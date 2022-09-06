package Igp.ReusableClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import GenericLibrary.ExcelUtility;
import GenericLibrary.IAutoContants;
import GenericLibrary.PropertyFile;
import pomRepository.CheckoutDeliveryPage;
import pomRepository.LoginPage;

public class BusinesWorkFlowLibrary implements IAutoContants{

	
	/**
	 * 
	 * @param this method is used to perform login operation
	 */
	public void loginToIgp(WebDriver driver) {
		LoginPage Login = PageFactory.initElements(driver, LoginPage.class);
		PropertyFile propertiesData = new PropertyFile();
		String emailId = propertiesData.readDataFromProperty(PROPERTIES_PATH_LOGIN, "email");
		String passorwd = propertiesData.readDataFromProperty(PROPERTIES_PATH_LOGIN, "password");
		
		Login.getEmail_Textfield().sendKeys(emailId);
		Login.getPassword_Textfield().sendKeys(passorwd);
		Login.getSignIn_Btn().click();
	}
	
	/**
	 * 
	 * @param  This method is used to fill the address
	 */
	public void fillAddress(WebDriver driver) {
		ExcelUtility excelUtility = new ExcelUtility();
		PropertyFile propertiesData = new PropertyFile();
		String emailId = propertiesData.readDataFromProperty(PROPERTIES_PATH_LOGIN, "email");
		String firstName = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 1, 4);
		String addressline1 = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 6, 4);
		String addressline2 = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 7, 4);
		String mobileNumber = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 5, 4);
		String alternativeMobileNumber = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 4, 4);
		CheckoutDeliveryPage checkoutDelivery = PageFactory.initElements(driver, CheckoutDeliveryPage.class);
		checkoutDelivery.getFirstName_TextBox().click();
		checkoutDelivery.getFirstName_TextBox().sendKeys(firstName);
		checkoutDelivery.getAddressline1_textField().sendKeys(addressline1);
		checkoutDelivery.getAddressline2_textField().sendKeys(addressline2);
		checkoutDelivery.getMobileNum_textField().sendKeys(mobileNumber);
		checkoutDelivery.getAlternativeMobileNum_textField().sendKeys(alternativeMobileNumber);
		checkoutDelivery.getEmailId_textField().sendKeys(emailId);
	}
	

	/**
	 * 
	 * @param  This method is used to select future date 
	 */
	
	public void selectDate(WebDriver driver) {
		LocalDate now = LocalDate.now().plusDays(10);
		int day = now.getDayOfMonth();
		driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
		}
	
	/**
	 * 
	 * @param  This method is used to verify the actual date
	 */
	
	public String actualDate(WebDriver driver) {
		LocalDate now = LocalDate.now().plusDays(10);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
		String formatDate = now.format(format);  
		return formatDate;
	}
	
}
