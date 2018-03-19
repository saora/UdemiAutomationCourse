package section21;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.InitializeDriver;
import utilities.ReadPropertiesFile;
import java.io.IOException;
import java.util.Set;
public class SwitchWindow {
    private WebDriver driver;
    @Before
    public void setUp()throws IOException{
        InitializeDriver browser = new InitializeDriver();


        browser.initializeDriver();
        driver = browser.driver;
    }
    @Test
    public void test()throws InterruptedException{
        String parentHandle =  driver.getWindowHandle();
        System.out.println("Parent Handle: "+parentHandle);
        //Find open window button
        WebElement openWindow = driver.findElement(By.id("openwindow"));
        openWindow.click();
        //Get all handles
        Set<String> handles = driver.getWindowHandles();
        //Switch between handles
        for(String handle : handles){
            System.out.println(handle);
            if(!handle.equals(parentHandle)){
                driver.switchTo().window(handle);
                Thread.sleep(3000);
                WebElement searchBox = driver.findElement(By.id("search-courses"));
                searchBox.sendKeys("python");
                Thread.sleep(3000);
                driver.close();
                break;
            }
        }
        //Switch back to the parent window
        driver.switchTo().window(parentHandle);
        driver.findElement(By.id("name")).sendKeys("test SUCCESSFUL");
    }
    @After
    public void tearDown()throws InterruptedException{
        Thread.sleep(5000);
        driver.quit();

    }
}
