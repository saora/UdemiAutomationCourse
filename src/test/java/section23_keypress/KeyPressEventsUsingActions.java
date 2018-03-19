package section23_keypress;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.InitializeDriver;

public class KeyPressEventsUsingActions extends InitializeDriver {
    @Before
    public void setUp()throws Exception{
        initializeDriver();
    }
    @Test
    public void testKeyPressEvents(){
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();

    }
    @After
    public void tearDown()throws Exception{
        closeBrowser();
    }

}
