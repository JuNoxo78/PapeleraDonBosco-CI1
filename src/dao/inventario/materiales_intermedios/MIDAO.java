/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.inventario.materiales_intermedios;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import modelo.inventario.materiales_intermedios.InventarioMI;
import modelo.inventario.materiales_intermedios.MaterialIntermedio;
import modelo.inventario.materiales_intermedios.MovimientoMI;
/**
 *
 * @author user
 */
public class MIDAO {
	private Connection conn;

        public MIDAO(Connection conn) {
            this.conn = conn;
        }

    //Obtener todos los registros de inventario
    public List<InventarioMI> obtenerTodos() throws SQLException {
        List<InventarioMI> inventarios = new ArrayList<>();
        String sql = "SELECT * FROM inventariomi";
        try (PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                InventarioMI inv = new InventarioMI();
                inv.setIdInventarioMI(rs.getString("idInventarioMI"));
                inv.setIdAlmacen(rs.getString("idAlmacen"));
                inv.setStockLogico(rs.getInt("stockLogico"));
                inv.setStockFisico(rs.getInt("stockFisico"));
                inv.setFechaActualizacion(rs.getTimestamp("fechaActualizacion").toLocalDateTime());
                inv.setPeriodo(rs.getString("periodo"));
                inventarios.add(inv);
            }
        }
        return inventarios;
    }
    
   //Actualizar existencias en inventario 
    public void actualizarStock(String idInventario, int deltaStockFisico, int deltaStockLogico) throws SQLException {
        String sql = "UPDATE inventariomi SET stockFisico = stockFisico + ?, stockLogico = stockLogico + ?, "
                   + "fechaActualizacion = NOW() WHERE idInventarioMI = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, deltaStockFisico);
            ps.setInt(2, deltaStockLogico);
            ps.setString(3, idInventario);
            ps.executeUpdate();
        }
    }
    
    //Obtener inventario por ID
    public InventarioMI obtenerPorId(String idInventario) throws SQLException {
        String sql = "SELECT * FROM inventariomi WHERE idInventarioMI = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, idInventario);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    InventarioMI inv = new InventarioMI();
                    inv.setIdInventarioMI(rs.getString("idInventarioMI"));
                    inv.setIdAlmacen(rs.getString("idAlmacen"));
                    inv.setStockLogico(rs.getInt("stockLogico"));
                    inv.setStockFisico(rs.getInt("stockFisico"));
                    inv.setFechaActualizacion(rs.getTimestamp("fechaActualizacion").toLocalDateTime());
                    inv.setPeriodo(rs.getString("periodo"));
                    return inv;
                }
            }
        }
        return null;
    }
    
    //Crear nuevo inventario
    public void insertarInventario(InventarioMI inventario) throws SQLException {
        String sql = "INSERT INTO inventariomi (idInventarioMI, idAlmacen, stockLogico, stockFisico, fechaActualizacion, periodo) "
                   + "VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, inventario.getIdInventarioMI());
            ps.setString(2, inventario.getIdAlmacen());
            ps.setInt(3, inventario.getStockLogico());
            ps.setInt(4, inventario.getStockFisico());
            ps.setTimestamp(5, Timestamp.valueOf(inventario.getFechaActualizacion()));
            ps.setString(6, inventario.getPeriodo());
            ps.executeUpdate();
        }
    }
    
    //Obtener la existencia por material intermedio en inventario
    public InventarioMI getInventarioPorMaterial(String idAlmacen, String idMaterialIntermedio) throws SQLException {
        String sql = "SELECT inv.* FROM inventariomi inv "
                   + "JOIN inventariomi_materials imi ON inv.idInventarioMI = imi.idInventarioMI "
                   + "WHERE inv.idAlmacen = ? AND imi.idMaterialIntermedio = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, idAlmacen);
            ps.setString(2, idMaterialIntermedio);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    InventarioMI inv = new InventarioMI();
                    inv.setIdInventarioMI(rs.getString("idInventarioMI"));
                    inv.setIdAlmacen(rs.getString("idAlmacen"));
                    inv.setStockLogico(rs.getInt("stockLogico"));
                    inv.setStockFisico(rs.getInt("stockFisico"));
                    inv.setFechaActualizacion(rs.getTimestamp("fechaActualizacion").toLocalDateTime());
                    inv.setPeriodo(rs.getString("periodo"));
                    return inv;
                }
            }
        }
        return null;
    }
}
