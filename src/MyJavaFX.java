
import javafx.scene.paint.Color;
import static java.awt.Color.yellow;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MyJavaFX extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a button and place it in the scene
    Button btOK = new Button("Shrink");
    Button btCan = new Button("Enlarge");
    Label q = new Label("Is Gabriel Cool?");
    
    Circle c = new Circle(50);
    c.setStroke(Color.RED);
    c.setFill(Color.YELLOW);
    c.setRadius(20);
    
  
    FlowPane pane = new FlowPane();
    FlowPane top = new FlowPane();
    pane.setAlignment(Pos.BOTTOM_CENTER.CENTER);
    pane.setHgap(5);
    pane.setVgap(5);
    top.getChildren().addAll(q);
    top.setAlignment(Pos.BASELINE_CENTER);
    
    pane.getChildren().addAll(btCan, btOK, c, q);
    btCan.setOnAction(e -> c.setRadius(c.getRadius()+2));
    btOK.setOnAction(e -> c.setRadius(c.getRadius()-2));
    
    Scene scene = new Scene(pane, 400, 200);
    primaryStage.setTitle("Does Gabriel have a life?"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  public static void main(String[] args) { 
    Application.launch(args);
  }
}

