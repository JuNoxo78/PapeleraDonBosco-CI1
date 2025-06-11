package modelo;

import java.time.LocalDate;

public class Venta {

	private String idVenta;
	private String idCompPago;
	private LocalDate fechaVenta;
	private String metodoPago;
	private String estadoPago;

	// Constructor vacío
	public Venta() {
	}

	// Constructor completo
	public Venta(String idVenta, String idCompPago, LocalDate fechaVenta, String metodoPago, String estadoPago) {
		this.idVenta = idVenta;
		this.idCompPago = idCompPago;
		this.fechaVenta = fechaVenta;
		this.metodoPago = metodoPago;
		this.estadoPago = estadoPago;
	}

	// Getters y setters
	public String getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(String idVenta) {
		this.idVenta = idVenta;
	}

	public String getIdCompPago() {
		return idCompPago;
	}

	public void setIdCompPago(String idCompPago) {
		this.idCompPago = idCompPago;
	}

	public LocalDate getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public String getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}

	public String getEstadoPago() {
		return estadoPago;
	}

	public void setEstadoPago(String estadoPago) {
		this.estadoPago = estadoPago;
	}

	// Validación básica
	public boolean isValid() {
		return idVenta != null && !idVenta.isBlank();
	}

	// toString para depuración
	@Override
	public String toString() {
		return "Venta{"
				+ "idVenta='" + idVenta + '\''
				+ ", idCompPago='" + idCompPago + '\''
				+ ", fechaVenta=" + fechaVenta
				+ ", metodoPago='" + metodoPago + '\''
				+ ", estadoPago='" + estadoPago + '\''
				+ '}';
	}
}
