package dao;

import model.Venta;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VentaDAO {
    private Connection connection;

    public VentaDAO(Connection connection) {
        this.connection = connection;
    }

    public void agregarVenta(Venta venta) throws SQLException {
        String sql = "INSERT INTO VENTAS (fecha, total) VALUES (?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setTimestamp(1, Timestamp.valueOf(venta.getFecha()));
            pstmt.setDouble(2, venta.getTotal());
            pstmt.executeUpdate();
        }
    }

    public void actualizarVenta(Venta venta) throws SQLException {
        String sql = "UPDATE VENTAS SET fecha = ?, total = ? WHERE ID = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setTimestamp(1, Timestamp.valueOf(venta.getFecha()));
            pstmt.setDouble(2, venta.getTotal());
            pstmt.setInt(3, venta.getId());
            pstmt.executeUpdate();
        }
    }

    public void eliminarVenta(int id) throws SQLException {
        String sql = "DELETE FROM VENTAS WHERE ID = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        }
    }

    public List<Venta> obtenerVentas() throws SQLException {
        List<Venta> ventas = new ArrayList<>();
        String sql = "SELECT * FROM VENTAS";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Venta venta = new Venta(
                        rs.getInt("ID"),
                        rs.getTimestamp("fecha").toLocalDateTime(),
                        rs.getDouble("total")
                );
                ventas.add(venta);
            }
        }
        return ventas;
    }

    public double obtenerVentasPorDia(LocalDate fecha) throws SQLException {
        double totalVentas = 0;
        String sql = "SELECT SUM(total) AS total_ventas FROM VENTAS WHERE DATE(fecha) = DATE(?)";

        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setDate(1, Date.valueOf(fecha));
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    totalVentas = rs.getDouble("total_ventas");
                }
            }
        }
        return totalVentas;
    }
}
