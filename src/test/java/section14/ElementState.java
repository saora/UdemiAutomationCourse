package section14;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ElementState {
    WebDriver driver;
    String baseUrl;

    @Before
    public void setUp(){
        System.setProperty("webdriver.gecko.driver","browser/geckodriver.exe");
        driver = new FirefoxDriver();
        baseUrl="http://www.google.com";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @Test
    public void test(){
        WebElement element = driver.findElement(By.id("gs_htif0"));
        System.out.println("Is element disabled ?" +element.isEnabled());
        //element.sendKeys("letskodeit");
    }

    @After
    public void tearDown()throws Exception{
        Thread.sleep(3000);
        driver.quit();

    }


}
