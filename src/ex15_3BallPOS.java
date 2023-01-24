
import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EddyJ
 */
public class ex15_3BallPOS extends Application {
    @Override
    public void start(Stage primaryStage){
        Button left = new Button("Left");
        Button right = new Button("Right");
        Button down = new Button("Down");
        Button up = new Button("Up");
        
        Circle c = new Circle(100);
        c.setStroke(Color.BLACK);
        c.setFill(Color.GREENYELLOW);
        
        
        Pane pane = new Pane();
        c.layoutXProperty().bind(pane.widthProperty().divide(2));
        c.layoutYProperty().bind(pane.heightProperty().divide(2));
                
        
        
                
        pane.getChildren().addAll(c, left, right, down, up);
        
        left.setOnAction(e -> c.setCenterX(c.getCenterX() > -100 ? c.getCenterX() - 10 : 10));
        left.layoutXProperty().bind(pane.widthProperty().divide(2).subtract(90));
        left.layoutYProperty().bind(pane.heightProperty().divide(2).add(150));
        
        right.setOnAction(e -> c.setCenterX(c.getCenterX() <  100? c.getCenterX() + 10 : 10));
        right.layoutXProperty().bind(pane.widthProperty().divide(2).subtract(50));
        right.layoutYProperty().bind(pane.heightProperty().divide(2).add(150));

        down.setOnAction(e -> c.setCenterY(c.getCenterY() < 100? c.getCenterY() + 10 : 10));
        down.layoutXProperty().bind(pane.widthProperty().divide(2).add(40));
        down.layoutYProperty().bind(pane.heightProperty().divide(2).add(150));
        
        up.setOnAction(e -> c.setCenterY(c.getCenterY() > -100 ? c.getCenterY() - 10 : 10));
        up.layoutXProperty().bind(pane.widthProperty().divide(2));
        up.layoutYProperty().bind(pane.heightProperty().divide(2).add(150));
        
        
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setTitle("Ball POS");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){
        Application.launch(args);
        }
    }
