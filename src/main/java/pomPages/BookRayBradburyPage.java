package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookRayBradburyPage
{
	@FindBy(xpath="//button[text()='Add to cart']")
	private WebElement addToCart;
	
	public BookRayBradburyPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addToCart()
	{
		addToCart.click();
	}

}
