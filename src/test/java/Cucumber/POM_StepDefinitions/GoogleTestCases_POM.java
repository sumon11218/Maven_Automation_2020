package Cucumber.POM_StepDefinitions;

import Page_objects.Google_POM_Cucumber.Cucumber_Homepage;
import Page_objects.Google_POM_Cucumber.Cucumber_SearchResultpage;
import Reusable_library.Reusable_Methods;
import Reusable_library.Reusable_Methods_Cucumber;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class GoogleTestCases_POM {
    //declare webdriver outside since it will be used on all methods
    WebDriver driver;

    @Given("^I navigate to google home$")
    public void navigate() throws IOException, InterruptedException {
       //set pre agrs using ChromeOptions
        driver = Reusable_Methods_Cucumber.navigate(driver,"https://www.google.com");
    }//end of given method

    @When("^I verify the expected title as Google$")
    public void verifyTitle(){
        Reusable_Methods.verifyPageTitle(driver,"Google");
    }//end of when

    @When("^I type Cars (.*) in google search field$")
    public void typeOnSearch(String cars) throws IOException {
        Cucumber_Homepage cucumber_homepage = new Cucumber_Homepage(driver);
        cucumber_homepage.userSearch(cars);
    }//end of second when

    @And("^I submit or click on google search$")
    public void submitOnSearch() throws IOException {
        Cucumber_Homepage cucumber_homepage = new Cucumber_Homepage(driver);
        cucumber_homepage.submitOnSearchField();
    }//end of And

    @Then("^I capture and extract the search number$")
    public void getSearchNumber() throws IOException, InterruptedException {
        Cucumber_SearchResultpage cucumber_searchResultpage = new Cucumber_SearchResultpage(driver);
        cucumber_searchResultpage.captureSearchNumber();
    }//end of Then



}//end of java class
