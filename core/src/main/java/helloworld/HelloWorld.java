package helloworld;

import org.springframework.beans.factory.annotation.Required;

/**
 * Created by yteng on 9/22/15.
 */
public class HelloWorld {
    private String message;

    public String helloworld() {
        return "Hello " + message;
    }

    public String getMessage() {
        return message;
    }

    @Required
    public void setMessage(String message) {
        this.message = message;
    }
}
