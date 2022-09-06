package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "email") private WebElement email_Textfield;

	@FindBy(id = "passwd") private WebElement password_Textfield;

	@FindBy(xpath ="(//button[text()='SIGN IN'])[1]") private WebElement signIn_Btn;

	
	public LoginPage(WebDriver driver) {          
		PageFactory.initElements(driver, this);
	}
	public WebElement getEmail_Textfield() {
		return email_Textfield;
	}

	public WebElement getPassword_Textfield() {
		return password_Textfield;
	}

	public WebElement getSignIn_Btn() {
		return signIn_Btn;
	}
}
