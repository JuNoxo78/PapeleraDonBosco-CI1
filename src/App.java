
import controlador.autenticacion.AuthGeneralControlador;
import dao.autenticacion.EmpleadoDAO;
import dao.autenticacion.EmpleadoxRolDAO;
import dao.autenticacion.RolDAO;
import vista.autenticacion.LoginGeneral;

public class App {

    public static void main(String[] args) {
        LoginGeneral loginVista = new LoginGeneral();
        EmpleadoDAO empleadoDAO = new EmpleadoDAO();
        EmpleadoxRolDAO empleadoxrolDAO = new EmpleadoxRolDAO();
        RolDAO rolDAO = new RolDAO();
        new AuthGeneralControlador(loginVista, empleadoDAO, empleadoxrolDAO, rolDAO);
    }
}
