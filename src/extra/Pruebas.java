package extra;

import java.util.ArrayList;
import java.util.concurrent.*;

public class Pruebas {

    public static void main(String[] args) {
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
				int lastIndex = listaUsbIds.size() - 1;
				int lastConUSBIndex = listaUsbIds.lastIndexOf("*03f0:2d40");
				int lastDisUSBIndex = listaUsbIds.lastIndexOf("X03f0:2d40");

				if (lastConUSBIndex > lastDisUSBIndex) {
					System.out.println(listaUsbIds.get(lastConUSBIndex));
				}
            } catch (Exception e) {
                System.err.println("Error durante el escaneo: " + e.getMessage());
            }
        }, 0, 1, TimeUnit.SECONDS);

    }
}