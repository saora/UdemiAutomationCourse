package loggingfile;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LoggingFile {
    private static final Logger log = Logger.getLogger(LoggingFile.class.getName());
    public static void main(String[] args){
        DOMConfigurator.configure("C:\\Users\\Salvador\\IdeaProjects\\UdemyAutomationWithJava\\src\\main\\resources\\log4j-config.xml");
        BasicConfigurator.configure();
        log.error("Error loggingConsole");
    }
}