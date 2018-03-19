import course.practice.utilities.AppInterface;
import course.practice.utilities.FindWebElement;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Test1 implements AppInterface{

    /*public void Test() {


        *//***
         * 108
         * It needs to set same Security level in all zones. To do that follow the steps below:
         * 1. Open IE
         * 2. Go to Tools -> Internet Options -> Security
         * 3. Set all zones (Internet, Local intranet, Trusted sites, Restricted sites) to the same protected mode, enabled or disabled should not matter.
         *
         *//*
        String baseUrl = "http://newtours.demoaut.com";
        WebDriver driver;
        String findText ="Tutorial";

        DesiredCapabilities caps =  DesiredCapabilities.internetExplorer();
        caps.setCapability(InternetExplorerDriver.NATIVE_EVENTS,false);
        caps.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
        caps.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS,false);
        caps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION,true);
        caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING,true);
        caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);


        System.setProperty("webdriver.ie.driver", "browser/IEDriverServer.exe");
        driver = new InternetExplorerDriver(caps);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);

        driver.findElement(By.linkText("REGISTER")).click();

        driver.findElement(By.name("firstName")).sendKeys(findText);
        new Select(driver.findElement(By.name("country"))).selectByVisibleText("MEXICO");
    }*/

    @org.testng.annotations.Test
    public void test1()throws IOException{



    }

    public Properties getPropertiesData()throws IOException {
        Properties prop = new Properties();
        FileInputStream fileInput = new FileInputStream(propertiesFile);
        prop.load(fileInput);
        System.out.println(prop);
        return prop;
    }
}
