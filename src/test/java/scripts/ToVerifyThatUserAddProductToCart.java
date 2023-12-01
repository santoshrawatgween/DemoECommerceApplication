package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genricLib.BaseClass;
import pomPages.BookRayBradburyPage;
import pomPages.CustomerWelcomePage;
import pomPages.LoginPage;
import pomPages.NopCommerce_HomePage;


public class ToVerifyThatUserAddProductToCart extends BaseClass 
 {
	@Test
	public void tc6() throws FileNotFoundException, IOException
	{
		NopCommerce_HomePage hp = new NopCommerce_HomePage(driver);
		hp.goToLoginPage();
		LoginPage l1 = new LoginPage(driver);
		l1.userNameTextBox(pdata.getData("emailTextbox"));
		l1.passwordTextBox(pdata.getData("PasswordTextBox"));
		l1.loginButton();
		CustomerWelcomePage wc1 = new CustomerWelcomePage(driver);
		wc1.parentCategoryBook();
		utilities.scrollPage(driver, 0, 500);
		wc1.bookRayBredBury();
		BookRayBradburyPage book = new BookRayBradburyPage(driver);
		book.addToCart();
		
	}
	
 } 

