package modelo.inventario.materias_primas;

import java.time.LocalDateTime;

public class MateriaPrima {

	private String idMateriaPrima;
	private String nombre;
	private String descripcion;
	private String unidadMedida;
	private int stockMinimo;
	private String tipoMP;
	private String rutaImagen;
	private LocalDateTime fechaSubida;

	// Constructor vacío
	public MateriaPrima() {
	}

	// Constructor completo
	public MateriaPrima(String idMateriaPrima, String nombre, String descripcion, String unidadMedida, int stockMinimo, String tipoMP, String rutaImagen, LocalDateTime fechaSubida) {
		this.idMateriaPrima = idMateriaPrima;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.unidadMedida = unidadMedida;
		this.stockMinimo = stockMinimo;
		this.tipoMP = tipoMP;
		this.rutaImagen = rutaImagen;
		this.fechaSubida = fechaSubida;
	}

	// Getters y setters
	public String getIdMateriaPrima() {
		return idMateriaPrima;
	}

	public void setIdMateriaPrima(String idMateriaPrima) {
		this.idMateriaPrima = idMateriaPrima;
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

	public String getTipoMP() {
		return tipoMP;
	}

	public void setTipoMP(String tipoMP) {
		this.tipoMP = tipoMP;
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
		return idMateriaPrima != null && !idMateriaPrima.isBlank()
				&& nombre != null && !nombre.isBlank();
	}

	// toString para depuración
	@Override
	public String toString() {
		return "MateriaPrima{"
				+ "idMateriaPrima='" + idMateriaPrima + '\''
				+ ", nombre='" + nombre + '\''
				+ ", descripcion='" + descripcion + '\''
				+ ", unidadMedida='" + unidadMedida + '\''
				+ ", stockMinimo=" + stockMinimo
				+ ", tipoMP='" + tipoMP + '\''
				+ ", rutaImagen='" + rutaImagen + '\''
				+ ", fechaSubida='" + fechaSubida + '\''
				+ '}';
	}
}
