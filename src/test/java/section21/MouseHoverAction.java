package section21;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.InitializeDriver;
import java.io.IOException;
public class MouseHoverAction extends InitializeDriver{
    private JavascriptExecutor jse;
    @Before
    public void setUp()throws IOException{
        initializeDriver();
        jse = (JavascriptExecutor) driver;
    }
    @Test
    public void testMouseHoverAction()throws Exception{
        jse.executeScript("window.scrollBy(0, 600);");
        Thread.sleep(2000);
        WebElement secundaryElement = driver.findElement(By.id("mousehover"));
        Actions action = new Actions(driver);
        action.moveToElement(secundaryElement).perform();
        Thread.sleep(2000);
        WebElement primaryElement = driver.findElement(By.xpath("id(\"block-1069048\")//div/fieldset[1]//div/a[1]"));
        primaryElement.click();
    }
    @After
    public void tearDown()throws Exception{
        closeBrowser();
    }
}
