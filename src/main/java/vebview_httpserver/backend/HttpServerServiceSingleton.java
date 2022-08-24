package vebview_httpserver.backend;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class HttpServerServiceSingleton {
    private HttpServer httpServer;
    private static HttpServerServiceSingleton httpServerServiceSingleton = null;

    private HttpServerServiceSingleton(String path, int port, int backlog, HttpHandler httpHandler) throws IOException {
        httpServer = HttpServer.create(new InetSocketAddress(port),backlog);
        httpServer.createContext(path,httpHandler);
        httpServer.setExecutor(null);
    }
    public static HttpServerServiceSingleton getInstance(String path, int port, int backlog, HttpHandler httpHandler) {

        if (httpServerServiceSingleton != null) {
            return httpServerServiceSingleton;
        } else {
            if (httpServerServiceSingleton == null) {
                try {
                    httpServerServiceSingleton = new HttpServerServiceSingleton(path, port, backlog, httpHandler);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return httpServerServiceSingleton;
        }
    }

    public HttpServer getHttpServer() {
        return httpServer;
    }
}
