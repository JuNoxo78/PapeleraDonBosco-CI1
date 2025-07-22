package dao.clientes;

import conf.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.clientes.Cliente;

public class ClienteDAO {

    //Lista para listar clientes luego
    public List<Cliente> obtenerTodos() {
        List<Cliente> lista = new ArrayList<>();

        String sql = "SELECT * FROM cliente";

        try (Connection con = Conexion.conectar(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Cliente c = new Cliente();
                c.setIdCliente(rs.getString("idCliente"));
                c.setIdDocIdentidad(rs.getString("idDocIdentidad"));
                c.setNombre(rs.getString("nombre"));
                c.setApellido(rs.getString("apellido"));
                c.setDireccion(rs.getString("direccion"));
                c.setTelefono(rs.getString("telefono"));
                c.setCorreo(rs.getString("correo"));
                // Sacar la fecha
                Timestamp fechaSQL = rs.getTimestamp("fechaRegistro");
                c.setFechaRegistro(fechaSQL != null ? fechaSQL.toLocalDateTime() : null);
                // Anadiendo el objeto en la lista
                lista.add(c);
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener los clientes");
            e.printStackTrace();
        }

        return lista;
    }

    public String obtenerUltimoId() {
        String ultimoId = null;
        String sql = "SELECT idCliente FROM cliente ORDER BY idCliente DESC LIMIT 1";

        try (Connection conn = Conexion.conectar(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                ultimoId = rs.getString("idCliente");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener último ID: " + e.getMessage());
        }

        return ultimoId;
    }

    // Nuevo método para generar el siguiente ID en formato CLI00*
    public String generarNuevoId() {
        String ultimoId = obtenerUltimoId();
        String nuevoId;

        if (ultimoId == null) {
            // Si no hay clientes, empezar con CLI001
            nuevoId = "CLI001";
        } else {
            // Extraer el número del último ID (ejemplo: CLI001 -> 1)
            int numero = Integer.parseInt(ultimoId.replace("CLI", ""));
            // Incrementar el número
            numero++;
            // Formatear el nuevo ID con ceros a la izquierda (CLI00*)
            nuevoId = String.format("CLI%03d", numero);
        }

        return nuevoId;
    }

    public List<Cliente> buscarClientes(String id, String docId, String nombre, String apellido) {
        List<Cliente> lista = new ArrayList<>();
        StringBuilder sql = new StringBuilder("SELECT * FROM cliente WHERE 1=1");

        if (!id.isEmpty()) {
            sql.append(" AND idCliente LIKE ?");
        }
        if (!docId.isEmpty()) {
            sql.append(" AND idDocIdentidad LIKE ?");
        }
        if (!nombre.isEmpty()) {
            sql.append(" AND nombre LIKE ?");
        }
        if (!apellido.isEmpty()) {
            sql.append(" AND apellido LIKE ?");
        }

        try (Connection conn = Conexion.conectar(); PreparedStatement stmt = conn.prepareStatement(sql.toString())) {

            int index = 1;
            if (!id.isEmpty()) {
                stmt.setString(index++, "%" + id + "%");
            }
            if (!docId.isEmpty()) {
                stmt.setString(index++, "%" + docId + "%");
            }
            if (!nombre.isEmpty()) {
                stmt.setString(index++, "%" + nombre + "%");
            }
            if (!apellido.isEmpty()) {
                stmt.setString(index++, "%" + apellido + "%");
            }

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getString("idCliente"));
                cliente.setIdDocIdentidad(rs.getString("idDocIdentidad"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setCorreo(rs.getString("correo"));
                cliente.setFechaRegistro(rs.getTimestamp("fechaRegistro").toLocalDateTime());
                lista.add(cliente);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar clientes: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return lista;
    }

    public void insertar(Cliente cliente) {
        String sql = "INSERT INTO cliente (idCliente, idDocIdentidad, nombre, apellido, direccion, telefono, correo, fechaRegistro) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (
                Connection conn = Conexion.conectar(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, cliente.getIdCliente());
            ps.setString(2, cliente.getIdDocIdentidad());
            ps.setString(3, cliente.getNombre());
            ps.setString(4, cliente.getApellido());
            ps.setString(5, cliente.getDireccion());
            ps.setString(6, cliente.getTelefono());
            ps.setString(7, cliente.getCorreo());
            ps.setTimestamp(8, Timestamp.valueOf(cliente.getFechaRegistro()));

            ps.executeUpdate();

        } catch (SQLIntegrityConstraintViolationException ex) {

            String msg = ex.getMessage().toLowerCase();

            if (msg.contains("duplicate entry") && msg.contains("for key 'cliente.primary'")) {
                throw new RuntimeException("Ya existe un cliente con ese código. Usa uno diferente.");
            }

            if (msg.contains("duplicate entry") && msg.contains("for key 'cliente.iddocidentidad'")) {
                throw new RuntimeException("El documento de identidad ya está asignado a otro cliente.");
            }

            if (msg.contains("duplicate entry")) {
                throw new RuntimeException("Uno de los datos ya fue registrado. Revisa los campos ingresados.");
            }

            throw new RuntimeException("No se pudo registrar el cliente. Revisa los datos ingresados.");

        } catch (SQLException ex) {
            throw new RuntimeException("Ocurrió un error al registrar el cliente. Intenta nuevamente.");
        }
    }

    public boolean actualizarCliente(Cliente cliente) throws SQLException {
        String sql = "UPDATE cliente SET nombre=?, apellido=?, direccion=?, telefono=?, correo=? WHERE idCliente=?";

        try (Connection conexion = Conexion.conectar(); PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getApellido());
            stmt.setString(3, cliente.getDireccion());
            stmt.setString(4, cliente.getTelefono());
            stmt.setString(5, cliente.getCorreo());
            stmt.setString(6, cliente.getIdCliente());

            return stmt.executeUpdate() > 0;
        }
    }

    public boolean eliminarCliente(String idCliente) throws SQLException {
        String sql = "DELETE FROM cliente WHERE idCliente = ?";

        try (Connection con = Conexion.conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

            // Establece el parámetro del ID
            ps.setString(1, idCliente);

            // Ejecuta la eliminación; devuelve true si se eliminó alguna fila
            return ps.executeUpdate() > 0;
        }
    }

    public Cliente buscarPorId(String idCliente) {
        String sql = "SELECT * FROM cliente WHERE idCliente = ?";
        Cliente cliente = null;

        try (Connection con = Conexion.conectar(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, idCliente);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(rs.getString("idCliente"));
                cliente.setIdDocIdentidad(rs.getString("idDocIdentidad"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setCorreo(rs.getString("correo"));
                Timestamp fechaSQL = rs.getTimestamp("fechaRegistro");
                cliente.setFechaRegistro(fechaSQL != null ? fechaSQL.toLocalDateTime() : null);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el cliente: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return cliente;
    }
}
