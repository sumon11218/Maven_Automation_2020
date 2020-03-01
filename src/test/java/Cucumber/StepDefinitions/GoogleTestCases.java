package Cucumber.StepDefinitions;

import Reusable_library.Reusable_Methods;
import Reusable_library.Reusable_Methods_Cucumber;
import com.cucumber.listener.Reporter;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class GoogleTestCases {
    //declare webdriver outside since it will be used on all methods
    WebDriver driver = null;

    @Given("^I navigate to google home$")
    public void navigate() throws IOException, InterruptedException {
       //set pre agrs using ChromeOptions
        //quit all open chrome browsers
        Runtime.getRuntime().exec("taskkill /im chromedriver.exe /f /t");
        Thread.sleep(2500);
        //define the path of the chrome driver
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        //seeting up the chromeoptions
        ChromeOptions options = new ChromeOptions();
        //add the precondition arguments
        options.addArguments("start-maximized","incognito");
        //define the chrome web driver
        driver = new ChromeDriver(options);
        //navigate
        driver.navigate().to("https://www.google.com");
    }//end of given method

    @When("^I verify the expected title as Google$")
    public void verifyTitle(){
        Reusable_Methods.verifyPageTitle(driver,"Google");
    }//end of when

    @When("^I type Cars (.*) in google search field$")
    public void typeOnSearch(String cars) throws IOException {
        Reusable_Methods.type(driver,"//*[@name='q']",cars,"Search Field");
    }//end of second when

    @And("^I submit or click on google search$")
    public void clickOnSearch() throws IOException {
        Reusable_Methods.submit(driver,"//*[@name='q']","Search Field");
    }//end of And

    @Then("^I capture and extract the search number$")
    public void getSearchNumber(){
        String message = Reusable_Methods.captureText(driver,"//*[@id='mBMHK' or @id='result-stats']","Search Result");
        String[] arrayMsg = message.split(" ");
        Reporter.addStepLog("My search number for car is " + arrayMsg[1]);
        System.out.println("My search number for car is " + arrayMsg[1]);
    }//end of Then



}//end of java class
