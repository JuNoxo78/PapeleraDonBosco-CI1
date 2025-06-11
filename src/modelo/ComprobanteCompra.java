package modelo;

import java.time.LocalDate;

public class ComprobanteCompra {

	private String idComprobanteCompra;
	private String docComprobante;
	private LocalDate fechaEmision;

	// Constructor vacío
	public ComprobanteCompra() {
	}

	// Constructor completo
	public ComprobanteCompra(String idComprobanteCompra, String docComprobante, LocalDate fechaEmision) {
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

	public LocalDate getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(LocalDate fechaEmision) {
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
