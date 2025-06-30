package modelo;

public class DetallePlantillaMI {

	private String idPlantillaMI;
	private String idMaterialIntermedio;
	private int cantidadRequerida;
	private String comentarios;

	// Constructor vacío
	public DetallePlantillaMI() {
	}

	// Constructor completo
	public DetallePlantillaMI(String idPlantillaMI, String idMaterialIntermedio, int cantidadRequerida, String comentarios) {
		this.idPlantillaMI = idPlantillaMI;
		this.idMaterialIntermedio = idMaterialIntermedio;
		this.cantidadRequerida = cantidadRequerida;
		this.comentarios = comentarios;
	}

	// Getters y setters
	public String getIdPlantillaMI() {
		return idPlantillaMI;
	}

	public void setIdPlantillaMI(String idPlantillaMI) {
		this.idPlantillaMI = idPlantillaMI;
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

	// Validación básica
	public boolean isValid() {
		return idPlantillaMI != null && !idPlantillaMI.isBlank()
				&& idMaterialIntermedio != null && !idMaterialIntermedio.isBlank()
				&& cantidadRequerida > 0
				&& (comentarios == null || !comentarios.isBlank());
	}

	// toString para depuración
	@Override
	public String toString() {
		return "DetallePlantillaMI"
				+ "idPlantillaMI='" + idPlantillaMI + '\''
				+ ", idMaterialIntermedio='" + idMaterialIntermedio + '\''
				+ ", cantidadRequerida=" + cantidadRequerida
				+ ", comentarios='" + comentarios + '\''
				+ '}';
	}
}
