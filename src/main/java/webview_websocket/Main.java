package webview_websocket;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import webview_websocket.backend.HTTPServerJetty;

public class Main extends Application {
    //Logger class to avoid logger exeptions
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    // We must run jetty in another thread
    @Override
    public void init() throws Exception {
            //Start server in another thread
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
                Parent startFxml = FXMLLoader.load(getClass().getResource("/webview_websocket/startwindow.fxml"));
                primaryStage.setTitle("GlucoReader");
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

        //Stop server when javafx app wii closed
    @Override
    public void stop()  {
        try {
            HTTPServerJetty.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
