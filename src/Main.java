import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.stages.LoginView;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Crear y mostrar la vista de inicio de sesión
        LoginView loginView = new LoginView();
        loginView.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}









/*

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import dao.UsuarioDAO;
import model.Usuario;


public class Main {
    public static void main(String[] args) {

        String connectionUrl = "jdbc:sqlserver://KEVIN\\SQLEXPRESS;databaseName=system_gest_store;integratedSecurity=true;encrypt=false;";

        // Conectar a la base de datos
        try (Connection connection = DriverManager.getConnection(connectionUrl)) {
            System.out.println("Conexión exitosa a la base de datos!");

            UsuarioDAO usuarioDAO = new UsuarioDAO(connection); // Instanciar UsuarioDAO con la conexión

            // Crear un nuevo usuario
            Usuario nuevoUsuario = new Usuario();
            nuevoUsuario.setNombre("Kevin Muñoz");
            nuevoUsuario.setEmail("kevin.munoz@gmail.com");
            nuevoUsuario.setContrasena("1234567");
            nuevoUsuario.setRol("Administrador");

            // Insertar el usuario en la base de datos
            usuarioDAO.agregarUsuario(nuevoUsuario);
            System.out.println("Usuario insertado exitosamente.");

        } catch (SQLException e) {
            System.out.println("Error en la conexión o en la operación: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
} */
