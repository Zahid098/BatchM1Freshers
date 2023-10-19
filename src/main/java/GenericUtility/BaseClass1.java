package GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1
{
	 
	public static WebDriver driver;
	
	@BeforeMethod
	public  void launchTheBrowser() throws Throwable 
	{
		
		DataUtility a1=new DataUtility();
		String BrowserRef = a1.fetchingpropertisfiledata( "browser");
		if (BrowserRef.equals( "chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(BrowserRef.equals( "firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}
		else if(BrowserRef.equals( "edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();	
		}
		else
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
	}
	@AfterMethod
	public void aftermethod() throws Throwable 
	{
		Thread.sleep(3000);
	  driver.quit();

}
}
