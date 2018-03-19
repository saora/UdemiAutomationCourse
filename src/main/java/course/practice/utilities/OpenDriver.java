package course.practice.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class OpenDriver extends PageObject {
    public WebDriver driver;

    public OpenDriver(WebDriver driver){
        super(driver);
    }

    public WebDriver initializeDriver(String driverName, String baseUrl) {
        this.driver=driver;
        try {
            switch (driverName) {
                case "FF":
                    System.setProperty("webdriver.gecko.driver", "browser/geckodriver.exe");
                    driver = new FirefoxDriver();
                    break;
                case "CH":
                    System.setProperty("webdriver.chrome.driver", "browser/chromedriver.exe");
                    driver = new ChromeDriver();
                    break;
                case "IE":
                    System.setProperty("webdriver.ie,driver", "browser/IEDriverServer.exe");
                    driver = new InternetExplorerDriver();
                    break;
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get(baseUrl);
        } catch (Exception e) {
            System.out.println("Error al iniciar el navagador: " + e.getCause());
        }
        return driver;
    }


}
