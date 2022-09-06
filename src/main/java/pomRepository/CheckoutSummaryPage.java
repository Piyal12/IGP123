package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutSummaryPage {

	@FindBy(xpath ="//div[contains(text(),'Order Summary')]") private WebElement orderSummary_Tab;

	@FindBy(xpath ="//label[@for='occasion-2'] ") private WebElement birthday_Btn;

	@FindBy(xpath ="//textarea[@id='msg-field']") private WebElement message_TextField;

	@FindBy(xpath = "//div[@class= 'revamp-update-card-btn']") private WebElement messageSaved_Btn;

	@FindBy(xpath = "//button[contains(@class,'btn revamp-apply-btn1')]") private WebElement applyChanges_Btn;

	@FindBy(xpath = "//span[contains(@class,'vamp-ordsummary-number ')]") private WebElement orderTotalAmount;

	@FindBy(xpath = "//span[@class='same qty-amt revamp-prod-price']") private WebElement orderProductQty;

	@FindBy(xpath = "//span[@class='para font']") private WebElement orderProduct;

	@FindBy(xpath = "//div[contains(@class,'billing-total-header')]") private WebElement billingDetails;

	@FindBy(xpath = "//div[contains(@class,'billing-total-header')]/..//span[contains(text(),'1')]") private WebElement billDetail_totalItems;

	@FindBy(xpath = "//div[contains(@class,'billing-total-header')]/..//span[contains(text(),'495')][1]") private WebElement billDetail_subTotalAmt;

	@FindBy(xpath = "//div[contains(@class,'billing-total-header')]/..//span[contains(text(),'0')]") private WebElement billDetail_discount;

	@FindBy(xpath = "//span[contains(text(),'Free')]") private WebElement billDetail_shippingcharge;

	@FindBy(xpath = "//span[contains(@class,'Montbold-font u-case bold')]/..//span[contains(@id,'cart-total-val')]") private WebElement finalAmount;

	@FindBy(xpath = "//button[contains(@class,'mp-payment-button')]") private WebElement proceedToPayment_Btn;

	@FindBy(xpath = "//span[@class='coupon-form-focus']") private WebElement orderApplyCoupon_Link;

	@FindBy(xpath = "//button[contains(@class,'-apply-coupan-btn')] ") private WebElement applyButton;

	@FindBy(id = "coupon") private WebElement enterCouponTextfield;

	@FindBy(xpath = "//p[@id='coupon-message']") private WebElement couponErrorMessage_Text;

	@FindBy(xpath = "//p[@class='Montbold-font coupon-band-text']") private WebElement couponCodeApplied_Text;

	@FindBy(xpath ="//span[contains(@class,'Montbold-font u-case bold')]/..//span[contains(@id,'cart-total-val')]") private WebElement finalAmountAfterAppliedCoupon;

	public CheckoutSummaryPage(WebDriver driver) {          
		PageFactory.initElements(driver, this);
	}


	public WebElement getOrderSummary_Tab() {
		return orderSummary_Tab;
	}

	public WebElement getBirthday_Btn() {
		return birthday_Btn;
	}

	public WebElement getMessage_TextField() {
		return message_TextField;
	}

	public WebElement getMessageSaved_Btn() {
		return messageSaved_Btn;
	}

	public WebElement getApplyChanges_Btn() {
		return applyChanges_Btn;
	}

	public WebElement getOrderTotalAmount() {
		return orderTotalAmount;
	}

	public WebElement getOrderProductQty() {
		return orderProductQty;
	}

	public WebElement getOrderProduct() {
		return orderProduct;
	}

	public WebElement getBillingDetails() {
		return billingDetails;
	}

	public WebElement getBillDetail_totalItems() {
		return billDetail_totalItems;
	}

	public WebElement getBillDetail_subTotalAmt() {
		return billDetail_subTotalAmt;
	}

	public WebElement getBillDetail_discount() {
		return billDetail_discount;
	}

	public WebElement getBillDetail_shippingcharge() {
		return billDetail_shippingcharge;
	}

	public WebElement getFinalAmount() {
		return finalAmount;
	}

	public WebElement getProceedToPayment_Btn() {
		return proceedToPayment_Btn;
	}

	public WebElement getOrderApplyCoupon_Link() {
		return orderApplyCoupon_Link;
	}

	public WebElement getApplyButton() {
		return applyButton;
	}

	public WebElement getEnterCouponTextfield() {
		return enterCouponTextfield;
	}

	public WebElement getCouponErrorMessage_Text() {
		return couponErrorMessage_Text;
	}

	public WebElement getCouponCodeApplied_Text() {
		return couponCodeApplied_Text;
	}

	public WebElement getFinalAmountAfterAppliedCoupon() {
		return finalAmountAfterAppliedCoupon;
	}

}
