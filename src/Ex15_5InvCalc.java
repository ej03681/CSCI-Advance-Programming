
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author EddyJ
 */
public class Ex15_5InvCalc extends Application {

    @Override
    public void start(Stage primaryStage) {

        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(11, 12, 13, 14));
        pane.setHgap(5);
        pane.setVgap(5);

        Label invAm = new Label("Investment Amount: ");
        TextField t1 = new TextField();

        Label NOY = new Label("Number of Years: ");
        TextField noyt = new TextField();

        Label AIR = new Label("Annual Interest Rate: ");
        TextField airt = new TextField();

        Label futv = new Label("Future Value: ");
        TextField futvt = new TextField();

        pane.getChildren().addAll(invAm, t1, NOY, noyt, AIR, airt, futv, futvt);

        HBox hbox = new HBox();
        Button calc = new Button("Calculate");
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().add(calc);

        BorderPane Bpane = new BorderPane();
        Bpane.setCenter(pane);
        Bpane.setBottom(hbox);

        Scene scene = new Scene(Bpane, 200, 250);
        primaryStage.setTitle("");
        primaryStage.setScene(scene);
        primaryStage.show();

        calc.setOnAction(e -> futvt.setText(String.format("$%.2f", (Double.parseDouble(t1.getText()) * 
                Math.pow(1 + (Double.parseDouble(airt.getText()) / 1200),
                        Double.parseDouble(noyt.getText()) * 12)))));

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
