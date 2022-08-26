package webview_websocket;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

//Controller for init webviev engine
public class StartController implements Initializable {
    @FXML
    private WebView startWebView;
    private String link = getClass().getResource("/webview_websocket/startpage.html").toExternalForm();
    private WebEngine engine;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        engine = startWebView.getEngine();
        engine.setJavaScriptEnabled(true);
        engine.load(link);
    }
}
