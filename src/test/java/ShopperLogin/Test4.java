package ShopperLogin;

import org.testng.annotations.Test;

import GenericUtility.BaseClass1;
import GenericUtility.DataUtility;

public class Test4 extends BaseClass1
{
	@Test(priority = 3,enabled = true)
	public void TC_Login_001()throws Throwable
	{
		DataUtility a1=new DataUtility();
		 
		System.out.println("The first test case");
		 
		String URL = a1.fetchingpropertisfiledata("url");
		driver.get(URL);
	}
	@Test(dependsOnMethods = "TC_Login_003",alwaysRun = true)
	public void TC_Login_002()throws Throwable
	{
		DataUtility a1=new DataUtility();
		 
		System.out.println("The Second test case");
		 
		String URL = a1.fetchingpropertisfiledata("url");
		driver.get(URL);	
	}
	@Test(priority = 1)
	public void TC_Login_003()throws Throwable
	{
		DataUtility a1=new DataUtility();
		 
		System.out.println("The Third test case");
		 
		String URL = a1.fetchingpropertisfiledata("url");
		driver.get(URL);		
	}
}