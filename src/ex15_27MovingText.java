
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EddyJ
 */
public class ex15_27MovingText extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        double width = 400;
        double height = 200;
        Scene scene = new Scene(pane, width, height);
        
        Text text = new Text("Programming is fun");
        text.setFont(Font.font(14));
        
        PathTransition pathTrans = new PathTransition(Duration.millis(5000), new Line(0, 100, 350, 100), text);
        pathTrans.setCycleCount(Timeline.INDEFINITE);
        pathTrans.play();

        pane.setOnMousePressed(e-> {
            pathTrans.pause();
        });
        pane.setOnMouseReleased(e-> {
            pathTrans.play();
        });

        pane.getChildren().addAll(text);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Moving text");
        primaryStage.show();
    }


    public static void main(String[] args) {
        Application.launch(args);
    }}