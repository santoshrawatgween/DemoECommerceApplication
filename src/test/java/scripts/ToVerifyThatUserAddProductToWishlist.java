package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genricLib.BaseClass;
import pomPages.CellPhonePage;
import pomPages.CustomerWelcomePage;
import pomPages.LoginPage;
import pomPages.NopCommerce_HomePage;

public class ToVerifyThatUserAddProductToWishlist extends BaseClass
{
	@Test
	public void tc5() throws FileNotFoundException, IOException
	{
		NopCommerce_HomePage hp = new NopCommerce_HomePage(driver);
		hp.goToLoginPage();
		LoginPage l1 = new LoginPage(driver);
		l1.userNameTextBox(pdata.getData("emailTextbox"));
		l1.passwordTextBox(pdata.getData("PasswordTextBox"));
		l1.loginButton();
		CustomerWelcomePage w1 = new CustomerWelcomePage(driver);
		utilities.mouseHover(driver, w1.getParentCategoryElectronics());
		w1.subCategoryCellPhone();
		CellPhonePage cp1= new CellPhonePage(driver);
		cp1.addtoWishlistHTCLollipop();
		
		
	}
	

}