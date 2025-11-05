package Log4jDemo;

import TestNGBatchTestingDemo.HomeScreenTest;
import org.testng.log4testng.Logger;
//import org.apache.loggin.log4j*;
import org.apache.logging.log4j.*;
public class LoggerDemo {
    public static void main(String[] args) {
       Logger logger = Logger.getLogger(HomeScreenTest.class);
       System.out.println("Logging Started");
       logger.info("Logging  info Started");
       logger.debug("Logging  debug Started");
       logger.warn("Logging  warn Started");
       logger.error("Logging  error Started");
    }
}
