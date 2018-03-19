package course.practice.section8.class66;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementsByIdAndXpath {
    public static void main(String[] args){
        String baseUrl="http:/www.google.com";
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver","browser/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get(baseUrl);



    }
}
