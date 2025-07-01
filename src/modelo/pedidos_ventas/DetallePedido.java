package modelo.pedidos_ventas;

import java.math.BigDecimal;

public class DetallePedido {

	private String idPedido;
	private String idProductoTerminado;
	private int cantidad;
	private BigDecimal precioUnitario;

	// Constructor vacío
	public DetallePedido() {
	}

	// Constructor completo
	public DetallePedido(String idPedido, String idProductoTerminado, int cantidad, BigDecimal precioUnitario) {
		this.idPedido = idPedido;
		this.idProductoTerminado = idProductoTerminado;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
	}

	// Getters y setters
	public String getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(String idPedido) {
		this.idPedido = idPedido;
	}

	public String getIdProductoTerminado() {
		return idProductoTerminado;
	}

	public void setIdProductoTerminado(String idProductoTerminado) {
		this.idProductoTerminado = idProductoTerminado;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	// Validación básica
	public boolean isValid() {
		return idPedido != null && !idPedido.isBlank()
				&& idProductoTerminado != null && !idProductoTerminado.isBlank()
				&& cantidad > 0;
	}

	// toString para depuración
	@Override
	public String toString() {
		return "DetallePedido{"
				+ "idPedido='" + idPedido + '\''
				+ ", idProductoTerminado='" + idProductoTerminado + '\''
				+ ", cantidad=" + cantidad
				+ ", precioUnitario=" + precioUnitario
				+ '}';
	}
}
