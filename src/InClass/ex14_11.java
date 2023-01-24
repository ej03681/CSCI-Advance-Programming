/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InClass;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

/**
 *
 * @author EddyJ
 */
public class ex14_11 extends Application {
    
    
    @Override
    public void start(Stage primaryStage){
        
        Pane pane = new Pane();
        
        Circle pupil1 = new Circle(39);
        pupil1.setStroke(Color.SKYBLUE);
        pupil1.setFill(Color.SKYBLUE);
        pupil1.setCenterX(400);
        pupil1.setCenterY(200);
        
        Circle pupil2 = new Circle(39);
        pupil2.setStroke(Color.SKYBLUE);
        pupil2.setFill(Color.SKYBLUE);
        pupil2.setCenterX(200);
        pupil2.setCenterY(200);
        
        Circle c = new Circle(280);
        c.setStroke(Color.BLACK);
        c.setFill(Color.TRANSPARENT);
        c.setCenterX(300);
        c.setCenterY(300);
        pane.getChildren().addAll(c,pupil1,pupil2);
        
        Ellipse eyeL = new Ellipse(40, 50);
        eyeL.setStroke(Color.BLACK);
        eyeL.setFill(Color.TRANSPARENT);
        eyeL.setCenterX(400);
        eyeL.setCenterY(200);

        pane.getChildren().add(eyeL);
        
       
        Ellipse eyeR = new Ellipse(40,50);
        eyeR.setStroke(Color.BLACK);
        eyeR.setFill(Color.TRANSPARENT);
        pane.getChildren().add(eyeR);
        eyeR.setCenterX(200);
        eyeR.setCenterY(200);
        
        Arc nose = new Arc(20, 45, 45, 20, 1, 180);
        nose.setStroke(Color.BLACK);
        nose.setFill(Color.TRANSPARENT);
        nose.setCenterX(300);
        nose.setCenterY(315);
        pane.getChildren().add(nose);
        
        Arc smile = new Arc(180, 100, 150, 90, 1, -180);
        smile.setStroke(Color.BLACK);
        smile.setFill(Color.TRANSPARENT);
        smile.setCenterX(300);
        smile.setCenterY(400);
        smile.rotateProperty().add(180);
        pane.getChildren().add(smile);

        Scene scene = new Scene(pane,601,601);
        primaryStage.setTitle("Smile");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    public static void main(String[] args){
        Application.launch(args);
    }
}
