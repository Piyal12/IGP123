package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WoodenPhotoFramesPage {
	@FindBy(xpath="//img[contains(@src,'p-personalized-superhero-dad-photo-frame-in-wood')]") private WebElement photoframe_image;

	public WoodenPhotoFramesPage(WebDriver driver) {          
		PageFactory.initElements(driver, this);
	}
	public WebElement getPhotoframe_image() {
		return photoframe_image;
	}
}
