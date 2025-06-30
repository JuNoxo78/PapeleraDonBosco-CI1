package modelo;

public class PlantillaMI {

	private String idPlantillaMI;
	private String observaciones;
	private int cantidadObtenidaPT;

	// Constructor vacío
	public PlantillaMI() {
	}

	// Constructor completo

	public PlantillaMI(String idPlantillaMI, String observaciones, int cantidadObtenidaPT) {
		this.idPlantillaMI = idPlantillaMI;
		this.observaciones = observaciones;
		this.cantidadObtenidaPT = cantidadObtenidaPT;
	}

	// Getters y setters
	public String getIdPlantillaMI() {
		return idPlantillaMI;
	}

	public void setIdPlantillaMI(String idPlantillaMI) {
		this.idPlantillaMI = idPlantillaMI;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public int getCantidadObtenidaPT() {
		return cantidadObtenidaPT;
	}

	public void setCantidadObtenidaPT(int cantidadObtenidaPT) {
		this.cantidadObtenidaPT = cantidadObtenidaPT;
	}

	// Validación básica
	public boolean isValid() {
		return idPlantillaMI != null && !idPlantillaMI.isBlank();
	}

	// toString para depuración
	@Override
	public String toString() {
		return "PlantillaMI{"
				+ "idPlantillaMI='" + idPlantillaMI + '\''
				+ ", observaciones='" + observaciones + '\''
				+ ", cantidadObtenidaPT=" + cantidadObtenidaPT
				+ '}';
	}
}
