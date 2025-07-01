package modelo.compras;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ComprobanteCompra {

	private String idCompCompra;
	private String idCompra;
	private String codigoComprobante;
	private String tipoComprobante;
	private LocalDate fechaEmision;
	private String nombreArchivo;
	private String rutaArchivo;
	private LocalDateTime fechaSubida;

	// Constructor vacío
	public ComprobanteCompra() {
	}

	// Constructor completo
	public ComprobanteCompra(String idCompCompra, String idCompra, String codigoComprobante, String tipoComprobante, LocalDate fechaEmision, String nombreArchivo, String rutaArchivo, LocalDateTime fechaSubida) {
		this.idCompCompra = idCompCompra;
		this.idCompra = idCompra;
		this.codigoComprobante = codigoComprobante;
		this.tipoComprobante = tipoComprobante;
		this.fechaEmision = fechaEmision;
		this.nombreArchivo = nombreArchivo;
		this.rutaArchivo = rutaArchivo;
		this.fechaSubida = fechaSubida;
	}

	// Getters y setters
	public String getIdCompCompra() {
		return idCompCompra;
	}

	public void setIdCompCompra(String idCompCompra) {
		this.idCompCompra = idCompCompra;
	}

	public String getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(String idCompra) {
		this.idCompra = idCompra;
	}

	public String getCodigoComprobante() {
		return codigoComprobante;
	}

	public void setCodigoComprobante(String codigoComprobante) {
		this.codigoComprobante = codigoComprobante;
	}

	public String getTipoComprobante() {
		return tipoComprobante;
	}

	public void setTipoComprobante(String tipoComprobante) {
		this.tipoComprobante = tipoComprobante;
	}

	public LocalDate getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(LocalDate fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public String getRutaArchivo() {
		return rutaArchivo;
	}

	public void setRutaArchivo(String rutaArchivo) {
		this.rutaArchivo = rutaArchivo;
	}

	public LocalDateTime getFechaSubida() {
		return fechaSubida;
	}

	public void setFechaSubida(LocalDateTime fechaSubida) {
		this.fechaSubida = fechaSubida;
	}

	// Validación básica
	public boolean isValid() {
		return idCompCompra != null && !idCompCompra.isBlank();
	}

	// toString para depuración
	@Override
	public String toString() {
		return "ComprobanteCompra{"
				+ "idCompCompra='" + idCompCompra + '\''
				+ ", idCompra='" + idCompra + '\''
				+ ", codigoComprobante='" + codigoComprobante + '\''
				+ ", tipoComprobante='" + tipoComprobante + '\''
				+ ", fechaEmision=" + fechaEmision
				+ ", nombreArchivo='" + nombreArchivo + '\''
				+ ", rutaArchivo='" + rutaArchivo + '\''
				+ ", fechaSubida=" + fechaSubida
				+ '}';
	}
}
