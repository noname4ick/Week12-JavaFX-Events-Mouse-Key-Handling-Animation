package week12;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ClickCounter extends Application {
    public int counter = 0;
    public void start(Stage stage){
        VBox root = new VBox(20);
        root.setPadding(new Insets(30));
        root.setAlignment(Pos.CENTER);
        Button click = new Button("Click me");
        Label lbl = new Label("Clicks: " + counter);
        click.setOnMouseClicked(event -> {
            lbl.setText("Clicks: " + counter);
            counter++;
        });
        root.getChildren().addAll(click,lbl);
        Scene scene = new Scene(root,300,200);
        stage.setScene(scene);
        stage.setTitle("Click Counter");
        stage.show();

    }
}
