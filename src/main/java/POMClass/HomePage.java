package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
      public WebDriver driver;
    //initialising of all the web element 
	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//div[text()='Hotels' and @dir='auto']")
	private WebElement HotelsLink;
	
	
	@FindBy(xpath="//div[text()='Hi Zahid']")
	private WebElement UsernameText;
	
	@FindBy(xpath="//div[text()='Log Out']")
	private WebElement LogoutLink;
	
	
	
	
	//getter web element
	 
	public WebElement getHotelsLink() {
		return HotelsLink;
	}

	public WebElement getUserName() {
		return UsernameText;
	}

	public WebElement getLogoutLink() {
		return LogoutLink;
	}
 
}
