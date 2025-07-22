package controlador.autenticacion;

import controlador.menu_principal.MenuPControlador;
import dao.autenticacion.EmpleadoDAO;
import dao.autenticacion.EmpleadoxRolDAO;
import dao.autenticacion.RolDAO;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import modelo.autenticacion.Empleado;
import modelo.autenticacion.EmpleadoxRol;
import modelo.autenticacion.Rol;
import vista.autenticacion.LoginGeneral;
import vista.autenticacion.LoginAdmin;
import vista.menu_principal.MenuPrincipal_2;

public class AuthGeneralControlador {

	private final LoginGeneral loginVista;
	private final EmpleadoDAO empleadoDAO;
	private final EmpleadoxRolDAO empleadoxrolDAO;
	private final RolDAO rolDAO;
	private ArrayList<String> empleadoDatos= new ArrayList<>();

	public AuthGeneralControlador(LoginGeneral loginVista, EmpleadoDAO empleadoDAO, EmpleadoxRolDAO empleadoxrolDAO, RolDAO rolDAO) {
		this.loginVista = loginVista;
		this.empleadoDAO = empleadoDAO;
		this.empleadoxrolDAO = empleadoxrolDAO;
		this.rolDAO = rolDAO;
		initController();
	}

	private void initController() {
		loginVista.setLoginButtonListener((ActionEvent e) -> LoginGeneralButtonEvent());
		loginVista.setLoginAdminButtonListener((ActionEvent e) -> LoginAdminButtonEvent());
		loginVista.setVisible(true);
	}

	private void LoginGeneralButtonEvent() {
		empleadoDatos = new ArrayList<>();

		List<EmpleadoxRol> listaEmxRol = empleadoxrolDAO.obtenerTodos();
		List<Rol> roles = rolDAO.obtenerTodos();

		String[] datosUsuario = loginVista.getDatosUsuario();
		String numeroDoc = datosUsuario[0];
		String contraseña = datosUsuario[1];

		Empleado empleado = empleadoDAO.buscarPorDocumentoYContraseña(numeroDoc, contraseña);

		if (empleado != null) {
			String rolEmpleado = "";

			for (EmpleadoxRol empleadoxrol : listaEmxRol) {
				String idEmpleado = empleadoxrol.getIdEmpleado();
				String idRol = empleadoxrol.getIdRol();

				if (empleado.getIdEmpleado().equals(idEmpleado)) {
					for (Rol rol : roles) {
						if (rol.getIdRol().equals(idRol)) {
							rolEmpleado += rol.getNombreRol() + ", ";
						}
					}
				}
			}

			if (!rolEmpleado.contains("Administrador de Sistema")) {
				rolEmpleado = rolEmpleado.substring(0, rolEmpleado.length() - 2);
				rolEmpleado = "<html>" + rolEmpleado + "</html>";

				empleadoDatos.add(rolEmpleado);
				empleadoDatos.add(empleado.getNombre());
				empleadoDatos.add(empleado.getApellido());

				MenuPrincipal_2 menuPrincipal = new MenuPrincipal_2();
				new MenuPControlador(menuPrincipal, empleadoDatos, empleado);

				loginVista.dispose();
			} else {
				loginVista.mostrarMensaje("Tu rol es de Administrador de Sistema. Accede mediante el botón situado en la esquina inferior derecha.");
			}

		} else {
			loginVista.mostrarMensaje("Documento o contraseña inválidos.");
		}

	}

	private void LoginAdminButtonEvent() {
		LoginAdmin loginAdmin = new LoginAdmin(loginVista, true);

		new AuthAdminControlador(loginAdmin);
	}
}
