package modelo;

import java.time.LocalDate;

public class Cliente {

	private String idCliente;
	private String idDocIdentidad;
	private String nombre;
	private String apellido;
	private String direccion;
	private String telefono;
	private String correo;
	private Boolean estado;
	private LocalDate fechaRegistro;

	// Constructor vacío
	public Cliente() {
	}

	// Constructor con todos los campos
	public Cliente(String idCliente, String idDocIdentidad, String nombre, String apellido,
			String direccion, String telefono, String correo, Boolean estado, LocalDate fechaRegistro) {
		this.idCliente = idCliente;
		this.idDocIdentidad = idDocIdentidad;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
		this.estado = estado;
		this.fechaRegistro = fechaRegistro;
	}

	// Getters y Setters
	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getIdDocIdentidad() {
		return idDocIdentidad;
	}

	public void setIdDocIdentidad(String idDocIdentidad) {
		this.idDocIdentidad = idDocIdentidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(LocalDate fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	// Método para validación básica (puedes ampliar según tus reglas de negocio)
	public boolean isValid() {
		return idCliente != null && !idCliente.isBlank()
				&& idDocIdentidad != null && !idDocIdentidad.isBlank();
	}

	// toString para facilitar la depuración
	@Override
	public String toString() {
		return "Cliente{"
				+ "idCliente='" + idCliente + '\''
				+ ", idDocIdentidad='" + idDocIdentidad + '\''
				+ ", nombre='" + nombre + '\''
				+ ", apellido='" + apellido + '\''
				+ ", direccion='" + direccion + '\''
				+ ", telefono='" + telefono + '\''
				+ ", correo='" + correo + '\''
				+ ", estado=" + estado
				+ ", fechaRegistro=" + fechaRegistro
				+ '}';
	}
}
