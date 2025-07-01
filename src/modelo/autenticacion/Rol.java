package modelo.autenticacion;

public class Rol {

	private String idRol;
	private String nombreRol;
	private String descripcion;

	// Constructor vacío
	public Rol() {
	}

	// Constructor completo
	public Rol(String idRol, String nombreRol, String descripcion) {
		this.idRol = idRol;
		this.nombreRol = nombreRol;
		this.descripcion = descripcion;
	}

	// Getters y setters
	public String getIdRol() {
		return idRol;
	}

	public void setIdRol(String idRol) {
		this.idRol = idRol;
	}

	public String getNombreRol() {
		return nombreRol;
	}

	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	// Validación básica
	public boolean isValid() {
		return idRol != null && !idRol.isBlank();
	}

	// toString para depuración
	@Override
	public String toString() {
		return "Rol{"
				+ "idRol='" + idRol + '\''
				+ ", nombreRol='" + nombreRol + '\''
				+ ", descripcion='" + descripcion + '\''
				+ '}';
	}
}
