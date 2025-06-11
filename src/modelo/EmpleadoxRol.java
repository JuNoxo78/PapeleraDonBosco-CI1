package modelo;

import java.time.LocalDate;

public class EmpleadoxRol {

	private String idEmpleado;
	private String idRol;
	private LocalDate fechaRolAñadido;

	// Constructor vacío
	public EmpleadoxRol() {
	}

	// Constructor completo
	public EmpleadoxRol(String idEmpleado, String idRol, LocalDate fechaRolAñadido) {
		this.idEmpleado = idEmpleado;
		this.idRol = idRol;
		this.fechaRolAñadido = fechaRolAñadido;
	}

	// Getters y setters
	public String getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getIdRol() {
		return idRol;
	}

	public void setIdRol(String idRol) {
		this.idRol = idRol;
	}

	public LocalDate getFechaRolAñadido() {
		return fechaRolAñadido;
	}

	public void setFechaRolAñadido(LocalDate fechaRolAñadido) {
		this.fechaRolAñadido = fechaRolAñadido;
	}

	// Validación básica
	public boolean isValid() {
		return idEmpleado != null && !idEmpleado.isBlank()
				&& idRol != null && !idRol.isBlank();
	}

	// toString para depuración
	@Override
	public String toString() {
		return "EmpleadoxRol{"
				+ "idEmpleado='" + idEmpleado + '\''
				+ ", idRol='" + idRol + '\''
				+ ", fechaRolAñadido=" + fechaRolAñadido
				+ '}';
	}
}
