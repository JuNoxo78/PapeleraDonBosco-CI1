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
			System.out.println("Error al obtener pedidos");
			e.printStackTrace();
		}

		return lista;
	}

	public String obtenerUltimoIdPedido() {
		String ultimoId = null;

		String sql = "SELECT idPedido FROM pedido ORDER BY idPedido DESC LIMIT 1";

		try (Connection conn = Conexion.conectar(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

			if (rs.next()) {
				ultimoId = rs.getString("idPedido");
			}

		} catch (SQLException e) {
			System.out.println("Error al obtener el último ID de pedido: " + e.getMessage());
		}

		return ultimoId;
	}

	public boolean agregarPedido(Pedido pedido) {
		String sql = "INSERT INTO pedido (idPedido, idCliente, idEmpleado, observaciones, fechaEntrega, estadoPedido, idVenta, fechaRegistro) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

		try (Connection conn = Conexion.conectar(); PreparedStatement ps = conn.prepareStatement(sql)) {

			ps.setString(1, pedido.getIdPedido());
			ps.setString(2, pedido.getIdCliente());
			ps.setString(3, pedido.getIdEmpleado());
			ps.setString(4, pedido.getObservaciones());

			// Fecha de entrega puede ser nula
			if (pedido.getFechaEntrega() != null) {
				ps.setDate(5, Date.valueOf(pedido.getFechaEntrega()));
			} else {
				ps.setNull(5, Types.DATE);
			}

			ps.setString(6, pedido.getEstadoPedido());

			// ID de venta puede ser nulo
			if (pedido.getIdVenta() != null) {
				ps.setString(7, pedido.getIdVenta());
			} else {
				ps.setNull(7, Types.VARCHAR);
			}

			ps.setTimestamp(8, Timestamp.valueOf(pedido.getFechaRegistro()));

			int filasAfectadas = ps.executeUpdate();
			return filasAfectadas > 0;

		} catch (SQLException e) {
			System.out.println("Error al agregar pedido: " + e.getMessage());
			e.printStackTrace();
			return false;
		}
	}
}
