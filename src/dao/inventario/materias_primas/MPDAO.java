
package dao.inventario.materias_primas;

/**
 *
 * @author user
 */

import modelo.inventario.materias_primas.MateriaPrima;
import conf.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.autenticacion.DocIdentidad;

public class MPDAO {
    
        Connection con;
        Conexion cn = new Conexion();
        PreparedStatement ps;
        ResultSet rs;
    
        public List ListarMateriaPrima(){
        List<MateriaPrima> MateriaPrima = new ArrayList();
        String sql = "SELECT * FROM materiaprima";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                MateriaPrima MP = new MateriaPrima();
                MP.setIdMateriaPrima(rs.getString("idMateriaPrima"));
                MP.setNombre(rs.getString("nombre"));
                MP.setDescripcion(rs.getString("descripcion"));
                MP.setUnidadMedida(rs.getString("unidadMedida"));
                MP.setStockMinimo(rs.getInt("stockMinimo"));
                MP.setTipoMP(rs.getString("tipoMP"));
                MP.setRutaImagen(rs.getString("rutaImagen"));
                
                Timestamp fechaSQL = rs.getTimestamp("fechaSubida");
                MP.setFechaSubida(fechaSQL != null ? fechaSQL.toLocalDateTime() : null);
                MateriaPrima.add(MP);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
       return MateriaPrima;
    }
        
        public void insertar(MateriaPrima MP) {
        String sql = "INSERT INTO materiaprima (idMateriaPrima, nombre, descripcion, unidadMedida, stockMinimo, tipoMP, fechaSubida) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = Conexion.conectar();
            PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, MP.getIdMateriaPrima());
            ps.setString(2, MP.getNombre());
            ps.setString(3, MP.getDescripcion());
            ps.setString(4, MP.getUnidadMedida());
            ps.setInt(5, MP.getStockMinimo());
            ps.setString(6, MP.getTipoMP());
            
            if (MP.getFechaSubida()!= null) {
                ps.setTimestamp(7, Timestamp.valueOf(MP.getFechaSubida()));
            } else {
                ps.setNull(7, Types.TIMESTAMP);
            }

            ps.executeUpdate();
            System.out.println("Materia Prima insertado con éxito");

        } catch (SQLException e) {
            System.out.println("Error al insertar Materia Prima");
            e.printStackTrace();
        }
    }
        
        public boolean actualizarPrima(MateriaPrima MP) throws SQLException {
        String sql = "UPDATE materiaprima SET nombre=?, descripcion=?, unidadMedida=?, stockMinimo=?, tipoMP=?  WHERE idMateriaPrima=?";
        try (Connection conexion = Conexion.conectar();
             PreparedStatement stmt = conexion.prepareStatement(sql)) {

            stmt.setString(1, MP.getNombre());
            stmt.setString(2, MP.getDescripcion());     
            stmt.setString(3, MP.getUnidadMedida());    
            stmt.setInt(4, MP.getStockMinimo());
            stmt.setString(5, MP.getTipoMP());
            
            stmt.setString(6, MP.getIdMateriaPrima());
            return stmt.executeUpdate() > 0;
        }
    }
        
        public boolean eliminarPrima(String idMateriaPrima) throws SQLException {
        // Consulta SQL para eliminar un dato de Materia prima por su ID
        String sql = "DELETE FROM materiaprima WHERE idMateriaPrima = ?";
        
        try (Connection con = Conexion.conectar();
         PreparedStatement ps = con.prepareStatement(sql)) {

        // Establece el parámetro del ID
        ps.setString(1, idMateriaPrima);

        // Ejecuta la eliminación; devuelve true si se eliminó alguna fila
        return ps.executeUpdate() > 0;
    }
  }
}
