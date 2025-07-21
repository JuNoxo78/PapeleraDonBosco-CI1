package dao.autenticacion;

import modelo.autenticacion.Rol;
import conf.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RolDAO {

	public List<Rol> obtenerTodos() {
		List<Rol> roles = new ArrayList<>();
		String sql = "SELECT idRol, nombreRol, descripcion FROM papeleraartesanal.rol ORDER BY idRol";

		try (Connection conn = Conexion.conectar(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

			while (rs.next()) {
				Rol rol = new Rol();
				rol.setIdRol(rs.getString("idRol"));
				rol.setNombreRol(rs.getString("nombreRol"));
				rol.setDescripcion(rs.getString("descripcion"));
				roles.add(rol);
			}

		} catch (SQLException e) {
			System.err.println("Error al obtener roles: " + e.getMessage());
		}

		return roles;
	}
}
