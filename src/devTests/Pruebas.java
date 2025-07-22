package devTests;

import extra.UtilSelectorArchivo;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import javax.swing.*;

public class Pruebas extends JFrame {

    public static void main(String[] args) {
		Frame padre = new Frame();
		String ruta = UtilSelectorArchivo.seleccionarArchivo(padre);
		UtilSelectorArchivo.copiarArchivoARutaAplicacion(ruta);
    }
}