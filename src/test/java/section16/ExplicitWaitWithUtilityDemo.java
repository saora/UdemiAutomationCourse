package section16;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.WaitType;


public class ExplicitWaitWithUtilityDemo {
    private String baseUrl;
    private WebDriver driver;

    WaitType wt;
    @Before
    public void setUp(){
        baseUrl="https://letskodeit.teachable.com/pages/practice";
        System.setProperty("webdriver.gecko.driver","browser/geckodriver.exe");
        driver = new FirefoxDriver();

         wt = new WaitType(driver);
        driver.manage().window().maximize();

    }

    @Test
    public void test(){
        driver.get(baseUrl);
        WebElement logLink = driver.findElement(By.linkText("Login"));
        logLink.click();

        WebElement emailField;
        emailField = wt.waitForElement(By.id("user_email"),3);

        emailField.sendKeys("test");

        wt.clickWhenReady(By.name("commit"),3);

    }

    @After
    public void tearDown() throws Exception{
        Thread.sleep(3000);
        //driver.quit();

    }
}
