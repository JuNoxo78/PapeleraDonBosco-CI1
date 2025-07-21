package controlador.pedidos_ventas;

import dao.autenticacion.DocIdentidadDAO;
import dao.autenticacion.EmpleadoxRolDAO;
import dao.clientes.ClienteDAO;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import modelo.autenticacion.DocIdentidad;
import modelo.clientes.Cliente;
import vista.pedidos_ventas.AddPedidoVista;
import vista.pedidos_ventas.AddPedidoVista_AddCliente;
import vista.pedidos_ventas.AddPedidoVista_AddDocIdent;

public class AddPedidoVista_AddClienteControlador {

	private final AddPedidoVista_AddCliente addClienteVista;
	private final ClienteDAO clienteDAO = new ClienteDAO();
	private final DocIdentidadDAO docIdentidadDAO = new DocIdentidadDAO();
	private final EmpleadoxRolDAO empleadoxRolDAO = new EmpleadoxRolDAO();

	public AddPedidoVista_AddClienteControlador(AddPedidoVista_AddCliente addClienteVista) {
		this.addClienteVista = addClienteVista;
		initController();
	}

	public void initController() {
		addClienteVista.setJb_addDocIdentidadEvent((ActionEvent e) -> addDocIdentidadButtonEvent());

		generarIdCliente(addClienteVista.getJt_addIdCliente());

		validarCorreo();
		validarTelefono();

		addClienteVista.setJb_cancelarEvent((ActionEvent e) -> manejarCierre());
		addClienteVista.setJb_addClienteEvent((ActionEvent e) -> {
			try {
				addClienteButtonEvent();
			} catch (SQLException ex) {
				Logger.getLogger(AddPedidoVista_AddClienteControlador.class.getName()).log(Level.SEVERE, null, ex);
			}
		});

		addClienteVista.setVisible(true);
	}

	public void addClienteButtonEvent() throws SQLException {
		String txtCorreo = addClienteVista.getJt_correoCliente().getText();
		String txtTelefono = addClienteVista.getJt_telefonoCliente().getText();
		String txtNombre = addClienteVista.getJt_nombre().getText();
		String txtApellido = addClienteVista.getJt_apellido().getText();
		String txtDireccion = addClienteVista.getJt_direccion().getText();
		String idDocIdentidad = addClienteVista.getJt_docIdentidad().getText();
		System.out.println(idDocIdentidad);

		if (esCorreoValido(txtCorreo) && esTelefonoInternacionalValido(txtTelefono) && txtNombre != null && txtApellido != null && txtDireccion != null && !idDocIdentidad.isEmpty()) {
			((AddPedidoVista) addClienteVista.getOwner()).getClienteCreado().setNombre(txtNombre);
			((AddPedidoVista) addClienteVista.getOwner()).getClienteCreado().setApellido(txtApellido);
			((AddPedidoVista) addClienteVista.getOwner()).getClienteCreado().setTelefono(txtTelefono);
			((AddPedidoVista) addClienteVista.getOwner()).getClienteCreado().setCorreo(txtCorreo);
			((AddPedidoVista) addClienteVista.getOwner()).getClienteCreado().setDireccion(txtDireccion);
			((AddPedidoVista) addClienteVista.getOwner()).getClienteCreado().setFechaRegistro(LocalDateTime.now().withNano(0));

			Cliente clienteNuevo = ((AddPedidoVista) addClienteVista.getOwner()).getClienteCreado();
			DocIdentidad docIdentidadNuevo = ((AddPedidoVista) addClienteVista.getOwner()).getDocIdentidadCreado();

			docIdentidadDAO.insertarDocumento(docIdentidadNuevo);
			clienteDAO.insertar(clienteNuevo);

			addClienteVista.dispose();
		} else {
			JOptionPane.showMessageDialog(null,
					"Hay algún error en el formulario que debes corregir.",
					"Error en formulario.",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	public void manejarCierre() {
		addClienteVista.dispose();
	}

	public void validarTelefono() {
		JTextField txtTelefono = addClienteVista.getJt_telefonoCliente();

		txtTelefono.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) {
				validarTelefono();
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				validarTelefono();
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				validarTelefono();
			}

			private void validarTelefono() {
				String telefono = txtTelefono.getText().trim();
				if (esTelefonoInternacionalValido(telefono)) {
					txtTelefono.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				} else {
					txtTelefono.setBorder(BorderFactory.createLineBorder(Color.RED));
				}
			}
		});

		txtTelefono.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				String texto = txtTelefono.getText();

				if (Character.isDigit(c)) {
					if (texto.replaceAll("\\D", "").length() >= 15) {
						e.consume(); // ya hay 15 dígitos, no permitir más
					}
				} else if (c == '+') {
					if (!texto.isEmpty() || texto.contains("+")) {
						e.consume(); // el '+' solo puede ir al inicio y una vez
					}
				} else {
					e.consume(); // cualquier otro carácter es inválido
				}
			}
		});
	}

	public boolean esTelefonoInternacionalValido(String telefono) {
		return telefono.matches("^\\+?\\d{9,15}$");
	}

	public void validarCorreo() {

		JTextField txtCorreo = addClienteVista.getJt_correoCliente();

		txtCorreo.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) {
				validarCorreo();
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				validarCorreo();
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				validarCorreo(); // Este normalmente no se llama con campos de texto simples
			}

			private void validarCorreo() {
				String correo = txtCorreo.getText().trim();
				if (esCorreoValido(correo)) {
					txtCorreo.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				} else {
					txtCorreo.setBorder(BorderFactory.createLineBorder(Color.RED));
				}
			}
		});
	}

	public boolean esCorreoValido(String correo) {
		String regex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
		return correo.matches(regex);
	}

	public void generarIdCliente(JTextField jt_idCliente) {
		String ultimoId = clienteDAO.obtenerUltimoId();
		String nuevoId = generarNuevoId(ultimoId);

		((AddPedidoVista) addClienteVista.getOwner()).getClienteCreado().setIdCliente(nuevoId);

		addClienteVista.getJt_addIdCliente().setText(nuevoId);
	}

	public String generarNuevoId(String ultimoId) {
		if (ultimoId == null) {
			return "CLI001";
		}

		String numeroStr = ultimoId.substring(3); // "001"
		int numero = Integer.parseInt(numeroStr);
		numero++; // 2

		return String.format("CLI%03d", numero); // CLI002
	}

	public void addDocIdentidadButtonEvent() {
		AddPedidoVista addPedidoVista = (AddPedidoVista) addClienteVista.getOwner();

		AddPedidoVista_AddDocIdent addDocIdentVista = new AddPedidoVista_AddDocIdent(addPedidoVista, true);

		addDocIdentVista.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				DocIdentidad docIdentidad = addPedidoVista.getDocIdentidadCreado();
				String idDocIdentidad = docIdentidad.getIdDocIdentidad();
				String numDoc = docIdentidad.getNumeroDocumento();
				if (numDoc != null && idDocIdentidad != null) {
					addClienteVista.getJt_docIdentidad().setText(numDoc + " (" + idDocIdentidad + ")");
				}
			}
		});

		new AddPedidoVista_AddDocIdentControlador(addDocIdentVista);
	}
}
