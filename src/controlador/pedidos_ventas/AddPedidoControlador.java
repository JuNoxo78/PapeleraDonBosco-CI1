package controlador.pedidos_ventas;

import RSMaterialComponent.RSButtonFormaIcon;
import com.toedter.calendar.JDateChooser;
import extra.HoverToolTip;
import extra.UtilSelectorArchivo;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import vista.pedidos_ventas.AddPedidoVista;
import vista.pedidos_ventas.AddPT_PedidosVista;
import vista.pedidos_ventas.AddPedidoVista_SelectCliente;

public final class AddPedidoControlador {

	private final AddPedidoVista agregarPedidosVista;
	private final HoverToolTip tooltip1 = new HoverToolTip("Fecha inválida. Anterior a la actual, o mal formato.");

	public AddPedidoControlador(AddPedidoVista agregarPedidosVista) {
		this.agregarPedidosVista = agregarPedidosVista;
		initController();
	}

	public void initController() {
		agregarPedidosVista.setJb_addFileComprobanteEvent((ActionEvent e) -> JbAddFileComprobanteEvent());
		agregarPedidosVista.setJb_pedidoAddPT((ActionEvent e) -> JbPedidoAddPT());
		agregarPedidosVista.setJdatec_fechaEntregaFocusLost(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				warningEventFechaEntrega();
			}
		});
		agregarPedidosVista.setEventoCambioTextoFecha(new DocumentListener() {
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
		agregarPedidosVista.getJdatec_fechaEntrega().getDateEditor().addPropertyChangeListener("date", evt -> {
			warningEventFechaEntrega();
		});

		agregarPedidosVista.setJcb_estadoPedidoEvent((ActionEvent e) -> comboBoxEstadoPedidoEvent());
		agregarPedidosVista.setRsb_addClienteEvent((ActionEvent e) -> addClienteButtonEvent());

		agregarPedidosVista.setVisible(true);
	}

	public void addClienteButtonEvent() {
		AddPedidoVista_SelectCliente selectClienteVista = new AddPedidoVista_SelectCliente(agregarPedidosVista, true);

		selectClienteVista.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				String idCliente = agregarPedidosVista.getClienteCreado().getIdCliente();
				agregarPedidosVista.getJt_idCliente().setText(idCliente);
			}
		});

		new AddPedidoVista_SelectClienteControlador(selectClienteVista);
	}

	public void comboBoxEstadoPedidoEvent() {
		JComboBox jcbEstadoPedido = agregarPedidosVista.getJcb_estadoPedido();
		String itemSelected = String.valueOf(jcbEstadoPedido.getSelectedItem());

		switch (itemSelected) {
			case "Iniciar Producción":
				jcbEstadoPedido.setBackground(new Color(255, 203, 203)); // Amarillo claro
				JOptionPane.showMessageDialog(null,
						"La producción ha sido iniciada.",
						"Estado actualizado",
						JOptionPane.INFORMATION_MESSAGE);
				break;

			case "En Producción":
				jcbEstadoPedido.setBackground(new Color(255, 235, 203)); // Naranja claro
				JOptionPane.showMessageDialog(null,
						"Este estado implica que se notificó al equipo de artesanía,\nhabiéndose comenzado ya la elaboración del pedido.",
						"Estado actualizado",
						JOptionPane.INFORMATION_MESSAGE);
				break;

			case "Listo para Entregar":
				jcbEstadoPedido.setBackground(new Color(200, 255, 183)); // Verde claro
			// Aparición de mensajes, depende si se ha agregado o no productos terminados al pedido
			// Se verifica que estén en estock
//				JOptionPane.showMessageDialog(null,
//						"El pedido está listo para entregar.",
//						"Estado actualizado",
//						JOptionPane.INFORMATION_MESSAGE);
//				break;

			default:
				jcbEstadoPedido.setBackground(Color.WHITE); // Color por defecto
		}
	}

	public void JbAddFileComprobanteEvent() {
		String ruta = UtilSelectorArchivo.seleccionarArchivo(agregarPedidosVista);
	}

	public void JbPedidoAddPT() {
		AddPT_PedidosVista pedidoAddPT = new AddPT_PedidosVista(agregarPedidosVista, true);
		pedidoAddPT.setVisible(true);
	}

	public void warningEventFechaEntrega() {
		JDateChooser jdatec_fechaEntrega = agregarPedidosVista.getJdatec_fechaEntrega();
		Date fechaEntrega = jdatec_fechaEntrega.getDate();
		RSButtonFormaIcon jb_warningAdvice = agregarPedidosVista.getJb_warningAdvice();

		JTextField textJDateChooser = ((JTextField) jdatec_fechaEntrega.getDateEditor().getUiComponent());

		if (fechaEntrega == null) {
			tooltip1.asociarA(jb_warningAdvice);
			jb_warningAdvice.setVisible(true);
		} else {
			if (esFechaHoyOPosterior(fechaEntrega)) {
				jb_warningAdvice.setVisible(false);
				textJDateChooser.setForeground(new Color(0, 153, 0));
			} else {
				tooltip1.asociarA(jb_warningAdvice);
				textJDateChooser.setForeground(Color.red);
				jb_warningAdvice.setVisible(true);
			}
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
