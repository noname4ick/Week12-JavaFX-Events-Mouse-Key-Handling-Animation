package week12;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



public class KeyboardMove extends Application {
    public void start(Stage stage){
        Pane root = new Pane();
        double paneWidth = 500;
        double paneHeight = 400;

        double rectWidth = 60;
        double rectHeight = 40;
        Rectangle pc = new Rectangle(60,40);
        pc.setFill(Color.BLUE);
        pc.setX(220);
        pc.setY(180);
        TextField posDisplay = new TextField("X: 220 Y: 180");
        posDisplay.setEditable(false);
        posDisplay.setLayoutY(paneHeight - 30);
        posDisplay.setPrefWidth(paneWidth);
        root.getChildren().addAll(
                pc,
                posDisplay);
        Scene scene = new Scene(root,paneWidth,paneHeight);


        scene.setOnKeyPressed(event -> {
            double x = pc.getX();
            double y = pc.getY();

            if(event.getCode() == KeyCode.UP){
                y-=10;
            }else if(event.getCode() == KeyCode.DOWN){
                y+=10;
            }else if(event.getCode() == KeyCode.LEFT){
                x-=10;
            }else if(event.getCode() == KeyCode.RIGHT){
                x+=10;
            }

            x = Math.max(0, Math.min(x, paneWidth - rectWidth));
            y = Math.max(0, Math.min(y, paneHeight - rectHeight));

            pc.setX(x);
            pc.setY(y);

            // Update the display
            posDisplay.setText("X: " + (int)x + " Y: " + (int)y);

        });
        stage.setScene(scene);
        stage.setTitle("Keyboard Move");
        stage.show();

        scene.getRoot().requestFocus();

    }
    public static void main(String[] args){
        launch();
    }
}
