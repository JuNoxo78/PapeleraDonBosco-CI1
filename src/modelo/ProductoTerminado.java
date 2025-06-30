package modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProductoTerminado {

	private String idProductoTerminado;
	private String nombre;
	private String descripcion;
	private BigDecimal precio;
	private int stockMinimo;
	private String tipoPT;
	private String dimensiones;
	private String idPlantillaMI;
	private String rutaImagen;
	private LocalDateTime fechaSubida;

	// Constructor vacío
	public ProductoTerminado() {
	}

	// Constructor completo
	public ProductoTerminado(String idProductoTerminado, String nombre, String descripcion, BigDecimal precio, int stockMinimo, String tipoPT, String dimensiones, String idPlantillaMI, String rutaImagen, LocalDateTime fechaSubida) {
		this.idProductoTerminado = idProductoTerminado;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stockMinimo = stockMinimo;
		this.tipoPT = tipoPT;
		this.dimensiones = dimensiones;
		this.idPlantillaMI = idPlantillaMI;
		this.rutaImagen = rutaImagen;
		this.fechaSubida = fechaSubida;
	}

	// Getters y setters
	public String getIdProductoTerminado() {
		return idProductoTerminado;
	}

	public void setIdProductoTerminado(String idProductoTerminado) {
		this.idProductoTerminado = idProductoTerminado;
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

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public int getStockMinimo() {
		return stockMinimo;
	}

	public void setStockMinimo(int stockMinimo) {
		this.stockMinimo = stockMinimo;
	}

	public String getTipoPT() {
		return tipoPT;
	}

	public void setTipoPT(String tipoPT) {
		this.tipoPT = tipoPT;
	}

	public String getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}

	public String getIdPlantillaMI() {
		return idPlantillaMI;
	}

	public void setIdPlantillaMI(String idPlantillaMI) {
		this.idPlantillaMI = idPlantillaMI;
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
		return idProductoTerminado != null && !idProductoTerminado.isBlank();
	}

	// toString para depuración
	@Override
	public String toString() {
		return "ProductoTerminado{"
				+ "idProductoTerminado='" + idProductoTerminado + '\''
				+ ", nombre='" + nombre + '\''
				+ ", descripcion='" + descripcion + '\''
				+ ", precio=" + precio
				+ ", stockMinimo=" + stockMinimo
				+ ", tipoPT='" + tipoPT + '\''
				+ ", dimensiones='" + dimensiones + '\''
				+ ", idPlantillaMI='" + idPlantillaMI + '\''
				+ ", rutaImagen='" + rutaImagen + '\''
				+ ", fechaSubida=" + fechaSubida
				+ '}';
	}
}
