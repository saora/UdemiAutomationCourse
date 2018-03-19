package course.practice.section8.class61;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class IEDriver {

    public void Test() {
        String baseUrl = "http://newtours.demoaut.com";
        WebDriver driver;

        /***
         * 108
         * It needs to set same Security level in all zones. To do that follow the steps below:
         * 1. Open IE
         * 2. Go to Tools -> Internet Options -> Security
         * 3. Set all zones (Internet, Local intranet, Trusted sites, Restricted sites) to the same protected mode, enabled or disabled should not matter.
         *
         */
        String findText ="Tutorial";
        System.setProperty("webdriver.ie.driver", "browser/IEDriverServer.exe");
        driver = new InternetExplorerDriver();
        driver.get(baseUrl);

        driver.findElement(By.linkText("REGISTER")).click();

        //driver.findElement(By.name("firstName")).sendKeys(findText);
        new Select(driver.findElement(By.name("country"))).selectByVisibleText("MEXICO");
    }
}
