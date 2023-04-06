import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Lab10Pro3_64010609 extends Application {
    @Override
    public void start(Stage primaryStage) {

        ClockPane clock = new ClockPane((int)(Math.random() * 12), 
        ((int)(Math.random() * 2) == 1 ? 30 : 0), (int)(Math.random() * 60));
        String timeString = clock.getHour() + ":" + clock.getMinute()+ ": "+clock.getSecond() ;
        clock.setSecondHandVisible(true);
        clock.setHourHandVisible(false);
       Label time = new Label(timeString);
       BorderPane pane = new BorderPane();
       pane.setCenter(clock);
       pane.setBottom(time);   
       BorderPane.setAlignment(time, Pos.TOP_CENTER);

       Scene scene = new Scene(pane,250,250);
       primaryStage.setTitle("Lab10Pro3");
       primaryStage.setScene(scene);
       primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
