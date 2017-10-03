package ObjectsClasses;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;


public class Ex2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        Rectangle rect1 = new Rectangle(10,10);
        Rectangle rect2 = new Rectangle(30,30,10,10);
        Shape rect3 = Shape.intersect(Shape.subtract(rect1, rect2), Shape.subtract(rect1, rect2));

        System.out.println(rect3.toString());

        StackPane layout = new StackPane();
        layout.getChildren().add(rect1);
        layout.getChildren().add(rect2);
        layout.getChildren().add(rect3);


        Scene scene = new Scene(layout, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
