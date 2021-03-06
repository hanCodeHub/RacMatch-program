package Matchr_UI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// USE ONLY WHEN RUNNING APP WITH UI
public class JavaFX_App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        // loads the UI from the fxml file into the scene
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        primaryStage.setTitle("Matchr");
        primaryStage.setScene(new Scene(root, 700, 750));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
