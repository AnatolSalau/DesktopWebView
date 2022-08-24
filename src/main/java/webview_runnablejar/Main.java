package webview_runnablejar;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception {
            Parent startFxml = FXMLLoader.load(getClass().getResource("/webview_runnablejar/start.fxml"));
            primaryStage.setTitle("WebView load");
            primaryStage.setScene(new Scene(startFxml,500,300));
            primaryStage.show();
        }

        public static void main(String[] args) {
            launch(args);
        }

}
