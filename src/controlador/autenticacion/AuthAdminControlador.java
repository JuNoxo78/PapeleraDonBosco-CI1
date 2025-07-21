package controlador.autenticacion;

import controlador.menu_principal.MenuPAdminControlador;
import extra.USBDetector;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.ArrayList;
import vista.autenticacion.LoginAdmin;
import java.util.concurrent.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import vista.autenticacion.LoginAdminCode;
import vista.autenticacion.LoginAdminKey;
import vista.menu_principal.MenuPrincipalAdmin;

public class AuthAdminControlador {

	private final LoginAdmin loginAdminVista;
	private ScheduledExecutorService usbScheduler;
	private ArrayList<String> letraEtiqueta;
	private final String keyAuthAdminHash = "459f49c44e0d26f7a98880de609125f559e1e693f6bda299c89b657e94517d23";
	private final String keyAuthAdminFile = "keyAuth.txt";

	public AuthAdminControlador(LoginAdmin loginAdminVista) {
		this.loginAdminVista = loginAdminVista;
		initController();
	}

	public void initController() {
		LoginAdminKey loginAdminKey = new LoginAdminKey();
		LoginAdminCode loginAdminCode = new LoginAdminCode();
		JPanel menuLoginAdmin = loginAdminVista.getJp_menuLoginAdmin();
		MenuPrincipalAdmin menuPrincipalAdmin = new MenuPrincipalAdmin();

		loginAdminVista.setKeyLoginButton((ActionEvent e) -> keyLoginButtonEvent(loginAdminKey));
		loginAdminVista.setCodeLoginButton((ActionEvent e) -> codeLoginButtonEvent(loginAdminCode));

		loginAdminKey.setVolverButton((ActionEvent e) -> volverButtonEvent(menuLoginAdmin));
		loginAdminCode.setVolverButton((ActionEvent e) -> volverButtonEvent(menuLoginAdmin));

		loginAdminKey.setAutenticarKeyButton((ActionEvent e) -> autenticarKeyEvent(menuPrincipalAdmin));

		loginAdminVista.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				manejarCierre();
			}
		});

		loginAdminVista.setVisible(true);
	}

	private void manejarCierre() {
		int opcion = JOptionPane.showConfirmDialog(
				loginAdminVista,
				"¿Estás seguro de que deseas salir?",
				"Confirmar salida",
				JOptionPane.YES_NO_OPTION
		);

		if (opcion == JOptionPane.YES_OPTION) {
			detenerUSBDetecting();
			loginAdminVista.dispose();
		}
	}

	private void USBDetecting(LoginAdminKey loginAdminKey) {
		if (!USBDetector.inicializar()) {
			System.err.println("No se pudo inicializar LibUsb.");
			return;
		}

		System.out.println("Iniciando escaneo periodico de dispositivos USB...");

		usbScheduler = Executors.newSingleThreadScheduledExecutor();

		usbScheduler.scheduleAtFixedRate(() -> {
			ArrayList<String> listaUsbIds = USBDetector.getListaUsbIds();
			try {
				USBDetector.escanearDispositivos();
				int lastConUSBIndex = listaUsbIds.lastIndexOf("*03f0:2d40");
				int lastDisUSBIndex = listaUsbIds.lastIndexOf("X03f0:2d40");

				if (lastConUSBIndex > lastDisUSBIndex) {
					letraEtiqueta = USBDetector.obtenerLetraEtiquetaVolumen();
					if (!letraEtiqueta.isEmpty()) {
						//System.out.println(">> Unidad: " + letraEtiqueta.get(0) + " | Etiqueta: " + letraEtiqueta.get(1));
						loginAdminKey.getRsp_circleProgress().setVisible(false);
						loginAdminKey.getJb_autenticarKey().setVisible(true);
						loginAdminKey.setJLKeyText("<html>Ingresada llave de seguridad <b>" + letraEtiqueta.get(1) + "<b>.</html>");
					}
				} else {
					letraEtiqueta = new ArrayList<>();
					loginAdminKey.getJb_autenticarKey().setVisible(false);
					loginAdminKey.getRsp_circleProgress().setVisible(true);
					loginAdminKey.setJLKeyText("Buscando llave de seguridad...");
				}
			} catch (Exception e) {
				System.err.println("Error durante el escaneo: " + e.getMessage());
			}
		}, 0, 1, TimeUnit.SECONDS);
	}

	private void detenerUSBDetecting() {
		if (usbScheduler != null && !usbScheduler.isShutdown()) {
			usbScheduler.shutdownNow();
			System.out.println("Escaneo de USB detenido.");
		}
		USBDetector.cerrar();
	}

	private void keyLoginButtonEvent(LoginAdminKey loginAdminKey) {
		loginAdminKey.setLocation(0, 0);

		JPanel jp_contentLoginAdmin = loginAdminVista.getJp_contentLoginAdmin();

		jp_contentLoginAdmin.removeAll();
		jp_contentLoginAdmin.add(loginAdminKey);
		jp_contentLoginAdmin.revalidate();
		jp_contentLoginAdmin.repaint();

		USBDetecting(loginAdminKey);
	}

	private void codeLoginButtonEvent(LoginAdminCode loginAdminCode) {
		loginAdminCode.setLocation(0, 0);

		JPanel jp_contentLoginAdmin = loginAdminVista.getJp_contentLoginAdmin();

		jp_contentLoginAdmin.removeAll();
		jp_contentLoginAdmin.add(loginAdminCode);
		jp_contentLoginAdmin.revalidate();
		jp_contentLoginAdmin.repaint();
	}

	private void volverButtonEvent(JPanel menuLoginAdmin) {
		JPanel jp_contentLoginAdmin = loginAdminVista.getJp_contentLoginAdmin();

		jp_contentLoginAdmin.removeAll();
		jp_contentLoginAdmin.add(menuLoginAdmin);
		jp_contentLoginAdmin.revalidate();
		jp_contentLoginAdmin.repaint();

		detenerUSBDetecting();
	}

	private void autenticarKeyEvent(MenuPrincipalAdmin menu) {
		for (int i = 0; i < letraEtiqueta.size(); i += 2) {
			String letra = letraEtiqueta.get(i);
			String etiqueta = letraEtiqueta.get(i + 1);

			File unidad = new File(letra);
			if (unidad.exists()) {
				File archivoClave = new File(unidad, keyAuthAdminFile);
				if (archivoClave.exists()) {
					boolean encontrado = USBDetector.verificarClavePorHash(archivoClave, keyAuthAdminHash);
					if (encontrado) {
						System.out.println("-- KeyCode de acceso encontrado en " + letra + " (" + etiqueta + ")");
						detenerUSBDetecting();
						loginAdminVista.dispose();
						Window loginAdminParent = SwingUtilities.getWindowAncestor(loginAdminVista);
						if (loginAdminParent != null) {
							loginAdminParent.dispose();
						}
						new MenuPAdminControlador(menu);
						return;
					} else {
						System.out.println("xx KeyCode no encontrado en " + letra + " (" + etiqueta + ")");
					}
				} else {
                	System.out.println("xx Archivo '" + keyAuthAdminFile + "' no encontrado en " + letra);
				}
			}
		}
	}

}
