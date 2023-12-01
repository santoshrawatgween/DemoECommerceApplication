package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerWelcomePage
{
	@FindBy(xpath="//a[text()=\"Electronics \"]")
	private WebElement parentCategoryElectronics;
	
	@FindBy(xpath="//a[text()='Books ']")
	private WebElement parentCategoryBook; 
	
	@FindBy(xpath="//a[text()='Fahrenheit 451 by Ray Bradbury']")
	private WebElement bookRayBredBury;
	
	@FindBy(xpath="//a[text()='Log out']")
	private WebElement logoutButton;
	
	public WebElement getLogoutButton() {
		return logoutButton;
	}
	
	public WebElement getParentCategoryElectronics() {
		return parentCategoryElectronics;
	}

	@FindBy(xpath="//a[text()=\"Cell phones \"]")
	private WebElement subCategoryCellPhone;
	
	
	@FindBy(id="customerCurrency")
	private WebElement customerCurrency;
	
	public WebElement getCustomerCurrency() {
		return customerCurrency;
	}

	public CustomerWelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void subCategoryCellPhone()
	{
		subCategoryCellPhone.click();
	}
	
	public void parentCategoryBook()
	{
		parentCategoryBook.click();
	}
	
	public void bookRayBredBury()
	{
		bookRayBredBury.click();
	}

}
