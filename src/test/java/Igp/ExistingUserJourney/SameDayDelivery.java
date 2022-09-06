package Igp.ExistingUserJourney;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import GenericLibrary.SelectClassUtility;
import Igp.ReusableClass.SignUpDetails;
import pomRepository.CheckoutDeliveryPage;
import pomRepository.CheckoutPaymentPage;
import pomRepository.CheckoutSummaryPage;
//import pomRepository.AddressAndCouponPage;
import pomRepository.HomePage;
import pomRepository.ProductSelectionPage;
import pomRepository.SignupPage;

@Listeners(GenericLibrary.ListenerImplementationClass.class)

/**
 * 
 * @author Shashank
 *
 */
public class SameDayDelivery extends BaseClass{

	SelectClassUtility select1=new SelectClassUtility();
	/**
	 * 
	 * @throws InterruptedException
	 */

	@Test
	public void TC_01Test() throws InterruptedException {
		/* 
		 * Selecting a product and signup with new user and check out
		 * 
		 *
		 *
		 * */

		// Visit IGP Homepage 

		Reporter.log("Land to home page successfully",true);
		HomePage homepage=PageFactory.initElements(driver, HomePage.class);
		ProductSelectionPage productselect=PageFactory.initElements(driver, ProductSelectionPage.class);
		homepage.Samedaycategorybtn().click();
		Assert.assertEquals(driver.getCurrentUrl(),  excelUtility.readDataFromExcel(EXCELDATA_PATH, "Sheet1", 1, 0));
		homepage.Cake().click();

		javaScript.scrollBy(0, 1000, driver);
		productselect.Blackforestcake().click();
		Assert.assertEquals(driver.getCurrentUrl(), excelUtility.readDataFromExcel(EXCELDATA_PATH, "Sheet1", 2, 0));
		Reporter.log("Selected black-forest-cake-half-kg",true);


		//Verifying Pincode
		javaScript.scrollBy(0, 1500, driver);
		productselect.EnterNondeliveryPincode().sendKeys(excelUtility.readDataFromExcel(EXCELDATA_PATH, "Sheet1", 1, 1));
		Reporter.log("error messgae is displayed for entered pincode",true);
		productselect.EnterNondeliveryPincode().clear();
		productselect.EnterNondeliveryPincode().sendKeys(excelUtility.readDataFromExcel(EXCELDATA_PATH, "Sheet1", 2, 1));
		Reporter.log("Pincode Available messgae is displayed for entered pincode",true);


		//Select Delivery Date 
		productselect.Deliverydate().click();
		productselect.CalenderButton().click();
		Reporter.log("Selected date from calender",true);

		//Select Delivery Type and Time 
		productselect.deliverytype().click();
		WebElement Time = productselect.TimeDD();		
		select1.selectDropDown(Time, excelUtility.readDataFromExcel(EXCELDATA_PATH, "Sheet1", 1, 4));
		Reporter.log("Selected Required Delivery TYpe and Time",true);		
		javaScript.scrollBy(0, 1500, driver);

		//Select and Deselect Add ons to cart
		productselect.Selectcandle().click();
		productselect.DeSelectcandle().click();
		Reporter.log("Selected and Deselected Candle",true);	


		//Adding to cart and checkout
		productselect.clickAddtocart().click();
		javaScript.scrollBy(0, 2500, driver);
		productselect.Checkoutbutton().click();
		Assert.assertEquals(driver.getCurrentUrl(), excelUtility.readDataFromExcel(EXCELDATA_PATH, "Sheet1", 3, 0));
		Reporter.log("Product Added to cart",true);

		//SignUp Details
		SignupPage signup= PageFactory.initElements(driver, SignupPage.class);
		SignUpDetails signUpDetails=new SignUpDetails();
		signUpDetails.signUp(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);	
		wait.until(ExpectedConditions.visibilityOf(signup.ClickSignup()));
		Reporter.log("Entered Signup details",true);


		//Personalize measaage Details
		CheckoutDeliveryPage checkoutDelivery = PageFactory.initElements(driver, CheckoutDeliveryPage.class);

		WebDriverWait wait2 = new WebDriverWait(driver, 10);	
		wait2.until(ExpectedConditions.visibilityOf(checkoutDelivery.firstname()));

		checkoutDelivery.firstname().sendKeys(excelUtility.readDataFromExcel(EXCELDATA_PATH, "Sheet1", 1, 3));
		checkoutDelivery.Enteraddress().sendKeys(excelUtility.readDataFromExcel(EXCELDATA_PATH, "Sheet1", 2, 3));
		checkoutDelivery.Enterphoneno().sendKeys(excelUtility.readDataFromExcel(EXCELDATA_PATH, "Sheet1", 3, 3));
		checkoutDelivery.Savedeliverbutton().click();
		CheckoutSummaryPage checkoutSummary = PageFactory.initElements(driver, CheckoutSummaryPage.class);
		checkoutSummary.getBirthday_Btn().click();
		Reporter.log("Entered personal message",true);
		checkoutSummary.getMessage_TextField().sendKeys(excelUtility.readDataFromExcel(EXCELDATA_PATH, "Sheet1", 4, 3));;

		// Apply Coupon 
		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		wait3.until(ExpectedConditions.visibilityOf(checkoutSummary.getOrderApplyCoupon_Link()));
		checkoutSummary.getOrderApplyCoupon_Link().click();
		checkoutSummary.getEnterCouponTextfield().sendKeys(excelUtility.readDataFromExcel(EXCELDATA_PATH, "Sheet1", 1, 2));
		checkoutSummary.getApplyButton().click();

		checkoutSummary.getEnterCouponTextfield().clear();
		checkoutSummary.getEnterCouponTextfield().sendKeys(excelUtility.readDataFromExcel(EXCELDATA_PATH, "Sheet1", 2, 2));
		checkoutSummary.getEnterCouponTextfield().sendKeys(Keys.ENTER);

		Reporter.log("coupon message is displayed successfully",true);
		Reporter.log("Final amount is displayed successfully",true);
		javaScript.scrollBy(0, 500, driver);
		// Click on Proceed to payment
		checkoutSummary.getProceedToPayment_Btn().click();

		CheckoutPaymentPage checkoutpayment = PageFactory.initElements(driver, CheckoutPaymentPage.class);
		Assert.assertTrue(checkoutpayment.getPayment_Tab().isDisplayed(), "payment tab is available");
		Reporter.log("User is redirected to Payments Tab successfully",true);
		driver.close();
	}

}


