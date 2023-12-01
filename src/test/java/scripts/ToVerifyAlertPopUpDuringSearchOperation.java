package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genricLib.BaseClass;
import pomPages.NopCommerce_HomePage;

public class ToVerifyAlertPopUpDuringSearchOperation extends BaseClass
{
	@Test
	public void tc9() throws FileNotFoundException, IOException
	{
		NopCommerce_HomePage hp = new NopCommerce_HomePage(driver);
		hp.searchButton();
		utilities.alertPopupOk(driver);
	}

}
