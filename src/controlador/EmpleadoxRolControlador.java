package controlador;

import dao.EmpleadoxRolDAO;
import modelo.autenticacion.EmpleadoxRol;

import java.util.List;

public class EmpleadoxRolControlador {

    private EmpleadoxRolDAO dao;

    public EmpleadoxRolControlador() {
        dao = new EmpleadoxRolDAO();
    }

    public List<EmpleadoxRol> obtenerAsignaciones() {
        try {
            return dao.obtenerTodos();
        } catch (Exception e) {
            System.err.println("❌ Error en el controlador al obtener asignaciones: " + e.getMessage());
            return null;
        }
    }

    public boolean asignarRol(EmpleadoxRol er) {
        if (er.isValid()) {
            return dao.insertar(er);
        }
        System.out.println("❗ Asignación inválida: faltan datos.");
        return false;
    }

    public boolean eliminarAsignacion(String idEmpleado, String idRol) {
        return dao.eliminar(idEmpleado, idRol);
    }
}