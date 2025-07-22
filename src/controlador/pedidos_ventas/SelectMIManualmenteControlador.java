package controlador.pedidos_ventas;

import dao.inventario.materiales_intermedios.MIDAO;
import extra.SingleColumnLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import modelo.inventario.materiales_intermedios.MaterialIntermedio;
import vista.pedidos_ventas.AddMIDetalle_Card;
import vista.pedidos_ventas.AddMIDetalle_PedidosVista;
import vista.pedidos_ventas.AddPedidoVista;
import vista.pedidos_ventas.SelectMIManualmente;

public final class SelectMIManualmenteControlador {

	private SelectMIManualmente selectManualVista;
	private MIDAO miDAO = new MIDAO();
	private final AddPedidoVista agregarPedidoVista;
	private final AddMIDetalle_PedidosVista addMIDetalleVista;

	public SelectMIManualmenteControlador(SelectMIManualmente addMIManualVista, AddPedidoVista agregarPedidoVista, AddMIDetalle_PedidosVista addMIDetalleVista) {
		this.selectManualVista = addMIManualVista;
		this.agregarPedidoVista = agregarPedidoVista;
		this.addMIDetalleVista = addMIDetalleVista;
		initController();
	}

	public void initController() {
		cargarMIenTabla();
		selectManualVista.setJb_selectMIEvent((ActionEvent e) -> selectMIButtonEvent());

		selectManualVista.setVisible(true);
	}

	public void cargarMIenTabla() {
		String[] cabecera = {"Elegir", "Id MI", "Nombre", "Descripción", "Unidad de Medida", "Stock Mínimo", "TipoMI"};
		Object[][] datos = obtenerDatosTablasMI();
		selectManualVista.cargarTabla(cabecera, datos);
	}

	public Object[][] obtenerDatosTablasMI() {
		List<MaterialIntermedio> materialesIntermedios = miDAO.obtenerTodos();
		Object[][] datos = new Object[materialesIntermedios.size()][7];

		for (int i = 0; i < materialesIntermedios.size(); i++) {
			MaterialIntermedio c = materialesIntermedios.get(i);
			datos[i][0] = false;
			datos[i][1] = c.getIdMaterialIntermedio();
			datos[i][2] = c.getNombre();
			datos[i][3] = c.getDescripcion();
			datos[i][4] = c.getUnidadMedida();
			datos[i][5] = c.getStockMinimo();
			datos[i][6] = c.getTipoMI();
		}

		return datos;
	}

	public void selectMIButtonEvent() {
		List<String> idsSeleccionados = obtenerIdsSeleccionados();
		if (!idsSeleccionados.isEmpty()) {
			agregarPedidoVista.setIdsMISeleccionados(idsSeleccionados);
			cargarMIDetalle();
			selectManualVista.dispose();
		} else {
			JOptionPane.showMessageDialog(null,
					"Seleccione alguna fila.",
					"Error en formulario.",
					JOptionPane.WARNING_MESSAGE);
		}

	}

	public List<String> obtenerIdsSeleccionados() {
		JTable tabla = selectManualVista.getJtable_datosMI();
		List<String> idsSeleccionados = new ArrayList<>();

		for (int i = 0; i < tabla.getRowCount(); i++) {
			Boolean seleccionado = (Boolean) tabla.getValueAt(i, 0); // Columna 0 = checkbox
			if (Boolean.TRUE.equals(seleccionado)) {
				String idMI = tabla.getValueAt(i, 1).toString(); // Columna 1 = id del producto terminado
				idsSeleccionados.add(idMI);
			}
		}

		return idsSeleccionados;
	}

	public void cargarMIDetalle() {
		JPanel miDetalleContenedor = addMIDetalleVista.getJp_miDetalleContenedor();
		miDetalleContenedor.setLayout(new SingleColumnLayout(0));
		miDetalleContenedor.removeAll();
		miDetalleContenedor.revalidate();
		miDetalleContenedor.repaint();

		List<String> idsSeleccionados = agregarPedidoVista.getIdsMISeleccionados();

		if (idsSeleccionados != null) {
			for (int i = 0; i < idsSeleccionados.size(); i++) {
				AddMIDetalle_Card cardsMIPedidoDetalle = new AddMIDetalle_Card();
				MaterialIntermedio mi = miDAO.buscarPorId(idsSeleccionados.get(i));
				cardsMIPedidoDetalle.getJl_tittle().setText(mi.getNombre() + " (" + mi.getIdMaterialIntermedio() + ")");
				cardsMIPedidoDetalle.getJt_descripcion().setText(mi.getDescripcion());
				JPanel cardMIPedidoDetalle = cardsMIPedidoDetalle.getCard();
				cardMIPedidoDetalle.setPreferredSize(new Dimension(80, cardMIPedidoDetalle.getPreferredSize().height));
				miDetalleContenedor.add(cardMIPedidoDetalle);
			}
		}
	}

}
