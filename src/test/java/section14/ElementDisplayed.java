package section14;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ElementDisplayed {
    WebDriver driver;
    String baseUrl1, baseUrl2;

    @Before
    public void setUp(){
        baseUrl1="http://letskodeit.teachable.com/pages/practice";
        baseUrl2="http://www.expedia.com";

        System.setProperty("webdriver.chrome.driver","browser/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void testLetsKodeit()throws Exception{
        driver.get(baseUrl1);
        WebElement textBox = driver.findElement(By.id("displayed-text"));
        System.out.println("Text Box Displayed: " + textBox.isDisplayed());

        Thread.sleep(3000);
        WebElement hideButton = driver.findElement(By.id("hide-textbox"));
        hideButton.click();

        System.out.println("Clicked on hide button ");
        System.out.println("Text Box Displayed: "+textBox.isDisplayed());

        Thread.sleep(3000);
        WebElement showButton = driver.findElement(By.id("show-textbox"));
        showButton.click();

        System.out.println("Clicked on show button ");
        System.out.println("Text Box Displayed: "+textBox.isDisplayed());

    }

    @Test
    public void testExpedia(){
        driver.get(baseUrl2);
        WebElement childDropDown = driver.findElement(By.id("package-1-age-select-1"));
        System.out.println("Child Drop Down Displayed"+childDropDown.isDisplayed());


    }

    @After
    public void tearDown()throws Exception{
        Thread.sleep(5000);
        driver.quit();

    }
}
