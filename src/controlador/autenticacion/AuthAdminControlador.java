package controlador.autenticacion;

import vista.autenticacion.LoginAdmin;

public class AuthAdminControlador {
	private LoginAdmin loginAdminVista;

	public AuthAdminControlador(LoginAdmin loginAdminVista) {
		this.loginAdminVista = loginAdminVista;
		initController();
	}

	public void initController() {
		loginAdminVista.setVisible(true);
	}
}
