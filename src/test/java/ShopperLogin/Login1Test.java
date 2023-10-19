package ShopperLogin;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import GenericUtility.DataUtility;

public class Login1Test 
{
	public static void main(String[] args) throws Throwable 
	{
		DataUtility a1=new DataUtility();
		
		String value1 = a1.fetchingpropertisfiledata("username");
		System.out.println(value1);
		
		String Browser=a1.fetchingpropertisfiledata( "browser");
		System.out.println(Browser);
	}
}