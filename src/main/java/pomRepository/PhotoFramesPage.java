package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhotoFramesPage {

	@FindBy(xpath="//p[@id='pin-error-text']") private WebElement pincodeError_message;

	@FindBy(xpath="//h1[@class='prod-name']") private WebElement product_Text;

	@FindBy(name = "countries") private WebElement country_TextField;

	@FindBy(id = "location-input") private WebElement Pincode_TextField;

	@FindBy(id = "pincode-check-btn") private WebElement check_button;

	@FindBy(xpath = "//button[@id='available-pincode']") private WebElement available_button;  

	@FindBy(xpath="//button[@class = 'pincode-notfound']") private WebElement error_button;

	@FindBy(xpath="//span[text() = 'Standard Delivery']") private WebElement standardDelivery;

	@FindBy(id = "std-datepicker") private WebElement selectDate_dropdown;

	@FindBy(xpath="//input[@id ='std-datepicker']") private WebElement SelectedDateOnField; 

	@FindBy(id = "personalize-revamp") private WebElement personalizeNow_button;

	@FindBy(xpath = "//img[contains(@class,'image img-responsive z-depth')]")  private WebElement selectedDesign_image;

	@FindBy(xpath ="//h1[text()='Personalized Superhero Dad Photo Frame in Wood']") private WebElement actualImage_text;

	@FindBy(xpath ="//h3[text()='Personalized Superhero Dad Photo Frame in Wood']")  private WebElement selectedImage_text;

	@FindBy(id = "continue-icon") private WebElement continue_button;


	@FindBy(xpath ="//p[text()='Start Personalizing']")  private WebElement uploadpage_text;

	@FindBy(xpath="///img[contains(@src,'https://cdn.igp.com/pers')]") private WebElement photoframe_image;

	@FindBy(id = "opener") private WebElement uploadImage_button;

	@FindBy(xpath = "//button[@data-test='url-btn']") private WebElement select_webBrowserTab;

	@FindBy(xpath = "//span[text()='My Files']") private WebElement select_MyFiles;

	@FindBy(xpath = "//iframe[@data-test='uw-iframe']") private WebElement selectFrame;

	@FindBy(xpath = "//iframe[contains(@src,'https://www.igp.com')]") private WebElement selectFrame2;

	@FindBy(xpath = "//div[contains(@class,'css-1emeo9b')]") private WebElement publicUrlOfFile_Text;

	@FindBy(xpath = "//input[@data-test = 'search-input-box']") private WebElement Search_Field;

	@FindBy(xpath = "//button[@data-test = 'upload-from-link-btn']") private WebElement SearchBox_arrowButton;


	@FindBy(xpath ="//div[@class='css-5nfit2 self-center relative pl5 f5 fw6 c-window-border bl']")  private WebElement uploadImagePage_Text;

	@FindBy(xpath = "//button[@data-test = 'cropBtn']") private WebElement Crop_uploadImageBtn;


	@FindBy(xpath = "//div[@class='ReactCrop__crop-selection']") private WebElement Croptted_Image;

	@FindBy(xpath = "//img[contains(@src,'65469734/b0pcwvvttkptsfzyiegk.png')]")  private WebElement uploaded_Image;

	@FindBy(xpath = "//div[contains(text(),'Image 1')]") private WebElement image_1_Text;

	@FindBy(xpath = "//a[contains(text(),'Edit')]")  private WebElement Edit_Btn;

	@FindBy(xpath ="//a[contains(text(),'Save & Review')]")  private WebElement saveAndReview_Btn;

	@FindBy(xpath ="//button[@title='ADD TO CART']")  private WebElement addToCart_Btn;

	@FindBy(xpath ="//button[text()='EDIT PERSONALISATION']")  private WebElement editPersonalize_Btn;

	@FindBy(xpath="//span[text()='Make it extra special']") private WebElement addonOverlay_text;

	@FindBy(xpath ="(//img[contains(@src,'_auto,q_auto,t_pnopt2prodlp/products')])[1]")  private WebElement addon_image;

	@FindBy(xpath ="//button[@title='ADD TO CART']/descendant ::span[text()='CONTINUE WITH ADDONS (1)']")  private WebElement continueWithAddonsNum_button; 

	
	@FindBy(xpath ="//span[text()='CONTINUE WITHOUT ADDONS']")  private WebElement continueWithoutAddonsNum_button;


	public PhotoFramesPage(WebDriver driver) {          
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getcontinueWithoutAddonsNum_button() {
		return continueWithoutAddonsNum_button;
	}
	public WebElement getPincodeError_message() {
		return pincodeError_message;
	}


	public WebElement getProduct_Text() {
		return product_Text;
	}


	public WebElement getCountry_TextField() {
		return country_TextField;
	}


	public WebElement getPincode_TextField() {
		return Pincode_TextField;
	}


	public WebElement getCheck_button() {
		return check_button;
	}


	public WebElement getAvailable_button() {
		return available_button;
	}


	public WebElement getError_button() {
		return error_button;
	}


	public WebElement getStandardDelivery() {
		return standardDelivery;
	}


	public WebElement getSelectDate_dropdown() {
		return selectDate_dropdown;
	}


	public WebElement getSelectedDateOnField() {
		return SelectedDateOnField;
	}


	public WebElement getPersonalizeNow_button() {
		return personalizeNow_button;
	}


	public WebElement getSelectedDesign_image() {
		return selectedDesign_image;
	}


	public WebElement getActualImage_text() {
		return actualImage_text;
	}


	public WebElement getSelectedImage_text() {
		return selectedImage_text;
	}


	public WebElement getContinue_button() {
		return continue_button;
	}


	public WebElement getUploadpage_text() {
		return uploadpage_text;
	}


	public WebElement getPhotoframe_image() {
		return photoframe_image;
	}


	public WebElement getUploadImage_button() {
		return uploadImage_button;
	}


	public WebElement getSelect_webBrowserTab() {
		return select_webBrowserTab;
	}


	public WebElement getSelect_MyFiles() {
		return select_MyFiles;
	}


	public WebElement getSelectFrame() {
		return selectFrame;
	}


	public WebElement getSelectFrame2() {
		return selectFrame2;
	}


	public WebElement getPublicUrlOfFile_Text() {
		return publicUrlOfFile_Text;
	}


	public WebElement getSearch_Field() {
		return Search_Field;
	}


	public WebElement getSearchBox_arrowButton() {
		return SearchBox_arrowButton;
	}


	public WebElement getUploadImagePage_Text() {
		return uploadImagePage_Text;
	}


	public WebElement getCrop_uploadImageBtn() {
		return Crop_uploadImageBtn;
	}


	public WebElement getCroptted_Image() {
		return Croptted_Image;
	}


	public WebElement getUploaded_Image() {
		return uploaded_Image;
	}


	public WebElement getImage_1_Text() {
		return image_1_Text;
	}


	public WebElement getEdit_Btn() {
		return Edit_Btn;
	}


	public WebElement getSaveAndReview_Btn() {
		return saveAndReview_Btn;
	}


	public WebElement getAddToCart_Btn() {
		return addToCart_Btn;
	}


	public WebElement getEditPersonalize_Btn() {
		return editPersonalize_Btn;
	}


	public WebElement getAddonOverlay_text() {
		return addonOverlay_text;
	}


	public WebElement getAddon_image() {
		return addon_image;
	}


	public WebElement getContinueWithAddonsNum_button() {
		return continueWithAddonsNum_button;
	}



}

