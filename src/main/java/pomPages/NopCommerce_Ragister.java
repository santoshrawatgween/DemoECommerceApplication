package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NopCommerce_Ragister 
{
	
	@FindBy(id="gender-male")
	private WebElement maleRadioButton;
	
	@FindBy(id="gender-female")
	private WebElement femaleRadioButton;
	
	@FindBy(id="FirstName")
	private WebElement firstName;
	
	@FindBy(id="LastName")
	private WebElement lastName;
	
	@FindBy(name="DateOfBirthDay")
	private WebElement dataOfBirthday;
	
	public WebElement getDataOfBirthday() 
	{
		return dataOfBirthday;
	}
	
	@FindBy(name="DateOfBirthMonth")
	private WebElement DateOfBirthMonth;

	public WebElement getDateOfBirthMonth() 
	{
		return DateOfBirthMonth;
	}
	
	@FindBy(name="DateOfBirthYear")
	private WebElement DateOfBirthYear;

	public WebElement getDateOfBirthYear() {
		return DateOfBirthYear;
	}
	
	
	@FindBy(id="Email")
	private WebElement emailTextbox;
	
	@FindBy(id="Company")
	private WebElement CompanyName;
	
	@FindBy(id="Newsletter")
	private WebElement NewsletterCheckBox;
	
	@FindBy(id="Password")
	private WebElement PasswordTextBox;
	
	@FindBy(id="ConfirmPassword")
	private WebElement ConfirmPasswordTextBox;
	
	@FindBy(id="register-button")
	private WebElement ragisterButton;

	public NopCommerce_Ragister(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void maleRadioButton()
	{
		maleRadioButton.click();
	}
	
	public void femaleRadioButton()
	{
		femaleRadioButton.click();
	}
	
	public void firstName(String name)
	{
		firstName.sendKeys(name);
	}
	
	public void lastName(String name)
	{
		lastName.sendKeys(name);
	}
	
	public void emailTextbox(String name)
	{
		emailTextbox.sendKeys(name);
	}
	
	public void CompanyName(String name)
	{
		CompanyName.sendKeys(name);
	}
	public void  NewsletterCheckBox()
	{
		 NewsletterCheckBox.click();
	}
	
	public void PasswordTextBox(String name)
	{
		PasswordTextBox.sendKeys(name);
	}
	
	public void ConfirmPasswordTextBox(String name)
	{
		ConfirmPasswordTextBox.sendKeys(name);
	}
	public void ragisterButton()
	{
		ragisterButton.click();
	}

}
