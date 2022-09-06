package pomRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSelectionPage {
	
	public ProductSelectionPage(WebDriver driver) 
	{          //contructor
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath=("//img[contains(@src,'auto,t_pnopt5prodlp/products/p-black-')]"))
	private WebElement Blackforest;
	
	@FindBy(xpath=("//img[contains(@src,'https://cdn.igp.com/f_auto,q_auto,t_pnopt3prodlp/products/p-black-forest-cake-half-kg--13461-m.jpg')]"))
	private WebElement Halfkg;
	
	@FindBy(xpath=("//input[@id='location-input']"))
	private WebElement Pincode;
	
	@FindBy(xpath=("//input[@id='location-input']"))
	private WebElement NonPincode;
	
	@FindBy(xpath ="//button[@id='show-Select_Date']") 
	private WebElement selectDate_dropdown;
	
	@FindBy(xpath="//span[text()='Next']") 
	private WebElement calenderNext_button;
	
	@FindBy(xpath="//a[text()='8']") 
	private WebElement Select_calenderDate;
	
	@FindBy(xpath=("//button[@id='cal-Standard']"))
	private WebElement standard;
	
	@FindBy(xpath=("//select[@id='timepicker']"))
	private WebElement Timeslot;
	
	@FindBy(xpath=("//img[contains(@src,'https://cdn.igp.com/f_auto,q_auto,t_pnopt2prodlp/products/p-sparkle-candle-135048-m.jpg')]"))
	private WebElement Candle;
	
	@FindBy(xpath=("//img[contains(@src,'https://cdn.igp.com/f_auto,q_auto,t_pnopt2prodlp/products/p-sparkle-candle-135048-m.jpg')]"))
	private WebElement removeCandle;
	
	@FindBy(xpath=("//span[text()='ADD TO CART']"))
	private WebElement Addtocart;
	
	@FindBy(xpath=("//span[text()='ADD TO CART']"))
	private WebElement Continuewithoutaddons;
	
	@FindBy(xpath=("//a[text()=' Proceed To Checkout']"))
	private WebElement proceedtocheckout;
	
	public WebElement Blackforestcake() {
		return Blackforest;
	}
	
	public WebElement EnterPincode() {
		return Pincode;
	}
	
	public WebElement EnterNondeliveryPincode() {
		return NonPincode;
	}
	
	public WebElement Deliverydate() {
		return selectDate_dropdown;
	}
	
	public WebElement CalenderButton() {
		return Select_calenderDate;
	}
	
	
	public WebElement deliverytype() {
		return standard;
	}
	
	public WebElement Selectcandle() {
		return Candle;
	}
	
	public WebElement DeSelectcandle() {
		return removeCandle;
	}
	
	
	public WebElement clickAddtocart() {
		return Addtocart;
	}
	
	public WebElement TimeDD() {
		return Timeslot;
	}
	
	
	public WebElement Checkoutbutton() {
		return proceedtocheckout;
	}
	
	
	

}
