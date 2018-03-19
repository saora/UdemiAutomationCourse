package section24_pageobjectmodel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import page.classes.SearchPage;
import utilities.InitializeDriver;
public class PageObjectModel extends InitializeDriver{
    @Before
    public void setUp()throws Exception{
        initializeDriver();
    }
    @Test
    public void testPageObjectModel(){
        SearchPage.clickOnFlightBtn(driver).click();
        SearchPage.fillOriginTextBox(driver, "Mexico");
        SearchPage.fillDestinationTextBox(driver, "New York");
        SearchPage.fillStartDateTextBoxCalendar(driver, "19/01/2018");
        SearchPage.fillReturnDateTextBoxCalendar(driver, "24/01/2018");
        SearchPage.clickOnSearchBtn(driver).click();
    }
    @After
    public void tearDown()throws Exception{
        closeBrowser();

    }

}
