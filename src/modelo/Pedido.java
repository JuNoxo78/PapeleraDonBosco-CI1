package modelo;

public class Pedido {

	private String idPedido;
	private String idCliente;
	private String idEmpleado;
	private String observaciones;
	private String estadoPedido;
	private String idVenta;

	// Constructor vacío
	public Pedido() {
	}

	// Constructor completo
	public Pedido(String idPedido, String idCliente, String idEmpleado, String observaciones,
			String estadoPedido, String idVenta) {
		this.idPedido = idPedido;
		this.idCliente = idCliente;
		this.idEmpleado = idEmpleado;
		this.observaciones = observaciones;
		this.estadoPedido = estadoPedido;
		this.idVenta = idVenta;
	}

	// Getters y setters
	public String getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(String idPedido) {
		this.idPedido = idPedido;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getEstadoPedido() {
		return estadoPedido;
	}

	public void setEstadoPedido(String estadoPedido) {
		this.estadoPedido = estadoPedido;
	}

	public String getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(String idVenta) {
		this.idVenta = idVenta;
	}

	// Validación básica
	public boolean isValid() {
		return idPedido != null && !idPedido.isBlank();
	}

	// toString para depuración
	@Override
	public String toString() {
		return "Pedido{"
				+ "idPedido='" + idPedido + '\''
				+ ", idCliente='" + idCliente + '\''
				+ ", idEmpleado='" + idEmpleado + '\''
				+ ", observaciones='" + observaciones + '\''
				+ ", estadoPedido='" + estadoPedido + '\''
				+ ", idVenta='" + idVenta + '\''
				+ '}';
	}
}
