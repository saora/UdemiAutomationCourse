package section23_keypress;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.InitializeDriver;

public class KeyPressCombKey extends InitializeDriver {
    @Before
    public  void setUp() throws Exception{
        initializeDriver();
    }
    @Test
    public void testPressCombinationKeys()throws Exception{
       // driver.findElement(By.id("openwindow")).sendKeys(Keys.CONTROL+"a");
       // Thread.sleep(2000);

       // driver.findElement(By.id("openwindow")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
       // Thread.sleep(2000);

        String selectAll = Keys.chord(Keys.CONTROL, "a");
        driver.findElement(By.id("openwindow")).sendKeys(selectAll);
        Thread.sleep(2000);


    }
    @After
    public void tearDown()throws Exception{
        closeBrowser();
    }
}
