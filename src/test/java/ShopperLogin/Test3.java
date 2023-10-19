package ShopperLogin;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.DataUtility;

public class Test3 extends BaseClass
{
	@Test(priority = 3,enabled = false)
	public void TC_Login_001()throws Throwable
	{
		DataUtility a1=new DataUtility();
		String BrowserRef = a1.fetchingpropertisfiledata( "browser");
		System.out.println("The first test case");
		BaseClass.launchTheBrowser(BrowserRef);
		String URL = a1.fetchingpropertisfiledata("url");
		driver.get(URL);
		driver.quit();
		
	}
	@Test(dependsOnMethods = "TC_Login_003",alwaysRun = true)
	public void TC_Login_002()throws Throwable
	{
		DataUtility a1=new DataUtility();
		String BrowserRef = a1.fetchingpropertisfiledata( "browser");
		System.out.println("The Second test case");
		BaseClass.launchTheBrowser(BrowserRef);
		String URL = a1.fetchingpropertisfiledata("url");
		driver.get(URL);
		driver.quit();
		
	}
	@Test(priority = 1)
	public void TC_Login_003()throws Throwable
	{
		DataUtility a1=new DataUtility();
		String BrowserRef = a1.fetchingpropertisfiledata( "browser");
		System.out.println("The Third test case");
		BaseClass.launchTheBrowser(BrowserRef);
		String URL = a1.fetchingpropertisfiledata("url1");
		driver.get(URL);
		driver.quit();
		
	}

}
