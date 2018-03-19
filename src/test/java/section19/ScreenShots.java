package section19;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import utilities.InitializeDriver;
import utilities.TakeScreenShot;
public class ScreenShots extends InitializeDriver {
    @Before
    public void setUp()throws Exception{
        initializeDriver();
    }
    @Test
    public void test(){
        driver.findElement(By.id("tab-flight-tab-hp")).click();
    }
    @After
    public void tearDown()throws Exception{
        TakeScreenShot tss = new TakeScreenShot();
        tss.captureScreen(driver, "INC002");
        closeBrowser();
    }
}
