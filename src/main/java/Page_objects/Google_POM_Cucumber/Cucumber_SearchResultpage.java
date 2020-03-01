package Page_objects.Google_POM_Cucumber;

import Reusable_library.Abstract_Class_Regular;
import Reusable_library.Reusable_Methods_Cucumber;
import Reusable_library.Reusable_Methods_Reports;
import com.cucumber.listener.Reporter;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Cucumber_SearchResultpage extends Abstract_Class_Regular {
    WebDriver driver;
    public Cucumber_SearchResultpage(WebDriver driver){
        super();
        PageFactory.initElements(driver,this);
    }//end of page object constructor

    //define locators here
    String resultLoc = "//*[@id='result-stats']";

    //capturing and printing out the number to the report
    public Cucumber_SearchResultpage captureSearchNumber() throws IOException, InterruptedException {
        String searchResult = Reusable_Methods_Cucumber.captureText(driver,resultLoc,"Search Result");
        String[] arraySearch = searchResult.split(" ");
        Reporter.addStepLog("Search Number is " + arraySearch[1]);
        return new Cucumber_SearchResultpage(driver);
    }


}
