package modelo.compras;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Compra {

	private String idCompra;
	private LocalDate fechaCompra;
	private BigDecimal totalPagado;
	private String estadoCompra;
	private String idProveedor;
	private String idEmpleado;

	// Constructor vacío
	public Compra() {
	}

	// Constructor completo
	public Compra(String idCompra, LocalDate fechaCompra, BigDecimal totalPagado, String estadoCompra, String idProveedor, String idEmpleado) {
		this.idCompra = idCompra;
		this.fechaCompra = fechaCompra;
		this.totalPagado = totalPagado;
		this.estadoCompra = estadoCompra;
		this.idProveedor = idProveedor;
		this.idEmpleado = idEmpleado;
	}

	// Getters y Setters
	public String getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(String idCompra) {
		this.idCompra = idCompra;
	}

	public LocalDate getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(LocalDate fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public BigDecimal getTotalPagado() {
		return totalPagado;
	}

	public void setTotalPagado(BigDecimal totalPagado) {
		this.totalPagado = totalPagado;
	}

	public String getEstadoCompra() {
		return estadoCompra;
	}

	public void setEstadoCompra(String estadoCompra) {
		this.estadoCompra = estadoCompra;
	}

	public String getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(String idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	// Validación básica
	public boolean isValid() {
		return idCompra != null && !idCompra.isBlank();
	}

	// toString para depuración
	@Override
	public String toString() {
		return "Compra{"
				+ "idCompra='" + idCompra + '\''
				+ ", fechaCompra=" + fechaCompra
				+ ", totalPagado=" + totalPagado
				+ ", estadoCompra='" + estadoCompra + '\''
				+ ", idProveedor='" + idProveedor + '\''
				+ ", idEmpleado='" + idEmpleado + '\''
				+ '}';
	}
}
