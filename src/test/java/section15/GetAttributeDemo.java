package section15;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class GetAttributeDemo {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp(){
        baseUrl="https://letskodeit.teachable.com/pages/practice";
        System.setProperty("webdriver.gecko.driver","browser/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test(){
        driver.get(baseUrl);
        WebElement element = driver.findElement(By.id("name"));
        String attributeValue= element.getAttribute("placeholder");
        System.out.println("Attribute of value is: "+attributeValue);
    }

    @After
    public void tearDown()throws Exception{
        Thread.sleep(5000);
        driver.quit();
    }


}
