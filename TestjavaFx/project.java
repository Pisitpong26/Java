package TestjavaFx;

import java.util.Iterator;
import java.util.Scanner;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class project extends Application {

    @FXML
    private WebView webView = new WebView();

    @FXML
    private TextField textField;

    @FXML
    private WebEngine engine;

    private Button btGoForward = new Button("Next");
    private Button btฺBackForward= new Button("Back");
    private Button btZoomIn = new Button("+"); 
    private Button btZoomOut = new Button("-"); 
    private Button btEnter= new Button("Search");
    private TextField search = new TextField();

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        HBox tab = new HBox(35);
        WebView webView = new WebView();

        pane.setPadding(new Insets(5));
        
        pane.setHgap(5);
        pane.setVgap(5);
        search.setPrefColumnCount(25);
        tab.getChildren().addAll(btฺBackForward,btGoForward,btZoomIn,btZoomOut,search,btEnter);
        tab.setAlignment(Pos.TOP_CENTER);
        pane.add(tab, 0, 0);

        pane.setAlignment(Pos.CENTER);
        
        engine = webView.getEngine();
        engine.load("http://www.google.com");
        
        pane.add(webView, 0, 2);

        btฺBackForward.setOnAction(e -> back());
        btGoForward.setOnAction(e -> next());
        btZoomIn.setOnAction(e -> webView.setZoom(webView.getZoom()+0.25));
        btZoomOut.setOnAction(e -> webView.setZoom(webView.getZoom()-0.25));
        btEnter.setOnAction(e -> searchEngine());

        Scene scene = new Scene(pane,700,650);
        primaryStage.setTitle("Web");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void back(){
        WebHistory history = engine.getHistory();
        history.go(-1);
    }

    public void next(){
        WebHistory history = engine.getHistory();
        history.go(+1);
    }

    public void reload(){
        WebHistory history = engine.getHistory();
        history.go(0);
    }

    public void searchEngine(){
        String htLink = "http://";
        String input = search.getText();
        engine.load(htLink + input);
    }
    
    public static void main(String[] args) {
        launch(args);
    }

}
