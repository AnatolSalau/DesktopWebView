package webview_websocket.backend;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.*;
import webview_websocket.backend.servlets.IndexHTTPServlet;

//Class for run jetty server and mapping servlets
public class HTTPServerJetty {
    private static Server server;

    public static void start(int port) {
        server = new Server(port);
        ServletHandler handler = new ServletHandler();
        //Mapping servlets
        handler.addServletWithMapping(IndexHTTPServlet.class,"/");
        server.setHandler(handler);
        try {
            server.start();
            server.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void stop() throws Exception {
        server.stop();
    }
}
