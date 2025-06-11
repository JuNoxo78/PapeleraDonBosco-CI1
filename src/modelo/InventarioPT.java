package modelo;

public class InventarioPT {

	private String idInventarioPT;
	private String idAlmacen;
	private int stockActual;

	// Constructor vacío
	public InventarioPT() {
	}

	// Constructor completo
	public InventarioPT(String idInventarioPT, String idAlmacen, int stockActual) {
		this.idInventarioPT = idInventarioPT;
		this.idAlmacen = idAlmacen;
		this.stockActual = stockActual;
	}

	// Getters y setters
	public String getIdInventarioPT() {
		return idInventarioPT;
	}

	public void setIdInventarioPT(String idInventarioPT) {
		this.idInventarioPT = idInventarioPT;
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
		return idInventarioPT != null && !idInventarioPT.isBlank()
				&& idAlmacen != null && !idAlmacen.isBlank()
				&& stockActual >= 0;
	}

	// toString para depuración
	@Override
	public String toString() {
		return "InventarioPT{"
				+ "idInventarioPT='" + idInventarioPT + '\''
				+ ", idAlmacen='" + idAlmacen + '\''
				+ ", stockActual=" + stockActual
				+ '}';
	}
}
