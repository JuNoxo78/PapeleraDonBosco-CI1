package modelo;

public class ProveedorxMaterialIntermedio {

	private String idProveedor;
	private String idMaterialIntermedio;

	// Constructor vacío
	public ProveedorxMaterialIntermedio() {
	}

	// Constructor completo
	public ProveedorxMaterialIntermedio(String idProveedor, String idMaterialIntermedio) {
		this.idProveedor = idProveedor;
		this.idMaterialIntermedio = idMaterialIntermedio;
	}

	// Getters y setters
	public String getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(String idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getIdMaterialIntermedio() {
		return idMaterialIntermedio;
	}

	public void setIdMaterialIntermedio(String idMaterialIntermedio) {
		this.idMaterialIntermedio = idMaterialIntermedio;
	}

	// Validación básica
	public boolean isValid() {
		return idProveedor != null && !idProveedor.isBlank()
				&& idMaterialIntermedio != null && !idMaterialIntermedio.isBlank();
	}

	// toString para depuración
	@Override
	public String toString() {
		return "ProveedorxMaterialIntermedio{"
				+ "idProveedor='" + idProveedor + '\''
				+ ", idMaterialIntermedio='" + idMaterialIntermedio + '\''
				+ '}';
	}
}
