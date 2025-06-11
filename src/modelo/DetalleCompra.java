package modelo;

public class DetalleCompra {

	private String idDetalleCompra;
	private String nombreElemento;
	private String tipoElementoComprado;
	private int cantidad;
	private String idCompra;

	// Constructor vacío
	public DetalleCompra() {
	}

	// Constructor completo
	public DetalleCompra(String idDetalleCompra, String nombreElemento, String tipoElementoComprado, int cantidad, String idCompra) {
		this.idDetalleCompra = idDetalleCompra;
		this.nombreElemento = nombreElemento;
		this.tipoElementoComprado = tipoElementoComprado;
		this.cantidad = cantidad;
		this.idCompra = idCompra;
	}

	// Getters y setters
	public String getIdDetalleCompra() {
		return idDetalleCompra;
	}

	public void setIdDetalleCompra(String idDetalleCompra) {
		this.idDetalleCompra = idDetalleCompra;
	}

	public String getNombreElemento() {
		return nombreElemento;
	}

	public void setNombreElemento(String nombreElemento) {
		this.nombreElemento = nombreElemento;
	}

	public String getTipoElementoComprado() {
		return tipoElementoComprado;
	}

	public void setTipoElementoComprado(String tipoElementoComprado) {
		this.tipoElementoComprado = tipoElementoComprado;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(String idCompra) {
		this.idCompra = idCompra;
	}

	// Validación básica
	public boolean isValid() {
		return idDetalleCompra != null && !idDetalleCompra.isBlank()
				&& idCompra != null && !idCompra.isBlank()
				&& cantidad > 0;
	}

	// toString para depuración
	@Override
	public String toString() {
		return "DetalleCompra{"
				+ "idDetalleCompra='" + idDetalleCompra + '\''
				+ ", nombreElemento='" + nombreElemento + '\''
				+ ", tipoElementoComprado='" + tipoElementoComprado + '\''
				+ ", cantidad=" + cantidad
				+ ", idCompra='" + idCompra + '\''
				+ '}';
	}
}
