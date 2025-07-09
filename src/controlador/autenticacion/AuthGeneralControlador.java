package controlador.autenticacion;

import dao.autenticacion.EmpleadoDAO;
import dao.autenticacion.EmpleadoxRolDAO;
import dao.autenticacion.RolDAO;
import java.awt.event.ActionEvent;
import java.util.List;
import modelo.autenticacion.Empleado;
import modelo.autenticacion.EmpleadoxRol;
import modelo.autenticacion.Rol;
import vista.autenticacion.LoginGeneral;
import vista.autenticacion.LoginAdmin;
import vista.menu_principal.MenuPrincipal_2;

public class AuthGeneralControlador {

	private LoginGeneral loginVista;
	private MenuPrincipal_2 menuPrincipal;
	private EmpleadoDAO empleadoDAO;
	private EmpleadoxRolDAO empleadoxrolDAO;
	private RolDAO rolDAO;

	public AuthGeneralControlador(LoginGeneral loginVista, MenuPrincipal_2 menuPrincipal, EmpleadoDAO empleadoDAO, EmpleadoxRolDAO empleadoxrolDAO, RolDAO rolDAO) {
		this.loginVista = loginVista;
		this.menuPrincipal = menuPrincipal;
		this.empleadoDAO = empleadoDAO;
		this.empleadoxrolDAO = empleadoxrolDAO;
		this.rolDAO = rolDAO;
		initController();
	}

	private void initController() {
		List<Empleado> empleados = empleadoDAO.getEmpleados();
		List<EmpleadoxRol> listaEmxRol = empleadoxrolDAO.getListaEmxRol();
		List<Rol> roles = rolDAO.getRoles();

		loginVista.setVisible(true);

		loginVista.setLoginListener((ActionEvent e) -> {
			String[] datosUsuario = loginVista.getDatosUsuario();
			String numeroDoc = datosUsuario[0];
			String contraseña = datosUsuario[1];

			Empleado empleado = empleadoDAO.buscarPorDocumentoYContraseña(numeroDoc, contraseña);

			if (empleado != null) {
				menuPrincipal.setVisible(true);

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

 				rolEmpleado = rolEmpleado.substring(0, rolEmpleado.length() - 2);
				rolEmpleado = "<html>" + rolEmpleado + "</html>";

				menuPrincipal.setRolNombre(rolEmpleado, empleado.getNombre() + " " + empleado.getApellido());

				loginVista.dispose();
			} else {
				loginVista.mostrarMensaje("Documento o contraseña inválidos.");
			}
		});

		loginVista.setLoginAdminListener((ActionEvent e) -> {
			LoginAdmin loginAdmin = new LoginAdmin(loginVista, true);

			AuthAdminControlador authAdminControlador = new AuthAdminControlador(loginAdmin);
		});
	}
}
