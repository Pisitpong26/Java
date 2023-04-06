package TestjavaFx;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class control implements Initializable {

    @FXML
    private WebView webView;

    @FXML
    private TextField textField;
    private WebEngine engine;


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        engine = webView.getEngine();
    }
    
}
