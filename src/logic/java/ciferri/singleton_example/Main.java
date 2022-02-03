package ciferri.singleton_example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 750, 400);
            stage.setTitle("Singleton Example!");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText("Error loading some files!");
            alert.setContentText("Please try again later.");
            alert.showAndWait();
            stage.close();
        }

    }

    public static void main(String[] args) {
        launch();
    }
}