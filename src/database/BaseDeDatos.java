package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDeDatos {

    public Connection conectar() {
        Connection conn = null;
        try {
            // URL para autenticación de Windows
            String url = "jdbc:sqlserver://localhost;databaseName=system_gest_store;integratedSecurity=true";

            // Conexión a la base de datos
            conn = DriverManager.getConnection(url);
            System.out.println("Conexión a la base de datos exitosa!");
        } catch (SQLException e) {
            System.out.println("Error en la conexión: " + e.getMessage());
        }
        return conn;
    }
}
