package section19;

import course.practice.utilities.OpenDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import course.practice.utilities.*;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CalendarSelection {
    public String baseUrl = "https://www.expedia.com/";
public WebDriver driver;


    @Before
    public void setUp() {
      OpenDriver nav = new OpenDriver(driver);
      nav.initializeDriver("CH",baseUrl);
     driver=  nav.driver;
    }

    @Test
    public void test()throws IOException {
        PropertiesInfo prop = new PropertiesInfo();
        FindWebElement FE = new FindWebElement(driver);

        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement elemento;

        FE.elementIsVisible("id", prop.getPropertiesData().getProperty("popUp"));
    }
    @After
    public void tearDown(){
        driver.quit();
    }


}









