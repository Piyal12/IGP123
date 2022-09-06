package GenericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static Actions moveByOffset(int xcoordinate, int ycoordinate,WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveByOffset(xcoordinate, ycoordinate).click().perform();
		return action;
	}
	
	public static Actions moveByOffsetdoubleclick(int xcoordinate, int ycoordinate,WebDriver driver) {
		Actions action = new Actions(driver);
	
		action.moveByOffset(xcoordinate, ycoordinate).doubleClick().perform();
		return action;
	}
	public static Actions click(WebDriver driver,int Xcord, int Ycord,WebElement element) {
		Actions action = new Actions(driver);
		
		action.moveToElement(element, Xcord, Ycord).moveByOffset(Xcord, Ycord).click().perform();
		return action;
	}

}
