package modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ComprobantePago {
    private String idCompPago;
    private BigDecimal montoTotal;
    private LocalDate fechaEmision;

    // Constructor vacío
    public ComprobantePago() {
    }

    // Constructor completo
    public ComprobantePago(String idCompPago, BigDecimal montoTotal, LocalDate fechaEmision) {
        this.idCompPago = idCompPago;
        this.montoTotal = montoTotal;
        this.fechaEmision = fechaEmision;
    }

    // Getters y setters
    public String getIdCompPago() {
        return idCompPago;
    }

    public void setIdCompPago(String idCompPago) {
        this.idCompPago = idCompPago;
    }

    public BigDecimal getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(BigDecimal montoTotal) {
        this.montoTotal = montoTotal;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    // Validación básica
    public boolean isValid() {
        return idCompPago != null && !idCompPago.isBlank();
    }

    // toString para depuración
    @Override
    public String toString() {
        return "ComprobantePago{" +
                "idCompPago='" + idCompPago + '\'' +
                ", montoTotal=" + montoTotal +
                ", fechaEmision=" + fechaEmision +
                '}';
    }
}