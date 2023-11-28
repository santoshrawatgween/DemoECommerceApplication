package genricLib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
	public void closeApp() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.quit();
	}
	

}
