package section14;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RadioButtonsAndCheckBoxes {

    WebDriver driver;
    String baseUrl;

    @Before
    public  void setUp(){
        baseUrl="http://letskodeit.teachable.com/pages/practice";
        System.setProperty("webdriver.chrome.driver","browser/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);

    }

    @Test
    public void test()throws Exception{
        WebElement bmwradiobutn = driver.findElement(By.id("bmwradio"));
        bmwradiobutn.click();

        Thread.sleep(2000);
        WebElement benzradiobtn = driver.findElement(By.id("benzradio"));
        benzradiobtn.click();

        WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
        bmwCheckBox.click();

        Thread.sleep(2000);
        WebElement benzCheckBox = driver.findElement(By.id("benzcheck"));
        benzCheckBox.click();

        System.out.println("BMW is radio selected ? " + bmwradiobutn.isSelected());
        System.out.println("BENZ is radio selected ? " + benzradiobtn.isSelected());
        System.out.println("BMW is CHECK selected ? " + bmwCheckBox.isSelected());
        System.out.println("BENZ is CHECK selected ? " + benzCheckBox.isSelected());
    }

    @After
    public void tearDown() throws Exception{
        Thread.sleep(3000);
       // driver.quit();
    }
}
