package extra;

import java.io.BufferedReader;
import org.usb4java.*;

import java.util.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import oshi.SystemInfo;
import oshi.hardware.UsbDevice;
import oshi.software.os.FileSystem;
import oshi.software.os.OSFileStore;

public class USBDetector {

	private final Context context = new Context();
	private Set<String> dispositivosPrevios = new HashSet<>();
	private ArrayList<String> listaUsbIds = new ArrayList<>();
	private boolean inicializado = false;

	public boolean inicializar() {
		if (inicializado) {
			return true;
		}

		int resultado = LibUsb.init(context);
		if (resultado == LibUsb.SUCCESS) {
			inicializado = true;
			return true;
		} else {
			System.err.println("Error al inicializar LibUsb: " + LibUsb.strError(resultado));
			return false;
		}
	}

	public void cerrar() {
		if (inicializado) {
			LibUsb.exit(context);
			inicializado = false;
			System.out.println("LibUsb cerrado correctamente.");
		}
	}

	public ArrayList<String> getListaUsbIds() {
		return listaUsbIds;
	}

	public void escanearDispositivos() {
		DeviceList lista = new DeviceList();
		int resultado = LibUsb.getDeviceList(context, lista);

		if (resultado < 0) {
			System.err.println("No se pudo obtener la lista de dispositivos: " + LibUsb.strError(resultado));
			return;
		}

		Set<String> dispositivosActuales = new HashSet<>();

		for (Device dispositivo : lista) {
			DeviceDescriptor descriptor = new DeviceDescriptor();
			int r = LibUsb.getDeviceDescriptor(dispositivo, descriptor);
			if (r != LibUsb.SUCCESS) {
				continue;
			}

			String id = String.format("%04x:%04x", descriptor.idVendor(), descriptor.idProduct());

			dispositivosActuales.add(id);

			if (!dispositivosPrevios.contains(id)) {
				listaUsbIds.add("*" + id);
				System.out.println("* USB Conectado: " + id);
			}
		}

		for (String idAnterior : dispositivosPrevios) {
			if (!dispositivosActuales.contains(idAnterior)) {
				listaUsbIds.add("X" + idAnterior);
				System.out.println("X USB Desconectado: " + idAnterior);
			}
		}

		dispositivosPrevios = dispositivosActuales;
		LibUsb.freeDeviceList(lista, true);
	}

	public ArrayList<String> obtenerLetraEtiquetaVolumen() {
		ArrayList<String> letraEtiqueta = new ArrayList<>();
		SystemInfo si = new SystemInfo();

		// Obtener dispositivos USB
		List<UsbDevice> dispositivos = si.getHardware().getUsbDevices(true);

		for (UsbDevice dev : dispositivos) {
			if (dev.getVendorId() != null && dev.getProductId() != null) {
				// Buscar volumen montado
				FileSystem fs = si.getOperatingSystem().getFileSystem();
				for (OSFileStore store : fs.getFileStores()) {
					if (store.getDescription().toLowerCase().contains("removable")) {
						letraEtiqueta.add(store.getMount());
						letraEtiqueta.add(store.getLabel());
					}
				}
			}
		}
		return letraEtiqueta;
	}

	public boolean verificarClavePorHash(File archivo, String keyAuthAdminHash) {
		try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
			String claveLeida = br.readLine(); // Leer solo la primera línea
			if (claveLeida == null) {
				return false;
			}

			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hashBytes = digest.digest(claveLeida.getBytes(StandardCharsets.UTF_8));
			String hashHex = HexFormat.of().formatHex(hashBytes).toLowerCase();

			return hashHex.equals(keyAuthAdminHash);
		} catch (Exception e) {
			System.err.println("Error al verificar clave: " + e.getMessage());
			return false;
		}
	}
}
