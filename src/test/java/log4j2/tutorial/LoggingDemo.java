package log4j2.tutorial;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class LoggingDemo {
    private static final Logger log = LogManager.getLogger(LoggingDemo.class.getName());
    public static void main(String[] args){
        BasicConfigurator.configure();
        log.debug("Debug message logged");
        log.error("Error message logged");
        log.fatal("Fatal message logged");
    }
}
