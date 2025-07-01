package modelo.pedidos_ventas;

public class ListaPedidoMI {
    private String idMaterialIntermedio;
    private String idPedido;
    private int cantidad;
    private String idProductoTerminado;

	// Constructor vacío
    public ListaPedidoMI() {
    }

	// Constructor completo
    public ListaPedidoMI(String idMaterialIntermedio, String idPedido, int cantidad, String idProductoTerminado) {
        this.idMaterialIntermedio = idMaterialIntermedio;
        this.idPedido = idPedido;
        this.cantidad = cantidad;
        this.idProductoTerminado = idProductoTerminado;
    }

    // Getters y setters
    public String getIdMaterialIntermedio() {
        return idMaterialIntermedio;
    }

    public void setIdMaterialIntermedio(String idMaterialIntermedio) {
        this.idMaterialIntermedio = idMaterialIntermedio;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getIdProductoTerminado() {
        return idProductoTerminado;
    }

    public void setIdProductoTerminado(String idProductoTerminado) {
        this.idProductoTerminado = idProductoTerminado;
    }

    // Validacion básica
    public boolean isValid() {
        return idMaterialIntermedio != null && !idMaterialIntermedio.isBlank()
                && idPedido != null && !idPedido.isBlank()
                && idProductoTerminado != null && !idProductoTerminado.isBlank();
    }

    // toString method
    @Override
    public String toString() {
        return "ListaPedidoMI{" +
                "idMaterialIntermedio='" + idMaterialIntermedio + '\'' +
                ", idPedido='" + idPedido + '\'' +
                ", cantidad=" + cantidad +
                ", idProductoTerminado='" + idProductoTerminado + '\'' +
                '}';
    }
}