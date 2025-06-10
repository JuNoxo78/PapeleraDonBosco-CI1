
package modelo;

/**
 *
 * @author Muaro
 */
public class Empleado {
    private int codigo;
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private String telefono;
    private String correo;
    private String contraseña;
    
    //Algo para el polimorfismo
    public Empleado() {
    }
    
    //Constructor Empleado
    public Empleado(int codigo, String nombre, String apellido, String dni, String direccion, String telefono, String correo, String contraseña) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    //GETTERS Y SETTERS
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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
    
}
