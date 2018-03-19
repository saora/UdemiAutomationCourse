package section15;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class IsElementPresentDemo {
    private WebDriver driver;
    private String baseUrl;
    private GenericMethods gm;

    @Before
    public void setUp(){
        baseUrl="https://letskodeit.teachable.com/pages/practice";;
        System.setProperty("webdriver.gecko.driver","browser/geckodriver.exe");
        driver = new FirefoxDriver();
        gm = new GenericMethods(driver);

        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void test(){
        driver.get(baseUrl);

        boolean result1 = gm.isElementPresent("name","id");
        System.out.println("Size of the element list is: "+ result1);

        boolean result2 = gm.isElementPresent("name-nopresent","id");
        System.out.println("Size of the element list is: "+ result2);

    }

    @After
    public void tearDown()throws  Exception{
        //Thread.sleep(5000);
        driver.quit();

    }

}
