package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.DataOutputStream;
import java.io.IOException;

public class RegistrationStage extends Stage {//окно регистрации
    DataOutputStream out;

    public RegistrationStage(DataOutputStream out) {
        this.out = out;
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("singup.fxml"));
            setTitle("Sign Up");
            Scene scene = new Scene(root, 300, 200);
            setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}