package webview_websocket.backend;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.*;

import java.net.ServerSocket;

public class ServerApp {
    private Server server = new Server(8080);
    private ServletHandler handler

    public static void main(String[] args) {



    }

    public void start() throws Exception {
        server.start();
        server.join();
    }
}
