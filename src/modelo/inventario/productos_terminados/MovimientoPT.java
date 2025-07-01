package modelo.inventario.productos_terminados;

import java.time.LocalDateTime;

public class MovimientoPT {

	private String idMovimientoPT;
	private String idProductoTerminado;
	private LocalDateTime fechaMovimiento;
	private String tipo;
	private int cantidad;
	private String idEmpleado;
	private String idInventarioPT;

	// Constructor vacío
	public MovimientoPT() {
	}

	// Constructor completo
	public MovimientoPT(String idMovimientoPT, String idProductoTerminado, LocalDateTime fechaMovimiento,
			String tipo, int cantidad, String idEmpleado, String idInventarioPT) {
		this.idMovimientoPT = idMovimientoPT;
		this.idProductoTerminado = idProductoTerminado;
		this.fechaMovimiento = fechaMovimiento;
		this.tipo = tipo;
		this.cantidad = cantidad;
		this.idEmpleado = idEmpleado;
		this.idInventarioPT = idInventarioPT;
	}

	// Getters y setters
	public String getIdMovimientoPT() {
		return idMovimientoPT;
	}

	public void setIdMovimientoPT(String idMovimientoPT) {
		this.idMovimientoPT = idMovimientoPT;
	}

	public String getIdProductoTerminado() {
		return idProductoTerminado;
	}

	public void setIdProductoTerminado(String idProductoTerminado) {
		this.idProductoTerminado = idProductoTerminado;
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

	public String getIdInventarioPT() {
		return idInventarioPT;
	}

	public void setIdInventarioPT(String idInventarioPT) {
		this.idInventarioPT = idInventarioPT;
	}

	// Validación básica
	public boolean isValid() {
		return idMovimientoPT != null && !idMovimientoPT.isBlank()
				&& tipo != null && !tipo.isBlank()
				&& cantidad > 0;
	}

	// toString para depuración
	@Override
	public String toString() {
		return "MovimientoPT{"
				+ "idMovimientoPT='" + idMovimientoPT + '\''
				+ ", idProductoTerminado='" + idProductoTerminado + '\''
				+ ", fechaMovimiento=" + fechaMovimiento
				+ ", tipo='" + tipo + '\''
				+ ", cantidad=" + cantidad
				+ ", idEmpleado='" + idEmpleado + '\''
				+ ", idInventarioPT='" + idInventarioPT + '\''
				+ '}';
	}
}
