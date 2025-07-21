package extra;

import java.awt.*;

public class MultiColumnLayout implements LayoutManager {

    private int columns;   // Número de columnas deseado
    private int hgap;      // Espacio horizontal entre columnas
    private int vgap;      // Espacio vertical entre filas

    public MultiColumnLayout(int columns, int hgap, int vgap) {
        this.columns = Math.max(1, columns); // mínimo 1 columna
        this.hgap = hgap;
        this.vgap = vgap;
    }

    @Override
    public void addLayoutComponent(String name, Component comp) {
        // No se usa
    }

    @Override
    public void removeLayoutComponent(Component comp) {
        // No se usa
    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        synchronized (parent.getTreeLock()) {
            Insets insets = parent.getInsets();
            int n = parent.getComponentCount();
            int rows = (int) Math.ceil((double) n / columns);

            int maxHeight = 0;
            int maxWidth = 0;

            for (Component comp : parent.getComponents()) {
                if (comp.isVisible()) {
                    Dimension d = comp.getPreferredSize();
                    maxHeight = Math.max(maxHeight, d.height);
                    maxWidth = Math.max(maxWidth, d.width);
                }
            }

            int width = columns * maxWidth + (columns - 1) * hgap + insets.left + insets.right;
            int height = rows * maxHeight + (rows - 1) * vgap + insets.top + insets.bottom;

            return new Dimension(width, height);
        }
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        return preferredLayoutSize(parent);
    }

    @Override
    public void layoutContainer(Container parent) {
        synchronized (parent.getTreeLock()) {
            Insets insets = parent.getInsets();
            int n = parent.getComponentCount();
            int rows = (int) Math.ceil((double) n / columns);

            int totalWidth = parent.getWidth() - insets.left - insets.right;
            int cellWidth = (totalWidth - (columns - 1) * hgap) / columns;

            int y = insets.top;

            for (int row = 0; row < rows; row++) {
                int x = insets.left;
                int maxRowHeight = 0;

                for (int col = 0; col < columns; col++) {
                    int index = row * columns + col;
                    if (index >= n) break;

                    Component comp = parent.getComponent(index);
                    if (!comp.isVisible()) continue;

                    Dimension d = comp.getPreferredSize();
                    comp.setBounds(x, y, cellWidth, d.height);

                    maxRowHeight = Math.max(maxRowHeight, d.height);
                    x += cellWidth + hgap;
                }

                y += maxRowHeight + vgap;
            }
        }
    }
}