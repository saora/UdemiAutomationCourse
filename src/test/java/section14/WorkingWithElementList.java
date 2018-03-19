package section14;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



import java.util.List;
import java.util.concurrent.TimeUnit;

public class WorkingWithElementList {
    WebDriver driver;
    String urlBase;

    @Before
    public void setUp(){
        System.setProperty("webdriver.gecko.driver","browser/geckodriver.exe");
        driver = new FirefoxDriver();

        urlBase="http://letskodeit.teachable.com/pages/practice";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(urlBase);
    }

    @Test
    public void test()throws Exception{
        boolean isChecked = false;
        List<WebElement> radiobtn = driver.findElements(By.xpath("//input[contains(@type,'radio')and contains(@name,'cars')]"));
        int size = radiobtn.size();

        System.out.println("Size of the list: "+size);

        for(int i=0; i<size;i++){
            isChecked = radiobtn.get(i).isSelected();

            if(!isChecked){
                radiobtn.get(i).click();
                Thread.sleep(3000);

            }

        }
    }

    @After
    public void tearDown()throws Exception{
        Thread.sleep(3000);
        //driver.quit();
    }
}
