package course.practice.utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class FindWebElement extends PageObject {
    WebDriver driver;

    public FindWebElement(WebDriver driver){
        super(driver);
    }
    public String elementIsVisible(String elementLocator, String elementContent) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement element = null;
        try {
            switch (elementLocator.toLowerCase()) {
                case "id":
                    element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(elementContent))));
                    break;
                case "xpath":
                    element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(elementContent))));
                    break;
                case "css":
                    element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(elementContent))));
                    break;
                case "linktext":
                    element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText(elementContent))));
                    break;
                case "partialtext":
                    element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.partialLinkText(elementContent))));
                    break;
            }
            if (element.isDisplayed()) {
                element.click();
                System.out.println("Element " + "<" + elementLocator + ">" + " found: " + "<" + elementContent + ">");
            }
        } catch (TimeoutException e) {
            System.out.println("Did not find the locator " + "<" + elementLocator + "> " + "<" + elementContent + ">" + " with the specific wait time " + e.getMessage());
        }
        return elementContent;
    }


}
