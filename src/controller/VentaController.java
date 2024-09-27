package controller;

import dao.VentaDAO;
import model.Venta;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class VentaController {
    private VentaDAO ventaDAO;

    public VentaController(Connection connection) {
        this.ventaDAO = new VentaDAO(connection);
    }

    public void agregarVenta(Venta venta) throws SQLException {
        ventaDAO.agregarVenta(venta);
    }

    public List<Venta> obtenerVentas() throws SQLException {
        return ventaDAO.obtenerVentas();
    }

    public void actualizarVenta(Venta venta) throws SQLException {
        ventaDAO.actualizarVenta(venta);
    }

    public void eliminarVenta(int id) throws SQLException {
        ventaDAO.eliminarVenta(id);
    }

    public double obtenerVentasPorDia(LocalDate fecha) throws SQLException {
        return ventaDAO.obtenerVentasPorDia(fecha);
    }
}
