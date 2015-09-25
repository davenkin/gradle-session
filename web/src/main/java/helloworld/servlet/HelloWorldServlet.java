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
        logger.info("Saying Hello from " + this.getClass().toString());
        PrintWriter out = res.getWriter();
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Lenovo");
        out.println(helloWorld.helloworld());
        out.close();
    }
}

