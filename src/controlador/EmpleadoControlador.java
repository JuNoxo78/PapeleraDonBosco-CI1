package controlador;
/**
 *
 * @author Muaro
 */
import modelo.Empleado;
import dao.EmpleadoDAO;
import java.util.List;

public class EmpleadoControlador {
    private EmpleadoDAO dao = new EmpleadoDAO();

    public List<Empleado> obtenerEmpleados() {
        return dao.obtenerEmpleados();
    }
}

