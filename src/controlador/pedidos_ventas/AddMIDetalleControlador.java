package controlador.pedidos_ventas;

import dao.inventario.materiales_intermedios.MIDAO;
import dao.inventario.productos_terminados.PTDAO;
import extra.AcordeonPanel;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import modelo.inventario.productos_terminados.ProductoTerminado;
import vista.pedidos_ventas.AddMIDetalle_PedidosVista;
import vista.pedidos_ventas.AddPedidoVista;
import vista.pedidos_ventas.SelectMIManualmente;
import vista.pedidos_ventas.AddPedido_SelectPTVista;

public class AddMIDetalleControlador {

	private AddMIDetalle_PedidosVista addMIDetalleVista;
	private AcordeonPanel acordeon;
	private String idPT;
	private final AddPedido_SelectPTVista selectPTVista;
	private final AddPedidoVista agregarPedidoVista;

	private final PTDAO ptDAO = new PTDAO();
	private final MIDAO miDAO = new MIDAO();

	public AddMIDetalleControlador(AddMIDetalle_PedidosVista addMIDetalleVista, String idPT, AcordeonPanel acordeon, AddPedido_SelectPTVista selectPTVista, AddPedidoVista agregarPedidoVista) {
		this.addMIDetalleVista = addMIDetalleVista;
		this.idPT = idPT;
		this.acordeon = acordeon;
		this.selectPTVista = selectPTVista;
		this.agregarPedidoVista = agregarPedidoVista;
		initController();
	}

	public void initController() {
		cargarPrecioUnitario();
		addMIDetalleVista.setJb_addManualmenteEvent((ActionEvent e) -> botonAddManualmenteEvento());
	}

	public void cargarPrecioUnitario() {
		ProductoTerminado pt = ptDAO.buscarPorId(idPT);
		addMIDetalleVista.getJt_precioUnitario().setText(pt.getPrecio().toString());
	}

	public void botonAddManualmenteEvento() {
		SelectMIManualmente addMIManualVista = new SelectMIManualmente((Frame) selectPTVista.getOwner(), true);
		new SelectMIManualmenteControlador(addMIManualVista, agregarPedidoVista, addMIDetalleVista, idPT);
	}
}
