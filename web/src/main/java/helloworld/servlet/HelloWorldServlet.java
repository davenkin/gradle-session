package helloworld.servlet;

import helloworld.HelloWorld;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by yteng on 9/22/15.
 */
public class HelloWorldServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(HelloWorldServlet.class);

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        HelloWorld helloWorld = new HelloWorld();
        String user = req.getRemoteUser();
        logger.info("Saying Hello from {}.", user);
        helloWorld.setMessage(user);
        out.println("<!DOCTYPE html>\n" +
                "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
                "<body>\n" +
                "<div><a href=\"j_spring_security_logout\">Logout</a></div>\n");
        out.println(helloWorld.helloworld());
        out.println("</body></html>");
        out.close();
    }
}


