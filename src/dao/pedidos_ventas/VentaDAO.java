package dao.pedidos_ventas;

import conf.Conexion;
import modelo.pedidos_ventas.Venta;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VentaDAO {

    public List<Venta> obtenerVentas() {
        List<Venta> lista = new ArrayList<>();
        String sql = "SELECT * FROM venta";

        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Venta venta = new Venta();
                venta.setIdVenta(rs.getString("idVenta"));
                venta.setIdCompPago(rs.getString("idCompPago"));
                Date fecha = rs.getDate("fechaVenta");
                venta.setFechaVenta(fecha != null ? fecha.toLocalDate() : null);
                venta.setMetodoPago(rs.getString("metodoPago"));
                venta.setEstadoPago(rs.getString("estadoPago"));
                lista.add(venta);
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener ventas:");
            e.printStackTrace();
        }

        return lista;
    }

    public boolean agregarVenta(Venta venta) {
        String sql = "INSERT INTO venta (idVenta, idCompPago, fechaVenta, metodoPago, estadoPago) VALUES (?, ?, ?, ?, ?)";

        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, venta.getIdVenta());
            ps.setString(2, venta.getIdCompPago());
            if (venta.getFechaVenta() != null) {
                ps.setDate(3, Date.valueOf(venta.getFechaVenta()));
            } else {
                ps.setNull(3, Types.DATE);
            }
            ps.setString(4, venta.getMetodoPago());
            ps.setString(5, venta.getEstadoPago());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al agregar venta:");
            e.printStackTrace();
            return false;
        }
    }

    public String obtenerUltimoIdVenta() {
        String ultimoId = null;
        String sql = "SELECT idVenta FROM venta ORDER BY idVenta DESC LIMIT 1";

        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                ultimoId = rs.getString("idVenta");
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener el último ID de venta:");
            e.printStackTrace();
        }

        return ultimoId;
    }
}