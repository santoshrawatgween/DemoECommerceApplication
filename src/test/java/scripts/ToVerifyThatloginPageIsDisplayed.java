package scripts;

import org.testng.annotations.Test;

import genricLib.BaseClass;
import pomPages.NopCommerce_HomePage;

public class ToVerifyThatloginPageIsDisplayed extends BaseClass
{
	@Test
	public void tc2()
	{
		NopCommerce_HomePage hp = new NopCommerce_HomePage(driver);		
		hp.goToLoginPage();
	}

}
