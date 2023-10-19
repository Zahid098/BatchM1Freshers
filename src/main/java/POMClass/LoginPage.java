package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public WebDriver driver;
	
	    //initialising of all the web element 
		public LoginPage(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}
		//Declaration of we element 
		@FindBy(xpath="//input[@data-testid='user-mobileno-input-box']")
		private WebElement mobilenumber;
		
		@FindBy(xpath="//input[@data-testid='password-input-box-cta']")
        private WebElement passwordtextfield;
		
		@FindBy(xpath ="//div[@data-testid='login-cta']")
		private WebElement loginButton;
		//getter methods
		public WebElement getMobileNumber() {
			return mobilenumber;
		}
		 
		public WebElement getPasswordtextfield() {
			return passwordtextfield;
		}

		public WebElement getloginButton() {
			return loginButton;
		}	 
}
