package JavaScratchFx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class JavaScratchedFX extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane group = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        Group group = new Group();
        Scene scene = new Scene(group, 400, 500);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setFill(Color.valueOf("#356263"));

        primaryStage.setTitle("Hello Java!");
        primaryStage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
        primaryStage.setFullScreen(false);

        group.getChildren().add(rectangle);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
