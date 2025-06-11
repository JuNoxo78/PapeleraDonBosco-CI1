package modelo;

public class MaterialIntermedio {

	private String idMaterialIntermedio;
	private String idDetalleMIFabricado;
	private String nombre;
	private String descripcion;
	private String unidadMedida;
	private int stockMinimo;
	private String tipoMI;

	// Constructor vacío
	public MaterialIntermedio() {
	}

	// Constructor completo
	public MaterialIntermedio(String idMaterialIntermedio, String idDetalleMIFabricado, String nombre,
			String descripcion, String unidadMedida, int stockMinimo, String tipoMI) {
		this.idMaterialIntermedio = idMaterialIntermedio;
		this.idDetalleMIFabricado = idDetalleMIFabricado;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.unidadMedida = unidadMedida;
		this.stockMinimo = stockMinimo;
		this.tipoMI = tipoMI;
	}

	// Getters y setters
	public String getIdMaterialIntermedio() {
		return idMaterialIntermedio;
	}

	public void setIdMaterialIntermedio(String idMaterialIntermedio) {
		this.idMaterialIntermedio = idMaterialIntermedio;
	}

	public String getIdDetalleMIFabricado() {
		return idDetalleMIFabricado;
	}

	public void setIdDetalleMIFabricado(String idDetalleMIFabricado) {
		this.idDetalleMIFabricado = idDetalleMIFabricado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUnidadMedida() {
		return unidadMedida;
	}

	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	public int getStockMinimo() {
		return stockMinimo;
	}

	public void setStockMinimo(int stockMinimo) {
		this.stockMinimo = stockMinimo;
	}

	public String getTipoMI() {
		return tipoMI;
	}

	public void setTipoMI(String tipoMI) {
		this.tipoMI = tipoMI;
	}

	// Validación básica
	public boolean isValid() {
		return idMaterialIntermedio != null && !idMaterialIntermedio.isBlank()
				&& nombre != null && !nombre.isBlank();
	}

	// toString para depuración
	@Override
	public String toString() {
		return "MaterialIntermedio{"
				+ "idMaterialIntermedio='" + idMaterialIntermedio + '\''
				+ ", idDetalleMIFabricado='" + idDetalleMIFabricado + '\''
				+ ", nombre='" + nombre + '\''
				+ ", descripcion='" + descripcion + '\''
				+ ", unidadMedida='" + unidadMedida + '\''
				+ ", stockMinimo=" + stockMinimo
				+ ", tipoMI='" + tipoMI + '\''
				+ '}';
	}
}
