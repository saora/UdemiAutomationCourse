package page.classes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {
    WebDriver driver;

    @FindBy(id = "tab-flight-tab-hp")
    WebElement flightTab;
    @FindBy(id = "flight-origin-hp-flight")
    WebElement originCity;
    @FindBy(id = "flight-destination-hp-flight")
    WebElement detinationCity;
    @FindBy(id = "flight-departing-hp-flight")
    WebElement startDate;
    @FindBy(id = "flight-returning-hp-flight")
    WebElement returnDate;
    @FindBy(xpath = "id(\"gcw-flights-form-hp-flight\")/div[8]/label[1]/button[1]")
    WebElement searchBtn;

    public  SearchPageFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickFlightTab(){
        flightTab.click();
    }
    public void setOriginCity(String origin){
        originCity.sendKeys(origin);
    }
    public void setDetinationCity(String destination){
        detinationCity.sendKeys(destination);
    }
    public void setStartDate(String startD){
        startDate.sendKeys(startD);
    }
    public void setReturnDate(String returnD){
        returnDate.sendKeys(returnD);
    }
    public void clickSeachBtn(){
        searchBtn.click();
    }


}
