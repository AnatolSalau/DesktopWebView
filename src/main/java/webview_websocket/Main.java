package webview_websocket;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vebview_httpserver.backend.StartStopHttpServerService;
import webview_websocket.backend.HTTPServerJetty;

public class Main extends Application {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    @Override
    public void init() throws Exception {
            Thread serverThread = new Thread() {
                @Override
                public void run() {
                    HTTPServerJetty.start(8080);
                }
            };
            serverThread.start();
    }

    @Override
        public void start(Stage primaryStage)  {

            try {
                Parent startFxml = FXMLLoader.load(getClass().getResource("/webview_websocket/start.fxml"));
                primaryStage.setTitle("WebSocket");
                primaryStage.setScene(new Scene(startFxml, 500, 300));
                primaryStage.show();
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        public static void main(String[] args) {
            launch(args);
        }

    @Override
    public void stop()  {
        try {
            HTTPServerJetty.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
