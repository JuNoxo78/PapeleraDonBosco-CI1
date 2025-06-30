package modelo;

import java.time.LocalDateTime;

public class MaterialIntermedio {

	private String idMaterialIntermedio;
	private String nombre;
	private String descripcion;
	private String unidadMedida;
	private int stockMinimo;
	private String tipoMI;
	private String rutaImagen;
	private LocalDateTime fechaSubida;

	// Constructor vacío
	public MaterialIntermedio() {
	}

	// Constructor completo
	public MaterialIntermedio(String idMaterialIntermedio, String nombre, String descripcion, String unidadMedida, int stockMinimo, String tipoMI, String rutaImagen, LocalDateTime fechaSubida) {
		this.idMaterialIntermedio = idMaterialIntermedio;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.unidadMedida = unidadMedida;
		this.stockMinimo = stockMinimo;
		this.tipoMI = tipoMI;
		this.rutaImagen = rutaImagen;
		this.fechaSubida = fechaSubida;
	}

	// Getters y setters
	public String getIdMaterialIntermedio() {
		return idMaterialIntermedio;
	}

	public void setIdMaterialIntermedio(String idMaterialIntermedio) {
		this.idMaterialIntermedio = idMaterialIntermedio;
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

	public String getRutaImagen() {
		return rutaImagen;
	}

	public void setRutaImagen(String rutaImagen) {
		this.rutaImagen = rutaImagen;
	}

	public LocalDateTime getFechaSubida() {
		return fechaSubida;
	}

	public void setFechaSubida(LocalDateTime fechaSubida) {
		this.fechaSubida = fechaSubida;
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
				+ ", nombre='" + nombre + '\''
				+ ", descripcion='" + descripcion + '\''
				+ ", unidadMedida='" + unidadMedida + '\''
				+ ", stockMinimo=" + stockMinimo
				+ ", tipoMI='" + tipoMI + '\''
				+ ", rutaImagen='" + rutaImagen + '\''
				+ ", fechaSubida='" + fechaSubida + '\''
				+ '}';
	}
}
