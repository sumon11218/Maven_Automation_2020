package Page_objects.Google_POM_Cucumber;

import Reusable_library.Abstract_Class_Regular;
import Reusable_library.Reusable_Methods_Cucumber;
import Reusable_library.Reusable_Methods_Reports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Cucumber_Homepage{
    WebDriver driver;
    public Cucumber_Homepage(WebDriver driver){
        super();
        PageFactory.initElements(driver,this);
    }//end of page object constructor

    //declare and define all of your xpath string before creating the user methods
    String searchFieldLoc = "//*[@name='q']";

    //entering keyword on search field
    public Cucumber_Homepage userSearch(String useValue) throws IOException {
        Reusable_Methods_Cucumber.type(driver,searchFieldLoc,useValue,"Search Field");
        return new Cucumber_Homepage(driver);
    }//end of userSearch method

    //clicking on submit
    public Cucumber_Homepage submitOnSearchField() throws IOException {
        Reusable_Methods_Cucumber.submit(driver,searchFieldLoc,"Search Field");
        return new Cucumber_Homepage(driver);
    }//end of submit method




}//end of java class
