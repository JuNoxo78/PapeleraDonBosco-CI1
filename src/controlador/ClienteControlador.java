package controlador;
/**
 *
 * @author Muaro
 */
import modelo.Cliente;
import java.sql.SQLException;
import dao.ClienteDAO;
import java.util.List;

public class ClienteControlador {
    private ClienteDAO dao = new ClienteDAO();

    public List<Cliente> obtenerClientes() {
            return dao.obtenerTodos();
    }
        
    public void registrarCliente(Cliente cliente) {
        dao.insertar(cliente);
    }

    public boolean modificarCliente(Cliente cliente) {
        try {
            return dao.actualizarCliente(cliente);
        } catch (SQLException ex) {
            System.err.println("Error al modificar cliente: " + ex.getMessage());
            return false;
        }
    }
  
}

