package controlador;

/**
 *
 * @author Muaro
 */
import modelo.clientes.Cliente;
import java.sql.SQLException;
import dao.ClienteDAO;
import java.util.List;

public class ClienteControlador {

    private ClienteDAO dao = new ClienteDAO();
//Obtener Cliente

    public List<Cliente> obtenerClientes() {
        return dao.obtenerTodos();
    }

//Agregar Clientes
    public void registrarCliente(Cliente cliente) {
        dao.insertar(cliente);
    }

//Eliminar Clientes
    public boolean eliminarCliente(String idCliente) {
        try {
            return dao.eliminarCliente(idCliente);
        } catch (SQLException ex) {
            System.err.println("Error al eliminar cliente: " + ex.getMessage());
            return false;
        }
    }

//Modificar clientes
    public boolean modificarCliente(Cliente cliente) {
        try {
            return dao.actualizarCliente(cliente);
        } catch (SQLException ex) {
            System.err.println("Error al modificar cliente: " + ex.getMessage());
            return false;
        }
    }
}
