package modelo;

public class Proveedor {

	private String idProveedor;
	private String nombre;
	private String ruc;
	private String direccion;
	private String telefono;
	private Boolean estado;

	// Constructor vacío
	public Proveedor() {
	}

	// Constructor completo
	public Proveedor(String idProveedor, String nombre, String ruc, String direccion, String telefono, Boolean estado) {
		this.idProveedor = idProveedor;
		this.nombre = nombre;
		this.ruc = ruc;
		this.direccion = direccion;
		this.telefono = telefono;
		this.estado = estado;
	}

	// Getters y setters
	public String getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(String idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
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

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	// Validación básica
	public boolean isValid() {
		return idProveedor != null && !idProveedor.isBlank()
				&& ruc != null && !ruc.isBlank();
	}

	// toString para depuración
	@Override
	public String toString() {
		return "Proveedor{"
				+ "idProveedor='" + idProveedor + '\''
				+ ", nombre='" + nombre + '\''
				+ ", ruc='" + ruc + '\''
				+ ", direccion='" + direccion + '\''
				+ ", telefono='" + telefono + '\''
				+ ", estado=" + estado
				+ '}';
	}
}