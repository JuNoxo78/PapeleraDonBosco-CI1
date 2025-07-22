package controlador.pedidos_ventas;

import dao.autenticacion.DocIdentidadDAO;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import modelo.autenticacion.DocIdentidad;
import vista.pedidos_ventas.AddPedidoVista;
import vista.pedidos_ventas.AddPedidoVista_AddDocIdent;

public final class AddPedidoVista_AddDocIdentControlador {

	private final AddPedidoVista_AddDocIdent addDocIdentVista;
	private final DocIdentidadDAO docIdentidadDAO = new DocIdentidadDAO();
	private final AddPedidoVista agregarPedidoVista;

	public AddPedidoVista_AddDocIdentControlador(AddPedidoVista_AddDocIdent addDocIdentVista, AddPedidoVista agregarPedidoVista) {
		this.addDocIdentVista = addDocIdentVista;
		this.agregarPedidoVista = agregarPedidoVista;
		initController();
	}

	public void initController() {
		setDocIdentidad(addDocIdentVista.getJt_idDocIdentidad());
		JTextField txtIdDocIdentidad = addDocIdentVista.getJt_idDocIdentidad();
		JTextField txtNumeroDoc = addDocIdentVista.getJt_numDoc();
		JComboBox cbTipoDoc = addDocIdentVista.getJcb_tipoDoc();
		validarNumDoc(txtNumeroDoc, cbTipoDoc);
		addDocIdentVista.setJb_cancelarEvent((ActionEvent e) -> cancelarButtonEvent());
		addDocIdentVista.setJb_addDocIdentidad((ActionEvent e) -> {
			try {
				addDocIdentidadButtonEvent(txtIdDocIdentidad, cbTipoDoc, txtNumeroDoc);
			} catch (SQLException ex) {
				Logger.getLogger(AddPedidoVista_AddDocIdentControlador.class.getName()).log(Level.SEVERE, null, ex);
			}
		});

		addDocIdentVista.setVisible(true);
	}

	public void addDocIdentidadButtonEvent(JTextField txtIdDocIdentidad, JComboBox cbTipoDoc, JTextField txtNumeroDoc) throws SQLException {
		String idDocIdentidad = txtIdDocIdentidad.getText();
		String tipoDocIdentidad = (String) cbTipoDoc.getSelectedItem();
		String numDocIdentidad = txtNumeroDoc.getText();
		Border borde = txtNumeroDoc.getBorder();

		Color colorActual = ((LineBorder) borde).getLineColor();

		if (idDocIdentidad != null && tipoDocIdentidad != null && numDocIdentidad != null && colorActual.equals(Color.GREEN)) {
			DocIdentidad doc = new DocIdentidad(idDocIdentidad, tipoDocIdentidad, numDocIdentidad);
			agregarPedidoVista.getClienteCreado().setIdDocIdentidad(idDocIdentidad);
			agregarPedidoVista.setDocIdentidadCreado(doc);
			addDocIdentVista.dispose();
		} else {
			JOptionPane.showMessageDialog(null,
					"Hay algún error en el formulario que debes corregir.",
					"Error en formulario.",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	public void cancelarButtonEvent() {
		addDocIdentVista.dispose();
	}

	public void validarNumDoc(JTextField txtNumDoc, JComboBox cbTipoDoc) {
		txtNumDoc.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) {
				validarNumeroDocumento(txtNumDoc);
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				validarNumeroDocumento(txtNumDoc);
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				validarNumeroDocumento(txtNumDoc);
			}
		});

		cbTipoDoc.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					validarNumeroDocumento(txtNumDoc); // Llama a validación cuando cambia el tipo
				}
			}
		});
	}

	public void validarNumeroDocumento(JTextField txtNumeroDoc) {
		String tipo = (String) addDocIdentVista.getJcb_tipoDoc().getSelectedItem();
		String numero = txtNumeroDoc.getText().trim();

		boolean esValido = switch (tipo) {
			case "DNI" ->
				numero.matches("^\\d{8}$"); // exactamente 8 dígitos
			case "Pasaporte" ->
				numero.matches("^[A-Z0-9]{6,12}$"); // letras y números, 6-12 caracteres
			case "Carné de Extranjería" ->
				numero.matches("^\\d{9}$"); // 9 dígitos (puedes ajustar)
			default ->
				false;
		};

		txtNumeroDoc.setBorder(BorderFactory.createLineBorder(esValido ? Color.GREEN : Color.RED));
	}

	public void setDocIdentidad(JTextField txtIdDocIdentidad) {
		String ultimoId = docIdentidadDAO.obtenerUltimoId();
		String nuevoId = generarNuevoIdDoc(ultimoId);

		addDocIdentVista.getJt_idDocIdentidad().setText(nuevoId);
	}

	public String generarNuevoIdDoc(String ultimoId) {
		if (ultimoId == null) {
			return "DOC001";
		}

		String numeroStr = ultimoId.substring(3); // "005"
		int numero = Integer.parseInt(numeroStr);
		numero++;

		return String.format("DOC%03d", numero); // "DOC006"
	}
}
