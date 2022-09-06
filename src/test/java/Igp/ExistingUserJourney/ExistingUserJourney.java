package Igp.ExistingUserJourney;
import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericLibrary.BaseClass;
import GenericLibrary.ListenerImplementationClass;
import Igp.ReusableClass.BusinesWorkFlowLibrary;
import pomRepository.CheckoutDeliveryPage;
import pomRepository.CheckoutPaymentPage;
import pomRepository.CheckoutSummaryPage;
import pomRepository.HomePage;
import pomRepository.LoginPage;
import pomRepository.PersonalizedGiftsPage;
import pomRepository.PhotoFramesPage;
import pomRepository.ShoppingCartPage;
import pomRepository.WoodenPhotoFramesPage;


@Listeners(ListenerImplementationClass.class)
/**
 * 
 * 
 * @author chandana R
 *
 */
public class ExistingUserJourney extends BaseClass{
/**
 * This script select a product and place a order
 * @throws InterruptedException 
 * 
 */

	@Test
	public void TC_02Test() throws InterruptedException
	
	{
	/**
	 * 	
	 */WebDriverWait wait = new WebDriverWait(driver, 30);
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		BusinesWorkFlowLibrary rUsable = new BusinesWorkFlowLibrary();
		PersonalizedGiftsPage personalizegiftPage = PageFactory.initElements(driver, PersonalizedGiftsPage.class);
		WoodenPhotoFramesPage woodenPhotoFramesPage = PageFactory.initElements(driver, WoodenPhotoFramesPage.class);
		PhotoFramesPage PhotoFrames = PageFactory.initElements(driver, PhotoFramesPage.class);
		ShoppingCartPage ShoppingCart = PageFactory.initElements(driver, ShoppingCartPage.class);
		CheckoutDeliveryPage checkoutDelivery = PageFactory.initElements(driver, CheckoutDeliveryPage.class);
		CheckoutSummaryPage checkoutSummary = PageFactory.initElements(driver, CheckoutSummaryPage.class);
		CheckoutPaymentPage checkoutpayment = PageFactory.initElements(driver, CheckoutPaymentPage.class);
		
		
		
		String homePageUrl = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 1, 0);
		String ProductUrlDisplayed = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 2, 0);
		String countryName = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 1, 1);
		String checkButton = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 1, 3);
		String invalidPinCode = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 1, 2);
		String errorButtonText = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 2, 3);
		String errorMessage = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 4, 3);
		String validPinCode = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 2, 2);
		String availableButtonText = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 3, 3);
		String uploadPage = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 7, 3);
		String imageUrlTextFieldMessage = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 8, 3);
		String searchField = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 3, 0);
		String uploadImage = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 9, 3);
		String image_1Text = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 10, 3);
		String editPersonalizeBtn_Text = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 11, 3);
		String addonOverlayTitleText = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 12, 3);
		String addToCartBtnText = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 13, 3);
		String continueWithoutAddons = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 14, 3);
		String shoppingCartPageUrl = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 4, 0);
		String expectedProductQty = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 18, 3);
		String expectedProductprice = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 22, 3);
		String expectedLoginPageUrl = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 5, 0);
		String expectedCheckoutPageUrl = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 6, 0);
		String deliveryDetailsTab_text = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 19, 3);
		String expectedAddNewAddress_TitleText = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 20, 3);
		String orderSummary_EnterMessage = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 8, 4);
		String expectedBillDetail_discount = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 23, 3);
		String expectedBillDetail_shippingcharge = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 24, 3);
		String invalidCouponNumber = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 3, 2);
		String couponNumber = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 4, 2);
		String couponCodeAppliedText = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 26, 3);
		String expectedFinalPrice = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 27, 3);
		String expectedHDFCbankUrl = excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 7, 0);
		
		
		//1) Visit homepage of IGP
		homePage.getPersonalize_link().click();
		Assert.assertEquals(driver.getCurrentUrl(), homePageUrl,"home page url is not present");
		Reporter.log("Land to home page successfully",true);
		ListenerImplementationClass.test.log(Status.INFO, "Land to home page successfully");
		personalizegiftPage.selectTile(driver, "selectTile").click();
		personalizegiftPage.getPhotoCanvas_linktext().click();


		//2) Click on a selection tile
		javaScript.scrollBy(0, 1552, driver);
		woodenPhotoFramesPage.getPhotoframe_image().click();
		Assert.assertEquals(driver.getCurrentUrl(), ProductUrlDisplayed, "different url");
		String actualSelected_Photo = PhotoFrames.getProduct_Text().getText();
		Reporter.log("selected product is displayed",true); 
		ListenerImplementationClass.test.log(Status.INFO, "selected product is displayed");
		
		//3)Select a product
		PhotoFrames.getCountry_TextField().sendKeys(countryName); 
		Assert.assertEquals(PhotoFrames.getCheck_button().getText(), checkButton);
		Reporter.log("check button is displayed",true);
		ListenerImplementationClass.test.log(Status.INFO, "check button is displayed");

		PhotoFrames.getPincode_TextField().sendKeys(invalidPinCode);
		Assert.assertEquals(PhotoFrames.getError_button().getText(), errorButtonText);
		Assert.assertEquals(PhotoFrames.getPincodeError_message().getText(), errorMessage);
		Reporter.log("error button is displayed with error message",true);
		ListenerImplementationClass.test.log(Status.INFO, "error button is displayed with error message");

		//clear pincode text field
		PhotoFrames.getPincode_TextField().clear();
		PhotoFrames.getPincode_TextField().sendKeys(validPinCode);
		wait.until(ExpectedConditions.visibilityOf(PhotoFrames.getAvailable_button()));
		Assert.assertEquals(PhotoFrames.getAvailable_button().getText(), availableButtonText);
		Reporter.log("available button is displayed",true);
		ListenerImplementationClass.test.log(Status.INFO, "available button is displayed");
		Assert.assertTrue(PhotoFrames.getStandardDelivery().isEnabled());
		Reporter.log("Selected delivery type is highlighted",true);
		ListenerImplementationClass.test.log(Status.INFO, "Selected delivery type is highlighted");

		//select date
		PhotoFrames.getSelectDate_dropdown().click();
		rUsable.selectDate(driver);
		String actualDatePresent = rUsable.actualDate(driver);
		Assert.assertEquals(PhotoFrames.getSelectedDateOnField().getAttribute("value"), actualDatePresent, "different date is selected");
		Reporter.log("Date is selected successfully",true);
		ListenerImplementationClass.test.log(Status.INFO, "Date is selected successfully");

		//4) Click on personalize now button
		PhotoFrames.getPersonalizeNow_button().click();
		Assert.assertNotNull(PhotoFrames.getSelectedDesign_image(), "image not is present");

		//5) Select a design and click continue
		Assert.assertEquals(PhotoFrames.getActualImage_text().getText(), PhotoFrames.getSelectedImage_text().getText(), "different image is present");
		Reporter.log("selected image is present successfully",true);
		ListenerImplementationClass.test.log(Status.INFO, "selected image is present successfully");

		PhotoFrames.getContinue_button().click();
		Assert.assertEquals(PhotoFrames.getUploadpage_text().getText(), uploadPage,"text not match");
		Reporter.log("upload page  is present successfully",true);
		ListenerImplementationClass.test.log(Status.INFO, "upload page  is present successfully");


		//6) Click on Upload Image Button
		PhotoFrames.getUploadImage_button().click();
		driver.switchTo().frame(PhotoFrames.getSelectFrame());
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@data-test='url-btn']")));	
		Assert.assertTrue(PhotoFrames.getSelect_webBrowserTab().isDisplayed(), "web browser tab is not present");
		Assert.assertTrue(PhotoFrames.getSelect_MyFiles().isDisplayed(),"My Files tab is not present");
		Reporter.log("My Files and web browser displayed successfully",true);
		ListenerImplementationClass.test.log(Status.INFO, "My Files and web browser displayed successfully");


		//7) Click on web address tab
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@data-test='url-btn']")));
		PhotoFrames.getSelect_webBrowserTab().click();
		Assert.assertEquals(PhotoFrames.getPublicUrlOfFile_Text().getText(), imageUrlTextFieldMessage,"different text found");
		Assert.assertTrue(PhotoFrames.getSearch_Field().isEnabled(), "Url search field is not found");
		ListenerImplementationClass.test.log(Status.INFO, "Text and Url search field is present");
		Reporter.log("Text and Url search field is present",true);

		//8) Fill the input filed with an image url and click arrow button next to the input field
		PhotoFrames.getSearch_Field().sendKeys(searchField);
		PhotoFrames.getSearchBox_arrowButton().click();
		wait.until(ExpectedConditions.visibilityOf(PhotoFrames.getCroptted_Image()));
		driver.switchTo().parentFrame();
		driver.switchTo().frame(PhotoFrames.getSelectFrame2());
		//upload image page
		Assert.assertEquals(PhotoFrames.getUploadImagePage_Text().getText(), uploadImage,"different frame is displayed");
		Assert.assertTrue(PhotoFrames.getCroptted_Image().isDisplayed(), "croptted image is not present");
		Reporter.log("croptted image and frame text is present",true);
		ListenerImplementationClass.test.log(Status.INFO, "croptted image and frame text is present");



		//9) Click on uplaod image button
		wait.until(ExpectedConditions.visibilityOf(PhotoFrames.getCrop_uploadImageBtn()));
		PhotoFrames.getCrop_uploadImageBtn().click();
		driver.switchTo().defaultContent();
		wait.until(ExpectedConditions.visibilityOf(PhotoFrames.getEdit_Btn()));	
		Assert.assertTrue(PhotoFrames.getEdit_Btn().isEnabled(),"edit button is present");
		Assert.assertTrue(PhotoFrames.getImage_1_Text().getText().contains(image_1Text),"image 1 Text is not present");
		Reporter.log( "Uplaod Image iframe is appearsuccessfully",true);
		ListenerImplementationClass.test.log(Status.INFO, "Uplaod Image iframe is appearsuccessfully");


		//10) Click on Save & Review
		PhotoFrames.getSaveAndReview_Btn().click();
		Assert.assertEquals(driver.getCurrentUrl(), excelUtility.readDataFromExcel(DATA_PATH, "Sheet1", 2, 0),"different url");
		Reporter.log("user is navigate to PDP on the selected product page successfully",true);
		ListenerImplementationClass.test.log(Status.INFO, "user is navigate to PDP on the selected product page successfully");
		Assert.assertTrue(PhotoFrames.getAddToCart_Btn().isEnabled(),"addTocart button is present");
		Assert.assertEquals(PhotoFrames.getEditPersonalize_Btn().getText(), editPersonalizeBtn_Text, "different text is present");
		Reporter.log("EDIT PERSONALIZATION & ADD TO CART is displayed successfully",true);
		ListenerImplementationClass.test.log(Status.INFO, "EDIT PERSONALIZATION & ADD TO CART is displayed successfully");

		//11) Click on Add to Cart
		PhotoFrames.getAddToCart_Btn().click();
		Assert.assertEquals(PhotoFrames.getAddonOverlay_text().getText(), addonOverlayTitleText, "different addon ovelay text is present");
		Reporter.log("make it extra special text displayed successfully",true);
		ListenerImplementationClass.test.log(Status.INFO, "make it extra special text displayed successfully");

		//12) Select and unselect addons
		PhotoFrames.getAddon_image().click();
		Reporter.log("selected addon successfully",true);
		ListenerImplementationClass.test.log(Status.INFO, "selected addon successfully");
		wait.until(ExpectedConditions.visibilityOf(PhotoFrames.getContinueWithAddonsNum_button()));
		Reporter.log(PhotoFrames.getContinueWithAddonsNum_button().getText(),true);
		Assert.assertTrue(PhotoFrames.getAddToCart_Btn().getText().contains(addToCartBtnText));
		Reporter.log("CONTINUE WITH ADDONS(1) is displayed successfully",true);
		ListenerImplementationClass.test.log(Status.INFO, "CONTINUE WITH ADDONS(1) is displayed successfully");
		PhotoFrames.getAddon_image().click();
		Assert.assertEquals(PhotoFrames.getcontinueWithoutAddonsNum_button().getText(), continueWithoutAddons, "continue without addons button text is not present");
		Reporter.log("CONTINUE WITHOUT ADDONS button displayed successfully",true);
		ListenerImplementationClass.test.log(Status.INFO, "CONTINUE WITHOUT ADDONS button displayed successfully");

		//13) Click on "CONTINUE WITHOUT ADDONS" button
		PhotoFrames.getcontinueWithoutAddonsNum_button().click();
		wait.until(ExpectedConditions.urlToBe("https://www.igp.com/cart"));	
		Assert.assertEquals(driver.getCurrentUrl(), shoppingCartPageUrl, "shopping cart page is not displayed");
		Reporter.log("shopping cart page Url is verified successfully",true);
		ListenerImplementationClass.test.log(Status.INFO, "shopping cart page Url is verified successfully");
		
		//14) Verify cart content
		Assert.assertEquals(actualSelected_Photo, ShoppingCart.getSelectedProduct().getText(),"different product is present");
		Assert.assertTrue(ShoppingCart.getInputProductQty().isDisplayed(), "input quantity of product is not present");
		Assert.assertTrue(ShoppingCart.getIncreament_Btn().isEnabled(), "increment button is not present");
		Assert.assertTrue(ShoppingCart.getProceedToCheckour_Btn().isEnabled(), "proceed to checkout button is not present");
		Assert.assertTrue(ShoppingCart.getDelete_Btn().isEnabled(), "Delete button is not present");
		Assert.assertTrue(ShoppingCart.getTotalProdutQty().isDisplayed(), "product quantity is displayed");
		String productQty = ShoppingCart.getTotalProdutQty().getText();
		Assert.assertEquals(productQty, expectedProductQty ,"different product quantity is present");
		Assert.assertTrue(ShoppingCart.getProductPrice().isDisplayed(), "product price is displayed");
		String productPrice = ShoppingCart.getProductPrice().getText();
		Assert.assertTrue(productPrice.contains(expectedProductprice),"actual product price is match as expected");
		Reporter.log("shopping cart page content is verified successfully",true);
		ListenerImplementationClass.test.log(Status.INFO, "shopping cart page content is verified successfully");

		//15) Click on Proceed to checkout
		
		try {
			ShoppingCart.getProceedToCheckour_Btn().click();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		Assert.assertEquals(driver.getCurrentUrl(), expectedLoginPageUrl,"different url is present for login page");
		Reporter.log("navigate to login page successfully",true);
		ListenerImplementationClass.test.log(Status.INFO, "navigate to login page successfully");

		//16) Login using email id and password
		rUsable.loginToIgp(driver);
		wait.until(ExpectedConditions.visibilityOf(checkoutDelivery.getDeliveryDetails_tab()));	
		Assert.assertEquals(driver.getCurrentUrl(), expectedCheckoutPageUrl, "checkout page url is not present");
		Assert.assertTrue(checkoutDelivery.getDeliveryDetails_tab().isEnabled(), "delivery details tab is displayed");
		Reporter.log("navigate to checkout page successfully",true);
		ListenerImplementationClass.test.log(Status.INFO, "navigate to checkout page successfully");


		Assert.assertEquals(checkoutDelivery.getDeliveryDetails_tab().getText(), deliveryDetailsTab_text,"delivery detail tab is present");

		//17) Click on add new address button
		checkoutDelivery.getAddNewAddress_Btn().click();
		Assert.assertEquals(checkoutDelivery.getAddNewAddress_TitleText().getText(), expectedAddNewAddress_TitleText,"add new address overlay is displayed");
		Reporter.log("address form is appear successfully",true);
		ListenerImplementationClass.test.log(Status.INFO, "address form is appear successfully");


		//18) Fill the new address form
		rUsable.fillAddress(driver);
		Reporter.log("address form is filled successfully",true);
		ListenerImplementationClass.test.log(Status.INFO, "address form is filled successfully");


		//19) Click on Save & Deliver Button
		checkoutDelivery.getSaveAndDeliver_Btn().click();
		Assert.assertTrue(checkoutSummary.getOrderSummary_Tab().isEnabled(), "order summary tab is displayed");
		Reporter.log("User Should Navigate to Order Summary Tab",true);
		ListenerImplementationClass.test.log(Status.INFO, "User Should Navigate to Order Summary Tab");


		//20) Fill the order summary form
		wait.until(ExpectedConditions.visibilityOf(checkoutSummary.getBirthday_Btn()));
		checkoutSummary.getBirthday_Btn().click();
		checkoutSummary.getMessage_TextField().sendKeys(orderSummary_EnterMessage);
		checkoutSummary.getMessage_TextField().sendKeys(Keys.ENTER);

		//- Click on "Apply Changes button"
		Assert.assertTrue(checkoutSummary.getApplyChanges_Btn().isEnabled(), "apply changes button is not present");
		javaScript.scrollBy(0, 584, driver);
		checkoutSummary.getApplyChanges_Btn().click();
		Assert.assertTrue(checkoutSummary.getMessageSaved_Btn().isEnabled(), "message saved button is not present");
		Reporter.log("Apply Changes text is change to Message Saved successfully",true);
		ListenerImplementationClass.test.log(Status.INFO, "Apply Changes text is change to Message Saved successfully");

		//- Verify Order summary contents
		Assert.assertEquals(checkoutSummary.getOrderProduct().getText(), actualSelected_Photo,"different product is present");
		Assert.assertEquals(checkoutSummary.getOrderProductQty().getText(), productQty,"different product is present in order summary page");
		String orderProductQty = checkoutSummary.getOrderProductQty().getText();
		Assert.assertEquals( orderProductQty, productQty,"different product Qty is present in order summage page");
		String OrderTotalAmount = checkoutSummary.getOrderTotalAmount().getText();
		Assert.assertEquals(OrderTotalAmount, productPrice,"different product amount is present in order summage page");
		//verifying product price is equal to final price, to ensure that discount amount is zero and free shipping charge
		Assert.assertEquals(checkoutSummary.getOrderTotalAmount().getText(),checkoutSummary.getFinalAmount().getText() ,"product price and final price is not equal");
		Assert.assertEquals(checkoutSummary.getBillDetail_totalItems().getText(), orderProductQty, "total item is not displayed correctly in billing detail");
		Assert.assertEquals(checkoutSummary.getBillDetail_subTotalAmt().getText(), OrderTotalAmount, "sub total aamount is not displayed correctly in billing detail");

        String billingDiscount = checkoutSummary.getBillDetail_discount().getText().substring(2);
		Assert.assertTrue(billingDiscount.contains(expectedBillDetail_discount), "billing discount is not displayed correctly in billing detail");
		Assert.assertEquals(checkoutSummary.getBillDetail_shippingcharge().getText(), expectedBillDetail_shippingcharge, "shipping charge is not displayed correctly in billing detail");
		Reporter.log("Verify Order summary contents successfully",true);
		ListenerImplementationClass.test.log(Status.INFO, "Verify Order summary contents successfully");

		//21) Apply Coupon Code
		checkoutSummary.getOrderApplyCoupon_Link().click();
		checkoutSummary.getEnterCouponTextfield().sendKeys(invalidCouponNumber);
		checkoutSummary.getApplyButton().click();
		checkoutSummary.getEnterCouponTextfield().clear();
		checkoutSummary.getEnterCouponTextfield().sendKeys(couponNumber);
		checkoutSummary.getEnterCouponTextfield().sendKeys(Keys.ENTER);
		Assert.assertEquals(checkoutSummary.getCouponCodeApplied_Text().getText(), couponCodeAppliedText,"different message is displayed");
		Reporter.log("coupon message is displayed successfully",true);
		ListenerImplementationClass.test.log(Status.INFO, "coupon message is displayed successfully");
		//------------------actual coupon discount is not provided so not yet calculated
		String finalPrice = checkoutSummary.getFinalAmountAfterAppliedCoupon().getText().substring(2);
		Assert.assertEquals(finalPrice, expectedFinalPrice,"different amount is present");
		Reporter.log("Final amount is displayed successfully",true);
		ListenerImplementationClass.test.log(Status.INFO, "Final amount is displayed successfully");

		//22) Click on Proceed to payment
		checkoutSummary.getProceedToPayment_Btn().click();
		Assert.assertTrue(checkoutpayment.getPayment_Tab().isDisplayed(), "payment tab is present");
		Reporter.log("User is redirected to Payments Tab successfully",true);
		ListenerImplementationClass.test.log(Status.INFO, "User is redirected to Payments Tab successfully");

		//23) Select a Payment option
		checkoutpayment.getNetBanking_Btn().click();
		checkoutpayment.getHDFCbank_image().click();
		Assert.assertTrue(checkoutpayment.getHDFC_radioBtn().isSelected(), "radio button is present");
		Reporter.log("radio button selected successfully",true);
		ListenerImplementationClass.test.log(Status.INFO, "radio button selected successfully");
		javaScript.scrollBy(0, 630, driver);

		//24) Click on Make Payment Button
		wait.until(ExpectedConditions.visibilityOf(checkoutpayment.getMakePayment_Btn2()));
		checkoutpayment.getMakePayment_Btn2().submit();

		wait.until(ExpectedConditions.urlToBe("https://netbanking.hdfcbank.com/netbanking/merchant"));
		Assert.assertEquals(driver.getCurrentUrl(), expectedHDFCbankUrl, "HDFC payment page url is not present");
		Reporter.log("successfully navigate to HDFC netbanking page",true);
		ListenerImplementationClass.test.log(Status.INFO, "successfully navigate to HDFC netbanking page");
	}
}
