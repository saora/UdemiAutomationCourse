package section24_pageobjectmodel;
import java.net.HttpURLConnection;
import java.net.URL;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.classes.SearchPage;
import utilities.InitializeDriver;
import java.util.ArrayList;
import java.util.List;

public class FindLinks extends InitializeDriver{
    @Before
    public void setUp()throws Exception{
        initializeDriver();
    }
    @Test
    public void testFindLinks(){
        SearchPage.clickOnFlightBtn(driver);

        List<WebElement> linkList = clickableLinks(driver);
        for(WebElement link: linkList){
            String href = link.getAttribute("href");
            try{
                System.out.println("URL " + href + " returned " + linkStatus(new URL(href)));
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static List<WebElement> clickableLinks(WebDriver driver){
        List<WebElement> linksToClick = new ArrayList<WebElement>();
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        elements.addAll(driver.findElements(By.tagName("img")));
        for(WebElement e: elements){
            if(e.getAttribute("href")!=null){
                linksToClick.add(e);
            }
        }
        return linksToClick;
    }
    public static String linkStatus(java.net.URL url){
        try{
            HttpURLConnection http = (HttpURLConnection) url.openConnection();
            http.connect();
            String responseMessage = http.getResponseMessage();
            http.disconnect();
            return responseMessage;
        }catch (Exception e){
            return e.getMessage();
        }
    }
    @After
    public void tearDown()throws Exception{
        closeBrowser();
    }
}
