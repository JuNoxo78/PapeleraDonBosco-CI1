package modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Compra {
    private String idCompra;
    private LocalDate fechaCompra;
    private BigDecimal totalPagado;
    private String idProveedor;
    private String idEmpleado;
    private String idComprobanteCompra;

    // Constructor vacío
    public Compra() {
    }

    // Constructor completo
    public Compra(String idCompra, LocalDate fechaCompra, BigDecimal totalPagado,
                  String idProveedor, String idEmpleado, String idComprobanteCompra) {
        this.idCompra = idCompra;
        this.fechaCompra = fechaCompra;
        this.totalPagado = totalPagado;
        this.idProveedor = idProveedor;
        this.idEmpleado = idEmpleado;
        this.idComprobanteCompra = idComprobanteCompra;
    }

    // Getters y setters
    public String getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(String idCompra) {
        this.idCompra = idCompra;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public BigDecimal getTotalPagado() {
        return totalPagado;
    }

    public void setTotalPagado(BigDecimal totalPagado) {
        this.totalPagado = totalPagado;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getIdComprobanteCompra() {
        return idComprobanteCompra;
    }

    public void setIdComprobanteCompra(String idComprobanteCompra) {
        this.idComprobanteCompra = idComprobanteCompra;
    }

    // Validación básica
    public boolean isValid() {
        return idCompra != null && !idCompra.isBlank();
    }

    // toString para depuración
    @Override
    public String toString() {
        return "Compra{" +
                "idCompra='" + idCompra + '\'' +
                ", fechaCompra=" + fechaCompra +
                ", totalPagado=" + totalPagado +
                ", idProveedor='" + idProveedor + '\'' +
                ", idEmpleado='" + idEmpleado + '\'' +
                ", idComprobanteCompra='" + idComprobanteCompra + '\'' +
                '}';
    }
}