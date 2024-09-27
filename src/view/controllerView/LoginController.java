package view.controllerView;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private TextField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Label errorMessage; // Añade un Label para mostrar mensajes de error

    @FXML
    public void initialize() {
        loginButton.setOnAction(event -> handleLogin());
    }

    private void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Lógica para validar el usuario y la contraseña
        if (validarUsuario(username, password)) {
            abrirSiguienteVentana();
        } else {
            mostrarError("Usuario o contraseña incorrectos.");
        }
    }

    private boolean validarUsuario(String username, String password) {
        // Aquí puedes agregar lógica para validar con una base de datos o un listado de usuarios
        return username.equals("admin") && password.equals("admin"); // Cambia esto según tus necesidades
    }

    private void mostrarError(String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error de Inicio de Sesión");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void abrirSiguienteVentana() {
        // Implementa la lógica para abrir la siguiente ventana
        // Por ejemplo, puedes crear un nuevo Stage y cargar una nueva escena
        Stage stage = (Stage) loginButton.getScene().getWindow();
        // Cierra la ventana de inicio de sesión
        stage.close();
        // Aquí podrías abrir otra ventana (ejemplo, una ventana de dashboard)
        // new DashboardView().show();
    }
}
