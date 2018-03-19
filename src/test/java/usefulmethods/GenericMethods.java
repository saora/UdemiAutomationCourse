package usefulmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {
    WebDriver driver;

    public GenericMethods(WebDriver driver){
        this.driver=driver;

    }

    public WebElement getElement(String locator, String type){
        type = type.toLowerCase();
        if(type.equals("id")){
            System.out.println("Element found with id: "+type);
            return this.driver.findElement(By.id(locator));

        }
        else if(type.equals("xpath")){
            System.out.println("Element found by Xpath"+type);
            return this.driver.findElement(By.xpath(locator));

        }
        else{
            System.out.println("Locator type not supprted");
            return null;
        }



    }

    public List<WebElement> getElementList(String locator, String type){
        type = type.toLowerCase();

        List<WebElement> elementList = new ArrayList<WebElement>();

        if(type.equals("id")){
            elementList = this.driver.findElements(By.id(locator));

        }
        else if(type.equals("name")){
            elementList = this.driver.findElements(By.name(locator));

        }
        else if(type.equals("xpath")){
            elementList = this.driver.findElements(By.xpath(locator));

        }
        else if(type.equals("css")){
            elementList = this.driver.findElements(By.cssSelector(locator));

        }
        else if(type.equals("classname")){
            elementList = this.driver.findElements(By.className(locator));

        }
        else if(type.equals("tagname")){
            elementList = this.driver.findElements(By.tagName(locator));

        }
        else if(type.equals("linktext")){
            elementList = this.driver.findElements(By.linkText(locator));

        }
        else if(type.equals("partiallinktext")){
            elementList = this.driver.findElements(By.partialLinkText(locator));

        }

        else{
            System.out.println("Locator type not supported");
        }
        if(elementList.isEmpty()){
            System.out.println("Element not found with: "+type+" : "+locator);

        }
        else{
            System.out.println("Element found with: "+type+" : "+locator);
        }
        return elementList;

    }

    public boolean isElementPresent(String locator, String type){
        List<WebElement> elementList = getElementList(locator, type);
        int size = elementList.size();

        if(size>0){
            return true;
        }
        else{
            return false;
        }


    }

    public WebElement waitForElement(By locator, int timeout){

        WebElement element = null;
        try{
            System.out.println("Waiting for maximum :: "+timeout+" seconds for element to be available");

            WebDriverWait wait = new WebDriverWait(driver, 1);
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

            WebDriverWait wait = new WebDriverWait(driver, 10);
            element = wait.until(ExpectedConditions.elementToBeClickable(locator));

            element.click();

            System.out.println("The element clicled on web page: "+locator);


        }catch (Exception e){
            System.out.println("The element not appeared on web page");

        }

    }

}
