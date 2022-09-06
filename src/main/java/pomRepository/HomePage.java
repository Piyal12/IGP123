package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//img[contains(@src,'/w-tiles-personalize-v1.svg')]") private WebElement Personalize_link;

	@FindBy(xpath=("//a[@class='tile-8 sdd']"))
	private WebElement Samedaydelivery;
	
	@FindBy(xpath=("//span[@id='ab-test-filters-2-3']"))
	private WebElement Clickoncake;

	
	public HomePage(WebDriver driver) {         
		PageFactory.initElements(driver, this);
	}
	public WebElement getPersonalize_link() {
		return Personalize_link;
	}
	
	public WebElement Samedaycategorybtn() {
		return Samedaydelivery;
	}
	
	public WebElement Cake() {
		return Clickoncake;
	}


}

