package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NopCommerce_HomePage
{
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement goToLoginPage;
	
	@FindBy(xpath="//a[text()='Register']")
	private WebElement goToRagisterPage;
	
	
	public NopCommerce_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void goToLoginPage()
	{
		goToLoginPage.click();
	}
	
	public void goToRagisterPage()
	{
		goToRagisterPage.click();
	}
}
