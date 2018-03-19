package section22;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.InitializeDriver;
public class SlideAction extends InitializeDriver {
    @Before
    public void setUp()throws Exception{
        initializeDriver();
    }
    @Test
    public void testSlideAction(){
        driver.switchTo().frame(0);
        //Using the action class
        WebElement element = driver.findElement(By.xpath("//div[@id='slider']/span"));
        Actions action = new Actions(driver);
        action.dragAndDropBy(element, 500, 0).perform();
    }
    @After
    public void tearDown()throws Exception{
        closeBrowser();
    }
}
