package vebview_httpserver;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class StartController implements Initializable {
    @FXML
    private WebView startWebView;
    private String link = getClass().getResource("/vebview_httpserver/start.html").toExternalForm();
    private WebEngine engine;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        engine = startWebView.getEngine();
        engine.setJavaScriptEnabled(true);
        engine.load(link);
    }

}
