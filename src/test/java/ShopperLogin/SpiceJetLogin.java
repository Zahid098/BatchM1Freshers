package ShopperLogin;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericUtility.Baseclass2;
import GenericUtility.DataUtility;
import POMClass.HomePage;
import POMClass.HotelPage;
@Listeners(GenericUtility.ListnersFailure.class)
public class SpiceJetLogin extends Baseclass2
{
		DataUtility data=new DataUtility();
		@Test()
		public void TC_Login_001() throws Throwable
		{
			System.out.println("The First Test Case");
			 
			HomePage homepage = new HomePage(driver);
			Thread.sleep(3000);
			homepage.getHotelsLink().click();
			
			System.out.println(driver.getCurrentUrl());
			Assert.assertEquals( "https://www.spicejet.com/", driver.getCurrentUrl());
			
			String mainWindowID = driver.getWindowHandle();
			Set<String> allWindowId = driver.getWindowHandles();
			allWindowId.remove(mainWindowID);
			for (String wind:allWindowId)
			{
				driver.switchTo().window(wind);
			}
			
			SoftAssert softAssert=new SoftAssert();
			softAssert.assertEquals("https://www.spicejet.com/",driver.getCurrentUrl());
			
			softAssert.assertAll();
			System.out.println("the remaining lines of code");
			
	    	HotelPage hotelspage = new HotelPage(driver);
			String city = data.fetchingexceldata("Sheet2", 1, 0);
			System.out.println(city);
			hotelspage.getCityInputTextFeild().sendKeys(city);
			Thread.sleep(3000);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			hotelspage.getFromDate().click();
			long FROMDATE = data.fetchingexceldataNumeric("Sheet2", 1, 1);
			long TODATE = data.fetchingexceldataNumeric("Sheet2", 1, 2);
			hotelspage.selectDatesForHotels(driver, FROMDATE, TODATE);
			hotelspage.getSearchNowForHotelButton().click();
			driver.switchTo().window(mainWindowID);
		}
}
