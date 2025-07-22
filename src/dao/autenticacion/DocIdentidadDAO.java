package dao.autenticacion;

import conf.Conexion;
import modelo.autenticacion.DocIdentidad;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DocIdentidadDAO {

    // Para Insertar Documentos
    public void insertarDocumento(DocIdentidad doc) throws SQLException {
        String sql = "INSERT INTO docidentidad (idDocIdentidad, tipoDocumento, numeroDocumento) VALUES (?, ?, ?)";
        try (Connection conn = Conexion.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, doc.getIdDocIdentidad());
            stmt.setString(2, doc.getTipoDocumento());
            stmt.setString(3, doc.getNumeroDocumento());
            stmt.executeUpdate(); // Puede lanzar SQLException
        } catch (SQLException e) {
            throw e;
        }
    }

    // Obtener un documento por ID
    public DocIdentidad obtenerDocumentoPorId(String idDoc) {
        DocIdentidad doc = null;
        String sql = "SELECT * FROM docidentidad WHERE idDocIdentidad = ?";
        try (Connection conn = Conexion.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, idDoc);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    doc = new DocIdentidad();
                    doc.setIdDocIdentidad(rs.getString("idDocIdentidad"));
                    doc.setTipoDocumento(rs.getString("tipoDocumento"));
                    doc.setNumeroDocumento(rs.getString("numeroDocumento"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return doc;
    }

    // Actualizar un documento
    public boolean actualizarDocumento(DocIdentidad documento) {
        String sql = "UPDATE docidentidad SET tipoDocumento = ?, numeroDocumento = ? WHERE idDocIdentidad = ?";
        try (Connection conn = Conexion.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, documento.getTipoDocumento());
            stmt.setString(2, documento.getNumeroDocumento());
            stmt.setString(3, documento.getIdDocIdentidad());
            int filasAfectadas = stmt.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Para Listar todos los documentos
    public List<DocIdentidad> obtenerDocumentos() {
        List<DocIdentidad> lista = new ArrayList<>();
        String sql = "SELECT * FROM docidentidad";
        try (Connection con = Conexion.conectar(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                DocIdentidad doc = new DocIdentidad();
                doc.setIdDocIdentidad(rs.getString("idDocIdentidad"));
                doc.setTipoDocumento(rs.getString("tipoDocumento"));
                doc.setNumeroDocumento(rs.getString("numeroDocumento"));
                lista.add(doc);
            }
        } catch (SQLException e) {
            System.out.println("❌ Error al obtener documentos de identidad");
            e.printStackTrace();
        }
        return lista;
    }

    // Para Eliminar Documentos
    public void eliminar(String idDocIdentidad) throws SQLException {
        String sql = "DELETE FROM docidentidad WHERE idDocIdentidad = ?";
        try (Connection conn = Conexion.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, idDocIdentidad);
            stmt.executeUpdate(); // Puede lanzar SQLException
        } catch (SQLException e) {
            throw e;
        }
    }

    public String obtenerUltimoId() {
        String ultimoId = null;
        String sql = "SELECT idDocIdentidad FROM docidentidad ORDER BY idDocIdentidad DESC LIMIT 1";
        try (Connection conn = Conexion.conectar(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                ultimoId = rs.getString("idDocIdentidad");
            }
        } catch (SQLException e) {
            System.out.println("* Error al obtener el último ID de documento de identidad");
            e.printStackTrace();
        }
        return ultimoId;
    }

    // Método para generar el siguiente ID en formato DOC00*
    public String generarNuevoId() {
        String ultimoId = obtenerUltimoId();
        String nuevoId;

        if (ultimoId == null) {
            // Si no hay documentos, empezar con DOC001
            nuevoId = "DOC001";
        } else {
            // Extraer el número del último ID (ejemplo: DOC001 -> 1)
            int numero = Integer.parseInt(ultimoId.replace("DOC", ""));
            // Incrementar el número
            numero++;
            // Formatear el nuevo ID con ceros a la izquierda (DOC00*)
            nuevoId = String.format("DOC%03d", numero);
        }
        return nuevoId;
    }

    // Nuevo método para buscar documentos con filtros opcionales
    public List<DocIdentidad> buscarDocumentos(String codigo, String tipo, String numero) {
        List<DocIdentidad> resultados = new ArrayList<>();
        String sql = "SELECT idDocIdentidad, tipoDocumento, numeroDocumento FROM docidentidad WHERE 1=1";
        if (!codigo.isEmpty()) {
            sql += " AND idDocIdentidad LIKE ?";
        }
        if (tipo != null && !tipo.isEmpty()) {
            sql += " AND tipoDocumento = ?";
        }
        if (!numero.isEmpty()) {
            sql += " AND numeroDocumento LIKE ?";
        }

        try (Connection conn = Conexion.conectar(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            int paramIndex = 1;
            if (!codigo.isEmpty()) {
                pstmt.setString(paramIndex++, "%" + codigo + "%");
            }
            if (tipo != null && !tipo.isEmpty()) {
                pstmt.setString(paramIndex++, tipo);
            }
            if (!numero.isEmpty()) {
                pstmt.setString(paramIndex++, "%" + numero + "%");
            }

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    DocIdentidad doc = new DocIdentidad();
                    doc.setIdDocIdentidad(rs.getString("idDocIdentidad"));
                    doc.setTipoDocumento(rs.getString("tipoDocumento"));
                    doc.setNumeroDocumento(rs.getString("numeroDocumento"));
                    resultados.add(doc);
                }
            }
        } catch (SQLException e) {
            System.out.println("❌ Error al buscar documentos de identidad");
            e.printStackTrace();
            throw new RuntimeException("Error al buscar documentos: " + e.getMessage());
        }
        return resultados;
    }
}
