package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id="Email")
	private WebElement loginUserNameTextBox;
	
	@FindBy(name="Password")
	private WebElement passwordTextBox;
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement loginButton;
	
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void userNameTextBox(String name)
	{
		loginUserNameTextBox.sendKeys(name);
	}
	
	public void passwordTextBox(String name)
	{
		passwordTextBox.sendKeys(name);
	}
	
    public void loginButton()
    {
    	loginButton.click();
    }
	
	
	

}
