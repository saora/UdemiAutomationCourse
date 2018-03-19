package javascriptexecution;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
public class WindowSize {
    private WebDriver driver;
    private JavascriptExecutor js;
    @Before
    public void setUp(){
        System.setProperty("webdriver.gecko.driver","browser/geckodriver.exe");
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void test(){
        js.executeScript("window.location = 'https://letskodeit.teachable.com/pages/practice';");
        long height = (Long) js.executeScript("return window.innerHeight");
        long width = (Long) js.executeScript("return window.innerWidth");
        System.out.println("Height is: "+height);
        System.out.println("Width is: "+width);
    }
    @After
    public void tearDown(){
        driver.quit();

    }
}
