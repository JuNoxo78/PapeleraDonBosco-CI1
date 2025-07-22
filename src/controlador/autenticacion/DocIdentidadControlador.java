package controlador.autenticacion;

/**
 *
 * @author Muaro
 */
import dao.autenticacion.DocIdentidadDAO;
import java.sql.SQLException;
import modelo.autenticacion.DocIdentidad;
import java.util.List;

public class DocIdentidadControlador {

    private DocIdentidadDAO dao = new DocIdentidadDAO();

    public void registrarDocumento(DocIdentidad doc) throws SQLException {
        // Asignar ID automáticamente si no está establecido
        if (doc.getIdDocIdentidad() == null || doc.getIdDocIdentidad().isEmpty()) {
            doc.setIdDocIdentidad(dao.generarNuevoId());
        }
        dao.insertarDocumento(doc);
    }

    public List<DocIdentidad> obtenerDocumentos() {
        return dao.obtenerDocumentos();
    }

    public void eliminarDocumento(String idDocIdentidad) throws SQLException {
        dao.eliminar(idDocIdentidad);
    }

    // Método para obtener el siguiente ID
    public String obtenerSiguienteId() {
        return dao.generarNuevoId();
    }

    // Nuevo método para buscar documentos
    public List<DocIdentidad> buscarDocumentos(String codigo, String tipo, String numero) {
        return dao.buscarDocumentos(codigo, tipo, numero);
    }

    // Obtener un documento por ID
    public DocIdentidad obtenerDocumentoPorId(String idDoc) {
        return dao.obtenerDocumentoPorId(idDoc);
    }

    // Actualizar un documento
    public void actualizarDocumento(DocIdentidad documento) {
        if (!dao.actualizarDocumento(documento)) {
            throw new RuntimeException("No se pudo actualizar el documento.");
        }
    }
}
