package webview_websocket.backend.servlets;

import lombok.val;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class IndexHTTPServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        //Указываем что информация на странице это json
        resp.setContentType("application/json");
        resp.setHeader("Access-Control-Allow-Origin", "*");
/*        if (req.getMethod().equalsIgnoreCase("OPTIONS")) {
            resp.setHeader("Access-Control-Allow-Methods", "GET, OPTIONS");
            resp.setHeader("Access-Control-Allow-Headers", "Content-Type,Authorization");
            return;
        }*/
        //Пример JSON
        String employeeJsonString = """
                {"users": {"Second" : {"login" : "Second", "password" : "aaaa"}, "First" : {"login" : "First", "password" : "1111"}  } }
                """;


            //Печатаем на странице
            printWriter.print(employeeJsonString);
        }

}
