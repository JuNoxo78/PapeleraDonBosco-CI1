package conf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexionn {

    public static Connection conectar() {
        Connection conexion = null;

        // Configuración de conexión
        String url = "jdbc:mysql://localhost:3306/papeleraartesanal";
        String usuario = "root";

        // Lista de contraseñas a probar
        String[] posiblesContraseñas = {
            "root",
        };

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            for (String contraseña : posiblesContraseñas) {
                try {
                    conexion = DriverManager.getConnection(url, usuario, contraseña);
                    System.out.println("Conexion exitosa con password: " + contraseña);
                    break; // Salir del bucle si la conexión fue exitosa
                } catch (SQLException e) {
                    System.out.println("Fallo con password: " + contraseña);
                }
            }

            if (conexion == null) {
                System.out.println("No se pudo conectar con ninguna de las passwords.");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se encontro el driver JDBC");
            e.printStackTrace();
        }

        return conexion;
    }
}