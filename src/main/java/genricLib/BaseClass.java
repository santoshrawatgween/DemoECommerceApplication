package genricLib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
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
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.edgedriver().setup();
		String browserName= pdata.getData("browserName");
		if(browserName.contains("chrome"))
		{
			driver= new ChromeDriver();
		}
		
		if(browserName.contains("firefox"))
		{
			driver= new FirefoxDriver();
		}
		if(browserName.contains("edge"))
		{
			driver= new EdgeDriver();
		}
		
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
