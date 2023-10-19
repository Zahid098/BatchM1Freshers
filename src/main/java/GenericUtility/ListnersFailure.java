package GenericUtility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersFailure extends Baseclass2 implements ITestListener
{

	public void onTestFailure(ITestResult result) 
	{
		String FailedMethod = result.getMethod().getMethodName().toString();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Tempfail = ts.getScreenshotAs(OutputType.FILE);
		String timestamp = LocalDateTime.now().toString().replace(':','_');
		String Name=FailedMethod+timestamp;
		File PermanentFile = new File("./src/test/resources/Screenshot"+Name+".png");
		
		try {
			FileHandler.copy(Tempfail, PermanentFile);
		} catch (IOException e)
		{
		}	
	}
}
