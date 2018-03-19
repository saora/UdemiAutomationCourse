package Log4j2Tutorial;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LoggingConsole {
    private static final Logger log = LogManager.getLogger(LoggingConsole.class.getName());
    public static void main(String[] args){
      // BasicConfigurator.configure();
        DOMConfigurator.configure("src/main/resources/log4j-config.xml");
        log.debug("Debug message logged");
        log.error("Error message logged");

    }
}
