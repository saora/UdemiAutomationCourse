package section14;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDownSelect {
    WebDriver driver;
    String baseUrl;

    @Before
    public void setUp(){
        baseUrl="http://letskodeit.teachable.com/pages/practice";
        System.setProperty("webdriver.chrome.driver","browser/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test()throws Exception{
        driver.get(baseUrl);
        WebElement element = driver.findElement(By.id("carselect"));
        Select sel = new Select(element);

        Thread.sleep(3000);
        sel.selectByValue("benz");

        Thread.sleep(3000);
        sel.selectByIndex(2);

        Thread.sleep(3000);
        sel.selectByVisibleText("BMW");

        Thread.sleep(3000);
        System.out.println("Print the list of all option:");
        List<WebElement> option =sel.getOptions();
        int size = option.size();

        for(int i=0; i<size; i++){
            String optionName = option.get(i).getText();
            System.out.println(optionName);
        }


    }


    @After
    public void tearDown()throws Exception{
        Thread.sleep(2000);
       // driver.quit();
    }
}
