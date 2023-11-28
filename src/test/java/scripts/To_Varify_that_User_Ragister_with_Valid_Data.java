package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genricLib.BaseClass;
import genricLib.WebDriverUtilities;
import pomPages.NopCommerce_HomePage;
import pomPages.NopCommerce_Ragister;

public class To_Varify_that_User_Ragister_with_Valid_Data extends BaseClass
{
	@Test
	public void tc3() throws FileNotFoundException, IOException
	{
		NopCommerce_HomePage hp = new NopCommerce_HomePage(driver);
		hp.goToRagisterPage();	
		NopCommerce_Ragister r1= new NopCommerce_Ragister(driver);
		r1.femaleRadioButton();
		r1.firstName(pdata.getData("RagisterPage_Firstname"));
		r1.lastName(pdata.getData("RagisterPage_Lastname"));
		utilities.SelectOption(r1.getDataOfBirthday(), pdata.getData("dataOfBirthday"));
		utilities.SelectOption(r1.getDateOfBirthMonth(), pdata.getData("DateOfBirthMonth"));
		utilities.SelectOption(r1.getDateOfBirthYear(), pdata.getData("DateOfBirthYear"));
		r1.emailTextbox(pdata.getData("emailTextbox"));	
		r1.CompanyName(pdata.getData("CompanyName"));
		r1.NewsletterCheckBox();
		r1.PasswordTextBox(pdata.getData("PasswordTextBox"));
		r1.ConfirmPasswordTextBox(pdata.getData("ConfirmPasswordTextBox"));
		r1.ragisterButton();
	}

}
