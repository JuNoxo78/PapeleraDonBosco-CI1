package extra;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.border.LineBorder;

public class AcordeonPanel extends JPanel {
    private final List<JPanel> seccionesContenido = new ArrayList<>();
    private int seccionIndex = 0;
    private int espacioEntreSecciones = 10;

    public AcordeonPanel() {
        setLayout(new GridBagLayout());
    }

    public void setEspacioEntreSecciones(int espacio) {
        this.espacioEntreSecciones = espacio;
    }

    public void agregarSeccion(String titulo, JComponent contenido) {
        JPanel panelSeccion = new JPanel(new BorderLayout());

        Icon iconDerecha = UIManager.getIcon("Tree.collapsedIcon");
        Icon iconAbajo = UIManager.getIcon("Tree.expandedIcon");

        // Contenedor del contenido oculto
        JPanel panelContenido = new JPanel(new BorderLayout());
        panelContenido.add(contenido, BorderLayout.CENTER);
        panelContenido.setVisible(false);

        // PANEL CABECERA que actúa como botón
        JPanel panelCabecera = new JPanel(new BorderLayout());
        panelCabecera.setBackground(UIManager.getColor("Panel.background"));
        panelCabecera.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panelCabecera.setBorder(BorderFactory.createCompoundBorder(
            new LineBorder(Color.LIGHT_GRAY),
            BorderFactory.createEmptyBorder(5, 5, 5, 5)
        ));

        JLabel lblTitulo = new JLabel(titulo, iconDerecha, JLabel.LEFT);

        // Panel derecho con "Cantidad" y JTextField
        JPanel panelCantidad = new JPanel(new FlowLayout(FlowLayout.RIGHT, 5, 0));
        panelCantidad.setOpaque(false);
        panelCantidad.add(new JLabel("Cantidad:"));
        JTextField txtCantidad = new JTextField(4);
        panelCantidad.add(txtCantidad);

        // Añadir elementos a la cabecera
        panelCabecera.add(lblTitulo, BorderLayout.CENTER);
        panelCabecera.add(panelCantidad, BorderLayout.EAST);

        // Comportamiento de despliegue al hacer clic
        panelCabecera.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                boolean visible = !panelContenido.isVisible();
                panelContenido.setVisible(visible);
                lblTitulo.setIcon(visible ? iconAbajo : iconDerecha);
                revalidate();
                repaint();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                panelCabecera.setBackground(new Color(230, 230, 230));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panelCabecera.setBackground(UIManager.getColor("Panel.background"));
            }
        });

        panelSeccion.add(panelCabecera, BorderLayout.NORTH);
        panelSeccion.add(panelContenido, BorderLayout.CENTER);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = seccionIndex++;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        gbc.insets = new Insets(0, 0, espacioEntreSecciones, 0);

        add(panelSeccion, gbc);
        seccionesContenido.add(panelContenido);

        revalidate();
        repaint();
    }

    public void limpiarSecciones() {
        removeAll();
        seccionesContenido.clear();
        seccionIndex = 0;
        revalidate();
        repaint();
    }
}