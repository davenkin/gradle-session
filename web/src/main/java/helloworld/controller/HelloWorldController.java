package helloworld.controller;

import helloworld.HelloWorld;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by yteng on 9/23/15.
 */
@Controller
public class HelloWorldController {

    @RequestMapping
    public void helloWorld(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        WebApplicationContext webApplicationContext = RequestContextUtils.findWebApplicationContext(request);
        String[] beanDefinitionNames = webApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            out.println(beanDefinitionName);
        }
        out.println(new HelloWorld().helloworld());
        out.close();

    }
}
