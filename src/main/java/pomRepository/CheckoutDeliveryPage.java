package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutDeliveryPage {


	@FindBy(xpath ="//div[contains(text() , 'Delivery Details')]") private WebElement deliveryDetails_tab;

	@FindBy(xpath ="//div[contains(@class,'container-add-new-address')]/descendant::img[contains(@src,'svg-icons/add-new-address-5.svg')]") private WebElement addNewAddress_Btn;
	
	@FindBy(xpath ="//span[contains(text(),'Add new address')]") private WebElement addNewAddress_TitleText;
	
	@FindBy(xpath ="//span[text()=' Add new address']/../..//input[@name='fname']") private WebElement firstName_TextBox;
	
	@FindBy(xpath ="//span[contains(text(),'Add new address')]/../..//input[@name='saddr']") private WebElement addressline1_textField;
	
	@FindBy(xpath ="//span[contains(text(),'Add new address')]/../..//input[@name='saddr2']") private WebElement addressline2_textField;
	
	@FindBy(xpath ="//span[contains(text(),'Add new address')]/../..//input[@name='mob']") private WebElement mobileNum_textField;
	
	@FindBy(xpath ="//span[contains(text(),'Add new address')]/../..//input[@name='alternateMob']") private WebElement alternativeMobileNum_textField;
	
	@FindBy(xpath ="//span[contains(text(),'Add new address')]/../..//input[@name='email']") private WebElement emailId_textField;
	
	
	@FindBy(xpath ="//span[contains(text(),'Add new address')]/../..//button[text()='Save & Deliver']") private WebElement saveAndDeliver_Btn;
	
	
	@FindBy(xpath=("//input[@name='fname']")) private WebElement fname;
	
	@FindBy(xpath=("//input[@name='saddr']")) private WebElement Address;
	
	@FindBy(xpath=("//input[@name='mob']")) private WebElement mobileno ;
	
	@FindBy(xpath=("//input[@id='e-form-email-']")) private WebElement mail;
	
	@FindBy(xpath=("//button[@class='btn revamp-c-save-addr-btn address-save-btn z-depth-1 waves-effect revamp-c-save-addr-btn u-case deliver text-center c-save-addr-btn c-btn btn-red ']"))	private WebElement savedeliver;
	
	@FindBy(xpath=("//div[@class='deliver-here-link']")) private WebElement Deliveryhere;

	
	public CheckoutDeliveryPage(WebDriver driver) {          
		PageFactory.initElements(driver, this);
	}
	

	public WebElement firstname() {
		return fname;
	}
	public WebElement Enteraddress() {
		return Address;
	}
	
	public WebElement Enterphoneno() {
		return mobileno;
	}
	
	public WebElement Savedeliverbutton() {
		return savedeliver;
	}
	
	public WebElement Deliveryherebtn() {
		return Deliveryhere;
	}
	
	
	
	
	public WebElement getDeliveryDetails_tab() {
		return deliveryDetails_tab;
	}

	public WebElement getAddNewAddress_Btn() {
		return addNewAddress_Btn;
	}

	public WebElement getAddNewAddress_TitleText() {
		return addNewAddress_TitleText;
	}

	public WebElement getFirstName_TextBox() {
		return firstName_TextBox;
	}

	public WebElement getAddressline1_textField() {
		return addressline1_textField;
	}

	public WebElement getAddressline2_textField() {
		return addressline2_textField;
	}

	public WebElement getMobileNum_textField() {
		return mobileNum_textField;
	}

	public WebElement getAlternativeMobileNum_textField() {
		return alternativeMobileNum_textField;
	}

	public WebElement getEmailId_textField() {
		return emailId_textField;
	}

	public WebElement getSaveAndDeliver_Btn() {
		return saveAndDeliver_Btn;
	}

}
