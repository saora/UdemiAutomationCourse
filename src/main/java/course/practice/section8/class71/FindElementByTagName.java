package course.practice.section8.class71;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementByTagName {
    /***
     * Syntax
     * tag[atribute='value']
     * "#" -> id
     *  "." -> Class
     *
     *  Element displayed example textbox:
     *  input[id=displayed-text]
     *  #displayed
     *  input#displayed
     *
     *  input[class=displayed-class]
     *  .displayed-class
     *  input.displayed-class
     *
     * Appending classes
     *  .class1.class2.class3 -> until we find a unique element
     */

    public static void main(String[] args)throws InterruptedException{

        //String baseUrl="http://demostore.x-cart.com/";
        String baseUrl="https://www.curso-ingles.com/practicar/ejercicios/unit-test-relative-and-indefinite-pronouns";

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","browser/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);

        Thread.sleep(1000);
       //driver.findElement(By.tagName("a")).click();
       //driver.findElement(By.linkText("Coming soon")).click();
       //driver.findElement(By.cssSelector("div#iMenuAprender")).click();
       // driver.findElement(By.cssSelector("div#iMenuLogin")).click();
        //tag[]
        //driver.findElement(By.cssSelector("input[class='form-control css-button-blue lnkReg']")).click();
        //driver.findElement(By.cssSelector("#form-control css-button-blue lnkReg")).click();

      // driver.findElement(By.cssSelector("input#phrasal_text")).sendKeys("prueba");
        // driver.findElement(By.cssSelector("input[class='form-control']")).sendKeys("prueba");
        //class='cImgCourses course4'
        //img[class$='se4']
        //img[class^='cImgC']
       // driver.findElement(By.cssSelector(".dropdown.cTextoComunidad")).click();
        //driver.findElement(By.cssSelector(".form-control.css-button-blue.lnkReg")).click();
       // driver.findElement(By.cssSelector("div.panel:nth-child(1)>div.panel-heading>div.panel-title>a>div.cCursosTitulo")).click();
        ///div.panel:nth-child(1)>div.panel-heading>div.panel-title>a>div.cCursosTitulo

        driver.findElement(By.xpath("//a//div[@xpath='2']")).click();


       //driver.findElement(By.cssSelector("input#phrasal_btn")).click();
        //driver.findElement(By.className("leaf has-sub")).click();
        //driver.findElement(By.cssSelector("span[class='primary-title']")).click();
        Thread.sleep(5000);
        //driver.close();

    }
}
