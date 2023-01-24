
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
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
/**
 * @author EddyJ
 *
 */
public class ex15_13CheckMouseP extends Application {
    
    @Override
    public void start(Stage primaryStage){
        Pane pane = new Pane();
        Rectangle r = new Rectangle(100, 60, 100, 40);
        r.setFill(Color.AQUA);
        r.setStroke(Color.BLACK);
        
        Text text = new Text();
        pane.getChildren().addAll(r, text);
        
        pane.setOnMouseMoved(e -> {
            if(r.contains(e.getX(), e.getY())){
                text.setText("Mouse point is inside the rectangle");
                r.setFill(Color.color(Math.random(), Math.random(), Math.random(), Math.random()));
            }else{
                text.setText("Mouse point is outside the rectangle");
            }
            text.setX(e.getX());
            text.setY(e.getY());
        });
        
        Scene scene = new Scene(pane, 400, 250);
        primaryStage.setTitle("Rectangle CheckMousePointer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }    
    public static void main(String[] args){
        Application.launch(args);
        }
}
