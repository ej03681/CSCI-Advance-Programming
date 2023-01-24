/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex14;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;



/**
 *
 * @author EddyJ
 */
public class ex14_9FourFans extends Application{
    @Override
    public void start(Stage primaryStage) {
        int radius = 50;
        int gap = 5;
        Pane pane = new Pane();
        int pos1 = radius + gap;
        int pos2 = radius + gap;
        
        
        for (int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++){
            Circle c = new Circle(radius);
            c.setCenterX(pos1);
            c.setCenterY(pos2);
            c.setStroke(Color.BLACK);
            c.setFill(Color.WHITE);
            pane.getChildren().add(c);
            
            for(int k = 30; k < 360; k += 90) {
                Arc fan = new Arc(pos1, pos2, 45, 45, k, 30);
                fan.setFill(Color.BLACK);
                fan.setType(ArcType.ROUND);
                pane.getChildren().add(fan);
                
            }    
            pos1 += radius * 2 + gap;
            }
        pos1 = radius + gap;
        pos2 += radius * 2 + gap;
        }
    Scene scene = new Scene(pane,220,220);
    primaryStage.setTitle("Four Fans");
    primaryStage.setScene(scene);
    primaryStage.show();
    }
    
    public static void main(String[] args){
    Application.launch(args);
    
    }
}
