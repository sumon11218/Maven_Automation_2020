package Selenium_02162020;

import Reusable_library.Abstract_Class_CrossBrowser;
import Reusable_library.Reusable_Methods_Reports;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

public class Yahoo_Signin extends Abstract_Class_CrossBrowser {

    @Test
    public void Yahoo_Sigin_Validation() throws InterruptedException, IOException {
        driver.navigate().to("https://yahoo.com/");

        //click on yahoo sign in
        Reusable_Methods_Reports.click(driver,"//*[text()='Sign in']",logger,"Sign in");
       //verify that stay signed in checkbox is selected
        Thread.sleep(4000);
        Boolean checkbox = driver.findElement(By.xpath("//*[@id='persistent']")).isSelected();
        if(checkbox == true){
            System.out.println("Stay Signed in checkbox is selected");
            logger.log(LogStatus.PASS,"Stay Signed in checkbox is selected");
        } else {
            System.out.println("Stay Signed in checkbox is not selected");
            logger.log(LogStatus.FAIL,"Stay Signed in checkbox is not selected");
        }//end of if else for checkbox

       Reusable_Methods_Reports.click(driver,"//*[text()='Create an account']",logger,"Create an Account");

    }//end of test method

}//end of java class
