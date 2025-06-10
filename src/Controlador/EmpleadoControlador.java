package Controlador;
/**
 *
 * @author Muaro
 */
import Modelo.Empleado;
import dao.EmpleadoDAO;
import java.util.List;

public class EmpleadoControlador {
    private EmpleadoDAO dao = new EmpleadoDAO();

    public List<Empleado> obtenerEmpleados() {
        return dao.obtenerEmpleados();
    }
}

