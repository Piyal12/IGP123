package pomRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLibrary.IAutoContants;
import GenericLibrary.PropertyFile;

public class PersonalizedGiftsPage implements IAutoContants {
	@FindBy(xpath="//div[text() = 'Photo Gifts']") private WebElement photoGifts_button;
	@FindBy(xpath="//p[text()='Photo Canvas & Plaques']") private WebElement PhotoCanvas_linktext;
	
	
	public PersonalizedGiftsPage(WebDriver driver) {          
		PageFactory.initElements(driver, this);
	}
	public WebElement getPhotoGifts_button() {
		return photoGifts_button;
	}

	public WebElement getPhotoCanvas_linktext() {
		return PhotoCanvas_linktext;
	}
	
	public static WebElement selectTile(WebDriver driver,String selectTile) {
		PropertyFile propertiesData = new PropertyFile();
		String tileSelected = propertiesData.readDataFromProperty(PROPERTIES_PATH_LOGIN, selectTile);
		WebElement SelectedTile = driver.findElement(By.xpath("//div[text() = '"+tileSelected+"']"));
        return SelectedTile;
	}
	
}
