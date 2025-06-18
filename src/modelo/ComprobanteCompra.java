package modelo;

import java.time.LocalDateTime;

public class ComprobanteCompra {

	private String idComprobanteCompra;
	private String docComprobante;
	private LocalDateTime fechaEmision;

	// Constructor vacío
	public ComprobanteCompra() {
	}

	// Constructor completo
	public ComprobanteCompra(String idComprobanteCompra, String docComprobante, LocalDateTime fechaEmision) {
		this.idComprobanteCompra = idComprobanteCompra;
		this.docComprobante = docComprobante;
		this.fechaEmision = fechaEmision;
	}

	// Getters y setters
	public String getIdComprobanteCompra() {
		return idComprobanteCompra;
	}

	public void setIdComprobanteCompra(String idComprobanteCompra) {
		this.idComprobanteCompra = idComprobanteCompra;
	}

	public String getDocComprobante() {
		return docComprobante;
	}

	public void setDocComprobante(String docComprobante) {
		this.docComprobante = docComprobante;
	}

	public LocalDateTime getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(LocalDateTime fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	// Validación básica
	public boolean isValid() {
		return idComprobanteCompra != null && !idComprobanteCompra.isBlank();
	}

	// toString para depuración
	@Override
	public String toString() {
		return "ComprobanteCompra{"
				+ "idComprobanteCompra='" + idComprobanteCompra + '\''
				+ ", docComprobante='" + docComprobante + '\''
				+ ", fechaEmision=" + fechaEmision
				+ '}';
	}
}
