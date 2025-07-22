package dao.pedidos_ventas;

import conf.Conexion;
import modelo.pedidos_ventas.ComprobantePago;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ComprobantePagoDAO {

    public List<ComprobantePago> obtenerTodos() {
        List<ComprobantePago> lista = new ArrayList<>();
        String sql = "SELECT * FROM comprobantepago";

        try (Connection con = Conexion.conectar(); 
             PreparedStatement ps = con.prepareStatement(sql); 
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                ComprobantePago comp = new ComprobantePago();
                comp.setIdCompPago(rs.getString("idCompPago"));
                comp.setNumeroComprobante(rs.getString("numeroComprobante"));
                comp.setTipoComprobante(rs.getString("tipoComprobante"));
                comp.setFechaEmision(rs.getDate("fechaEmision").toLocalDate());
                comp.setMontoTotal(rs.getBigDecimal("montoTotal"));
                comp.setNombreArchivo(rs.getString("nombreArchivo"));
                comp.setRutaArchivo(rs.getString("rutaArchivo"));
                Timestamp ts = rs.getTimestamp("fechaSubida");
                comp.setFechaSubida(ts != null ? ts.toLocalDateTime() : null);
                lista.add(comp);
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener comprobantes de pago");
            e.printStackTrace();
        }

        return lista;
    }

    public boolean agregar(ComprobantePago comp) {
        String sql = "INSERT INTO comprobantepago (idCompPago, numeroComprobante, tipoComprobante, fechaEmision, montoTotal, nombreArchivo, rutaArchivo, fechaSubida) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = Conexion.conectar(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, comp.getIdCompPago());
            ps.setString(2, comp.getNumeroComprobante());
            ps.setString(3, comp.getTipoComprobante());
            ps.setDate(4, Date.valueOf(comp.getFechaEmision()));
            ps.setBigDecimal(5, comp.getMontoTotal());
            ps.setString(6, comp.getNombreArchivo());
            ps.setString(7, comp.getRutaArchivo());
            if (comp.getFechaSubida() != null) {
                ps.setTimestamp(8, Timestamp.valueOf(comp.getFechaSubida()));
            } else {
                ps.setNull(8, Types.TIMESTAMP);
            }

            int filas = ps.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            System.out.println("Error al agregar comprobante de pago");
            e.printStackTrace();
            return false;
        }
    }

    public String obtenerUltimoId() {
        String ultimoId = null;
        String sql = "SELECT idCompPago FROM comprobantepago ORDER BY idCompPago DESC LIMIT 1";

        try (Connection con = Conexion.conectar(); 
             PreparedStatement ps = con.prepareStatement(sql); 
             ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                ultimoId = rs.getString("idCompPago");
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener el último ID de comprobante de pago");
            e.printStackTrace();
        }

        return ultimoId;
    }
}