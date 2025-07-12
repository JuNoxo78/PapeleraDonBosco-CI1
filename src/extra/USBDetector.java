package extra;

import java.util.ArrayList;
import org.usb4java.*;

import java.util.HashSet;
import java.util.Set;

public class USBDetector {

	private static final Context context = new Context();
	private static Set<String> dispositivosPrevios = new HashSet<>();
	private static ArrayList<String> listaUsbIds = new ArrayList<>();

	public static boolean inicializar() {
		int resultado = LibUsb.init(context);
		return resultado == LibUsb.SUCCESS;
	}

	public static ArrayList<String> getListaUsbIds() {
		return listaUsbIds;
	}

	public static void escanearDispositivos() {
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
}
