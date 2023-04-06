import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Lab10Pro2_64010609 extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(5));
        pane.setVgap(5);
        pane.setHgap(5);

        for (int i = 1; i <= 10; i++){

            for (int j = 1 ; j <= 10 ; j++){
                TextField text = new TextField();
                text.setPrefColumnCount(1);
                text.setText(String.valueOf((int)(Math.random()*2)));
                pane.add(text,i,j);
            }
        }

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Lab10Pro2");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
