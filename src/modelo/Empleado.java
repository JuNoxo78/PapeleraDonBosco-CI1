package modelo;

public class Empleado {
    private String idEmpleado;
    private String idDocIdentidad;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String correo;
    private String contraseña;
    private Boolean estado;

    // Constructor vacío
    public Empleado() {
    }

    // Constructor completo
    public Empleado(String idEmpleado, String idDocIdentidad, String nombre, String apellido,
                    String direccion, String telefono, String correo, String contraseña,
                    Boolean estado) {
        this.idEmpleado = idEmpleado;
        this.idDocIdentidad = idDocIdentidad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.contraseña = contraseña;
        this.estado = estado;
    }

    // Getters y setters
    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getIdDocIdentidad() {
        return idDocIdentidad;
    }

    public void setIdDocIdentidad(String idDocIdentidad) {
        this.idDocIdentidad = idDocIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    // Validación básica
    public boolean isValid() {
        return idEmpleado != null && !idEmpleado.isBlank()
            && idDocIdentidad != null && !idDocIdentidad.isBlank();
    }

    // Método toString
    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado='" + idEmpleado + '\'' +
                ", idDocIdentidad='" + idDocIdentidad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", estado=" + estado +
                '}';
    }
}