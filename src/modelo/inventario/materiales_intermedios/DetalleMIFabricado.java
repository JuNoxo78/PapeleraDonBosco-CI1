package modelo.inventario.materiales_intermedios;

public class DetalleMIFabricado {

	private String idDetalleMIFabricado;
	private String idMaterialIntermedio;
	private String dimensiones;
	private String gramaje;
	private String textura;
	private String remate;

	// Constructor vacío
	public DetalleMIFabricado() {
	}

	// Constructor completo
	public DetalleMIFabricado(String idDetalleMIFabricado, String idMaterialIntermedio, String dimensiones, String gramaje, String textura, String remate) {
		this.idDetalleMIFabricado = idDetalleMIFabricado;
		this.idMaterialIntermedio = idMaterialIntermedio;
		this.dimensiones = dimensiones;
		this.gramaje = gramaje;
		this.textura = textura;
		this.remate = remate;
	}

	// Getters y setters
	public String getIdDetalleMIFabricado() {
		return idDetalleMIFabricado;
	}

	public void setIdDetalleMIFabricado(String idDetalleMIFabricado) {
		this.idDetalleMIFabricado = idDetalleMIFabricado;
	}

	public String getIdMaterialIntermedio() {
		return idMaterialIntermedio;
	}

	public void setIdMaterialIntermedio(String idMaterialIntermedio) {
		this.idMaterialIntermedio = idMaterialIntermedio;
	}

	public String getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}

	public String getGramaje() {
		return gramaje;
	}

	public void setGramaje(String gramaje) {
		this.gramaje = gramaje;
	}

	public String getTextura() {
		return textura;
	}

	public void setTextura(String textura) {
		this.textura = textura;
	}

	public String getRemate() {
		return remate;
	}

	public void setRemate(String remate) {
		this.remate = remate;
	}

	// Validación básica
	public boolean isValid() {
		return idDetalleMIFabricado != null && !idDetalleMIFabricado.isBlank();
	}

	// toString para depuración
	@Override
	public String toString() {
		return "DetalleMIFabricado{"
				+ "idDetalleMIFabricado='" + idDetalleMIFabricado + '\''
				+ ", idMaterialIntermedio='" + idMaterialIntermedio + '\''
				+ ", dimensiones='" + dimensiones + '\''
				+ ", gramaje='" + gramaje + '\''
				+ ", textura='" + textura + '\''
				+ ", remate='" + remate + '\''
				+ '}';
	}
}
