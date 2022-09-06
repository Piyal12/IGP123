package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

	@FindBy(xpath ="//p[text()='Personalized Superhero Dad Photo Frame in Wood']") private WebElement SelectedProduct;

	@FindBy(xpath ="//a[text()=' Proceed To Checkout']") private WebElement proceedToCheckour_Btn;
	
	@FindBy(xpath ="//span[@id='i-count']") private WebElement totalProdutQty;
	
	@FindBy(xpath ="//span[@class='symbol inc-quantity']") private WebElement increament_Btn;
	
	@FindBy(xpath ="//span[@id='cart-total-val']") private WebElement productPrice;
	
	@FindBy(xpath ="//input[contains(@class,'qty number c-item-qty-v')]") private WebElement inputProductQty;
	
	@FindBy(xpath ="//img[@alt='outlined-trash-icon img']") private WebElement delete_Btn;
	
	
	public ShoppingCartPage(WebDriver driver) {          
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSelectedProduct() {
		return SelectedProduct;
	}


	public WebElement getProceedToCheckour_Btn() {
		return proceedToCheckour_Btn;
	}


	public WebElement getTotalProdutQty() {
		return totalProdutQty;
	}


	public WebElement getIncreament_Btn() {
		return increament_Btn;
	}


	public WebElement getProductPrice() {
		return productPrice;
	}


	public WebElement getInputProductQty() {
		return inputProductQty;
	}


	public WebElement getDelete_Btn() {
		return delete_Btn;
	}


}
