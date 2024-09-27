package view.stages;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginView extends Stage {
    public LoginView() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/interfaces/LoginView.fxml"));
        try {
            Scene scene = new Scene(fxmlLoader.load());
            this.setTitle("Inicio de Sesión");
            this.setScene(scene);
            this.setResizable(false); // Opcional, para no permitir redimensionar la ventana
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
