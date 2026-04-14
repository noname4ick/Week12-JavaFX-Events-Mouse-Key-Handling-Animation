package week12;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class KeyLogger extends Application {

    @Override
    public void start(Stage primaryStage) {
        TextField inputField = new TextField();
        inputField.setPromptText("Type here to log events...");

        TextArea logArea = new TextArea();
        logArea.setEditable(false);
        logArea.setPrefRowCount(5);
        logArea.setWrapText(true);

        inputField.setOnKeyPressed(event -> {
            logArea.appendText(String.format("PRESSED  | Code: %-10s | Shift: %-5b | Ctrl: %-5b%n",
                    event.getCode(), event.isShiftDown(), event.isControlDown()));
        });

        inputField.setOnKeyReleased(event -> {
            logArea.appendText(String.format("RELEASED | Code: %s%n", event.getCode()));
        });

        inputField.setOnKeyTyped(event -> {
            logArea.appendText(String.format("TYPED    | Char: %s%n", event.getCharacter()));
        });

        Button clearBtn = new Button("Clear Log");
        clearBtn.setOnAction(e -> logArea.clear());

        VBox root = new VBox(10);
        root.setPadding(new Insets(20)); // padding 20
        root.getChildren().addAll(
                new Label("Keyboard Input:"),
                inputField,
                new Label("Event Log:"),
                logArea,
                clearBtn
        );

        Scene scene = new Scene(root, 420, 320);
        primaryStage.setTitle("Key Event Logger");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}