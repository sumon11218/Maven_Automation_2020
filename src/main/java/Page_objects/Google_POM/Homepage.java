package Page_objects.Google_POM;

import Reusable_library.Abstract_Class_Regular;
import Reusable_library.Reusable_Methods_Reports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Abstract_Class_Regular {
    //declare your logger locally when you use page object
    ExtentTest logger;
    //constructor method is when a child/sub-class having identical
    //name as parent class
    public Homepage(WebDriver driver){
        super();
        PageFactory.initElements(driver,this);
        this.logger = super.logger;
    }//end of page object constructor

    //declare and define all of your xpath string before creating the user methods
    String searchFieldLoc = "//*[@name='q']";

    //entering keyword on search field
    public Homepage userSearch(String useValue){
        Reusable_Methods_Reports.type(driver,searchFieldLoc,useValue,logger,"Search Field");
        return new Homepage(driver);
    }//end of userSearch method

    //clicking on submit
    public Homepage submitOnSearchField(){
        Reusable_Methods_Reports.submit(driver,searchFieldLoc,logger,"Search Field");
        return new Homepage(driver);
    }//end of submit method




}//end of java class
