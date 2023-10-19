package GenericUtility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import POMClass.HomePage;
import POMClass.LoginPage;
import POMClass.WelcomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass2
{
	String browser;
	public static WebDriver driver;
	DataUtility data1=new DataUtility();
	//@Parameters("Browser")
	@BeforeClass
	public void launchThebrowser() throws Throwable
	{
		System.out.println("----------Launcing the Browser-----------");
	 String Browser=data1.fetchingpropertisfiledata("browser");
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--disable-notifications");
		if (Browser.equals("chrome")) 
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(options);
		}
		else if (Browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();	
		}
		else if (Browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();	
	}
		else
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		 String URL=data1.fetchingpropertisfiledata("url");
		 driver.get(URL);
}
	@BeforeMethod
	public void LoginToApplication() throws Throwable
	{
		System.out.println("-----------Login to Application------------");
		
		WelcomePage welcomepage = new WelcomePage(driver);
		welcomepage.getLoginButton().click();
	 
		String MOBILENO=data1.fetchingpropertisfiledata("mobileno");
		String PASSWORD=data1.fetchingpropertisfiledata("password");	
		LoginPage loginpage = new LoginPage(driver);
		loginpage.getMobileNumber().sendKeys(MOBILENO);
		loginpage.getPasswordtextfield().sendKeys(PASSWORD);
		loginpage.getloginButton().click();
	}
	@AfterMethod
	public void logoutToApplication()throws Throwable
	{
		System.out.println("---------Logout the application--------------");
		 HomePage homepage = new HomePage(driver);
		 homepage.getUserName().click();
		 homepage.getLogoutLink().click();
	}	
		
		@AfterClass
		 public void aftermethod() throws Throwable
		 {
			 System.out.println("--------------Closing the server-----------");
			 Thread.sleep(3000);
			 driver.quit();
		 } 	
}



