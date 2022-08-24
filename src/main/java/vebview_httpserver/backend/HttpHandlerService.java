package vebview_httpserver.backend;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class HttpHandlerService implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String requestMethod = exchange.getRequestMethod();
        System.out.println(requestMethod);
        switch (requestMethod) {
            case  "GET"  -> ;
            default -> ;
        }
        //Пример JSON
        String response = """
                {"users": {"Second" : {"login" : "Second", "password" : "aaaa"}, "First" : {"login" : "First", "password" : "1111"}  } }
                """;
/*        String response = "----------";*/
        exchange.getResponseHeaders().set("Content-Type", "application/json");
        exchange.getResponseHeaders().add("Access-Control-Allow-Origin", "*");

        if (exchange.getRequestMethod().equalsIgnoreCase("OPTIONS")) {
            exchange.getResponseHeaders().add("Access-Control-Allow-Methods", "GET, OPTIONS");
            exchange.getResponseHeaders().add("Access-Control-Allow-Headers", "Content-Type,Authorization");
            exchange.sendResponseHeaders(204, -1);
            return;
        }
        exchange.sendResponseHeaders(200, response.length());
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }

    private void getHadler(HttpExchange exchange, String requestMethod ) {

    }
}
