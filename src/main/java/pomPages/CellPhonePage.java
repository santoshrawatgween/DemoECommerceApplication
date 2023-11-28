package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonePage 
{
	@FindBy(xpath="//button[text()=\"Add to wishlist\"]")
	private WebElement addtoWishlistHTCLollipop;
	
	public CellPhonePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void addtoWishlistHTCLollipop()
	{
		addtoWishlistHTCLollipop.click();
	}

}
