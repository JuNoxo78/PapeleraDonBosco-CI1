package dao.autenticacion;

/**
 *
 * @author Muaro
 */
import conf.Conexion;
import modelo.autenticacion.DocIdentidad;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DocIdentidadDAO {

//Para Insertar Documentos
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

//Para Listar todos los documentos
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
//Para Eliminar Documentos

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
}
