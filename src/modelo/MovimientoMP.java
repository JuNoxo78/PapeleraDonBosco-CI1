package modelo;

import java.time.LocalDateTime;

public class MovimientoMP {

	private String idMovimientoMP;
	private String idMateriaPrima;
	private LocalDateTime fechaMovimiento;
	private String tipo;
	private int cantidad;
	private String idEmpleado;
	private String idCompra;
	private String idInventarioMP;

	// Constructor vacío
	public MovimientoMP() {
	}

	// Constructor completo
	public MovimientoMP(String idMovimientoMP, String idMateriaPrima, LocalDateTime fechaMovimiento,
			String tipo, int cantidad, String idEmpleado, String idCompra, String idInventarioMP) {
		this.idMovimientoMP = idMovimientoMP;
		this.idMateriaPrima = idMateriaPrima;
		this.fechaMovimiento = fechaMovimiento;
		this.tipo = tipo;
		this.cantidad = cantidad;
		this.idEmpleado = idEmpleado;
		this.idCompra = idCompra;
		this.idInventarioMP = idInventarioMP;
	}

	// Getters y setters
	public String getIdMovimientoMP() {
		return idMovimientoMP;
	}

	public void setIdMovimientoMP(String idMovimientoMP) {
		this.idMovimientoMP = idMovimientoMP;
	}

	public String getIdMateriaPrima() {
		return idMateriaPrima;
	}

	public void setIdMateriaPrima(String idMateriaPrima) {
		this.idMateriaPrima = idMateriaPrima;
	}

	public LocalDateTime getFechaMovimiento() {
		return fechaMovimiento;
	}

	public void setFechaMovimiento(LocalDateTime fechaMovimiento) {
		this.fechaMovimiento = fechaMovimiento;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(String idCompra) {
		this.idCompra = idCompra;
	}

	public String getIdInventarioMP() {
		return idInventarioMP;
	}

	public void setIdInventarioMP(String idInventarioMP) {
		this.idInventarioMP = idInventarioMP;
	}

	// Validación básica
	public boolean isValid() {
		return idMovimientoMP != null && !idMovimientoMP.isBlank()
				&& tipo != null && !tipo.isBlank()
				&& cantidad > 0;
	}

	// toString para depuración
	@Override
	public String toString() {
		return "MovimientoMP{"
				+ "idMovimientoMP='" + idMovimientoMP + '\''
				+ ", idMateriaPrima='" + idMateriaPrima + '\''
				+ ", fechaMovimiento=" + fechaMovimiento
				+ ", tipo='" + tipo + '\''
				+ ", cantidad=" + cantidad
				+ ", idEmpleado='" + idEmpleado + '\''
				+ ", idCompra='" + idCompra + '\''
				+ ", idInventarioMP='" + idInventarioMP + '\''
				+ '}';
	}
}
