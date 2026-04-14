package week12;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javax.swing.text.html.FormView;
import java.text.Normalizer;
import java.text.ParseException;
import java.util.InputMismatchException;

public class SimpleCalc extends Application {
    public void start(Stage stage){
        GridPane root = new GridPane();
        root.setVgap(10);
        root.setHgap(10);
        root.setPadding(new Insets(10));
        root.setAlignment(Pos.CENTER);

        TextField n1 = new TextField("Number 1");
        TextField n2 = new TextField("Number 2");
        Button clc = new Button("Calculate");
        TextField res = new TextField("Sum: ");
        Button clr = new Button("Clear");
        res.setEditable(false);
        root.add(n1,0,0);
        root.add(n2,0,1);
        root.add(clc,0,2);
        root.add(res,0,3);
        root.add(clr,1,2);

            clc.setOnMouseClicked(event -> {
                try{
                double s1 = Double.parseDouble(n1.getText());
                double s2 = Double.parseDouble(n2.getText());
                res.setText("Sum: "+(s1+s2));
            }catch (NumberFormatException e){
                res.setText("Invalid Input");
            }
            });
            clr.setOnMouseClicked(event -> {
                n1.clear();
                n2.clear();
                res.clear();
            });



        Scene scene =  new Scene(root,300,200);
        stage.setScene(scene);
        stage.setTitle("SimpleCalc");
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }
}
