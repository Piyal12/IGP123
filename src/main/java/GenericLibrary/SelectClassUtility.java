package GenericLibrary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectClassUtility {
	/***
	 * 
	 * @author chandana R
	 *
	 */
	public void selectDropDown(WebElement listbox,String data)  {
		Select select=new Select(listbox);
		int count=0;
		try {
			int index=Integer.parseInt(data);
			select.selectByIndex(index);
			count++;
		} catch(Exception e)  {
			System.out.println("it is not a index");
		}
		if(count==0) {
			try {
				select.selectByVisibleText(data);
			}  catch(Exception e)  {
				select.selectByValue(data);
			}
		}
	}
}