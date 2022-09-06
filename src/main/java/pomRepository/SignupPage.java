package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {

	
	public SignupPage(WebDriver driver) 
	{          //contructor
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath=("//span[@id='goto-signup']"))
	private WebElement signup;
	
	@FindBy(xpath=("//input[@id='cname']"))
	private WebElement firstname;
	
	@FindBy(xpath=("//div[@class='col s4 no-padding']/descendant::input[@class='accord-input revamp-login-input login-input required input suggestCountry']"))
	private WebElement Country;
	
	@FindBy(xpath=("//input[@id='email']"))
	private WebElement email;
	
	@FindBy(xpath=("//input[@id='passwd']"))
	private WebElement password;
	
	@FindBy(xpath=("//input[@name='mob']"))
	private WebElement mobileno ;
	
	@FindBy(xpath=("//input[@id='dob']"))
	private WebElement DOB;
			
	@FindBy(xpath=("//div[@class='col s4 no-padding']/descendant::button[text()='SIGNUP']"))
	private WebElement SIGNUP;
	@FindBy(xpath="//select[@class='picker__select--year']")
	private WebElement YearDD;
	@FindBy(xpath = "//select[@title='Select a month']")
	private  WebElement MonthDD;
	@FindBy(xpath ="//table//td/div[text()='24']") private WebElement DATE;
	public WebElement Dateofbirth() {
		return DOB;
	}
	public WebElement EnterFirstname() throws InterruptedException {
        Thread.sleep(3000);
		return firstname;
	}
	
	public WebElement EnterCountryName() {
		return Country;
	}
	
	public WebElement Entermailid() {
		return email;
	}
	
	public WebElement Entermobileno() {
		return mobileno;
	}
	
	public WebElement Enterpassword() {
		return password;
	}
	
	public WebElement Sigunuplink() {
		return signup;
	}
	
	public WebElement ClickSignup() {
		return SIGNUP;
	}

	public WebElement YearDropdown() {
		return YearDD;
	}
	public WebElement MonthDropdown() {
		return MonthDD;
	}
	public WebElement DobDate() {
		return DATE;
	}
}
