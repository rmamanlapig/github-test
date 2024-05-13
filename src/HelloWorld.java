package src;

import java.util.logging.Logger;

public class HelloWorld {

    public static void main (String[] args){
        System.out.println("Hello World");

        // Replace println by this logging convention
        Logger logger = Logger.getLogger(HelloWorld.class.getName());
        logger.info("Hello World");
    }
}
