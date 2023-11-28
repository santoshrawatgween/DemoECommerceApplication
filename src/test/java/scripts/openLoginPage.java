package scripts;

import org.testng.annotations.Test;

import genricLib.BaseClass;
import pomPages.NopCommerce_HomePage;

public class openLoginPage extends BaseClass
{
	@Test
	public void tc1()
	{
		NopCommerce_HomePage hp = new NopCommerce_HomePage(driver);		
		hp.goToLoginPage();
	}

}
