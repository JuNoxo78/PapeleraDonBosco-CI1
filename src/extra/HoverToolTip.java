package extra;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HoverToolTip {

	private JWindow tooltipWindow;
	private JLabel tooltipLabel;
	private MouseListener hoverListener;
	private JComponent componenteAsociado;

	public HoverToolTip(String texto) {
		inicializarTooltip(texto);
	}

	private void inicializarTooltip(String texto) {
		tooltipWindow = new JWindow();
		tooltipLabel = new JLabel(texto);
		tooltipLabel.setOpaque(true);
		tooltipLabel.setBackground(new Color(255, 255, 200));
		tooltipLabel.setFont(new Font("SansSerif", Font.PLAIN, 12));
		tooltipLabel.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(Color.BLACK),
				BorderFactory.createEmptyBorder(5, 5, 5, 5)
		));
		tooltipWindow.getContentPane().add(tooltipLabel);
		tooltipWindow.pack();
	}

	public void asociarA(JComponent componente) {
		componenteAsociado = componente;
		hoverListener = new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if (tooltipWindow != null) {
					Point locationOnScreen = SwingUtilities.convertPoint(
							componente, new Point(0, 0), componente.getTopLevelAncestor());
					if (locationOnScreen != null) {
						SwingUtilities.convertPointToScreen(locationOnScreen, componente.getTopLevelAncestor());
						int x = locationOnScreen.x;
						int y = locationOnScreen.y - tooltipWindow.getHeight() - 5;
						tooltipWindow.setLocation(x, y);
						tooltipWindow.setVisible(true);
					}
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if (tooltipWindow != null) {
					tooltipWindow.setVisible(false);
				}
			}
		};
		componente.addMouseListener(hoverListener);
	}
}