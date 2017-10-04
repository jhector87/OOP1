package test;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class testet extends Application {

    private int width, height;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Group root = new Group();

        StackPane pane = new StackPane();
        width = 828;
        height = 60;

        Rectangle bar1 = new Rectangle(10, 40, width, height);
        bar1.setFill(Color.DARKRED);
        bar1.setStroke(Color.BLACK);
        bar1.setStrokeWidth(3.0);

        Text greeting = new Text("Hello Java!");
        greeting.setFont(Font.font("Menlo", FontWeight.SEMI_BOLD, 16));

        greeting.setLayoutX(width / 2 - greeting.getLayoutBounds().getWidth() / 2);
        greeting.setLayoutY(height / 2 - greeting.getLayoutBounds().getHeight() / 2);

        pane.getChildren().addAll(bar1, greeting);
        root.getChildren().addAll(pane);

        stage.setTitle("Test");
        stage.setScene(new Scene(root, 1000, 750));
        stage.show();

    }
}

