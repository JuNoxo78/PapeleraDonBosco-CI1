package controlador.clientes;

import modelo.clientes.Cliente;
import dao.clientes.ClienteDAO;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

public class ClienteControlador {

    private ClienteDAO dao = new ClienteDAO();

    public List<Cliente> obtenerClientes() {
        return dao.obtenerTodos();
    }

    public void registrarCliente(Cliente cliente) {
        // Asignar ID automáticamente
        String nuevoId = dao.generarNuevoId();
        cliente.setIdCliente(nuevoId);
        // Asignar fecha de registro actual si no está establecida
        if (cliente.getFechaRegistro() == null) {
            cliente.setFechaRegistro(LocalDateTime.now());
        }
        dao.insertar(cliente);
    }

    public boolean eliminarCliente(String idCliente) {
        try {
            return dao.eliminarCliente(idCliente);
        } catch (SQLException ex) {
            System.err.println("Error al eliminar cliente: " + ex.getMessage());
            return false;
        }
    }

    public boolean modificarCliente(Cliente cliente) {
        try {
            return dao.actualizarCliente(cliente);
        } catch (SQLException ex) {
            System.err.println("Error al modificar cliente: " + ex.getMessage());
            return false;
        }
    }

    public List<Cliente> buscarClientes(String id, String docId, String nombre, String apellido) {
        return dao.buscarClientes(id, docId, nombre, apellido);
    }

    // Nuevo método para obtener el siguiente ID (usado por la vista)
    public String obtenerSiguienteId() {
        return dao.generarNuevoId();
    }
}