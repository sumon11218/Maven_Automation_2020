package Google_POM_Testcases;

import Page_objects.Google_POM.Baseclass;
import Reusable_library.Abstract_Class_Regular;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;

public class TC01_GoogleSearchNumber extends Abstract_Class_Regular {

   @Test
    public void googleSearchResult() throws IOException, InterruptedException {

       ArrayList<String> cars = new ArrayList<>();
       cars.add("Mercedes");
       cars.add("BMW");
       cars.add("Lexus");

       for(int i = 0; i <cars.size(); i++) {
           logger.log(LogStatus.INFO, "Navigating to Google home");
           driver.navigate().to("https://www.google.com");
           Baseclass.homepage().userSearch(cars.get(i));
           Baseclass.homepage().submitOnSearchField();
           Baseclass.searchResultpage().captureSearchNumber();
       }//end of for loop

   }//end of test method

}//end of java class
