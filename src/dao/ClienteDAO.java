package dao;

import modelo.Cliente;
import conf.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    public List<Cliente> obtenerTodos() {
        List<Cliente> lista = new ArrayList<>();

        String sql = "SELECT * FROM cliente";

        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Cliente c = new Cliente();
                c.setIdCliente(rs.getString("idCliente"));
                c.setIdDocIdentidad(rs.getString("idDocIdentidad"));
                c.setNombre(rs.getString("nombre"));
                c.setApellido(rs.getString("apellido"));
                c.setDireccion(rs.getString("direccion"));
                c.setTelefono(rs.getString("telefono"));
                c.setCorreo(rs.getString("correo"));
                c.setEstado(rs.getBoolean("estado"));
                c.setFechaRegistro(rs.getDate("fechaRegistro").toLocalDate());
                lista.add(c);
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener los clientes");
            e.printStackTrace();
        }

        return lista;
    }
}

