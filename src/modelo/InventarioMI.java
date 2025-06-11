package modelo;

public class InventarioMI {

	private String idInventarioMI;
	private String idAlmacen;
	private int stockActual;

	// Constructor vacío
	public InventarioMI() {
	}

	// Constructor completo
	public InventarioMI(String idInventarioMI, String idAlmacen, int stockActual) {
		this.idInventarioMI = idInventarioMI;
		this.idAlmacen = idAlmacen;
		this.stockActual = stockActual;
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

	public int getStockActual() {
		return stockActual;
	}

	public void setStockActual(int stockActual) {
		this.stockActual = stockActual;
	}

	// Validación básica
	public boolean isValid() {
		return idInventarioMI != null && !idInventarioMI.isBlank()
				&& idAlmacen != null && !idAlmacen.isBlank()
				&& stockActual >= 0;
	}

	// toString para depuración
	@Override
	public String toString() {
		return "InventarioMI{"
				+ "idInventarioMI='" + idInventarioMI + '\''
				+ ", idAlmacen='" + idAlmacen + '\''
				+ ", stockActual=" + stockActual
				+ '}';
	}
}
