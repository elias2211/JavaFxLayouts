package clock;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class ClockPane extends Pane {
  private int hour;
  private int minute;
  private int second;
  
  // Clock pane's width and height
  private double w = 250, h = 250;
  
  /** Construct a default clock with the current time*/
  public ClockPane(){
    setCurrentTime();
  }
  
  
  /** Construct a clock with specified hour, minutes, and second */
  public ClockPane(int hour, int minute, int second){
    this.hour = hour;
    this.minute = minute;
    this.second = second;
    paintClock();
  }
  
  /** Return hour */
  public int getHour(){
    return hour;
  }
  
  /** Return minute */
  public int getMinute(){
    return minute;
  }
  
  /** Set a new minute */
  public void setMinute(int minute){
    this.minute = minute;
    paintClock();
  }
  
  /** Return second */
  public int getSecond(){
    return second;
  }
  
  /** Set a new second */
  public void setSecond(int second){
    this.second = second;
    paintClock();
  }
  
  public double getW(){
    return w;
  }
  
  /** Set clock pane's width */
  public void setW(double w){
    this.w = w;
    paintClock();
  }
  
  /** Return clock pane's height */
  public double getH() {
    return h;
  }
  
  /** Set clock pane's height */
  public void setH(double h){
    this.h = h;
    paintClock();
  }
  
  /** Set the current time for the clock */
  public void setCurrentTime(){
    // Construct a calendar for the current date and time
    Calendar calendar = new GregorianCalendar();
    
    //Set current hour, minute and second
    this.hour = calendar.get(Calendar.HOUR_OF_DAY);
    this.minute = calendar.get(Calendar.MINUTE);
    this.second = calendar.get(Calendar.SECOND);
    
    
    paintClock(); // Repaint the clock
  }
  
  /** Paint the clock */
   protected void paintClock(){
     //Initialize clock parameters
     double clockRadius = Math.min(w,  h) * 0.8 * 0.5;
     double centerX = w / 2;
     double centerY = h /2;
     
     // Draw a circle
     Circle circle = new Circle(centerX, centerY, clockRadius);
     circle.setFill(Color.BLACK);
     circle.setStroke(Color.BLACK);
     Text t12 = new Text(centerX - 5, centerY - clockRadius + 12, "12");
     Text t1 = new Text(centerX + clockRadius - 59, centerY - 77, "1");
     Text t13 = new Text(centerX + clockRadius - 25, centerY - 47, "2");

     Text t2 = new Text(centerX - clockRadius + 3, centerY + 5, "9");
     Text t3 = new Text(centerX + clockRadius - 10, centerY + 3, "3");
     Text t4 = new Text(centerX - 3, centerY + clockRadius - 3, "6");
     
     t1.setFill(Color.WHITE);
     t2.setFill(Color.WHITE);
     t3.setFill(Color.WHITE);
     t4.setFill(Color.WHITE);
     t12.setFill(Color.WHITE);
     t13.setFill(Color.WHITE);

     
     // Draw second hand
     double sLength = clockRadius * 0.8;
     double secondX = centerX + sLength * 
         Math.sin(second * (2 * Math.PI / 60));
     double secondY = centerY - sLength *
         Math.cos(second * (2 * Math.PI / 60));
     Line sLine = new Line(centerX, centerY, secondX, secondY);
     sLine.setStroke(Color.GREEN);
     
     // Draw minute hand
     double mLength = clockRadius * 0.65;
     double xMinute = centerX + mLength *
         Math.sin(minute * (2 * Math.PI / 60));
     double minuteY = centerY - mLength *
         Math.cos(minute * (2 * Math.PI / 60));
     Line mLine = new Line(centerX, centerY, xMinute, minuteY);
     mLine.setStroke(Color.YELLOW);
     
     // Draw hour hand
     double hLength = clockRadius * 0.55;
     double hourX = centerX + hLength *
         Math.sin(hour % 12 + minute / 60.0) * (2 * Math.PI / 12);
     double hourY = centerY + hLength * 
         Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
     Line hLine = new Line(centerX, centerY, hourX, hourY);
     hLine.setStroke(Color.RED);
     
     getChildren().clear();
     getChildren().addAll(circle, t12, t1, t13, t2, t3, t4, sLine, mLine, hLine);
   }  
}
