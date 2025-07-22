package controlador.pedidos_ventas;

import dao.clientes.ClienteDAO;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import modelo.clientes.Cliente;
import vista.pedidos_ventas.AddPedidoVista;
import vista.pedidos_ventas.AddPedidoVista_AddCliente;
import vista.pedidos_ventas.AddPedidoVista_SelectCliente;

public final class AddPedidoVista_SelectClienteControlador {

	private final AddPedidoVista_SelectCliente selectCliente;
	private final ClienteDAO clienteDAO = new ClienteDAO();
	private final AddPedidoVista agregarPedidoVista;

	public AddPedidoVista_SelectClienteControlador(AddPedidoVista_SelectCliente selectCliente, AddPedidoVista agregarPedidoVista) {
		this.selectCliente = selectCliente;
		this.agregarPedidoVista = agregarPedidoVista;
		initController();
	}

	public void initController() {
		selectCliente.setJb_addClienteEvent((ActionEvent e) -> addClienteButtonEvent());
		cargarClientesEnTabla();
		JTable jtable_datosClientes = selectCliente.getJtable_datosClientes();
		TableRowSorter<TableModel> sorter = new TableRowSorter<>(jtable_datosClientes.getModel());
		jtable_datosClientes.setRowSorter(sorter);
		eventBusqueda(sorter);
		selectCliente.setJb_selectCliente((ActionEvent e) -> selecClienteButtonEvent(jtable_datosClientes));

		selectCliente.setVisible(true);
	}

	public void selecClienteButtonEvent(JTable tablaDatosClientes) {
		int filaSeleccionada = tablaDatosClientes.getSelectedRow();

		if (filaSeleccionada != -1) {
			String idCliente = tablaDatosClientes.getValueAt(filaSeleccionada, 0).toString();
			agregarPedidoVista.getClienteCreado().setIdCliente(idCliente);
			selectCliente.dispose();
		} else {
			JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila.");
		}
	}

	public void eventBusqueda(TableRowSorter<TableModel> sorter) {
		selectCliente.getJt_textBusqueda().getDocument().addDocumentListener(new DocumentListener() {
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
				String texto = selectCliente.getJt_textBusqueda().getText().trim();
				if (texto.length() == 0) {
					sorter.setRowFilter(null);
				} else {
					sorter.setRowFilter(RowFilter.regexFilter("(?i)" + texto));
				}
			}
		});
	}

	public void cargarClientesEnTabla() {
		String[] cabecera = {"Id Cliente", "Numero de Documento", "Nombres y Apellidos", "Telefono", "Correo"};
		Object[][] datos = obtenerDatosTablaClientes();
		selectCliente.cargarTabla(cabecera, datos);
	}

	public Object[][] obtenerDatosTablaClientes() {
		List<Cliente> clientes = clienteDAO.obtenerTodos();
		Object[][] datos = new Object[clientes.size()][5]; // 5 columnas según la cabecera

		for (int i = 0; i < clientes.size(); i++) {
			Cliente c = clientes.get(i);
			datos[i][0] = c.getIdCliente();
			datos[i][1] = c.getIdDocIdentidad();
			datos[i][2] = (c.getNombre() != null ? c.getNombre() : "") + " " + (c.getApellido() != null ? c.getApellido() : "");
			datos[i][3] = c.getTelefono();
			datos[i][4] = c.getCorreo();
		}
		System.out.println("");

		return datos;
	}

	public void addClienteButtonEvent() {
		AddPedidoVista_AddCliente addClienteVista = new AddPedidoVista_AddCliente((Frame) selectCliente.getOwner(), true);

		addClienteVista.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				cargarClientesEnTabla();
				String idCliente = agregarPedidoVista.getClienteCreado().getIdCliente();
				JTable jtable_datosClientes = selectCliente.getJtable_datosClientes();
				TableRowSorter<TableModel> sorter = new TableRowSorter<>(jtable_datosClientes.getModel());
				jtable_datosClientes.setRowSorter(sorter);
				eventBusqueda(sorter);

				if (clienteDAO.buscarPorId(idCliente) != null) {
					selectCliente.getJt_textBusqueda().setText(idCliente);
				}
			}
		});

		new AddPedidoVista_AddClienteControlador(addClienteVista, agregarPedidoVista);
	}
}
