package ShopperLogin;

import org.testng.annotations.Test;

import GenericUtility.Baseclass2;

public class Login6Test extends Baseclass2
{
	@Test(groups = "SmokeTest")
	public void TC_Login_003() 
	{
		System.out.println("third test case");
	}
	
	@Test(groups = "RegressionTest")
	public void TC_Login_004()
	{
		System.out.println("fourth test case");
	}
	
	@Test(groups = {"RegressionTest","SmokeTest"})
	public void TC_Login_005() 
	{
		System.out.println("five test case");
	}

	
   
}
