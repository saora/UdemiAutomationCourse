package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    public static WebElement element = null;
    /**
     * Returns the flight origin text box element
     * @param driver
     * @return
     */
    private static WebElement originTexBox(WebDriver driver){
        element = driver.findElement(By.id("flight-origin-hp-flight"));
        return element;
    }
    public static void fillOriginTextBox(WebDriver driver, String origin){
        element = originTexBox(driver);
        element.sendKeys(origin);
    }
    private static WebElement destinationTextBox(WebDriver driver){
        element = driver.findElement(By.id("flight-destination-hp-flight"));
        return element;
    }
    public static void fillDestinationTextBox(WebDriver driver, String destination){
        element = destinationTextBox(driver);
        element.sendKeys(destination);
    }
    public static WebElement startDateTextBoxCalendar(WebDriver driver){
        element = driver.findElement(By.id("flight-departing-hp-flight"));
        return element;
    }
    public static void fillStartDateTextBoxCalendar(WebDriver driver, String startDate){
        element = startDateTextBoxCalendar(driver);
        element.sendKeys(startDate);
    }
    public static WebElement returnDateTextBoxCalendar(WebDriver driver) {
        element = driver.findElement(By.id("flight-returning-hp-flight"));
        return element;
    }
    public static void fillReturnDateTextBoxCalendar(WebDriver driver, String returnDate){
        element = returnDateTextBoxCalendar(driver);
        element.sendKeys(returnDate);
    }
    public static WebElement clickOnSearchBtn(WebDriver driver){
        element = driver.findElement(By.xpath("id(\"gcw-flights-form-hp-flight\")/div[8]/label[1]/button[1]"));
        return element;
    }

    public static WebElement clickOnFlightBtn(WebDriver driver){
        element = driver.findElement(By.id("tab-flight-tab-hp"));
        return element;
    }



}
