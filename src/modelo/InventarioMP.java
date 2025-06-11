package modelo;

public class InventarioMP {

	private String idInventarioMP;
	private String idAlmacen;
	private int stockActual;

	// Constructor vacío
	public InventarioMP() {
	}

	// Constructor completo
	public InventarioMP(String idInventarioMP, String idAlmacen, int stockActual) {
		this.idInventarioMP = idInventarioMP;
		this.idAlmacen = idAlmacen;
		this.stockActual = stockActual;
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

	public int getStockActual() {
		return stockActual;
	}

	public void setStockActual(int stockActual) {
		this.stockActual = stockActual;
	}

	// Validación básica
	public boolean isValid() {
		return idInventarioMP != null && !idInventarioMP.isBlank()
				&& idAlmacen != null && !idAlmacen.isBlank()
				&& stockActual >= 0;
	}

	// toString para depuración
	@Override
	public String toString() {
		return "InventarioMP{"
				+ "idInventarioMP='" + idInventarioMP + '\''
				+ ", idAlmacen='" + idAlmacen + '\''
				+ ", stockActual=" + stockActual
				+ '}';
	}
}
