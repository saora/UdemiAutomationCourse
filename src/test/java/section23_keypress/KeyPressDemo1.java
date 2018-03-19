package section23_keypress;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.InitializeDriver;
public class KeyPressDemo1 extends InitializeDriver {
    @Before
    public void setUp()throws Exception{
        initializeDriver();
    }
    @Test
    public void testKeyPress(){
        WebElement login = driver.findElement(By.xpath("id(\"navbar\")//div/ul[1]/li[2]/a[1]"));
        login.click();
        driver.findElement(By.id("user_email")).sendKeys("saora.mx@gmail.com");
        driver.findElement(By.id("user_password")).sendKeys("Test12345");
        driver.findElement(By.name("commit")).sendKeys(Keys.ENTER);
    }
    @After
    public void tearDown()throws Exception{
        closeBrowser();
    }

}
