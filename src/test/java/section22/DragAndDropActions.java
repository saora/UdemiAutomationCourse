package section22;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.InitializeDriver;
import java.io.IOException;
public class DragAndDropActions extends InitializeDriver {
    @Before
    public void setUp()throws IOException{
        initializeDriver();
    }
    @Test
    public void testDragAndDrop(){
        driver.switchTo().frame(0);

        WebElement fromElement = driver.findElement(By.id("draggable"));
        WebElement toElement = driver.findElement(By.id("droppable"));
        Actions action = new Actions(driver);
        //drag and drop
        //action.dragAndDrop(fromElement, toElement).build().perform();
        //Click and hold, move the element, release, build and perform
        action.clickAndHold(fromElement).moveToElement(toElement).release().build().perform();


    }
    @After
    public void tearDown()throws Exception{
        closeBrowser();
    }

}
