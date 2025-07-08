/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.inventario.materiales_intermedios;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.inventario.materiales_intermedios.MaterialIntermedio;
/**
 *
 * @author user
 */
public class MIControlador {
	private Connection conn;

        public MIControlador(Connection conn) {
            this.conn = conn;
        }
        
    // Crear plantilla nueva
    public void crearPlantilla(String idPlantilla, String observaciones, int cantidadObtenidaPT) throws SQLException {
        String sql = "INSERT INTO plantillami (idPlantillaMI, observaciones, cantidadObtenidaPT) VALUES (?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, idPlantilla);
            ps.setString(2, observaciones);
            ps.setInt(3, cantidadObtenidaPT);
            ps.executeUpdate();
        }
    }

    // Agregar detalles a plantilla
    public void agregarDetalle(String idPlantilla, String idMaterialIntermedio, int cantidadRequerida, String comentarios) throws SQLException {
        String sql = "INSERT INTO detalleplantillami (idPlantillaMI, idMaterialIntermedio, cantidadRequerida, comentarios) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, idPlantilla);
            ps.setString(2, idMaterialIntermedio);
            ps.setInt(3, cantidadRequerida);
            ps.setString(4, comentarios);
            ps.executeUpdate();
        }
    }
    
    // Obtener todas las plantillas
    public List<String> obtenerPlantillas() throws SQLException {
        List<String> resultados = new ArrayList<>();
        String sql = "SELECT * FROM plantillami";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                resultados.add(rs.getString("idPlantillaMI"));
            }
        }
        return resultados;
    }
}
