package conf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Muaro
 */
public class conexion {

    public static Connection conectar() {
        Connection conexion = null;
        
        //Credenciales de la base de datos
        String url = "jdbc:mysql://localhost:3306/papeleraDonBosco"; 
        String usuario = "root"; 
        String contraseña = "root";  

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("✅ Conexión exitosa a la base de datos");

        } catch (ClassNotFoundException e) {
            System.out.println("❌ Error: No se encontró el driver JDBC");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("❌ Error al conectar a MySQL");
            e.printStackTrace();
        }

        return conexion;
    }
}