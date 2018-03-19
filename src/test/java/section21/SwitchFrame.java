package section21;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.InitializeDriver;
import java.io.IOException;

public class SwitchFrame extends InitializeDriver {

    @Before
    public void setUp()throws IOException{
        initializeDriver();
    }
    @Test
    public void test(){
        //driver.switchTo().frame("courses-iframe");
        driver.switchTo().frame("iframe-name");



        WebElement searchBox = driver.findElement(By.id("search-courses"));
        searchBox.sendKeys("python");

        driver.switchTo().defaultContent();
        driver.findElement(By.id("name")).sendKeys("Test Successful");

        System.out.println("");
    }
    @After
    public void tearDown()throws Exception{
        closeBrowser();
    }
}
