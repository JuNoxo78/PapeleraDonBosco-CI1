
import controlador.autenticacion.AuthGeneralControlador;
import dao.autenticacion.EmpleadoDAO;
import dao.autenticacion.EmpleadoxRolDAO;
import dao.autenticacion.RolDAO;
import vista.autenticacion.LoginGeneral;
import vista.menu_principal.MenuPrincipal_2;

public class App {

	public static void main(String[] args) {
		LoginGeneral loginVista = new LoginGeneral();
		MenuPrincipal_2 menuPrincipal = new MenuPrincipal_2();
		EmpleadoDAO empleadoDAO = new EmpleadoDAO();
		EmpleadoxRolDAO empleadoxrolDAO = new EmpleadoxRolDAO();
		RolDAO rolDAO = new RolDAO();

		AuthGeneralControlador autenticacionControlador = new AuthGeneralControlador(loginVista, menuPrincipal, empleadoDAO, empleadoxrolDAO, rolDAO);
	}
}
