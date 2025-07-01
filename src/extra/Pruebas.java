package extra;

import dao.autenticacion.EmpleadoDAO;
import java.util.ArrayList;
import java.util.List;
import modelo.autenticacion.Empleado;

public class Pruebas {

	public static void main(String[] args) {
		List<Empleado> listaEmpleados = new ArrayList<Empleado>();

		EmpleadoDAO empleado_dao = new EmpleadoDAO();

		listaEmpleados = empleado_dao.obtenerTodos();

		System.out.println(empleado_dao.buscarPorDocumentoYContraseña("72134465", "admin123"));
	}

}
