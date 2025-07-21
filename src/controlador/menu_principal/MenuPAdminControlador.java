package controlador.menu_principal;

import vista.menu_principal.MenuPrincipalAdmin;

public class MenuPAdminControlador {
	private final MenuPrincipalAdmin menuPrincipalAdmin;

	public MenuPAdminControlador(MenuPrincipalAdmin menuPrincipalAdmin) {
		this.menuPrincipalAdmin = menuPrincipalAdmin;
		initController();
	}

	public void initController() {
		menuPrincipalAdmin.setVisible(true);
	}
	
}
