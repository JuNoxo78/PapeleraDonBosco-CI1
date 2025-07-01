package modelo.inventario.materiales_intermedios;

import java.time.LocalDateTime;

public class MovimientoMI {

	private String idMovimientoMI;
	private String idMaterialIntermedio;
	private LocalDateTime fechaMovimiento;
	private String tipo;
	private int cantidad;
	private String idEmpleado;
	private String idCompra;
	private String idInventarioMI;

	// Constructor vacío
	public MovimientoMI() {
	}

	// Constructor completo
	public MovimientoMI(String idMovimientoMI, String idMaterialIntermedio, LocalDateTime fechaMovimiento,
			String tipo, int cantidad, String idEmpleado, String idCompra, String idInventarioMI) {
		this.idMovimientoMI = idMovimientoMI;
		this.idMaterialIntermedio = idMaterialIntermedio;
		this.fechaMovimiento = fechaMovimiento;
		this.tipo = tipo;
		this.cantidad = cantidad;
		this.idEmpleado = idEmpleado;
		this.idCompra = idCompra;
		this.idInventarioMI = idInventarioMI;
	}

	// Getters y setters
	public String getIdMovimientoMI() {
		return idMovimientoMI;
	}

	public void setIdMovimientoMI(String idMovimientoMI) {
		this.idMovimientoMI = idMovimientoMI;
	}

	public String getIdMaterialIntermedio() {
		return idMaterialIntermedio;
	}

	public void setIdMaterialIntermedio(String idMaterialIntermedio) {
		this.idMaterialIntermedio = idMaterialIntermedio;
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

	public String getIdInventarioMI() {
		return idInventarioMI;
	}

	public void setIdInventarioMI(String idInventarioMI) {
		this.idInventarioMI = idInventarioMI;
	}

	// Validación básica
	public boolean isValid() {
		return idMovimientoMI != null && !idMovimientoMI.isBlank()
				&& tipo != null && !tipo.isBlank()
				&& cantidad > 0;
	}

	// toString para depuración
	@Override
	public String toString() {
		return "MovimientoMI{"
				+ "idMovimientoMI='" + idMovimientoMI + '\''
				+ ", idMaterialIntermedio='" + idMaterialIntermedio + '\''
				+ ", fechaMovimiento=" + fechaMovimiento
				+ ", tipo='" + tipo + '\''
				+ ", cantidad=" + cantidad
				+ ", idEmpleado='" + idEmpleado + '\''
				+ ", idCompra='" + idCompra + '\''
				+ ", idInventarioMI='" + idInventarioMI + '\''
				+ '}';
	}
}
