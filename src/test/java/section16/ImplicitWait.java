package section16;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    private String baseUrl;
    private WebDriver driver;

    @Before
    public void setUp(){
        baseUrl="https://letskodeit.teachable.com/pages/practice";
        System.setProperty("webdriver.chrome.driver","browser/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @Test
    public void test(){
        driver.get(baseUrl);

        WebElement logLink = driver.findElement(By.linkText("Login"));
        logLink.click();

        driver.findElement(By.id("user_email")).sendKeys("Test");

    }

    @After
    public void tearDown()throws Exception{
        Thread.sleep(3000);
        driver.quit();

    }

}
