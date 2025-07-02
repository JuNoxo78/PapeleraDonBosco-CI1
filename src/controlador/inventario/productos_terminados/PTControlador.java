
package controlador.inventario.productos_terminados;

import dao.inventario.productos_terminados.PTDAO;
import java.sql.SQLException;
import java.util.List;
import modelo.inventario.productos_terminados.ProductoTerminado;

/**
 *
 * @author user
 */
public class PTControlador {
    private PTDAO dao = new PTDAO();
    
    //obtener Producto Terminado
    public List<ProductoTerminado> obtenerProducto() {
        return dao.ListarProductoTerminado();
    }
    //agregar datos Materia Prima
        public void registrarProducto(ProductoTerminado MP) {
        dao.insertar(MP);
    }
    // Modificar Producto Terminado
        public boolean ModificarProducto(ProductoTerminado PT) {
    try {
        return dao.actualizarProducto(PT);
    } catch (SQLException ex) {
        System.err.println("Error al modificar Producto Terminado: " + ex.getMessage());
        return false;
    }
}
    //Eliminar Producto Terminado
    public boolean eliminarProducto(String idPT) {
    try {
        return dao.eliminarProducto(idPT);
    } catch (SQLException ex) {
        System.err.println("Error al eliminar Producto Terminado: " + ex.getMessage());
        return false;
    }
}


}
