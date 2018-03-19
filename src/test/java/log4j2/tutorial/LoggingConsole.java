package log4j2.tutorial;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

public class LoggingConsole {
    private static final Logger log = LogManager.getLogger(LoggingConsole.class.getName());
    public static void main(String[] args){
        log.debug("Debug message logged");
        log.error("Error message logged");
    }
}
