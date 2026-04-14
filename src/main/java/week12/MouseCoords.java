package week12;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MouseCoords extends Application {
    public void start(Stage stage){
        StackPane body = new StackPane();
        body.setStyle("-fx-border-color: ligt-blue;");
        Label lbl = new Label();
        body.getChildren().add(lbl);
        body.setOnMouseMoved(event -> {
            lbl.setText("X: " + event.getX() + "\t" + "Y: "+ event.getY());
        });
        body.setOnMouseClicked(event -> {
            int r = (int)(Math.random()*256);
            int g = (int)(Math.random()*256);
            int b = (int)(Math.random()*256);
            body.setStyle(String.format("-fx-background-color: rgb(%d,%d,%d);", r, g, b));
        });
        body.setOnMouseExited(event -> {
            lbl.setText("Move the mouse over the pane");
        });

        BorderPane root = new BorderPane();
        root.setCenter(body);
        root.setBottom(lbl);

        Scene scene = new Scene(root,400,300);
        stage.setScene(scene);
        stage.setTitle("Mouse Coordinates");
        stage.show();

    }
}
