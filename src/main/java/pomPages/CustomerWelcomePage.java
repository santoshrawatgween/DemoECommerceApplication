package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerWelcomePage
{
	@FindBy(xpath="//a[text()=\"Electronics \"]")
	private WebElement parentCategoryElectronics;
	
	public WebElement getParentCategoryElectronics() {
		return parentCategoryElectronics;
	}

	@FindBy(xpath="//a[text()=\"Cell phones \"]")
	private WebElement subCategoryCellPhone;
	
	public CustomerWelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void subCategoryCellPhone()
	{
		subCategoryCellPhone.click();
	}

}
