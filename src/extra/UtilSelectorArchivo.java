package extra;

import java.awt.FileDialog;
import java.awt.Frame;

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
}