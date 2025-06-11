package controlador;
/**
 *
 * @author Muaro
 */


import dao.EmpleadoDAO;
import modelo.Empleado;
import java.util.List;

public class EmpleadoControlador {

	private EmpleadoDAO empleadoDAO;

	public EmpleadoControlador() {
		empleadoDAO = new EmpleadoDAO();
	}

	// Método para obtener la lista de empleados
	public List<Empleado> obtenerEmpleados() {
		try {
			return empleadoDAO.obtenerTodos();
		} catch (Exception e) {
			System.err.println("Error en el controlador al obtener empleados: " + e.getMessage());
			return null;
		}
	}

	public Empleado verificarLogin(String numeroDocumento, String contraseña) {
		return empleadoDAO.buscarPorDocumentoYContraseña(numeroDocumento, contraseña);
	}

	// Agregar más métodos como registrarEmpleado, modificarEmpleado, eliminarEmpleado, etc.
}
