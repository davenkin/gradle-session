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
    public void sayHello(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println(helloWorld.sayHello1());
        out.println(helloWorld.sayHello2());
        out.println(helloWorld.sayHello3());
        out.println(helloWorld.sayHello4());
        out.println(helloWorld.sayHello5());
        out.println(helloWorld.sayHello6());
        out.println(helloWorld.sayHello7());
        out.println(helloWorld.sayHello8());
        out.println(helloWorld.sayHello9());
        out.println(helloWorld.sayHello10());
        out.close();
    }

}
