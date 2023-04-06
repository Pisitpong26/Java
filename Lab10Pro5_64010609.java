import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Lab10Pro5_64010609 extends Application {
    @Override
    public void start(Stage primaryStage){
        FanPane pane = new FanPane();

        Button pause = new Button("Pause");
        Button resume = new Button("Resume");
        Button reverse = new Button("Reverse");
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);

        hbox.getChildren().addAll(pause,resume,reverse);
        
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(hbox);

        pause.setOnAction(e -> {
            pane.pause();
        });

        resume.setOnAction(e -> {
            pane.play();
        });
        
        reverse.setOnAction(e -> {
            pane.reverse();
        });

        Scene scene = new Scene(borderPane,250,250);
        primaryStage.setTitle("Lab10Pro5");
        primaryStage.setScene(scene);
        primaryStage.show();

        pane.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
