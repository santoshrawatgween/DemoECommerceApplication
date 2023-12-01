package genricLib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public WebDriver driver;
	public PropertyFiles pdata = new PropertyFiles();
	public WebDriverUtilities utilities = new WebDriverUtilities();
	
	
	@BeforeMethod
	public void openApp() throws FileNotFoundException, IOException
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getData("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void closeApp(ITestResult its) throws InterruptedException, IOException
	{
		Thread.sleep(3000);
		
		int status = its.getStatus();
		String name = its.getName();
		if(status==2)
		{
			Screenshot s = new Screenshot();
			s.getPhoto(driver, name);
		}
		driver.quit();
	}
	

}
