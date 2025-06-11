package modelo;

public class ProveedorxMateriaPrima {

	private String idProveedor;
	private String idMateriaPrima;

	// Constructor vacío
	public ProveedorxMateriaPrima() {
	}

	// Constructor completo
	public ProveedorxMateriaPrima(String idProveedor, String idMateriaPrima) {
		this.idProveedor = idProveedor;
		this.idMateriaPrima = idMateriaPrima;
	}

	// Getters y setters
	public String getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(String idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getIdMateriaPrima() {
		return idMateriaPrima;
	}

	public void setIdMateriaPrima(String idMateriaPrima) {
		this.idMateriaPrima = idMateriaPrima;
	}

	// Validación básica
	public boolean isValid() {
		return idProveedor != null && !idProveedor.isBlank()
				&& idMateriaPrima != null && !idMateriaPrima.isBlank();
	}

	// toString para depuración
	@Override
	public String toString() {
		return "ProveedorxMateriaPrima{"
				+ "idProveedor='" + idProveedor + '\''
				+ ", idMateriaPrima='" + idMateriaPrima + '\''
				+ '}';
	}
}
