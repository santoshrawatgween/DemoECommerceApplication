package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genricLib.BaseClass;
import pomPages.LoginPage;
import pomPages.NopCommerce_HomePage;

public class UserSearchaProductInWelcomePage extends BaseClass
{
	@Test
	public void tc08() throws FileNotFoundException, IOException 
	{
		NopCommerce_HomePage hp = new NopCommerce_HomePage(driver);
		hp.searchTextBox(pdata.getData("searchTextBox"));
		hp.searchButton();
		
		
		
	}

}
