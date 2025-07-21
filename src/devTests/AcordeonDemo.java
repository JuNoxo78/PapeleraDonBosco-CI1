package devTests;

import extra.AcordeonPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class AcordeonDemo {

	public static void main(String[] args) {
		AcordeonPanel acordeon = new AcordeonPanel();

// Agrega tus secciones aquí
		acordeon.agregarSeccion("Frutas", new JLabel("Manzana, Banana, Naranja..."));
		acordeon.agregarSeccion("Verduras", new JTextArea("Zanahoria, Espinaca, Brócoli...\n".repeat(100)));
// Puedes agregar más secciones

// IMPORTANTE: Usa un panel intermedio con BorderLayout para asegurar que el JScrollPane se ajuste bien
		JPanel contenedor = new JPanel(new BorderLayout());
		contenedor.add(acordeon, BorderLayout.NORTH); // Esto permite que el acordeón crezca verticalmente

		JScrollPane scrollPane = new JScrollPane(contenedor);
		scrollPane.getVerticalScrollBar().setUnitIncrement(16); // Mejora la experiencia de scroll

// Luego añades el JScrollPane a tu JFrame o contenedor principal
		JFrame frame = new JFrame("Ejemplo Acordeón");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 500);
		frame.setLayout(new BorderLayout());
		frame.add(scrollPane, BorderLayout.CENTER);
		frame.setVisible(true);
	}
}
