package dao;

import modelo.autenticacion.Empleado;
import conf.Conexion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAO {

	// Método para obtener todos los empleados desde la base de datos
	public List<Empleado> obtenerTodos() {
		List<Empleado> empleados = new ArrayList<>();

		String sql = "SELECT * FROM empleado";

		try (Connection conn = Conexion.conectar(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

			while (rs.next()) {
				Empleado empleado = new Empleado();

				// Asignamos los valores recuperados del ResultSet al objeto Empleado
				empleado.setIdEmpleado(rs.getString("idEmpleado"));
				empleado.setIdDocIdentidad(rs.getString("idDocIdentidad"));
				empleado.setNombre(rs.getString("nombre"));
				empleado.setApellido(rs.getString("apellido"));
				empleado.setDireccion(rs.getString("direccion"));
				empleado.setTelefono(rs.getString("telefono"));
				empleado.setCorreo(rs.getString("correo"));
				empleado.setContraseña(rs.getString("contraseña"));

				// Convertimos el TINYINT(1) a Boolean
				boolean activo = rs.getBoolean("activo");
				empleado.setActivo(activo);

				empleados.add(empleado);
			}

		} catch (SQLException e) {
			System.err.println("Error al obtener empleados: " + e.getMessage());
			// En un proyecto más grande, podrías lanzar una excepción personalizada
		}

		return empleados;
	}

	public Empleado buscarPorDocumentoYContraseña(String numeroDocumento, String contraseña) {
		String sql = "SELECT e.* FROM empleado e "
				+ "JOIN docidentidad d ON e.idDocIdentidad = d.idDocIdentidad "
				+ "WHERE d.numeroDocumento = ? AND e.contraseña = ? AND e.estado = 1";

		try (Connection conn = Conexion.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setString(1, numeroDocumento);
			stmt.setString(2, contraseña);

			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					return new Empleado(
							rs.getString("idEmpleado"),
							rs.getString("idDocIdentidad"),
							rs.getString("nombre"),
							rs.getString("apellido"),
							rs.getString("direccion"),
							rs.getString("telefono"),
							rs.getString("correo"),
							rs.getString("contraseña"),
							rs.getBoolean("activo")
					);
				}
			}

		} catch (SQLException e) {
			System.err.println("❌ Error al buscar empleado por documento: " + e.getMessage());
		}

		return null;
	}
}
