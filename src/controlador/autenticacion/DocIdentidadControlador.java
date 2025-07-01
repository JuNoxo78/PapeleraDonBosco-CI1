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
         dao.insertarDocumento(doc);
    }

    public List<DocIdentidad> obtenerDocumentos() {
        return dao.obtenerDocumentos();
    }
    
    public void eliminarDocumento(String idDocIdentidad) throws SQLException {
        dao.eliminar(idDocIdentidad);
    }

}
