package controlador.autenticacion;

import extra.USBDetector;
import java.util.ArrayList;
import vista.autenticacion.LoginAdmin;
import java.util.concurrent.*;

public class AuthAdminControlador {

	private final LoginAdmin loginAdminVista;

	public AuthAdminControlador(LoginAdmin loginAdminVista) {
		this.loginAdminVista = loginAdminVista;
		initController();
	}

	public void initController() {
		loginAdminVista.setTareaUSB(() -> USBDetecting());
		loginAdminVista.setVisible(true);
	}

	private void USBDetecting() {
		if (!USBDetector.inicializar()) {
			System.err.println("No se pudo inicializar LibUsb.");
			return;
		}

		System.out.println("Iniciando escaneo periodico de dispositivos USB...");

		ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

		scheduler.scheduleAtFixedRate(() -> {
			ArrayList<String> listaUsbIds = USBDetector.getListaUsbIds();
			try {
				USBDetector.escanearDispositivos();
				int lastConUSBIndex = listaUsbIds.lastIndexOf("*03f0:2d40");
				int lastDisUSBIndex = listaUsbIds.lastIndexOf("X03f0:2d40");

				if (lastConUSBIndex > lastDisUSBIndex) {
					loginAdminVista.setJLText(listaUsbIds.get(lastConUSBIndex));
				} else {
					loginAdminVista.setJLText("Ingrese su llave de seguridad");
				}
			} catch (Exception e) {
				System.err.println("Error durante el escaneo: " + e.getMessage());
			}
		}, 0, 1, TimeUnit.SECONDS);
	}
}
