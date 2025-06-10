package dao;

import modelo.Empleado;
import conf.conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Muaro
 */

public class EmpleadoDAO {
    public List<Empleado> obtenerEmpleados() {
    //Lista donde se alamacenarán los datos de los empleados
        List<Empleado> lista = new ArrayList<>();
        
    //Codigo sql que se ejecutará en al base de datos para mostrar los datos de la tabla empleado
        String sql = "SELECT * FROM empleado";

        try (Connection con = conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            
            while (rs.next()) {
            //Creamos un objeto de la clase empleado
                Empleado c = new Empleado();
            //sacamos el dato de la base de datos con Get
            //Ponemos el dato de la base de datos al atributo del objeto
                c.setCodigo(rs.getInt("codigo"));
                c.setNombre(rs.getString("nombre"));
                c.setApellido(rs.getString("apellido"));
                c.setDni(rs.getString("dni"));
                c.setDireccion(rs.getString("direccion"));
                c.setTelefono(rs.getString("telefono"));
                c.setCorreo(rs.getString("correo"));
                c.setContraseña(rs.getString("contraseña"));
            //Lo agregamos a la lista
                lista.add(c);
            }

        } catch (SQLException e) {
            System.out.println("❌ Error al obtener los clientes");
            e.printStackTrace();
        }

        return lista;
    }
}
