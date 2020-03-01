package Page_objects.Google_POM;

import Reusable_library.Abstract_Class_Regular;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Baseclass extends Abstract_Class_Regular {

    /* Base classs i used to create a reference of page classes
    so that way we can resue the method we created for page classes
     */

    public Baseclass(WebDriver driver){
        super();
        PageFactory.initElements(driver,this);
    }//end of page object constructor


    //// Object for google home page
    public static Homepage homepage() {
        Homepage homepage = new Homepage(driver);
        return homepage;
    }//end of homepage object constructor method

    //// Object for search result page
    public static SearchResultpage searchResultpage() {
        SearchResultpage searchResultpage = new SearchResultpage(driver);
        return searchResultpage;
    }//end of searchresultpage constructor method




}
