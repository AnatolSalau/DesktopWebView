package webview_runnablejar;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.html.HTMLDivElement;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

public class StartController implements Initializable {
    @FXML
    private WebView startWebView;
    private String link = getClass().getResource("/webview_runnablejar/start.html").toExternalForm();
    private String linkToInternet = "https://material.io/";
    private WebEngine engine;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        engine = startWebView.getEngine();
        engine.setJavaScriptEnabled(true);
        engine.load(linkToInternet);
    }

}
