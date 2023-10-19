package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage 
{
	public WebElement driver;
	
	//initialising of all the web element 
	public WelcomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//Declaration of we element 
	
	@FindBy(xpath ="//div[text()='Login' and @dir='auto']")
	private WebElement LoginButton;

	public WebElement getLoginButton()
	{
		return LoginButton;
	}
}


