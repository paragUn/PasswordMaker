package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.InputStream;



public class Main extends Application {

    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/sample/sample.fxml"));
        Controller controller = loader.getController();
        Parent root = loader.load();

        Scene primaryScene = new Scene(root);
        primaryStage.setScene(primaryScene);

        InputStream iconStream =
        getClass().getResourceAsStream("/sample/Security-Password-2-icon.png");
        Image image = new Image(iconStream);
        primaryStage.getIcons().add(image);
        
        primaryStage.show();
    }
}
