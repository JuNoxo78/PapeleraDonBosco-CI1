package controlador;

import dao.RolDAO;
import modelo.Rol;

import java.util.List;

public class RolControlador {

    private RolDAO rolDAO;

    public RolControlador() {
        this.rolDAO = new RolDAO();
    }

    public List<Rol> obtenerRoles() {
        try {
            return rolDAO.obtenerTodos();
        } catch (Exception e) {
            System.err.println("Error en el controlador al obtener roles: " + e.getMessage());
            return null; // o Collections.emptyList() si prefieres evitar null
        }
    }
}