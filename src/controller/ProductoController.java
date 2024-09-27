package controller;

import dao.ProductoDAO;
import model.Producto;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ProductoController {
    private ProductoDAO productoDAO;

    public ProductoController(Connection connection) {
        this.productoDAO = new ProductoDAO(connection);
    }

    public void agregarProducto(String nombre, double precio, int cantidad) throws SQLException {
        Producto nuevoProducto = new Producto(0, nombre, precio, cantidad);
        productoDAO.agregarProducto(nuevoProducto);
    }

    public List<Producto> obtenerProductos() throws SQLException {
        return productoDAO.obtenerProductos();
    }

    public void actualizarProducto(Producto producto) throws SQLException {
        productoDAO.actualizarProducto(producto);
    }

    public void eliminarProducto(int id) throws SQLException {
        productoDAO.eliminarProducto(id);
    }
}
