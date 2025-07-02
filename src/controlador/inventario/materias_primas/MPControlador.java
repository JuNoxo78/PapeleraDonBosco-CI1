
package controlador.inventario.materias_primas;

import modelo.inventario.materias_primas.MateriaPrima;
import java.sql.SQLException;
import dao.inventario.materias_primas.MPDAO;
import java.util.List;
import modelo.clientes.Cliente;

public class MPControlador {
    private MPDAO dao = new MPDAO();
    
    //obtener MateriaPrima
    public List<MateriaPrima> obtenerPrimas() {
        return dao.ListarMateriaPrima();
    }
    //agregar datos Materia Prima
        public void registrarPrimas(MateriaPrima MP) {
        dao.insertar(MP);
    }
        
    //Modificar Materia Prima
    public boolean ModificarPrima(MateriaPrima MP) {
        try {
            return dao.actualizarPrima(MP);
        } catch (SQLException ex) {
            System.err.println("Error al modificar Materias Primas: " + ex.getMessage());
            return false;
        }
    }
    
    public boolean eliminarPrima(String idPM) {
        try {
            return dao.eliminarPrima(idPM);
        } catch (SQLException ex) {
            System.err.println("Error al eliminar Materia Prima: " + ex.getMessage());
            return false;
        }
    }
}



