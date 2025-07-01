package modelo.inventario.materias_primas;

import java.time.LocalDateTime;

public class InventarioMP {

	private String idInventarioMP;
	private String idAlmacen;
	private int stockLogico;
	private int stockFisico;
	private LocalDateTime fechaActualizacion;
	private String periodo;

	// Constructor vacío
	public InventarioMP() {
	}

	// Constructor completo
	public InventarioMP(String idInventarioMP, String idAlmacen, int stockLogico, int stockFisico, LocalDateTime fechaActualizacion, String periodo) {
		this.idInventarioMP = idInventarioMP;
		this.idAlmacen = idAlmacen;
		this.stockLogico = stockLogico;
		this.stockFisico = stockFisico;
		this.fechaActualizacion = fechaActualizacion;
		this.periodo = periodo;
	}

	// Getters y setters
	public String getIdInventarioMP() {
		return idInventarioMP;
	}

	public void setIdInventarioMP(String idInventarioMP) {
		this.idInventarioMP = idInventarioMP;
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
		return idInventarioMP != null && !idInventarioMP.isBlank()
				&& idAlmacen != null && !idAlmacen.isBlank()
				&& stockLogico >= 0
				&& stockFisico >= 0
				&& fechaActualizacion != null
				&& periodo != null && !periodo.isBlank();
	}

	// toString para depuración
	@Override
	public String toString() {
		return "InventarioMP{"
				+ "idInventarioMP='" + idInventarioMP + '\''
				+ ", idAlmacen='" + idAlmacen + '\''
				+ ", stockLogico=" + stockLogico
				+ ", stockFisico=" + stockFisico
				+ ", fechaActualizacion=" + fechaActualizacion
				+ ", periodo='" + periodo + '\''
				+ '}';
	}
}
