package modelo.inventario.materiales_intermedios;

import java.time.LocalDateTime;

public class InventarioMI {

	private String idInventarioMI;
	private String idAlmacen;
	private int stockLogico;
	private int stockFisico;
	private LocalDateTime fechaActualizacion;
	private String periodo;

	// Constructor vacío
	public InventarioMI() {
	}

	// Constructor completo
	public InventarioMI(String idInventarioMI, String idAlmacen, int stockLogico, int stockFisico, LocalDateTime fechaActualizacion, String periodo) {
		this.idInventarioMI = idInventarioMI;
		this.idAlmacen = idAlmacen;
		this.stockLogico = stockLogico;
		this.stockFisico = stockFisico;
		this.fechaActualizacion = fechaActualizacion;
		this.periodo = periodo;
	}

	// Getters y setters
	public String getIdInventarioMI() {
		return idInventarioMI;
	}

	public void setIdInventarioMI(String idInventarioMI) {
		this.idInventarioMI = idInventarioMI;
	}

	public String getIdAlmacen() {
		return idAlmacen;
	}

	public void setIdAlmacen(String idAlmacen) {
		this.idAlmacen = idAlmacen;
	}

	public int getStockLogico() {
		return stockLogico;
	}

	public void setStockLogico(int stockLogico) {
		this.stockLogico = stockLogico;
	}

	public int getStockFisico() {
		return stockFisico;
	}

	public void setStockFisico(int stockFisico) {
		this.stockFisico = stockFisico;
	}

	public LocalDateTime getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(LocalDateTime fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	// Validación básica
	public boolean isValid() {
		return idInventarioMI != null && !idInventarioMI.isBlank()
				&& idAlmacen != null && !idAlmacen.isBlank()
				&& stockLogico >= 0
				&& stockFisico >= 0
				&& fechaActualizacion != null
				&& periodo != null && !periodo.isBlank();
	}

	// toString para depuración
	@Override
	public String toString() {
		return "InventarioMI{"
				+ "idInventarioMI='" + idInventarioMI + '\''
				+ ", idAlmacen='" + idAlmacen + '\''
				+ ", stockLogico=" + stockLogico
				+ ", stockFisico=" + stockFisico
				+ ", fechaActualizacion=" + fechaActualizacion
				+ ", periodo='" + periodo + '\''
				+ '}';
	}
}
