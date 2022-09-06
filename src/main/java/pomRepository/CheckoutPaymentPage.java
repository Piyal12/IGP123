package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPaymentPage {

	@FindBy(xpath = "//div[@class='header-link payment-text chkpayment desktop']") private WebElement payment_Tab;


	@FindBy(xpath = "//div[contains(text(),'NET BANKING')]") private WebElement netBanking_Btn;

	@FindBy(xpath = "//img[@alt='HDFC']") private WebElement HDFCbank_image;

	@FindBy(xpath = "//button[contains(text(),'MAKE PAYMENT')]") private WebElement MakePayment_Btn;

	@FindBy(xpath = "(//button[contains(@class,'red revamp-submit-btn')])[4]")  private WebElement MakePayment_Btn2;

	@FindBy(xpath ="//input[@id='pm-HDFC']") private WebElement HDFC_radioBtn;


	public CheckoutPaymentPage(WebDriver driver) {          
		PageFactory.initElements(driver, this);
	}


	public WebElement getPayment_Tab() {
		return payment_Tab;
	}


	public WebElement getNetBanking_Btn() {
		return netBanking_Btn;
	}


	public WebElement getHDFCbank_image() {
		return HDFCbank_image;
	}


	public WebElement getMakePayment_Btn() {
		return MakePayment_Btn;
	}


	public WebElement getMakePayment_Btn2() {
		return MakePayment_Btn2;
	}


	public WebElement getHDFC_radioBtn() {
		return HDFC_radioBtn;
	}


}
