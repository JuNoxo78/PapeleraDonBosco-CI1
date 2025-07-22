package dao.inventario.productos_terminados;

import conf.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import modelo.inventario.productos_terminados.ProductoTerminado;
import java.sql.Types;

public class PTDAO {

	public static List<ProductoTerminado> obtenerTodos() {
		List<ProductoTerminado> productos = new ArrayList<>();
		String sql = "SELECT * FROM productoterminado";

		try (Connection conn = Conexion.conectar(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

			while (rs.next()) {
				ProductoTerminado pt = new ProductoTerminado();
				pt.setIdProductoTerminado(rs.getString("idProductoTerminado"));
				pt.setNombre(rs.getString("nombre"));
				pt.setDescripcion(rs.getString("descripcion"));
				pt.setPrecio(rs.getBigDecimal("precio"));

				int stockMinimo = rs.getInt("stockMinimo");
				pt.setStockMinimo(rs.wasNull() ? null : stockMinimo);

				pt.setTipoPT(rs.getString("tipoPT"));
				pt.setDimensiones(rs.getString("dimensiones"));
				pt.setIdPlantillaMI(rs.getString("idPlantillaMI"));
				pt.setRutaImagen(rs.getString("rutaImagen"));
				pt.setFechaSubida(rs.getTimestamp("fechaSubida").toLocalDateTime());

				productos.add(pt);
			}

		} catch (SQLException e) {
			e.printStackTrace(); // o manejo de errores personalizado
		}

		return productos;
	}

	public List<ProductoTerminado> ListarProductoTerminado() {
		List<ProductoTerminado> listaProducto = new ArrayList<>();
		String sql = "SELECT * FROM productoterminado";

		try (Connection con = Conexion.conectar(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

			while (rs.next()) {
				ProductoTerminado pt = new ProductoTerminado();
				pt.setIdProductoTerminado(rs.getString("idProductoTerminado"));
				pt.setNombre(rs.getString("nombre"));
				pt.setDescripcion(rs.getString("descripcion"));
				pt.setPrecio(rs.getBigDecimal("precio"));
				pt.setStockMinimo(rs.getInt("stockMinimo"));
				pt.setTipoPT(rs.getString("tipoPT"));
				pt.setDimensiones(rs.getString("dimensiones"));
				pt.setIdPlantillaMI(rs.getString("idPlantillaMI"));

				Timestamp fechaSQL = rs.getTimestamp("fechaSubida");
				pt.setFechaSubida(fechaSQL != null ? fechaSQL.toLocalDateTime() : null);

				listaProducto.add(pt);
			}

		} catch (SQLException e) {
			System.out.println("Error al listar producto terminado: " + e.getMessage());
		}

		return listaProducto;
	}

	public void insertar(ProductoTerminado pt) {
		String sql = "INSERT INTO productoterminado (idProductoTerminado, nombre, descripcion, precio, stockMinimo, tipoPT, dimensiones, idPlantillaMI, fechaSubida) " + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try (Connection con = Conexion.conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

			ps.setString(1, pt.getIdProductoTerminado());
			ps.setString(2, pt.getNombre());
			ps.setString(3, pt.getDescripcion());
			ps.setBigDecimal(4, pt.getPrecio());
			ps.setInt(5, pt.getStockMinimo());
			ps.setString(6, pt.getTipoPT());
			ps.setString(7, pt.getDimensiones());
			ps.setString(8, pt.getIdPlantillaMI());

			if (pt.getFechaSubida() != null) {
				ps.setTimestamp(9, Timestamp.valueOf(pt.getFechaSubida()));
			} else {
				ps.setNull(9, Types.TIMESTAMP);
			}

			ps.executeUpdate();
			System.out.println("Producto Terminado insertado con éxito");

		} catch (SQLException e) {
			System.out.println("Error al insertar Producto Terminado");
			e.printStackTrace();
		}
	}

	public boolean actualizarProducto(ProductoTerminado PT) throws SQLException {
		String sql = "UPDATE productoterminado SET nombre=?, descripcion=?, precio=?, stockMinimo=?, tipoPT=?, dimensiones=? WHERE idProductoTerminado=?";

		try (Connection conexion = Conexion.conectar(); PreparedStatement stmt = conexion.prepareStatement(sql)) {

			stmt.setString(1, PT.getNombre());
			stmt.setString(2, PT.getDescripcion());
			stmt.setBigDecimal(3, PT.getPrecio());
			stmt.setInt(4, PT.getStockMinimo());
			stmt.setString(5, PT.getTipoPT());
			stmt.setString(6, PT.getDimensiones());

			stmt.setString(7, PT.getIdProductoTerminado());

			return stmt.executeUpdate() > 0;
		}
	}

	public boolean eliminarProducto(String idProductoTerminado) throws SQLException {
		String sql = "DELETE FROM productoterminado WHERE idProductoTerminado = ?";

		try (Connection con = Conexion.conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

			// Establece el parámetro del ID
			ps.setString(1, idProductoTerminado);

			// Ejecuta la eliminación; devuelve true si se eliminó alguna fila
			return ps.executeUpdate() > 0;
		}
	}

	public ProductoTerminado buscarPorId(String idProductoTerminado) {
		ProductoTerminado pt = null;
		String sql = "SELECT * FROM productoterminado WHERE idProductoTerminado = ?";

		try (Connection con = Conexion.conectar(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, idProductoTerminado);
			try (ResultSet rs = ps.executeQuery()) {
				if (rs.next()) {
					pt = new ProductoTerminado();
					pt.setIdProductoTerminado(rs.getString("idProductoTerminado"));
					pt.setNombre(rs.getString("nombre"));
					pt.setDescripcion(rs.getString("descripcion"));
					pt.setPrecio(rs.getBigDecimal("precio"));

					int stockMinimo = rs.getInt("stockMinimo");
					pt.setStockMinimo(rs.wasNull() ? null : stockMinimo);

					pt.setTipoPT(rs.getString("tipoPT"));
					pt.setDimensiones(rs.getString("dimensiones"));
					pt.setIdPlantillaMI(rs.getString("idPlantillaMI"));

					Timestamp fechaSQL = rs.getTimestamp("fechaSubida");
					pt.setFechaSubida(fechaSQL != null ? fechaSQL.toLocalDateTime() : null);

					pt.setRutaImagen(rs.getString("rutaImagen"));
				}
			}
		} catch (SQLException e) {
			System.out.println("Error al buscar producto terminado por ID: " + e.getMessage());
		}

		return pt;
	}

	public String obtenerUltimoId() {
		String sql = "SELECT idProductoTerminado FROM productoterminado ORDER BY idProductoTerminado DESC LIMIT 1";

		try (Connection con = Conexion.conectar(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
			if (rs.next()) {
				return rs.getString("idProductoTerminado");
			}
		} catch (SQLException e) {
			System.out.println("Error al obtener el último ID de Producto Terminado: " + e.getMessage());
		}

		return null; // o "PT000" si deseas iniciar desde ahí
	}

}
