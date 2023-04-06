import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Lab10Pro1_64010609 extends Application{
    @Override
    public void start(Stage primaryStage){
        GridPane pane = new GridPane();

        pane.add(new ImageView(new Image("Image/UK.png")), 0, 0);
        pane.add(new ImageView(new Image("Image/Cannada.png")), 1, 0);
        pane.add(new ImageView(new Image("Image/China.png")), 0, 1);
        pane.add(new ImageView(new Image("Image/USA.png")), 1, 1);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Lab10");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
