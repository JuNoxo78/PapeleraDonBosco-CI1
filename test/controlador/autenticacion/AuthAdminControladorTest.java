package controlador.autenticacion;

import extra.USBDetector;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import vista.autenticacion.LoginAdmin;
import vista.autenticacion.LoginAdminCode;
import vista.autenticacion.LoginAdminKey;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class AuthAdminControladorTest {

    private LoginAdmin loginAdminMock;
    private JPanel contentPanelMock;
    private USBDetector usbDetectorMock;
    private AuthAdminControlador controlador;

    @Before
    public void setUp() {
        loginAdminMock = mock(LoginAdmin.class);
        contentPanelMock = mock(JPanel.class);
        usbDetectorMock = mock(USBDetector.class);

        when(loginAdminMock.getJp_contentLoginAdmin()).thenReturn(contentPanelMock);
        when(loginAdminMock.getJp_menuLoginAdmin()).thenReturn(new JPanel());

        // Simula que la inicialización del USBDetector fue exitosa
        when(usbDetectorMock.inicializar()).thenReturn(true);

        controlador = new AuthAdminControlador(loginAdminMock, usbDetectorMock);
    }

    @Test
    public void testKeyLoginButtonEvent_addsLoginAdminKeyToPanel_andInitializesUSBDetector() {
        // Captura el listener del botón de "key login"
        ArgumentCaptor<ActionListener> captor = ArgumentCaptor.forClass(ActionListener.class);
        verify(loginAdminMock).setKeyLoginButton(captor.capture());

        ActionListener keyLoginListener = captor.getValue();
        assertNotNull("Debe haberse asignado un listener al botón de login con llave", keyLoginListener);

        // Ejecutamos el evento simulando clic en el botón
        keyLoginListener.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "cmd"));

        // Verifica que se actualizó el panel
        verify(contentPanelMock).removeAll();
        verify(contentPanelMock).revalidate();
        verify(contentPanelMock).repaint();
        verify(contentPanelMock, atLeastOnce()).add(any(LoginAdminKey.class));

        // Verifica que se llamó al detector
        verify(usbDetectorMock, atLeastOnce()).inicializar();
    }

    @Test
    public void testCodeLoginButtonEvent_addsLoginAdminCodeToPanel() {
        LoginAdminCode loginAdminCode = mock(LoginAdminCode.class);
        controlador.codeLoginButtonEvent(loginAdminCode);

        verify(contentPanelMock).removeAll();
        verify(contentPanelMock).add(loginAdminCode);
        verify(contentPanelMock).revalidate();
        verify(contentPanelMock).repaint();
    }

    @Test
    public void testVolverButtonEvent_returnsToMenuAndStopsUSB() {
        JPanel menuPanel = mock(JPanel.class);
        controlador.volverButtonEvent(menuPanel);

        verify(contentPanelMock).removeAll();
        verify(contentPanelMock).add(menuPanel);
        verify(contentPanelMock).revalidate();
        verify(contentPanelMock).repaint();

        // Aquí podrías verificar que usbDetector.cerrar() fue llamado si expusieras ese método desde AuthAdminControlador
        // verify(usbDetectorMock).cerrar();
    }
}