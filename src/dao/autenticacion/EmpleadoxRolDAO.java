package dao.autenticacion;

import conf.Conexion;
import modelo.autenticacion.EmpleadoxRol;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoxRolDAO {

	public List<EmpleadoxRol> obtenerTodos() {
		List<EmpleadoxRol> listaEmxRol = new ArrayList<>();
		String sql = "SELECT * FROM empleadoxrol";

		try (Connection conn = Conexion.conectar(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

			while (rs.next()) {
				EmpleadoxRol er = new EmpleadoxRol();

				er.setIdEmpleado(rs.getString("idEmpleado"));
				er.setIdRol(rs.getString("idRol"));

				Timestamp fechaSQL = rs.getTimestamp("fechaRolAñadido");
				if (fechaSQL != null) {
					er.setFechaRolAñadido(fechaSQL.toLocalDateTime());
				}

				listaEmxRol.add(er);
			}

		} catch (SQLException e) {
			System.err.println("Error al obtener empleadoxrol: " + e.getMessage());
		}

		return listaEmxRol;
	}

	public boolean insertar(EmpleadoxRol er) {
		String sql = "INSERT INTO empleadoxrol (idEmpleado, idRol, fechaRolAñadido) VALUES (?, ?, ?)";

		try (Connection conn = Conexion.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setString(1, er.getIdEmpleado());
			stmt.setString(2, er.getIdRol());

			if (er.getFechaRolAñadido() != null) {
				stmt.setTimestamp(3, Timestamp.valueOf(er.getFechaRolAñadido()));
			} else {
				stmt.setNull(3, Types.TIMESTAMP);
			}

			int filas = stmt.executeUpdate();
			return filas > 0;

		} catch (SQLException e) {
			System.err.println("❌ Error al insertar empleadoxrol: " + e.getMessage());
			return false;
		}
	}

	public boolean eliminar(String idEmpleado, String idRol) {
		String sql = "DELETE FROM empleadoxrol WHERE idEmpleado = ? AND idRol = ?";

		try (Connection conn = Conexion.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

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
