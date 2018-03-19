package section14;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MultipleSelect {

    WebDriver driver;
    String baseUrl;

    @Before
    public void setUp(){
        System.setProperty("webdriver.gecko.driver","browser/geckodriver.exe");
        driver = new FirefoxDriver();

        baseUrl="https://letskodeit.teachable.com/p/practice";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testMultiSelect()throws Exception{
        driver.get(baseUrl);

        WebElement element = driver.findElement(By.id("multiple-select-example"));
        Select sel = new Select(element);

        Thread.sleep(2000);
        System.out.println("Select orange by value");
        sel.selectByValue("orange");

        Thread.sleep(2000);
        System.out.println("De-Select orange by value");
        sel.deselectByValue("orange");

        Thread.sleep(2000);
        System.out.println("Select peach by index");
        sel.selectByIndex(2);

        Thread.sleep(2000);
        System.out.println("Select apple by visible text");
        sel.selectByVisibleText("Apple");

        Thread.sleep(2000);
        System.out.println("Print all selected option");
        List<WebElement> selectedOption = sel.getAllSelectedOptions();

        for(WebElement option: selectedOption){
            System.out.println(option.getText());
        }

        Thread.sleep(2000);
        System.out.println("De-Select all selected option");
        sel.deselectAll();

    }

    @After
    public void tearDown()throws Exception{
        Thread.sleep(5000);
        driver.quit();

    }
}
