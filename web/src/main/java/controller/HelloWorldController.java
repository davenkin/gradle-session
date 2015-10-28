package controller;

import helloworld.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by yteng on 10/28/15.
 */
@Controller
public class HelloWorldController {

    @Autowired
    private HelloWorld helloWorld;

    @RequestMapping("/")
    public void sayHello(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();
        out.println(helloWorld.sayHello());
        out.close();
    }

}
