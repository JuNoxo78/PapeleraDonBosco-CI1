package modelo;

public class DetallePlantillaMI {

	private String idDetallePlantillaMI;
	private String idMaterialIntermedio;
	private int cantidadRequerida;
	private String comentarios;
	private String idPlantillaMI;

	// Constructor vacío
	public DetallePlantillaMI() {
	}

	// Constructor completo
	public DetallePlantillaMI(String idDetallePlantillaMI, String idMaterialIntermedio, int cantidadRequerida,
			String comentarios, String idPlantillaMI) {
		this.idDetallePlantillaMI = idDetallePlantillaMI;
		this.idMaterialIntermedio = idMaterialIntermedio;
		this.cantidadRequerida = cantidadRequerida;
		this.comentarios = comentarios;
		this.idPlantillaMI = idPlantillaMI;
	}

	// Getters y setters
	public String getIdDetallePlantillaMI() {
		return idDetallePlantillaMI;
	}

	public void setIdDetallePlantillaMI(String idDetallePlantillaMI) {
		this.idDetallePlantillaMI = idDetallePlantillaMI;
	}

	public String getIdMaterialIntermedio() {
		return idMaterialIntermedio;
	}

	public void setIdMaterialIntermedio(String idMaterialIntermedio) {
		this.idMaterialIntermedio = idMaterialIntermedio;
	}

	public int getCantidadRequerida() {
		return cantidadRequerida;
	}

	public void setCantidadRequerida(int cantidadRequerida) {
		this.cantidadRequerida = cantidadRequerida;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public String getIdPlantillaMI() {
		return idPlantillaMI;
	}

	public void setIdPlantillaMI(String idPlantillaMI) {
		this.idPlantillaMI = idPlantillaMI;
	}

	// Validación básica
	public boolean isValid() {
		return idDetallePlantillaMI != null && !idDetallePlantillaMI.isBlank()
				&& idMaterialIntermedio != null && !idMaterialIntermedio.isBlank()
				&& idPlantillaMI != null && !idPlantillaMI.isBlank()
				&& cantidadRequerida > 0;
	}

	// toString para depuración
	@Override
	public String toString() {
		return "DetallePlantillaMI{"
				+ "idDetallePlantillaMI='" + idDetallePlantillaMI + '\''
				+ ", idMaterialIntermedio='" + idMaterialIntermedio + '\''
				+ ", cantidadRequerida=" + cantidadRequerida
				+ ", comentarios='" + comentarios + '\''
				+ ", idPlantillaMI='" + idPlantillaMI + '\''
				+ '}';
	}
}
