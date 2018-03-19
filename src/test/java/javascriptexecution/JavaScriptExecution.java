package javascriptexecution;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

public class JavaScriptExecution {

    private WebDriver driver;
    private String baseUrl;
    private JavascriptExecutor js;

    @Before
    public void setUp(){
        baseUrl="https://letskodeit.teachable.com/pages/practice";
        System.setProperty("webdriver.chrome.driver","browser/chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void test(){
        //driver.get(baseUrl);
        js.executeScript("window.location = 'https://letskodeit.teachable.com/pages/practice';");

        //WebElement text = driver.findElement(By.id("name"));
        WebElement textBox = (WebElement) js.executeScript("return document.getElementById('name');");
        textBox.sendKeys("test");

    }
    @After
    public void tearDown(){

    }
}
