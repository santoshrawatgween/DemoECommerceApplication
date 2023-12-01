package genricLib;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class WebDriverUtilities 
{
	
	public void SelectOption(WebElement name, String text)
	{
		Select s = new Select(name);
		s.selectByVisibleText(text);
	}
	
	public void mouseHover(WebDriver driver, WebElement ele)
	{
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
	}
	
	public void scrollPage(WebDriver driver, int x, int y)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+", "+y+")");
	}
	
	public void alertPopupOk(WebDriver driver)
	{
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}
	
	public void validation(String actual, String expected)
	{
		SoftAssert s = new SoftAssert();
		s.assertEquals(actual,expected);
		s.assertAll();
	}
	
	

}
