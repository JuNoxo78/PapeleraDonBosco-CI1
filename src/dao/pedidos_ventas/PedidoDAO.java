package dao.pedidos_ventas;

import conf.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.pedidos_ventas.Pedido;

public class PedidoDAO {

	public List<Pedido> obtenerPedidos() {
		List<Pedido> lista = new ArrayList<>();
		String sql = "SELECT * FROM papeleraartesanal.pedido";

		try (Connection con = Conexion.conectar(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

			while (rs.next()) {
				Pedido pedido = new Pedido();
				pedido.setIdPedido(rs.getString("idPedido"));
				pedido.setIdCliente(rs.getString("idCliente"));
				pedido.setIdEmpleado(rs.getString("idEmpleado"));
				pedido.setObservaciones(rs.getString("observaciones"));
				Date sqlFechaEntrega = rs.getDate("fechaEntrega");
				pedido.setFechaEntrega(sqlFechaEntrega != null ? sqlFechaEntrega.toLocalDate() : null);
				pedido.setEstadoPedido(rs.getString("estadoPedido"));
				pedido.setIdVenta(rs.getString("idVenta"));
				Timestamp sqlFechaRegistro = rs.getTimestamp("fechaRegistro");
				pedido.setFechaRegistro(sqlFechaRegistro != null ? sqlFechaRegistro.toLocalDateTime() : null);
				lista.add(pedido);
			}

		} catch (SQLException e) {
			System.out.println("❌ Error al obtener pedidos");
			e.printStackTrace();
		}

		return lista;
	}
}
