package controlador;
/**
 *
 * @author Muaro
 */
import modelo.Cliente;
import dao.ClienteDAO;
import java.util.List;

public class ClienteControlador {
    private ClienteDAO dao = new ClienteDAO();

    public List<Cliente> obtenerClientes() {
        return dao.obtenerTodos();
    }
}

