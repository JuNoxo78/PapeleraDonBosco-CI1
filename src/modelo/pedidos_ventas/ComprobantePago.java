package modelo.pedidos_ventas;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ComprobantePago {

	private String idCompPago;
	private String numeroComprobante;
	private String tipoComprobante;
	private LocalDate fechaEmision;
	private BigDecimal montoTotal;
	private String nombreArchivo;
	private String rutaArchivo;
	private LocalDateTime fechaSubida;

	// Constructor vacío
	public ComprobantePago() {
	}

	// Constructor completo
	public ComprobantePago(String idCompPago, String numeroComprobante, String tipoComprobante, LocalDate fechaEmision, BigDecimal montoTotal, String nombreArchivo, String rutaArchivo, LocalDateTime fechaSubida) {
		this.idCompPago = idCompPago;
		this.numeroComprobante = numeroComprobante;
		this.tipoComprobante = tipoComprobante;
		this.fechaEmision = fechaEmision;
		this.montoTotal = montoTotal;
		this.nombreArchivo = nombreArchivo;
		this.rutaArchivo = rutaArchivo;
		this.fechaSubida = fechaSubida;
	}

	// Getter and Setter
	public String getIdCompPago() {
		return idCompPago;
	}

	public void setIdCompPago(String idCompPago) {
		this.idCompPago = idCompPago;
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
		return idCompPago != null && !idCompPago.isBlank();
	}

	// toString para depuración
	@Override
	public String toString() {
		return "ComprobantePago{"
				+ "idCompPago='" + idCompPago + '\''
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
