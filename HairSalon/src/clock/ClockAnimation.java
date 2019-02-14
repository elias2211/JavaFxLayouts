package clock;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.util.Duration; 

public class ClockAnimation extends Application{
  @Override
  public void start(Stage primaryStage){
    ClockPane clock = new ClockPane();
    
    // Create a handler for animation
    EventHandler<ActionEvent> eventHandler = e -> {
      clock.setCurrentTime();
    };
    
    // Create an animation for a running clock
    Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000), eventHandler));
    animation.setCycleCount(Timeline.INDEFINITE);
    animation.play(); // Start animation
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(clock, 250, 250);
    primaryStage.setTitle("Clock Animation");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
  public static void main(String[] args){
    launch(args);
  }
}
