package controlador;
/**
 *
 * @author Muaro
 */
import dao.DocIdentidadDAO;
import java.sql.SQLException;
import modelo.DocIdentidad;
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
