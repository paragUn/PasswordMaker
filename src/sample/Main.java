package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.InputStream;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello. Here's password maker!");
        primaryStage.setWidth(500);
        primaryStage.setHeight(400);

        InputStream iconStream =
        getClass().getResourceAsStream("/images/someImage.png");
        Image image = new Image(iconStream);
        primaryStage.getIcons().add(image);

        Button buttonOK = new Button();
        Button buttonCancel = new Button();


        primaryStage.show();
    }



}
