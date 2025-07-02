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

    // Método para buscar clientes dinámicamente
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

    // Registrar nuevos clientes
    public void insertar(Cliente cliente) {
        // Sentencia SQL para registrar un nuevo cliente
        String sql = "INSERT INTO cliente (idCliente, idDocIdentidad, nombre, apellido, direccion, telefono, correo, fechaRegistro) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (
                // Se obtiene una conexión válida a la base de datos
                Connection conn = Conexion.conectar(); PreparedStatement ps = conn.prepareStatement(sql)) {
            // Se establecen los valores del cliente en la consulta SQL
            ps.setString(1, cliente.getIdCliente());
            ps.setString(2, cliente.getIdDocIdentidad());
            ps.setString(3, cliente.getNombre());
            ps.setString(4, cliente.getApellido());
            ps.setString(5, cliente.getDireccion());
            ps.setString(6, cliente.getTelefono());
            ps.setString(7, cliente.getCorreo());
            ps.setTimestamp(8, Timestamp.valueOf(cliente.getFechaRegistro()));

            // Se ejecuta la instrucción SQL de inserción
            ps.executeUpdate();

        } catch (SQLIntegrityConstraintViolationException ex) {
            // Captura errores cuando se violan restricciones de integridad como claves duplicadas

            String msg = ex.getMessage().toLowerCase();  // Se obtiene el mensaje de error en minúsculas

            // Verifica si se está duplicando la clave primaria del cliente
            if (msg.contains("duplicate entry") && msg.contains("for key 'cliente.primary'")) {
                throw new RuntimeException("Ya existe un cliente con ese código. Usa uno diferente.");
            }

            // Verifica si el documento de identidad ya está relacionado con otro cliente
            if (msg.contains("duplicate entry") && msg.contains("for key 'cliente.iddocidentidad'")) {
                throw new RuntimeException("El documento de identidad ya está asignado a otro cliente.");
            }

            // Cualquier otro error de clave duplicada
            if (msg.contains("duplicate entry")) {
                throw new RuntimeException("Uno de los datos ya fue registrado. Revisa los campos ingresados.");
            }

            // Cualquier otra violación de restricción no identificada
            throw new RuntimeException("No se pudo registrar el cliente. Revisa los datos ingresados.");

        } catch (SQLException ex) {
            // Cualquier otro tipo de error en la base de datos es capturado aquí
            throw new RuntimeException("Ocurrió un error al registrar el cliente. Intenta nuevamente.");
        }
    }

    // Modificar Cliente
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

<<<<<<< HEAD
    // Eliminar Cliente
=======
>>>>>>> 5015909 (-- funicionabilidad de los botone de MT y PT)
    public boolean eliminarCliente(String idCliente) throws SQLException {
        // Consulta SQL para eliminar un cliente por su ID
        String sql = "DELETE FROM cliente WHERE idCliente = ?";

        try (Connection con = Conexion.conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

            // Establece el parámetro del ID
            ps.setString(1, idCliente);

            // Ejecuta la eliminación; devuelve true si se eliminó alguna fila
            return ps.executeUpdate() > 0;
        }
    }
}
