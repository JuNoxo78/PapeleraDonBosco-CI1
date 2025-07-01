package modelo.reportes;

import java.time.LocalDateTime;

public class Reporte {
    private String idReporte;
    private String tipoReporte;
    private String nombre;
    private LocalDateTime fechaGeneracion;
    private String idEmpleado;
    private String filtrosAplicados;
    private String descripcion;
    private String estado;

    public Reporte() {
    }

    public Reporte(String idReporte, String tipoReporte, String nombre, LocalDateTime fechaGeneracion, String idEmpleado, String filtrosAplicados, String descripcion, String estado) {
        this.idReporte = idReporte;
        this.tipoReporte = tipoReporte;
        this.nombre = nombre;
        this.fechaGeneracion = fechaGeneracion;
        this.idEmpleado = idEmpleado;
        this.filtrosAplicados = filtrosAplicados;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    // Getters and Setters
    public String getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(String idReporte) {
        this.idReporte = idReporte;
    }

    public String getTipoReporte() {
        return tipoReporte;
    }

    public void setTipoReporte(String tipoReporte) {
        this.tipoReporte = tipoReporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(LocalDateTime fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getFiltrosAplicados() {
        return filtrosAplicados;
    }

    public void setFiltrosAplicados(String filtrosAplicados) {
        this.filtrosAplicados = filtrosAplicados;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Validación básica
    public boolean isValid() {
        return idReporte != null && !idReporte.isBlank()
                && tipoReporte != null && !tipoReporte.isBlank()
                && nombre != null && !nombre.isBlank()
                && fechaGeneracion != null
                && idEmpleado != null && !idEmpleado.isBlank()
                && estado != null && !estado.isBlank()
                && (filtrosAplicados == null || !filtrosAplicados.isBlank());
    }

    // toString method
    @Override
    public String toString() {
        return "Reporte{" +
                "idReporte='" + idReporte + '\'' +
                ", tipoReporte='" + tipoReporte + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaGeneracion=" + fechaGeneracion +
                ", idEmpleado='" + idEmpleado + '\'' +
                ", filtrosAplicados='" + filtrosAplicados + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}