package dao;

import conf.Conexion;
import modelo.EmpleadoxRol;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoxRolDAO {

    // Obtener todos los registros de la tabla empleadoxrol
    public List<EmpleadoxRol> obtenerTodos() {
        List<EmpleadoxRol> lista = new ArrayList<>();

        String sql = "SELECT * FROM empleadoxrol";

        try (Connection conn = Conexion.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                EmpleadoxRol er = new EmpleadoxRol();

                er.setIdEmpleado(rs.getString("idEmpleado"));
                er.setIdRol(rs.getString("idRol"));

                Date fechaSQL = rs.getDate("fechaRolAñadido");
                if (fechaSQL != null) {
                    er.setFechaRolAñadido(fechaSQL.toLocalDate());
                }

                lista.add(er);
            }

        } catch (SQLException e) {
            System.err.println("❌ Error al obtener empleadoxrol: " + e.getMessage());
        }

        return lista;
    }

    // Insertar nuevo registro
    public boolean insertar(EmpleadoxRol er) {
        String sql = "INSERT INTO empleadoxrol (idEmpleado, idRol, fechaRolAñadido) VALUES (?, ?, ?)";

        try (Connection conn = Conexion.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, er.getIdEmpleado());
            stmt.setString(2, er.getIdRol());

            if (er.getFechaRolAñadido() != null) {
                stmt.setDate(3, Date.valueOf(er.getFechaRolAñadido()));
            } else {
                stmt.setNull(3, Types.DATE);
            }

            int filas = stmt.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            System.err.println("❌ Error al insertar empleadoxrol: " + e.getMessage());
            return false;
        }
    }

    // Eliminar asignación de rol
    public boolean eliminar(String idEmpleado, String idRol) {
        String sql = "DELETE FROM empleadoxrol WHERE idEmpleado = ? AND idRol = ?";

        try (Connection conn = Conexion.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, idEmpleado);
            stmt.setString(2, idRol);

            int filas = stmt.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            System.err.println("❌ Error al eliminar empleadoxrol: " + e.getMessage());
            return false;
        }
    }
}