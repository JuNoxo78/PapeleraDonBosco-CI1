package dao.inventario.materiales_intermedios;

import conf.Conexion;
import modelo.inventario.materiales_intermedios.MaterialIntermedio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class MIDAO {

    public List<MaterialIntermedio> obtenerTodos() {
        List<MaterialIntermedio> materiales = new ArrayList<>();
        String sql = "SELECT * FROM materialintermedio";

        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                MaterialIntermedio mi = new MaterialIntermedio();
                mi.setIdMaterialIntermedio(rs.getString("idMaterialIntermedio"));
                mi.setNombre(rs.getString("nombre"));
                mi.setDescripcion(rs.getString("descripcion"));
                mi.setUnidadMedida(rs.getString("unidad_medida"));

                int stockMinimo = rs.getInt("stockMinimo");
                mi.setStockMinimo(rs.wasNull() ? null : stockMinimo);

                mi.setTipoMI(rs.getString("tipoMI"));
                mi.setRutaImagen(rs.getString("rutaImagen"));

                Timestamp fechaSQL = rs.getTimestamp("fechaSubida");
                mi.setFechaSubida(fechaSQL != null ? fechaSQL.toLocalDateTime() : null);

                materiales.add(mi);
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener todos los materiales intermedios: " + e.getMessage());
        }

        return materiales;
    }

    public MaterialIntermedio buscarPorId(String idMaterialIntermedio) {
        MaterialIntermedio mi = null;
        String sql = "SELECT * FROM materialintermedio WHERE idMaterialIntermedio = ?";

        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, idMaterialIntermedio);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    mi = new MaterialIntermedio();
                    mi.setIdMaterialIntermedio(rs.getString("idMaterialIntermedio"));
                    mi.setNombre(rs.getString("nombre"));
                    mi.setDescripcion(rs.getString("descripcion"));
                    mi.setUnidadMedida(rs.getString("unidad_medida"));

                    int stockMinimo = rs.getInt("stockMinimo");
                    mi.setStockMinimo(rs.wasNull() ? null : stockMinimo);

                    mi.setTipoMI(rs.getString("tipoMI"));
                    mi.setRutaImagen(rs.getString("rutaImagen"));

                    Timestamp fechaSQL = rs.getTimestamp("fechaSubida");
                    mi.setFechaSubida(fechaSQL != null ? fechaSQL.toLocalDateTime() : null);
                }
            }

        } catch (SQLException e) {
            System.out.println("Error al buscar material intermedio por ID: " + e.getMessage());
        }

        return mi;
    }

    public String obtenerUltimoId() {
        String sql = "SELECT idMaterialIntermedio FROM materialintermedio ORDER BY idMaterialIntermedio DESC LIMIT 1";

        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                return rs.getString("idMaterialIntermedio");
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener el último ID de Material Intermedio: " + e.getMessage());
        }

        return null; // o "MI000" si deseas iniciar desde ahí
    }
}