package controller;

import dao.ClienteDAO;
import model.Cliente;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ClienteController {
    private ClienteDAO clienteDAO;

    public ClienteController(Connection connection) {
        this.clienteDAO = new ClienteDAO(connection);
    }

    public void agregarCliente(String nombre, String email, String telefono, double credito) throws SQLException {
        Cliente nuevoCliente = new Cliente(0,nombre,email,telefono,credito);
        clienteDAO.agregarCliente(nuevoCliente);
    }

    public List<Cliente> obtenerCliente() throws SQLException {
        return clienteDAO.obtenerClientes();
    }

    public void actualizarCliente(Cliente Cliente) throws SQLException {
        clienteDAO.actualizarCliente(Cliente);
    }

    public void eliminarCliente(int id) throws SQLException {
        clienteDAO.eliminarCliente(id);
    }
}
