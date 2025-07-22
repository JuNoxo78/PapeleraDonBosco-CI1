package controlador.pedidos_ventas;

import RSMaterialComponent.RSButtonFormaIcon;
import com.toedter.calendar.JDateChooser;
import dao.clientes.ClienteDAO;
import dao.pedidos_ventas.ComprobantePagoDAO;
import dao.pedidos_ventas.PedidoDAO;
import dao.pedidos_ventas.VentaDAO;
import extra.UtilSelectorArchivo;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ToolTipManager;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import modelo.pedidos_ventas.ComprobantePago;
import modelo.pedidos_ventas.Pedido;
import modelo.pedidos_ventas.Venta;
import vista.menu_principal.MenuPrincipal_2;
import vista.pedidos_ventas.AddPedidoVista;
import vista.pedidos_ventas.AddPT_PedidosVista;
import vista.pedidos_ventas.AddPedidoVista_SelectCliente;

public final class AddPedidoControlador {

	private final AddPedidoVista agregarPedidosVista;
	private final PedidoDAO pedidoDAO = new PedidoDAO();
	private final ClienteDAO clienteDAO = new ClienteDAO();
	private final VentaDAO ventaDAO = new VentaDAO();
	private final ComprobantePagoDAO comprobantePagoDAO = new ComprobantePagoDAO();

	public AddPedidoControlador(AddPedidoVista agregarPedidosVista) {
		this.agregarPedidosVista = agregarPedidosVista;
		initController();
	}

	public void initController() {
		generarIdPedido();
		generarIdVenta();
		generarIdComprobPago();
		condicionamientoEstadoPago();
		agregarPedidosVista.setJcb_estadoPagoEvent((ActionEvent e) -> condicionamientoEstadoPago());
		agregarPedidosVista.setJb_addFileComprobanteEvent((ActionEvent e) -> JbAddFileComprobanteEvent());
		agregarPedidosVista.setJb_pedidoAddPT((ActionEvent e) -> JbPedidoAddPT());
		agregarPedidosVista.setJdatec_fechaEntregaFocusLost(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				warningEventFechaEntrega();
			}
		});
		agregarPedidosVista.setJdatec_fechaEmisionFocusLost(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				warningEventFechaEmision();
			}
		});
		agregarPedidosVista.setEventoCambioFechaEntrega(new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) {
				actualizar();
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				actualizar();
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
			}

			private void actualizar() {
				warningEventFechaEntrega();
			}
		});
		agregarPedidosVista.setEventoCambioFechaEmision(new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) {
				actualizar();
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				actualizar();
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
			}

			private void actualizar() {
				warningEventFechaEmision();
			}
		});
		agregarPedidosVista.getJdatec_fechaEntrega().getDateEditor().addPropertyChangeListener("date", evt -> {
			warningEventFechaEntrega();
		});

		agregarPedidosVista.setJcb_estadoPedidoEvent((ActionEvent e) -> comboBoxEstadoPedidoEvent());
		agregarPedidosVista.setRsb_addClienteEvent((ActionEvent e) -> addClienteButtonEvent());
		agregarPedidosVista.setJb_addPedidoEvent((ActionEvent e) -> addPedidoButtonEvent());
		agregarPedidosVista.setJb_cancelar((ActionEvent e) -> cancelarButtonEvent());
		agregarPedidosVista.setRsb_verDocumento((ActionEvent e) -> verDocumentoButtonEvent());
		validarNumComprobante();
		validarMontoTotal();
		condicionamientoEstadoPago();

		agregarPedidosVista.setVisible(true);
	}

	public void validarNumComprobante() {
		JTextField JtnumComprobante = agregarPedidosVista.getJt_numComprobante();

		JtnumComprobante.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) {
				validar();
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				validar();
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				validar();
			}

			private void validar() {
				String texto = JtnumComprobante.getText().trim();
				if (!texto.isEmpty()) {
					JtnumComprobante.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				} else {
					JtnumComprobante.setBorder(BorderFactory.createLineBorder(Color.RED));
				}
			}
		});

	}

	public void validarMontoTotal() {
		JTextField txtMonto = agregarPedidosVista.getJt_montoTotal(); // ajusta esto a tu referencia real

		txtMonto.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) {
				validar();
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				validar();
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				validar();
			}

			private void validar() {
				String texto = txtMonto.getText().trim();
				if (esBigDecimalValido(texto)) {
					txtMonto.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				} else {
					txtMonto.setBorder(BorderFactory.createLineBorder(Color.RED));
				}
			}
		});

		txtMonto.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				String texto = txtMonto.getText();

				if (Character.isDigit(c)) {
					return; // se permite dígito
				}

				if (c == '.') {
					if (texto.contains(".")) {
						e.consume(); // solo se permite un punto decimal
					}
					return;
				}

				// no permitir ningún otro carácter
				e.consume();
			}
		});
	}

	private boolean esBigDecimalValido(String texto) {
		try {
			if (texto.isEmpty()) {
				return false;
			}
			new BigDecimal(texto);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public void condicionamientoEstadoPago() {
		String estadoPago = agregarPedidosVista.getJcb_estadoPago().getSelectedItem().toString();

		switch (estadoPago) {
			case "Pagado Parcialmente" -> {
				agregarPedidosVista.getJt_rutaArchivo().setEnabled(false);
				agregarPedidosVista.getJb_addComprobante().setEnabled(false);
				agregarPedidosVista.getRsb_verDocumento().setEnabled(false);
				agregarPedidosVista.getJdatec_fechaEmision().setEnabled(false);
				agregarPedidosVista.getJt_idCompPago().setEnabled(false);
				agregarPedidosVista.getJt_numComprobante().setEnabled(false);
				agregarPedidosVista.getJcb_tipoComprobante().setEnabled(false);
				agregarPedidosVista.getJt_montoTotal().setEnabled(false);
			}
			case "Pagado" -> {
				agregarPedidosVista.getJt_rutaArchivo().setEnabled(true);
				agregarPedidosVista.getJb_addComprobante().setEnabled(true);
				if (!agregarPedidosVista.getJt_rutaArchivo().getText().isEmpty()) {
					agregarPedidosVista.getRsb_verDocumento().setEnabled(true);
				}
				agregarPedidosVista.getJdatec_fechaEmision().setEnabled(true);
				agregarPedidosVista.getJt_idCompPago().setEnabled(true);
				agregarPedidosVista.getJt_numComprobante().setEnabled(true);
				agregarPedidosVista.getJcb_tipoComprobante().setEnabled(true);
				agregarPedidosVista.getJt_montoTotal().setEnabled(true);
				JOptionPane.showMessageDialog(null,
						"Si el pedido ya está pagado, es necesario agregar un comprobante de pago.",
						"Estado actualizado",
						JOptionPane.WARNING_MESSAGE);
			}
			default ->
				throw new AssertionError();
		}
	}

	public void generarIdComprobPago() {
		String nuevoId = generarSiguienteIdCompPago();

		agregarPedidosVista.getJt_idCompPago().setText(nuevoId);
		agregarPedidosVista.getComprobantePago().setIdCompPago(nuevoId);
	}

	public String generarSiguienteIdCompPago() {
		String ultimoId = comprobantePagoDAO.obtenerUltimoId(); // CP001, CP002, etc.
		if (ultimoId == null) {
			return "CP001";
		}

		try {
			int numero = Integer.parseInt(ultimoId.substring(2));
			numero++;
			return String.format("CP%03d", numero);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return "CP001"; // fallback en caso de error
		}
	}

	public void generarIdVenta() {
		String nuevoId = generarSiguienteIdVenta();

		agregarPedidosVista.getJt_idVenta().setText(nuevoId);

		agregarPedidosVista.getVentaCreada().setIdVenta(nuevoId);
	}

	public String generarSiguienteIdVenta() {
		String ultimoId = ventaDAO.obtenerUltimoIdVenta();

		if (ultimoId == null) {
			return "VEN001";
		}

		// Extraer la parte numérica del ID
		String numeroStr = ultimoId.substring(3); // Quita el prefijo "VEN"
		int numero = Integer.parseInt(numeroStr);
		int siguienteNumero = numero + 1;

		// Formatea el nuevo ID con ceros a la izquierda
		return String.format("VEN%03d", siguienteNumero);
	}

	public void cancelarButtonEvent() {
		agregarPedidosVista.dispose();
	}

	public void addPedidoButtonEvent() {
		//Panel Pedido
		String idPedido = agregarPedidosVista.getJt_idPedido().getText();
		String idCliente = agregarPedidosVista.getJt_idCliente().getText();
		Date fechaEntregaDate = agregarPedidosVista.getJdatec_fechaEntrega().getDate();
		LocalDate fechaEntrega = null;
		if (fechaEntregaDate != null) {
			fechaEntrega = fechaEntregaDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		}
		String estado = agregarPedidosVista.getJcb_estadoPedido().getSelectedItem().toString();
		String observaciones = agregarPedidosVista.getJta_observaciones().getText();
		String idEmpleado = ((MenuPrincipal_2) agregarPedidosVista.getOwner()).getEmpleadoLogeado().getIdEmpleado();

		Pedido pedidoCreado = agregarPedidosVista.getPedidoCreado();
		pedidoCreado.setIdPedido(idPedido);
		pedidoCreado.setIdCliente(idCliente);
		pedidoCreado.setFechaEntrega(fechaEntrega);
		pedidoCreado.setEstadoPedido(estado);
		pedidoCreado.setObservaciones(observaciones);
		pedidoCreado.setIdEmpleado(idEmpleado);
		pedidoCreado.setFechaRegistro(LocalDateTime.now().withNano(0));

		JDateChooser jdatec_fechaEntrega = agregarPedidosVista.getJdatec_fechaEntrega();
		JTextField textJDateChooser = ((JTextField) jdatec_fechaEntrega.getDateEditor().getUiComponent());

		// Panel Venta
		String idVenta = agregarPedidosVista.getJt_idVenta().getText();
		String metodoPago = agregarPedidosVista.getJcb_metodoPago().getSelectedItem().toString();

		String rutaArchivo = agregarPedidosVista.getJt_rutaArchivo().getText();
		Date fechaEmisionDate = agregarPedidosVista.getJdatec_fechaEmision().getDate();
		LocalDate fechaEmision = null;
		if (fechaEmisionDate != null) {
			fechaEmision = fechaEmisionDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		}
		String idCompPago = agregarPedidosVista.getJt_idCompPago().getText();
		String numeroComprobante = agregarPedidosVista.getJt_numComprobante().getText();
		String montoTotal = agregarPedidosVista.getJt_montoTotal().getText();
		String tipoComprobante = agregarPedidosVista.getJcb_tipoComprobante().getSelectedItem().toString();
		String estadoPago = agregarPedidosVista.getJcb_estadoPago().getSelectedItem().toString();

		ComprobantePago comprobantePagoCreado = agregarPedidosVista.getComprobantePago();
		comprobantePagoCreado.setIdCompPago(idCompPago);
		comprobantePagoCreado.setNumeroComprobante(numeroComprobante);
		comprobantePagoCreado.setTipoComprobante(tipoComprobante);
		comprobantePagoCreado.setFechaEmision(fechaEmision);
		if (!montoTotal.isBlank()) {
			comprobantePagoCreado.setMontoTotal(new BigDecimal(montoTotal));
		}
		Path rutaDestino = UtilSelectorArchivo.obtenerRutaDestinoDesde(rutaArchivo);
		Path nombreArchivo = rutaDestino.getFileName();
		comprobantePagoCreado.setNombreArchivo(nombreArchivo.toString());
		comprobantePagoCreado.setRutaArchivo(rutaDestino.toString());
		comprobantePagoCreado.setFechaSubida(LocalDateTime.now().withNano(0));

		Venta ventaCreada = new Venta();
		ventaCreada.setEstadoPago(estadoPago);
		ventaCreada.setIdVenta(idVenta);
		ventaCreada.setMetodoPago(metodoPago);
		ventaCreada.setFechaVenta(LocalDate.now());

		pedidoCreado.setIdVenta(idVenta);

		if (estadoPago.equals("Pagado Parcialmente")) {
			if (idPedido != null && idCliente != null && fechaEntrega != null && !textJDateChooser.getForeground().equals(Color.RED)) {
				ventaDAO.agregarVenta(ventaCreada);
				pedidoDAO.agregarPedido(pedidoCreado);
				agregarPedidosVista.dispose();
			} else {
				JOptionPane.showMessageDialog(null,
						"Revisa el formulario. Algo no está bien.",
						"Estado actualizado",
						JOptionPane.WARNING_MESSAGE);
			}

		} else {
			if (idPedido != null && idCliente != null && fechaEntrega != null && !textJDateChooser.getForeground().equals(Color.RED) && !idCompPago.isEmpty() && !numeroComprobante.isEmpty() && fechaEmision != null && !montoTotal.isBlank() && nombreArchivo.toString() != null && rutaDestino != null) {
				ventaCreada.setIdCompPago(idCompPago);
				comprobantePagoDAO.agregar(comprobantePagoCreado);
				ventaDAO.agregarVenta(ventaCreada);
				pedidoDAO.agregarPedido(pedidoCreado);
				UtilSelectorArchivo.copiarArchivoARutaAplicacion(rutaArchivo);
				agregarPedidosVista.dispose();
			} else {
				JOptionPane.showMessageDialog(null,
						"Revisa el formulario. Algo no está bien.",
						"Estado actualizado",
						JOptionPane.WARNING_MESSAGE);
			}
		}

	}

	public void generarIdPedido() {
		String nuevoId = generarNuevoIdPedido();
		agregarPedidosVista.getJt_idPedido().setText(nuevoId);
	}

	public String generarNuevoIdPedido() {
		String ultimoId = pedidoDAO.obtenerUltimoIdPedido();

		if (ultimoId != null && ultimoId.startsWith("PED")) {
			int numero = Integer.parseInt(ultimoId.substring(3));
			numero++;
			return String.format("PED%03d", numero); // Relleno con ceros, hasta 3 cifras
		} else {
			return "PED001"; // Primer ID si no hay ninguno
		}
	}

	public void addClienteButtonEvent() {
		AddPedidoVista_SelectCliente selectClienteVista = new AddPedidoVista_SelectCliente(((Frame) agregarPedidosVista.getOwner()), true);

		selectClienteVista.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				String idCliente = agregarPedidosVista.getClienteCreado().getIdCliente();
				if (clienteDAO.buscarPorId(idCliente) != null) {
					agregarPedidosVista.getJt_idCliente().setText(idCliente);
				}
			}
		});

		new AddPedidoVista_SelectClienteControlador(selectClienteVista, agregarPedidosVista);
	}

	public void comboBoxEstadoPedidoEvent() {
		JComboBox jcbEstadoPedido = agregarPedidosVista.getJcb_estadoPedido();
		String itemSelected = String.valueOf(jcbEstadoPedido.getSelectedItem());

		switch (itemSelected) {
			case "En Producción":
				jcbEstadoPedido.setBackground(new Color(255, 235, 203)); // Naranja claro
				JOptionPane.showMessageDialog(null,
						"Este estado implica que se notificó al equipo de artesanía,\nhabiéndose comenzado ya la elaboración del pedido.",
						"Estado actualizado",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			case "Listo para Entrega":
				jcbEstadoPedido.setBackground(new Color(200, 255, 183)); // Verde claro
			// Aparición de mensajes, depende si se ha agregado o no productos terminados al pedido
			// Se verifica que estén en estock
//				JOptionPane.showMessageDialog(null,
//						"El pedido está listo para entregar.",
//						"Estado actualizado",
//						JOptionPane.INFORMATION_MESSAGE);
				break;

			default:
				jcbEstadoPedido.setBackground(Color.WHITE); // Color por defecto
		}
	}

	public void JbAddFileComprobanteEvent() {
		String ruta = UtilSelectorArchivo.seleccionarArchivo((Frame) agregarPedidosVista.getOwner());
		if (ruta != null) {
			if (!ruta.toLowerCase().endsWith(".pdf")) {
				JOptionPane.showMessageDialog(null,
						"Solo se admiten PDFs.",
						"Archivo Inválido.",
						JOptionPane.WARNING_MESSAGE);
			} else {
				agregarPedidosVista.getJt_rutaArchivo().setText(ruta);
				agregarPedidosVista.getRsb_verDocumento().setEnabled(true);
			}
		}
	}

	public void verDocumentoButtonEvent() {
		String ruta = agregarPedidosVista.getJt_rutaArchivo().getText();
		if (!ruta.isEmpty()) {
			UtilSelectorArchivo.abrirArchivoConAppPorDefecto(ruta);
		}
	}

	public void JbPedidoAddPT() {
		AddPT_PedidosVista pedidoAddPT = new AddPT_PedidosVista(((Frame) agregarPedidosVista.getOwner()), true);
		pedidoAddPT.setVisible(true);
	}

	public void warningEventFechaEntrega() {
		JDateChooser jdatec_fechaEntrega = agregarPedidosVista.getJdatec_fechaEntrega();
		Date fechaEntrega = jdatec_fechaEntrega.getDate();
		RSButtonFormaIcon jb_warningAdvice = agregarPedidosVista.getJb_warningAdvicePedido();

		JTextField textJDateChooser = ((JTextField) jdatec_fechaEntrega.getDateEditor().getUiComponent());

		ToolTipManager.sharedInstance().setInitialDelay(100);
		ToolTipManager.sharedInstance().setDismissDelay(5000);
		ToolTipManager.sharedInstance().setReshowDelay(100);

		if (fechaEntrega == null) {
			jb_warningAdvice.setVisible(true);
			jb_warningAdvice.setToolTipText("Ninguna fecha ingresada, o mal formato.");
		} else {
			if (esFechaHoyOPosterior(fechaEntrega)) {
				jb_warningAdvice.setVisible(false);
				textJDateChooser.setForeground(new Color(0, 153, 0));
			} else {
				jb_warningAdvice.setToolTipText("La fecha tiene que ser actual o posterior.");
				textJDateChooser.setForeground(Color.red);
				jb_warningAdvice.setVisible(true);
			}
		}
	}

	public void warningEventFechaEmision() {
		JDateChooser jdatec_fechaEmision = agregarPedidosVista.getJdatec_fechaEmision();
		Date fechaEmision = jdatec_fechaEmision.getDate();
		RSButtonFormaIcon jb_warningAdvice = agregarPedidosVista.getJb_warningAdviceVenta();

		JTextField textJDateChooser = ((JTextField) jdatec_fechaEmision.getDateEditor().getUiComponent());

		ToolTipManager.sharedInstance().setInitialDelay(100);
		ToolTipManager.sharedInstance().setDismissDelay(5000);
		ToolTipManager.sharedInstance().setReshowDelay(100);

		if (fechaEmision == null) {
			jb_warningAdvice.setVisible(true);
			jb_warningAdvice.setToolTipText("Ninguna fecha ingresada, o mal formato.");
		} else {
			jb_warningAdvice.setVisible(false);
			textJDateChooser.setForeground(new Color(0, 153, 0));
		}
	}

	public boolean esFechaHoyOPosterior(Date fechaSeleccionada) {
		if (fechaSeleccionada == null) {
			return false;
		}

		LocalDate fecha = fechaSeleccionada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate hoy = LocalDate.now();
		LocalDate limiteSuperior = LocalDate.of(9999, 01, 01);

		return (!fecha.isBefore(hoy)) && fecha.isBefore(limiteSuperior);
	}
}
