
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
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
public class ex15_11KeysPressed extends Application {
    @Override
    public void start(Stage primaryStage){
        
        Circle c = new Circle(100);
        c.setStroke(Color.BLACK);
        c.setFill(Color.GREENYELLOW);
        
        
        Pane pane = new Pane();
        c.layoutXProperty().bind(pane.widthProperty().divide(2));
        c.layoutYProperty().bind(pane.heightProperty().divide(2));
              
        pane.getChildren().addAll(c);
        
        
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setTitle("Ball POS");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        scene.setOnKeyPressed(e -> {
            if(e.getCode() == KeyCode.LEFT){
                c.setCenterX(c.getCenterX() > -100 ? c.getCenterX() - 10 : 10);
            }else if(e.getCode() == KeyCode.RIGHT){
                c.setCenterX(c.getCenterX() <  100? c.getCenterX() + 10 : 10);
            }else if(e.getCode() == KeyCode.UP){
                c.setCenterY(c.getCenterY() > -100 ? c.getCenterY() - 10 : 10);
            }else if(e.getCode() == KeyCode.DOWN){
                c.setCenterY(c.getCenterY() < 100? c.getCenterY() + 10 : 10);
            }
        });
        
    }
    public static void main(String[] args){
        Application.launch(args);
        }
    }
