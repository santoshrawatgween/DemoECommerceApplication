package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genricLib.BaseClass;
import pomPages.LoginPage;
import pomPages.NopCommerce_HomePage;

public class To_Verify_The_Customer_login_with_ValidData extends BaseClass
{
	@Test
	public void tc4() throws FileNotFoundException, IOException
	{
		NopCommerce_HomePage hp = new NopCommerce_HomePage(driver);
		hp.goToLoginPage();
		LoginPage l1 = new LoginPage(driver);
		l1.userNameTextBox(pdata.getData("emailTextbox"));
		l1.passwordTextBox(pdata.getData("PasswordTextBox"));
		l1.loginButton();
		
	}
	

}
