package dao;

import modelo.Cliente;
import conf.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.DocIdentidad;

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
    public void insertar(Cliente cliente) {
        String sql = "INSERT INTO cliente (idCliente, idDocIdentidad, nombre, apellido, direccion, telefono, correo, estado, fechaRegistro) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, cliente.getIdCliente());
            ps.setString(2, cliente.getIdDocIdentidad());
            ps.setString(3, cliente.getNombre());
            ps.setString(4, cliente.getApellido());
            ps.setString(5, cliente.getDireccion());
            ps.setString(6, cliente.getTelefono());
            ps.setString(7, cliente.getCorreo());
            ps.setBoolean(8, cliente.getEstado());
            ps.setDate(9, java.sql.Date.valueOf(cliente.getFechaRegistro()));

            ps.executeUpdate();
            System.out.println("Cliente insertado con éxito");

        } catch (SQLException e) {
            System.out.println("Error al insertar cliente");
            e.printStackTrace();
        }
    }
    public boolean actualizarCliente(Cliente cliente) throws SQLException {
        String sql = "UPDATE cliente SET nombre=?, apellido=?, correo=?, telefono=?, direccion=?, estado=? WHERE idCliente=?";
            try (Connection conexion = new conexion().conectar();
                 PreparedStatement stmt = conexion.prepareStatement(sql)) {

                stmt.setString(1, cliente.getNombre());
                stmt.setString(2, cliente.getApellido());
                stmt.setString(3, cliente.getCorreo());
                stmt.setString(4, cliente.getTelefono());
                stmt.setString(5, cliente.getDireccion());
                stmt.setBoolean(6, cliente.getEstado());
                stmt.setString(7, cliente.getIdCliente());

                return stmt.executeUpdate() > 0;
            }
    }
    
}

