
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.Scene;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EddyJ
 */
public class StackPane extends Application {
    @Override
    public void start(Stage primaryStage){
        
        
        Circle c = new Circle(50);
        Pane pane = new Pane();
        StackPane pane1 = new StackPane();
        Arc fan1 = new Arc();
        for(int i = 30; i < 360; i += 90){
            Arc fan = new Arc(55, 55, 45, 45, i, 30);
            fan.setFill(Color.BLACK);
            fan.setType(ArcType.ROUND);
            fan1 = fan;
        }
        pane.getChildren().addAll(c, fan1);
        
        Scene scene = new Scene(pane, 400, 200);
        primaryStage.setTitle("Four Fans");
    primaryStage.setScene(scene);
    primaryStage.show();

    }
    public static void main(String[] args){
Application.launch(args);
}
}

