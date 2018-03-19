package utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WaitType {
    WebDriver driver;
    public WaitType(WebDriver driver){
        this.driver=driver;
    }
    public WebElement waitForElement(By locator, int timeout){
        WebElement element = null;
        try{
            System.out.println("Waiting for maximum :: "+timeout+" seconds for element to be available");
            WebDriverWait wait = new WebDriverWait(driver, 10);
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            System.out.println("The element appeared on web page: "+locator);
        }catch (Exception e){
            System.out.println("The element not appeared on web page");
        }
        return  element;
    }
    public void clickWhenReady(By locator, int timeout){
        try{
            WebElement element = null;
            System.out.println("Waiting for maximum :: "+timeout+" seconds for element to be clickable");
            WebDriverWait wait = new WebDriverWait(driver, 3);
            element = wait.until(ExpectedConditions.elementToBeClickable(locator));
            element.click();
            System.out.println("The element clicked on web page: "+locator);
        }catch (Exception e){
            System.out.println("The element not appeared on web page");
        }
    }
}
