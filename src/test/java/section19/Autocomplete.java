package section19;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Autocomplete {
    private String baseUrl;
    private WebDriver driver;

    private String textOrigen = "id(\"flight-origin-hp-flight\")";
    private String selectText = "typeaheadDataPlain";
    private String flightTab = "tab-flight-tab-hp";

    private String searchingText="Ciudad de México, Distrito Federal, México\n"+"(MEX) A. Internacional de la Ciudad de México";
    private String partialText="Mexico";


    @Before
    public void setUp(){
        baseUrl="https://www.expedia.com/";
        System.setProperty("webdriver.gecko.driver","browser/geckodriver.exe");
        driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void test(){
        driver.get(baseUrl);
        driver.findElement(By.id(flightTab)).click();
        WebElement text = driver.findElement(By.xpath(textOrigen));
        text.sendKeys(partialText);
        WebElement element = driver.findElement(By.id(selectText));
        List<WebElement> results = element.findElements(By.tagName("li"));
        int size = results.size();
        for(int i=0; i<size; i++){
            System.out.println(results.get(i).getText());
        }
        for(WebElement result : results){
            if(result.getText().equals(searchingText)){
                result.click();
            }
        }
    }

    @After
    public void tearDown()throws Exception{
        Thread.sleep(3000);
        driver.quit();

    }
}
