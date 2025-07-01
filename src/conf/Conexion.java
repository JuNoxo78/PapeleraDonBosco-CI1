package conf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	public static Connection conectar() {
		Connection conexion = null;

		String url = "jdbc:mysql://localhost:3306/papeleraartesanal";
		String usuario = "root";
		String contraseña = "root";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				conexion = DriverManager.getConnection(url, usuario, contraseña);
				System.out.println("Conexion exitosa");
			} catch (SQLException e) {
				System.out.println("Error: " + e.getMessage());
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Error: No se encontro el driver JDBC");
			e.printStackTrace();
		}

		return conexion;
	}
}
