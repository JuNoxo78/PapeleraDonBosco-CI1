package extra;

import java.awt.*;

public class SingleColumnLayout implements LayoutManager {

    private int vgap;

    public SingleColumnLayout(int vgap) {
        this.vgap = vgap;
    }

    @Override
    public void addLayoutComponent(String name, Component comp) {
        // No es necesario
    }

    @Override
    public void removeLayoutComponent(Component comp) {
        // No es necesario
    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        synchronized (parent.getTreeLock()) {
            Insets insets = parent.getInsets();
            int width = 0;
            int height = insets.top + insets.bottom;

            for (Component comp : parent.getComponents()) {
                if (comp.isVisible()) {
                    Dimension d = comp.getPreferredSize();
                    width = Math.max(width, d.width);
                    height += d.height + vgap;
                }
            }

            return new Dimension(width + insets.left + insets.right, height);
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
            int y = insets.top;
            int width = parent.getWidth() - insets.left - insets.right;

            for (Component comp : parent.getComponents()) {
                if (comp.isVisible()) {
                    Dimension d = comp.getPreferredSize();
                    comp.setBounds(insets.left, y, width, d.height);
                    y += d.height + vgap;
                }
            }
        }
    }
}