package controlador.pedidos_ventas;

import controlador.menu_principal.MenuPControlador;
import dao.clientes.ClienteDAO;
import dao.pedidos_ventas.PedidoDAO;
import extra.MultiColumnLayout;
import extra.PanelRound;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JPanel;
import modelo.clientes.Cliente;
import modelo.pedidos_ventas.Pedido;
import rojeru_san.rspanel.RSPanelImage;
import vista.pedidos_ventas.AddPedidoVista;
import vista.pedidos_ventas.Pedidos_Card;
import vista.pedidos_ventas.PedidosVista;

public class PedidosControlador {

	private final PedidoDAO pedidoDAO = new PedidoDAO();
	private final PedidosVista pedidosPanel;
	private final ClienteDAO clienteDAO = new ClienteDAO();
	private List<Pedido> listaPedidos;
	private final DateTimeFormatter formatoLocalDate = DateTimeFormatter.ofPattern("dd-MM-yy");

	public PedidosControlador(PedidosVista pedidosPanel) {
		this.pedidosPanel = pedidosPanel;
		initController();
	}

	private void initController() {
		cargarPedidos();

		pedidosPanel.setJb_crearPedidoEvent((ActionEvent e) -> CrearPedidoButtonEvent());
	}

	private void cargarPedidos() {
		listaPedidos = pedidoDAO.obtenerPedidos();
		JPanel jp_pedidos = pedidosPanel.getJp_pedidos();
		jp_pedidos.setLayout(new MultiColumnLayout(2, 10, 10));

		for (int i = 0; i < listaPedidos.size(); i++) {
			Pedidos_Card cardPedidos = new Pedidos_Card();
			String id = listaPedidos.get(i).getIdPedido();
			String estado = listaPedidos.get(i).getEstadoPedido();
			String idCliente = listaPedidos.get(i).getIdCliente();
			Cliente cliente = clienteDAO.buscarPorId(idCliente);
			String fechaEntrega = listaPedidos.get(i).getFechaEntrega().format(formatoLocalDate);

			// Card Contenido
			cardPedidos.setTextJl_title("  Pedido " + id);
			cardPedidos.setTextJl_estado("Estado: " + estado);
			cardPedidos.setTextJl_cliente("Cliente: " + cliente.getNombre() + " " + cliente.getApellido());
			cardPedidos.setTextJl_fechaEntrega("F. Entrega: " + fechaEntrega);

			// Card UI
			PanelRound cardPedido = cardPedidos.getCardPedido();
			PanelRound cardContent = cardPedidos.getCardContent();
			setCardColors(cardPedido, cardContent, estado);
			RSPanelImage jp_image = cardPedidos.getJp_image();
			setResizingImageCard(cardPedido, jp_image);

			// Card Load
			cardPedido.setPreferredSize(new Dimension(80, cardPedido.getSize().height));
			jp_pedidos.add(cardPedido);
		}
	}

	private void setCardColors(PanelRound cardPedido, PanelRound cardContent, String estado) {
		Color activeIniciarProd = new Color(255, 203, 203);
		Color inactiveIniciarProd = new Color(255, 219, 219);

		Color activeEnProd = new Color(255, 235, 203);
		Color inactiveEnProd = new Color(255, 245, 229);

		Color activeListoParaEntrega = new Color(200, 255, 183) ;
		Color inactiveListoParaEntrega = new Color(235, 255, 229);

		Color activeEntregado = new Color(178, 199, 255);
		Color inactiveEntregado = new Color(214, 225, 255);

		Color activo = activeIniciarProd;
		Color inactivo = inactiveIniciarProd;

		switch (estado) {
			case "Iniciar Producción" -> {
				inactivo = inactiveIniciarProd;
			}
			case "En Producción" -> {
				inactivo = inactiveEnProd;
			}
			case "Listo Para Entrega" -> {
				inactivo = inactiveListoParaEntrega;
			}
			case "Entregado" -> {
				inactivo = inactiveEntregado;
			}
			default -> {
				System.out.println("Estado no identificado.");
			}

		}

		cardPedido.setBackground(inactivo);
		cardContent.setBackground(inactivo);

		cardPedido.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				cardPedido.setCursor(new Cursor(Cursor.HAND_CURSOR));

				switch (estado) {
					case "Iniciar Producción" -> {
						cardPedido.setBackground(activeIniciarProd);
						cardContent.setBackground(activeIniciarProd);
					}
					case "En Producción" -> {
						cardPedido.setBackground(activeEnProd);
						cardContent.setBackground(activeEnProd);

					}
					case "Listo Para Entrega" -> {
						cardPedido.setBackground(activeListoParaEntrega);
						cardContent.setBackground(activeListoParaEntrega);
					}
					case "Entregado" -> {
						cardPedido.setBackground(activeEntregado);
						cardContent.setBackground(activeEntregado);
					}
					default -> {
						System.out.println("Estado no identificado.");
					}

				}
			}

			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				cardPedido.setCursor(Cursor.getDefaultCursor());

				switch (estado) {
					case "Iniciar Producción" -> {
						cardPedido.setBackground(inactiveIniciarProd);
						cardContent.setBackground(inactiveIniciarProd);
					}
					case "En Producción" -> {
						cardPedido.setBackground(inactiveEnProd);
						cardContent.setBackground(inactiveEnProd);

					}
					case "Listo Para Entrega" -> {
						cardPedido.setBackground(inactiveListoParaEntrega);
						cardContent.setBackground(inactiveListoParaEntrega);
					}
					case "Entregado" -> {
						cardPedido.setBackground(inactiveEntregado);
						cardContent.setBackground(inactiveEntregado);
					}
					default -> {
						System.out.println("Estado no identificado");
					}

				}
			}
		});
	}

	private void setResizingImageCard(PanelRound cardPedido, RSPanelImage jp_image) {
		cardPedido.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				int anchoActual = cardPedido.getWidth();
				if (anchoActual < 268) {
					jp_image.setVisible(false);
				} else {
					jp_image.setVisible(true);
				}
			}
		});

	}

	private void CrearPedidoButtonEvent() {
		AddPedidoVista agregarPedidosVista = new AddPedidoVista();
		AddPedidoControlador pedidoControlador = new AddPedidoControlador(agregarPedidosVista);
		MenuPControlador.addChild(agregarPedidosVista);
	}
}
