
import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class franks extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {       
    SierpinskiTrianglePane trianglePane = new SierpinskiTrianglePane(); 
    TextField tfOrder = new TextField(); 
    tfOrder.setOnAction(
      e -> trianglePane.setOrder(Integer.parseInt(tfOrder.getText())));
    tfOrder.setPrefColumnCount(4);
    tfOrder.setAlignment(Pos.BOTTOM_RIGHT);

    // Pane to hold label, text field, and a button
    HBox hBox = new HBox(10);
    hBox.getChildren().addAll(new Label("Enter an order: "), tfOrder);
    hBox.setAlignment(Pos.CENTER);
    
    BorderPane borderPane = new BorderPane();
    borderPane.setCenter(trianglePane);
    borderPane.setBottom(hBox);
        
    // Create a scene and place it in the stage
    Scene scene = new Scene(borderPane, 200, 210);
    primaryStage.setTitle("Exercise18_36"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    
    scene.widthProperty().addListener(ov -> trianglePane.paint());
    scene.heightProperty().addListener(ov -> trianglePane.paint());
  }

  /** Pane for displaying triangles */
  static class SierpinskiTrianglePane extends Pane {
    private int order = 0;

    /** Set a new order */
    public void setOrder(int order) {
      this.order = order;
      paint();
    }

    SierpinskiTrianglePane() {
    }

    protected void paint() {
      // Select three points in proportion to the panel size
      Point2D p1 = new Point2D(getHeight() / 2 - 30, getWidth() / 2 - 30);
      Point2D p2 = new Point2D(getHeight() / 2 - 30, getWidth() / 2 + 30);
      Point2D p3 = new Point2D(getHeight() / 2 + 30, getWidth() / 2 - 30);
      Point2D p4 = new Point2D(getHeight() / 2 + 30, getWidth() / 2 + 30);
      Point2D p5 = new Point2D(getHeight() / 2 - 30, getWidth() / 2);
      Point2D p6 = new Point2D(getHeight() / 2 + 30, getWidth() / 2);
      

      this.getChildren().clear(); // Clear the pane before redisplay

      displayTriangles(order, getHeight() / 2 - 30, getWidth() / 2 - 30,
    		  p2, p3, p4, p5, p6);
    }

    private void displayTriangles(int order, double p1, 
        double p2, double p3, double p4, double p5, double p6 ) {
      if (order == 0) {
        // Draw a triangle to connect three points
        
        Line line1 = new Line(p1.getX(), p1.getY(), p2.getX(), p2.getY());
        Line line2 = new Line(p3.getX(), p3.getY(), p4.getX(), p4.getY());
        Line line3 = new Line (p5.getX(), p5.getY(), p6.getX(), p6.getY());
        this.getChildren().addAll(line1, line2, line3);
      } 
      else {
        // Get the midpoint on each edge in the triangle
        
        
        
      }
    }
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
