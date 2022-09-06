package Igp.ReusableClass;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import GenericLibrary.IAutoContants;
import GenericLibrary.PropertyFile;
import pomRepository.SignupPage;

public class SignUpDetails implements IAutoContants {

	PropertyFile propertyFile=new PropertyFile();
    
    public void signUp(WebDriver driver) throws InterruptedException{
    	SignupPage signup= PageFactory.initElements(driver, SignupPage.class);

        //SignUp Details
        
    	signup.Sigunuplink().click();
    	signup.EnterFirstname().sendKeys(propertyFile.readDataFromProperty(PROPERTIES_PATH,"Firstname"));
   
        WebDriverWait wait = new WebDriverWait(driver, 10);	
        signup.EnterCountryName().sendKeys(propertyFile.readDataFromProperty(PROPERTIES_PATH,"CountryName"));
        signup.Entermobileno().sendKeys(propertyFile.readDataFromProperty(PROPERTIES_PATH,"Mobileno"));
        Random r=new Random();
        int next=r.nextInt();
        signup.Entermailid().sendKeys(propertyFile.readDataFromProperty(PROPERTIES_PATH,"Mailid1st")+next+ propertyFile.readDataFromProperty(PROPERTIES_PATH,"MailidDomain"));
        signup.Enterpassword().sendKeys(propertyFile.readDataFromProperty(PROPERTIES_PATH,"Password"));
        WebDriverWait wait1 = new WebDriverWait(driver, 10);	
		wait1.until(ExpectedConditions.visibilityOf(signup.ClickSignup()));
		signup.ClickSignup().click();
		Reporter.log("Entered Signup details",true);
    
    }
}

