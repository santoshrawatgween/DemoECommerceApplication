package genricLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities 
{
	
	public void SelectOption(WebElement name, String text)
	{
		Select s = new Select(name);
		s.selectByVisibleText(text);
	}

}
