package controlador.pedidos_ventas;

import dao.inventario.productos_terminados.PTDAO;
import extra.AcordeonPanel;
import extra.Validaciones;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import modelo.inventario.productos_terminados.ProductoTerminado;
import modelo.pedidos_ventas.DetallePedido;
import modelo.pedidos_ventas.Pedido;
import vista.pedidos_ventas.AddMIDetalle_PedidosVista;
import vista.pedidos_ventas.AddPedidoVista;
import vista.pedidos_ventas.AddPedido_AddPTVista;
import vista.pedidos_ventas.AddPedido_SelectPTVista;

public final class AddPedido_SelectPTControlador {

	private final AddPedido_SelectPTVista selectPTVista;
	private final AddPedidoVista agregarPedidoVista;
	private final PTDAO ptDAO = new PTDAO();

	public AddPedido_SelectPTControlador(AddPedido_SelectPTVista pedidoAddPTVista, AddPedidoVista agregarPedidoVista) {
		this.selectPTVista = pedidoAddPTVista;
		this.agregarPedidoVista = agregarPedidoVista;
		initController();
	}

	public void initController() {
		cargarPTenTabla();

		JTable jtable_datosPT = selectPTVista.getJtable_datosPT();
		TableRowSorter<TableModel> sorter = new TableRowSorter<>(jtable_datosPT.getModel());
		jtable_datosPT.setRowSorter(sorter);
		eventBusqueda(sorter);

		selectPTVista.setJb_addPT((ActionEvent e) -> addPTbuttonEvent());
		selectPTVista.setJb_selectPT((ActionEvent e) -> selectPTButtonEvent());

		selectPTVista.setVisible(true);
	}

	// Carga inciial de PT en tabla
	public void cargarPTenTabla() {
		String[] cabecera = {"Elegir", "Id PT", "Nombre", "Descripción", "Precio", "Tipo PT", "Dimensiones"};
		Object[][] datos = obtenerDatosTablaPT();
		selectPTVista.cargarTabla(cabecera, datos);
	}

	public Object[][] obtenerDatosTablaPT() {
		List<ProductoTerminado> productosTerminados = PTDAO.obtenerTodos();
		Object[][] datos = new Object[productosTerminados.size()][7];
		List<String> idsSeleccionados = agregarPedidoVista.getIdsPTSeleccionados();

		for (int i = 0; i < productosTerminados.size(); i++) {
			ProductoTerminado c = productosTerminados.get(i);
			if (idsSeleccionados != null) {
				for (String id : idsSeleccionados) {
					if (c.getIdProductoTerminado().equals(id)) {
						datos[i][0] = true;
						break;
					} else {
						datos[i][0] = false;
					}
				}
			} else {
				datos[i][0] = false;
			}
			datos[i][1] = c.getIdProductoTerminado();
			datos[i][2] = c.getNombre();
			datos[i][3] = c.getDescripcion();
			datos[i][4] = c.getPrecio();
			datos[i][5] = c.getTipoPT();
			datos[i][6] = c.getDimensiones();
		}

		return datos;
	}

	// Búsqueda dinámica en tabla
	public void eventBusqueda(TableRowSorter<TableModel> sorter) {
		selectPTVista.getJt_txtBusqueda().getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) {
				filtrar();
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				filtrar();
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				filtrar();
			}

			private void filtrar() {
				String texto = selectPTVista.getJt_txtBusqueda().getText().trim();
				if (texto.length() == 0) {
					sorter.setRowFilter(null);
				} else {
					sorter.setRowFilter(RowFilter.regexFilter("(?i)" + texto));
				}
			}
		});
	}

	// Evento Añadir PT (Apertura de nuevo JDialog)
	public void addPTbuttonEvent() {
		AddPedido_AddPTVista addPTVista = new AddPedido_AddPTVista((Frame) selectPTVista.getOwner(), true);

		addPTVista.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				cargarPTenTabla();
				String idPT = selectPTVista.getProductoTerminadoCreado().getIdProductoTerminado();
				JTable jtable_datosPT = selectPTVista.getJtable_datosPT();
				TableRowSorter<TableModel> sorter = new TableRowSorter<>(jtable_datosPT.getModel());
				jtable_datosPT.setRowSorter(sorter);
				eventBusqueda(sorter);
			}
		});

		new AddPedido_AddPTControlador(selectPTVista, addPTVista);
	}

	// Evento de Seleccionar PTs
	public void selectPTButtonEvent() {
		List<String> idsSeleccionados = obtenerIdsSeleccionados();
		if (!idsSeleccionados.isEmpty()) {
			agregarPedidoVista.setIdsPTSeleccionados(obtenerIdsSeleccionados());
			AcordeonPanel acordeon = new AcordeonPanel();
			acordeon.setEspacioEntreSecciones(0);

			int i = 0;

			agregarPedidoVista.getListDetallePedido().clear();

			for (String id : idsSeleccionados) {
				ProductoTerminado pt = ptDAO.buscarPorId(id);
				String idPedido = agregarPedidoVista.getJt_idPedido().getText();
				String idPT = pt.getIdProductoTerminado();

				DetallePedido dp = new DetallePedido();
				dp.setIdPedido(idPedido);
				dp.setIdProductoTerminado(idPT);

				agregarPedidoVista.getListDetallePedido().add(dp);
				AddMIDetalle_PedidosVista addMIDetalleVista = new AddMIDetalle_PedidosVista(id, acordeon, selectPTVista, agregarPedidoVista);
				acordeon.agregarSeccion(pt.getNombre() + " (" + pt.getIdProductoTerminado() + ")", addMIDetalleVista);

				BigDecimal precioUnitario = ptDAO.buscarPorId(pt.getIdProductoTerminado()).getPrecio();
				agregarPedidoVista.getListDetallePedido().get(i).setPrecioUnitario(precioUnitario);
				System.out.println(agregarPedidoVista.getListDetallePedido().get(i));

				listenerCantidadField(acordeon, addMIDetalleVista, i);
				i++;
			}

			JPanel envoltorio = new JPanel(new BorderLayout());
			envoltorio.add(acordeon, BorderLayout.NORTH);

			JScrollPane scrollPane = new JScrollPane(envoltorio);
			scrollPane.setBorder(null);
			scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
			scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			scrollPane.getVerticalScrollBar().setUnitIncrement(16); // Para scroll más fluido

			agregarPedidoVista.getJp_contenido().setLayout(new BorderLayout()); // o BoxLayout si prefieres
			agregarPedidoVista.getJp_contenido().removeAll(); // Opcional, si deseas limpiar antes
			agregarPedidoVista.getJp_contenido().add(scrollPane, BorderLayout.CENTER);
			agregarPedidoVista.getJp_contenido().revalidate();
			agregarPedidoVista.getJp_contenido().repaint();

			selectPTVista.dispose();
		} else {
			JOptionPane.showMessageDialog(null,
					"Seleccione alguna fila.",
					"Error en formulario.",
					JOptionPane.WARNING_MESSAGE);
		}

	}

	public void listenerCantidadField(AcordeonPanel acordeon, AddMIDetalle_PedidosVista addMiDetalleVista, int i) {
		acordeon.getCampoCantidad(i).getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) {
				calcular();
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				calcular();
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				calcular();
			}

			private void calcular() {
				actualizarPrecioTotal(addMiDetalleVista, acordeon, i);
			}
		});
	}

	public void actualizarPrecioTotal(AddMIDetalle_PedidosVista addMIDetalleVista, AcordeonPanel acordeon, int i) {
		BigDecimal precioUnitario = new BigDecimal(addMIDetalleVista.getJt_precioUnitario().getText());
		BigDecimal cantidad;
		String cantidadTxt = acordeon.getCampoCantidad(i).getText();
		if (!cantidadTxt.isBlank() && Validaciones.esBigDecimalValido(cantidadTxt)) {
			cantidad = new BigDecimal(acordeon.getCampoCantidad(i).getText());
		} else {
			cantidad = new BigDecimal(0);
		}

		BigDecimal precioTotal = precioUnitario.multiply(cantidad);
		String precioTotalString = String.valueOf(precioTotal);

		addMIDetalleVista.getJt_precioTotal().setText(precioTotalString);
	}

	public List<String> obtenerIdsSeleccionados() {
		JTable tabla = selectPTVista.getJtable_datosPT(); // Asegúrate de tener un método getTabla() que devuelva la JTable
		List<String> idsSeleccionados = new ArrayList<>();

		for (int i = 0; i < tabla.getRowCount(); i++) {
			Boolean seleccionado = (Boolean) tabla.getValueAt(i, 0); // Columna 0 = checkbox
			if (Boolean.TRUE.equals(seleccionado)) {
				String idPT = tabla.getValueAt(i, 1).toString(); // Columna 1 = id del producto terminado
				idsSeleccionados.add(idPT);
			}
		}

		return idsSeleccionados;
	}
}
