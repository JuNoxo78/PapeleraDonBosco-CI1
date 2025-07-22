package controlador.pedidos_ventas;

import dao.inventario.productos_terminados.PTDAO;
import extra.Validaciones;
import java.awt.event.ActionEvent;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.inventario.productos_terminados.ProductoTerminado;
import vista.pedidos_ventas.AddPedido_AddPTVista;
import vista.pedidos_ventas.AddPedido_SelectPTVista;

public final class AddPedido_AddPTControlador {

	private final AddPedido_SelectPTVista selectPTVista;
	private final AddPedido_AddPTVista addPTVista;
	private final PTDAO ptDAO = new PTDAO();

	public AddPedido_AddPTControlador(AddPedido_SelectPTVista selectPTVista, AddPedido_AddPTVista addPTVista) {
		this.selectPTVista = selectPTVista;
		this.addPTVista = addPTVista;
		initController();
	}

	public void initController() {
		generarIdPT(addPTVista.getJt_idPT());

		addPTVista.setJb_cancelarEvent((ActionEvent e) -> cancelarButtonEvent());
		addPTVista.setJb_addPT((ActionEvent e) -> addPTButtonEvent());

		addPTVista.setVisible(true);
	}

	// Generar idPT automáticamente
	public void generarIdPT(JTextField jt_idPT) {
		String nuevoId = generarNuevoIdPT();

		addPTVista.getJt_idPT().setText(nuevoId);
	}

	public String generarNuevoIdPT() {
		String ultimoId = ptDAO.obtenerUltimoId(); // ejemplo: "PT015"
		if (ultimoId == null) {
			return "PT001";
		}

		int numero = Integer.parseInt(ultimoId.substring(2)); // extrae "015" → 15
		numero++; // siguiente número
		return String.format("PT%03d", numero); // → "PT016"
	}


	// Evento de cierre del botón cancelar
	public void cancelarButtonEvent() {
		addPTVista.dispose();
	}

	// Evento del botón "agregar" para agregar PT
	public void addPTButtonEvent() {
		// Datos de Producto Terminado a crear, asignación a instancia
		String idPT = addPTVista.getJt_idPT().getText();
		String nombre = addPTVista.getJt_nombre().getText();
		String precio = addPTVista.getJt_precio().getText();
		String stockMinimo = addPTVista.getJt_stockMinimo().getText();
		String tipoPT = addPTVista.getJcb_tipoPT().getSelectedItem().toString();
		String dimensiones = addPTVista.getJt_dimensiones().getText();
		String descripción = addPTVista.getJta_descripcion().getText();

		ProductoTerminado productoTerminadoCreado = selectPTVista.getProductoTerminadoCreado();

		productoTerminadoCreado.setIdProductoTerminado(idPT);
		productoTerminadoCreado.setNombre(nombre);
		if (!precio.isBlank() && Validaciones.esBigDecimalValido(precio)) {
			productoTerminadoCreado.setPrecio(new BigDecimal(precio));
		}
		if (!stockMinimo.isBlank() && Validaciones.esEnteroValido(stockMinimo)) {
			productoTerminadoCreado.setStockMinimo(Integer.parseInt(stockMinimo));
		}
		productoTerminadoCreado.setTipoPT(tipoPT);
		productoTerminadoCreado.setDimensiones(dimensiones);
		productoTerminadoCreado.setDescripcion(descripción);
		productoTerminadoCreado.setFechaSubida(LocalDateTime.now().withNano(0));

		// Validación para agregación posible y correcta
		if (!idPT.isBlank() && !nombre.isBlank() && !precio.isBlank() && Validaciones.esBigDecimalValido(precio) && Validaciones.esEnteroValido(stockMinimo) && !tipoPT.isBlank()) {
			ptDAO.insertar(productoTerminadoCreado);
			addPTVista.dispose();
		} else {
			JOptionPane.showMessageDialog(null,
					"Hay algún error en el formulario que debes corregir.",
					"Error en formulario.",
					JOptionPane.WARNING_MESSAGE);
		}

	}

}
