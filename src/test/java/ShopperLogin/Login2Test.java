package ShopperLogin;

import GenericUtility.DataUtility;

public class Login2Test 
{
	public static void main(String[] args) throws Throwable 
	{

		DataUtility a1=new DataUtility();
		
		
		String value = a1.fetchingexceldata("sheet1",0,3);
		System.out.println(value);	
		
		long value2 = (long) a1.fetchingexceldataNumeric("sheet1",1,3);
		System.out.println(value2);
	}

}
