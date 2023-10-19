package POMClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelPage
{
	public WebDriver driver;
	 public HotelPage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	
	

	@FindBy(xpath = "//input[@id='txtHotelCity']")
	private WebElement CityInputTextFeild;
	
	@FindBy(xpath="//input[@id='from']")
	private WebElement FromDate;
	
	@FindBy(xpath ="//a[text()='Search Now']")
	private WebElement SearchNowForHotelButton;
	
	public WebElement getCityInputTextFeild() {
		return CityInputTextFeild;
	}

	public WebElement getFromDate() {
		return FromDate;
	}

	public WebElement getSearchNowForHotelButton() {
		return SearchNowForHotelButton;
	}
	
    public void selectDatesForHotels(WebDriver driver2,long fromdate,long todate) throws Throwable {
    	
    	driver2.findElement(By.xpath("//a[text()='"+fromdate+"']")).click();
    	Thread.sleep(2000);
    	driver2.findElement(By.xpath("//a[text()='"+todate+"']")).click();
    }
	
	
}
