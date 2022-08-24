package vebview_httpserver;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import vebview_httpserver.backend.StartStopHttpServerService;

public class Main extends Application {
    StartStopHttpServerService startStopHttpServerService = new StartStopHttpServerService();

        @Override
        public void start(Stage primaryStage) throws Exception {

            startStopHttpServerService.start();

            Parent startFxml = FXMLLoader.load(getClass().getResource("/vebview_httpserver/start.fxml"));
            primaryStage.setTitle("WebView load");
            primaryStage.setScene(new Scene(startFxml,500,300));
            primaryStage.show();
        }

        public static void main(String[] args) {
            launch(args);
        }

    @Override
    public void stop() throws Exception {
        startStopHttpServerService.stop();
    }
}
