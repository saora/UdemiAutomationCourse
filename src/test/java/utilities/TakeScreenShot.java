package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TakeScreenShot {
    public void captureScreen(WebDriver driver, String directory) throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File desFile = new File(screenshotName(makeImagesDirectory(directory) + "/" + directory));
        System.out.println("Snapshot location ---> " + desFile);
        FileUtils.copyFile(scrFile, desFile);
    }

    private String makeImagesDirectory(String pathName) {
        String directoryName = "images" + "/" + pathName;
        File directory = new File(directoryName);
        if (!directory.exists()) {
            System.out.println("The directory " + "<" + directoryName + ">" + " was successfully created...");
        } else {
            System.out.println("The directory " + "<" + directoryName + ">" + " already exist..");
        }
        return directoryName;
    }

    private String screenshotName(String directory) {
        Date date = new Date();
        String screenshotName, fileName;
        SimpleDateFormat formating = new SimpleDateFormat("dd-MMM-YYYY_hh-mm-ss-aa");
        fileName = formating.format(date).toUpperCase();
        screenshotName = directory + "_" + fileName + ".png";
        return screenshotName;
    }
}
