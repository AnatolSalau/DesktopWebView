package webview_websocket;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import vebview_httpserver.backend.StartStopHttpServerService;

public class Main extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception {

            Parent startFxml = FXMLLoader.load(getClass().getResource("/webview_websocket/start.fxml"));
            primaryStage.setTitle("WebSocket");
            primaryStage.setScene(new Scene(startFxml,500,300));
            primaryStage.show();
        }

        public static void main(String[] args) {
            launch(args);
        }

    @Override
    public void stop() throws Exception {

    }
}
