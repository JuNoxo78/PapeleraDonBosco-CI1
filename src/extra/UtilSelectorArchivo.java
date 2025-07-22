package extra;

import java.awt.Desktop;
import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class UtilSelectorArchivo {
	// Guarda la última carpeta seleccionada durante la ejecución

	private static String ultimaRuta = System.getProperty("user.home");

	public static String seleccionarArchivo(Frame padre) {
		FileDialog dialogo = new FileDialog(padre, "Seleccionar archivo", FileDialog.LOAD);
		dialogo.setDirectory(ultimaRuta);
		dialogo.setVisible(true);

		String archivo = dialogo.getFile();
		String directorio = dialogo.getDirectory();

		if (archivo != null && directorio != null) {
			ultimaRuta = directorio;
			return directorio + archivo;
		} else {
			return null; // Usuario canceló
		}
	}

	public static String copiarArchivoARutaAplicacion(String rutaOrigenStr) {
		Path rutaOrigen = Paths.get(rutaOrigenStr);

		if (!Files.exists(rutaOrigen) || !Files.isRegularFile(rutaOrigen)) {
			System.err.println("Archivo no válido: " + rutaOrigenStr);
			return null;
		}

		// Ruta destino: Documentos/MisArchivosApp
		Path rutaDocumentos = Paths.get(System.getProperty("user.home"), "Documentos", "DonBoscoApp");

		try {
			// Crear directorio si no existe
			Files.createDirectories(rutaDocumentos);

			// Crear ruta final
			Path rutaDestino = rutaDocumentos.resolve(rutaOrigen.getFileName());

			// Copiar archivo
			Files.copy(rutaOrigen, rutaDestino, StandardCopyOption.REPLACE_EXISTING);
			return rutaDestino.toString();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static Path obtenerRutaDestinoDesde(String rutaOrigenStr) {
		Path rutaOrigen = Paths.get(rutaOrigenStr);

		// Obtiene solo el nombre del archivo (ej: hola.txt)
		Path nombreArchivo = rutaOrigen.getFileName();

		// Ruta destino base: Documentos/MisArchivosApp
		Path carpetaDestino = Paths.get(System.getProperty("user.home"), "Documentos", "DonBoscoApp");

		// Construye la nueva ruta completa
		Path rutaDestino = carpetaDestino.resolve(nombreArchivo);

		return rutaDestino;
	}

	public static void abrirArchivoConAppPorDefecto(String ruta) {
		File archivo = new File(ruta);

		if (!archivo.exists()) {
			System.err.println("El archivo no existe: " + ruta);
			return;
		}

		if (!Desktop.isDesktopSupported()) {
			System.err.println("Desktop API no soportada en este sistema.");
			return;
		}

		Desktop desktop = Desktop.getDesktop();

		if (!desktop.isSupported(Desktop.Action.OPEN)) {
			System.err.println("La acción de abrir archivos no está soportada.");
			return;
		}

		try {
			desktop.open(archivo);
		} catch (IOException e) {
			System.err.println("No se pudo abrir el archivo:");
			e.printStackTrace();
		}
	}
}
