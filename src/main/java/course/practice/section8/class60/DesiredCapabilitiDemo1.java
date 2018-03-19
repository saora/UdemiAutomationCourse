package course.practice.section8.class60;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiDemo1 {

    public static void main(String []args) throws Exception{
        WebDriver driver;
        String baseURL = "http://demostore.x-cart.com/";
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        caps.setBrowserName("firefox");
        caps.setPlatform(Platform.WINDOWS);

        System.setProperty("webdriver.gecko.driver", "browser/geckodriver.exe");
        driver = new FirefoxDriver(caps);
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseURL);

        Thread.sleep(5000);
        driver.findElement(By.linkText("Shipping")).click();
        driver.findElement(By.partialLinkText("Contact")).click();
    }
}
