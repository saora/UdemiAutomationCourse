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


public class ExplicitWait {
    private String baseUrl;
    private WebDriver driver;

    @Before
    public void setUp(){
        baseUrl="https://letskodeit.teachable.com/pages/practice";
        System.setProperty("webdriver.gecko.driver","browser/geckodriver.exe");
        driver = new FirefoxDriver();

        driver.manage().window().maximize();

    }

    @Test
    public void test(){
        driver.get(baseUrl);
        WebElement logLink = driver.findElement(By.linkText("Login"));
        logLink.click();

/*        WebDriverWait wait = new WebDriverWait(driver, 3);
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
        emailField.sendKeys("Test");*/

        //driver.findElement(By.id("user_email")).sendKeys("Test");


    }

    @After
    public void tearDown() throws Exception{
        Thread.sleep(3000);

    }
}
