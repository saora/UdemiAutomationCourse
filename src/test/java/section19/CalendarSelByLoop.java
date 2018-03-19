package section19;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalendarSelByLoop {
    private String baseUrl;
    private WebDriver driver;
    private String dateCalendar= "id(\"flight-departing-wrapper-hp-flight\")/div[1]/div[1]/div[2]/table[1]/tbody[1]";
    private String flightTab = "tab-flight-tab-hp";
    private String texBoxCalendar = "flight-departing-hp-flight";
    @Before
    public void setUp(){
        baseUrl="https://www.expedia.com/";
        System.setProperty("webdriver.chrome.driver","browser/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test(){
        driver.get(baseUrl);
        driver.findElement(By.id(flightTab)).click();
        WebElement departingField = driver.findElement(By.id(texBoxCalendar));
        departingField.click();

        WebElement calMonth = driver.findElement(By.xpath(dateCalendar));

        List<WebElement> validDates= calMonth.findElements(By.tagName("button"));
        for(WebElement date :validDates){
            if(date.getText().equals("26")){
                date.click();
                break;

            }

        }


    }

    @After
    public void tearDown()throws Exception{

        Thread.sleep(3000);
        driver.quit();

    }

}
