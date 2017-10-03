package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FaceViewer extends Application {

    @Override
    public void start(Stage primaryStage) {
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        Ellipse head = new Ellipse(105, 85, 50, 75);
        head.setFill(Color.TRANSPARENT);
        head.setStroke(Color.BLACK);
        head.setStrokeWidth(3.0);

        Rectangle rightEye = new Rectangle(75, 70, 15, 15);
        rightEye.setFill(Color.GREEN);
        rightEye.setStrokeWidth(1.5);

        Rectangle leftEye = new Rectangle(120, 70, 15, 15);
        leftEye.setFill(Color.GREEN);
        leftEye.setStrokeWidth(1.5);

        Line mouth = new Line(80, 110, 130, 110);
        mouth.setStroke(Color.RED);

        Text greeting = new Text(170, 85, "Hello Java!");
        greeting.setFont(Font.font("Menlo", FontWeight.SEMI_BOLD, 16));

        Group root = new Group(head, rightEye, leftEye, mouth, greeting);
        Scene scene = new Scene(root, 300, 400);

        primaryStage.setTitle("An Alien Face");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
