package vebview_httpserver.backend;

import com.sun.net.httpserver.HttpServer;

public class StartStopHttpServerService {

    private HttpHandlerService httpHandlerService = new HttpHandlerService();

    HttpServerServiceSingleton httpServerService = HttpServerServiceSingleton.getInstance(
        "/",8080,0,httpHandlerService
    );

    private HttpServer httpServer = httpServerService.getHttpServer();

    public void start() {
        httpServer.start();
    }

    public void stop() {
        httpServer.stop(0);
    }
}
