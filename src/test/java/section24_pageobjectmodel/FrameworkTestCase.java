package section24_pageobjectmodel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import utilities.InitializeDriver;
import page.classes.SearchPageFactory;

public class FrameworkTestCase extends InitializeDriver{
    SearchPageFactory searchPage;
    @Before
    public void setUp()throws Exception{
        initializeDriver();
        searchPage = new SearchPageFactory(driver);
    }
    @Test
    public void testFramework(){
        searchPage.clickFlightTab();
        searchPage.setOriginCity("New York");
        searchPage.setDetinationCity("Chicago");
        searchPage.setStartDate("14/01/2018");
        searchPage.setReturnDate("24/01/2018");
        searchPage.clickSeachBtn();
    }
    @After
    public void tearDown()throws Exception{
        closeBrowser();

    }
}
