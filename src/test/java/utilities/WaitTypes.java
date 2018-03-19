package utilities;

import  org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTypes {
    WebDriver driver;

    public WaitTypes(WebDriver driver){
        this.driver=driver;

    }

    public WebElement waitForElement(By locator, int timeout){

        WebElement element = null;
        try{
            System.out.println("Waiting for maximum :: "+timeout+" seconds for element to be available");

            WebDriverWait wait = new WebDriverWait(driver, 3);
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

            System.out.println("The element appeared on web page");


        }catch (Exception e){
            System.out.println("The element not appeared on web page");

        }
        return  element;

    }
}
