package course.practice.section8.class60;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverMac {
public static void main(String[] args){
    String urlBase="http://www.gogle.com";

    WebDriver driver;
        System.setProperty("webdriver.chrome.driver","browser/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get(urlBase);
}


}
