package section15;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GenericMethodsDemo {
    private WebDriver driver;
    private String baseUrl;
    private GenericMethods gm;

    @Before
    public void setUp(){
        baseUrl="https://letskodeit.teachable.com/pages/practice";
        System.setProperty("webdriver.chrome.driver","browser/chromedriver.exe");
        driver = new ChromeDriver();
        gm = new GenericMethods(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test(){
        driver.get(baseUrl);

        WebElement element = gm.getElement("name","id");
        element.sendKeys("test");


    }

    @After
    public void tearDown()throws Exception{
        Thread.sleep(5000);
        driver.quit();

    }
}
