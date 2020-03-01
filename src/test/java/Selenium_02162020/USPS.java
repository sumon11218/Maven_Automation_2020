package Selenium_02162020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class USPS {

    WebDriver driver;

    @BeforeMethod
    public void openBrowser(){

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeOptions option = new ChromeOptions();
        option.addArguments("incognito", "start-maximized");
        driver = new ChromeDriver(option);

        //initiate the implicit wait
        //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

    }//end of before method

    @Test
    public void usps() throws InterruptedException {
        driver.navigate().to("https://usps.com/");

        //declare and define the WebDriverWait for explicit wait
        WebDriverWait wait = new WebDriverWait(driver,7);

        //store your find elements using List command to get the group count
        //List<WebElement> linkCount = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(@class,'lang-')]")));
        Thread.sleep(3000);
        List<WebElement> linkCount = driver.findElements(By.xpath("//*[contains(@class,'lang-')]"));
        //print out the size to get the count
        System.out.println("My Link Count is " + linkCount.size());

    }//end of test method

    @AfterMethod
    public void closeBrowser(){
        //driver.quit();
    }//end of after method



}//end of java class
