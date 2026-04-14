package week12;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class DraggableCircle extends Application {
    double offsetX, offsetY;
    public void start(Stage stage){
        Pane root = new Pane();
        int width = 500;
        int height = 400;
        Circle circle = new Circle(width/2,height/2,40, Color.CORAL);

        circle.setOnMouseClicked(event -> {
            offsetX = event.getSceneX() - circle.getCenterX();
            offsetY = event.getSceneY() - circle.getCenterY();
        });

        circle.setOnMouseDragged(event -> {
            circle.setCenterX(event.getSceneX() - offsetX);
            circle.setCenterY(event.getSceneY() - offsetY);
            circle.setFill(Color.TOMATO);
        });

        circle.setOnMouseReleased(event -> {
            circle.setFill(Color.CORAL);
        });

        root.getChildren().add(circle);

        Scene scene = new Scene(root,500,400);
        stage.setScene(scene);
        stage.setTitle("Draggable Circle");
        stage.show();

    }
    public static void main(String[] args){
        launch();
    }
}
