
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
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
public class ex15_25BallOnCurve extends Application {


    private static double width = 500;
    private static double height = 200;
    private static double X = width / 2;
    private static double Y = height / 2;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();


        Polyline xAxis = new Polyline();
        drawXAxis(pane, xAxis);
        Polyline yAxis = new Polyline();
        drawYAxis(pane, yAxis);

        String[] pi = new String[] {"-3\u03c0", "-2\u03c0", "-\u03c0", "0" , "\u03c0", "2\u03c0", "3\u03c0"};

        int index = 0;
        Polyline sinc = new Polyline();
        sinc.setStroke(Color.RED);
        ObservableList<Double> list = sinc.getPoints();
        
        for (int x = -170; x <= 170; x++) {
            list.add(x + X);
            double y = Y - 50 * Math.sin((x / 100.0) * 2 * Math.PI);
            list.add(y);

            if (y >= 99.9 && y < 100.01) {
                Text text = new Text(x + X, Y / 0.9, pi[index++]);
                pane.getChildren().add(text);
            }
        }
        Circle c = new Circle(list.get(0),list.get(1),10);
        c.setFill(Color.YELLOWGREEN);
        c.setStroke(Color.BLACK);
        PathTransition path = new PathTransition(Duration.millis(3500), sinc, c);
        path.setCycleCount(PathTransition.INDEFINITE);
        pane.getChildren().addAll(xAxis, yAxis, sinc, c);
        pane.setOnMouseClicked(e-> {
            if (e.getButton() == MouseButton.PRIMARY) {
                path.play();
            } else if (e.getButton() == MouseButton.SECONDARY) {
                path.pause();
            }
        });
        primaryStage.setScene(new Scene(pane, width, height));
        primaryStage.setTitle("Ball on curve");
        primaryStage.show();
    }
    private static void drawXAxis(Pane pane, Polyline xAxis) {
        ObservableList<Double> xAxisList = xAxis.getPoints();
        double limit = width * 0.95;

        for (double x = 0; x < limit; x++) {
            xAxisList.add(x);
            xAxisList.add(Y);
        }

        Line line1 = new Line(limit, Y, limit - width * 0.05, Y * 0.875);
        Line line2 = new Line(limit, Y, limit - width * 0.05, Y / 0.875);
        Text text = new Text(limit + (width * 0.02), Y, "X");
        text.setFont(Font.font(18));
        pane.getChildren().addAll(line1, line2, text);
    }

    private static void drawYAxis(Pane pane, Polyline yAxis) {
        ObservableList<Double> yAxisList = yAxis.getPoints();
        double limit = height * 0.95;

        for (double y = 0; y < limit; y++) {
            yAxisList.add(X);
            yAxisList.add(y + height * 0.1);
        }
        Line line1 = new Line(X, height * 0.1, X - width * 0.05, height * 0.2);
        Line line2 = new Line(X, height * 0.1, X + width * 0.05, height * 0.2);
        Text text = new Text(limit + (width * 0.2), height * 0.1, "Y");
        text.setFont(Font.font(18));
        pane.getChildren().addAll(line1, line2,text);
    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}