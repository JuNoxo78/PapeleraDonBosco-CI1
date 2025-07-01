package modelo.compras;

import java.math.BigDecimal;

public class DetalleCompra {

	private String idDetalleCompra;
	private String idCompra;
	private String nombreElemento;
	private String tipoElementoComprado;
	private int cantidad;
	private String idMateriaPrima;
	private String idMaterialIntermedio;
	private BigDecimal costoUnitario;
	private BigDecimal costoTotal;

	// Constructor vacío
	public DetalleCompra() {
	}

	// Constructor completo
	public DetalleCompra(String idDetalleCompra, String idCompra, String nombreElemento, String tipoElementoComprado, int cantidad, String idMateriaPrima, String idMaterialIntermedio, BigDecimal costoUnitario, BigDecimal costoTotal) {
		this.idDetalleCompra = idDetalleCompra;
		this.idCompra = idCompra;
		this.nombreElemento = nombreElemento;
		this.tipoElementoComprado = tipoElementoComprado;
		this.cantidad = cantidad;
		this.idMateriaPrima = idMateriaPrima;
		this.idMaterialIntermedio = idMaterialIntermedio;
		this.costoUnitario = costoUnitario;
		this.costoTotal = costoTotal;
	}

	// Getters y setters
	public String getIdDetalleCompra() {
		return idDetalleCompra;
	}

	public void setIdDetalleCompra(String idDetalleCompra) {
		this.idDetalleCompra = idDetalleCompra;
	}

	public String getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(String idCompra) {
		this.idCompra = idCompra;
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

	public String getIdMateriaPrima() {
		return idMateriaPrima;
	}

	public void setIdMateriaPrima(String idMateriaPrima) {
		this.idMateriaPrima = idMateriaPrima;
	}

	public String getIdMaterialIntermedio() {
		return idMaterialIntermedio;
	}

	public void setIdMaterialIntermedio(String idMaterialIntermedio) {
		this.idMaterialIntermedio = idMaterialIntermedio;
	}

	public BigDecimal getCostoUnitario() {
		return costoUnitario;
	}

	public void setCostoUnitario(BigDecimal costoUnitario) {
		this.costoUnitario = costoUnitario;
	}

	public BigDecimal getCostoTotal() {
		return costoTotal;
	}

	public void setCostoTotal(BigDecimal costoTotal) {
		this.costoTotal = costoTotal;
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
				+ ", idCompra='" + idCompra + '\''
				+ ", nombreElemento='" + nombreElemento + '\''
				+ ", tipoElementoComprado='" + tipoElementoComprado + '\''
				+ ", cantidad=" + cantidad
				+ ", idMateriaPrima='" + idMateriaPrima + '\''
				+ ", idMaterialIntermedio='" + idMaterialIntermedio + '\''
				+ ", costoUnitario=" + costoUnitario
				+ ", costoTotal=" + costoTotal
				+ '}';
	}
}
