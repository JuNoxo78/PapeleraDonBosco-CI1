package dao;

import modelo.clientes.Cliente;
import conf.Conexion;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import modelo.autenticacion.DocIdentidad;

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
                
                Timestamp fechaSQL = rs.getTimestamp("fechaRegistro");
                c.setFechaRegistro(fechaSQL != null ? fechaSQL.toLocalDateTime() : null);

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

        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, cliente.getIdCliente());
            ps.setString(2, cliente.getIdDocIdentidad());
            ps.setString(3, cliente.getNombre());
            ps.setString(4, cliente.getApellido());
            ps.setString(5, cliente.getDireccion());
            ps.setString(6, cliente.getTelefono());
            ps.setString(7, cliente.getCorreo());
            
            if (cliente.getFechaRegistro() != null) {
                ps.setTimestamp(9, Timestamp.valueOf(cliente.getFechaRegistro()));
            } else {
                ps.setNull(9, Types.TIMESTAMP);
            }

            ps.executeUpdate();
            System.out.println("Cliente insertado con éxito");

        } catch (SQLException e) {
            System.out.println("Error al insertar cliente");
            e.printStackTrace();
        }
    }

    public boolean actualizarCliente(Cliente cliente) throws SQLException {
        String sql = "UPDATE cliente SET nombre=?, apellido=?, correo=?, telefono=?, direccion=?, estado=? WHERE idCliente=?";
        try (Connection conexion = Conexion.conectar();
             PreparedStatement stmt = conexion.prepareStatement(sql)) {

            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getApellido());
            stmt.setString(3, cliente.getCorreo());
            stmt.setString(4, cliente.getTelefono());
            stmt.setString(5, cliente.getDireccion());
            stmt.setString(6, cliente.getIdCliente());

            return stmt.executeUpdate() > 0;
        }
    }
    public boolean eliminarCliente(String idCliente) throws SQLException {
    // Consulta SQL para eliminar un cliente por su ID
    String sql = "DELETE FROM cliente WHERE idCliente = ?";

    try (Connection con = Conexion.conectar();
         PreparedStatement ps = con.prepareStatement(sql)) {

        // Establece el parámetro del ID
        ps.setString(1, idCliente);

        // Ejecuta la eliminación; devuelve true si se eliminó alguna fila
        return ps.executeUpdate() > 0;
    }
}
}