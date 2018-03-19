package section15;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GetTextDemo {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp(){
        baseUrl="https://letskodeit.teachable.com/pages/practice";
        System.setProperty("webdriver.chrome.driver","browser/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test
    public void test(){
        driver.get(baseUrl);

        WebElement btnElement = driver.findElement(By.id("opentab"));
        String elementText = btnElement.getText();

        System.out.println("Text on element is: "+elementText);

    }

    @After
    public void tearDown()throws Exception{
        Thread.sleep(5000);

       // driver.quit();
    }

}
