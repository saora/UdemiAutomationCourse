package section21;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import utilities.InitializeDriver;

import java.io.IOException;

public class SwitchAlert extends InitializeDriver {
    @Before
    public void setUp() throws IOException {
        initializeDriver();
    }

    @Test
    public void alert1() throws Exception {
        driver.findElement(By.id("name")).sendKeys("Salvador");
        driver.findElement(By.id("alertbtn")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    @Test
    public void alert2() throws Exception {
        driver.findElement(By.id("name")).sendKeys("Salvador");
        driver.findElement(By.id("confirmbtn")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }
    @After
    public void tearDown() throws Exception {
        closeBrowser();
    }
}
