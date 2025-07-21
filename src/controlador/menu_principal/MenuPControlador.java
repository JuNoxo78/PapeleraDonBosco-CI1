package controlador.menu_principal;

import controlador.autenticacion.AuthGeneralControlador;
import controlador.pedidos_ventas.PedidosControlador;
import dao.autenticacion.EmpleadoDAO;
import dao.autenticacion.EmpleadoxRolDAO;
import dao.autenticacion.RolDAO;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import vista.autenticacion.LoginGeneral;
import vista.menu_principal.MenuPrincipal_2;
import vista.pedidos_ventas.PedidosVista;

public class MenuPControlador {

	private final MenuPrincipal_2 menuPrincipal;
	private final ArrayList<String> empleadoDatos;
	private static List<JFrame> openChildren = new ArrayList<>();

	public MenuPControlador(MenuPrincipal_2 menuPrincipal, ArrayList<String> empleadoDatos) {
		this.menuPrincipal = menuPrincipal;
		this.empleadoDatos = empleadoDatos;
		initController();
	}

	private void initController() {
		menuPrincipal.setRolNombre(empleadoDatos.get(0), empleadoDatos.get(1) + " " + empleadoDatos.get(2));

		menuPrincipal.setCloseButtonEvent((ActionEvent e) -> manejarCierre());

		menuPrincipal.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				manejarCierre();
			}
		});

		menuPrincipal.setPedidoButtonEvent((ActionEvent e) -> pedidoButtonEvent());

		menuPrincipal.setVisible(true);
	}

	private void manejarCierre() {
		int opcion = JOptionPane.showConfirmDialog(
				menuPrincipal,
				"¿Estás seguro de que deseas cerra sesión?",
				"Confirmar cierre de sesión",
				JOptionPane.YES_NO_OPTION
		);

		if (opcion == JOptionPane.YES_OPTION) {
			// Cerrar hijos
			for (JFrame hijo : openChildren) {
				hijo.dispose();
			}
			openChildren.clear();

			menuPrincipal.dispose();

			LoginGeneral loginVista = new LoginGeneral();
			EmpleadoDAO empleadoDAO = new EmpleadoDAO();
			EmpleadoxRolDAO empleadoxrolDAO = new EmpleadoxRolDAO();
			RolDAO rolDAO = new RolDAO();

			new AuthGeneralControlador(loginVista, empleadoDAO, empleadoxrolDAO, rolDAO);
		}
	}

	private void pedidoButtonEvent() {
		menuPrincipal.getBtn_home().setSelected(false);
		menuPrincipal.getBtn_cliente().setSelected(false);
		menuPrincipal.getBtn_empleado().setSelected(false);
		menuPrincipal.getBtn_proveedor().setSelected(false);
		menuPrincipal.getBtn_pedido().setSelected(true);
		menuPrincipal.getBtn_producto().setSelected(false);
		menuPrincipal.getBtn_prima().setSelected(false);
		menuPrincipal.getBtn_materialIntermedio().setSelected(false);
		menuPrincipal.getBtn_compras().setSelected(false);
		menuPrincipal.getBtn_informacion().setSelected(false);

		PedidosVista P = new PedidosVista();
		P.setLocation(0, 0);

		JPanel contentPanel = menuPrincipal.getContentPanel();
		contentPanel.removeAll();
		contentPanel.add(P, BorderLayout.CENTER);
		contentPanel.revalidate();

		new PedidosControlador(P);
	}

	public static void addChild(JFrame child) {
		openChildren.add(child);
	}
}
