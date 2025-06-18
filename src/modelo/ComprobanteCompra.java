package modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ComprobanteCompra {

	private String idCompCompra;
	private String numeroComprobante;
	private String tipoComprobante;
	private LocalDate fechaEmision;
	private BigDecimal montoTotal;
	private String nombreArchivo;
	private String rutaArchivo;
	private LocalDateTime fechaSubida;

	// Constructor vacío
	public ComprobanteCompra() {
	}

	// Constructor completo
	public ComprobanteCompra(String idComprCompra, String numeroComprobante, String tipoComprobante, LocalDate fechaEmision, BigDecimal montoTotal, String nombreArchivo, String rutaArchivo, LocalDateTime fechaSubida) {
		this.idCompCompra = idCompCompra;
		this.numeroComprobante = numeroComprobante;
		this.tipoComprobante = tipoComprobante;
		this.fechaEmision = fechaEmision;
		this.montoTotal = montoTotal;
		this.nombreArchivo = nombreArchivo;
		this.rutaArchivo = rutaArchivo;
		this.fechaSubida = fechaSubida;
	}

	// Getters y setters
	public String getIdComprobanteCompra() {
		return idCompCompra;
	}

	public void setIdComprobanteCompra(String idCompCompra) {
		this.idCompCompra = idCompCompra;
	}

	public String getNumeroComprobante() {
		return numeroComprobante;
	}

	public void setNumeroComprobante(String numeroComprobante) {
		this.numeroComprobante = numeroComprobante;
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

	public BigDecimal getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(BigDecimal montoTotal) {
		this.montoTotal = montoTotal;
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
	public String toString() {
		return "ComprobanteCompra{"
				+ "idCompCompra='" + idCompCompra + '\''
				+ ", numeroComprobante='" + numeroComprobante + '\''
				+ ", tipoComprobante='" + tipoComprobante + '\''
				+ ", fechaEmision=" + fechaEmision
				+ ", montoTotal=" + montoTotal
				+ ", nombreArchivo='" + nombreArchivo + '\''
				+ ", rutaArchivo='" + rutaArchivo + '\''
				+ ", fechaSubida=" + fechaSubida
				+ '}';
	}
}
