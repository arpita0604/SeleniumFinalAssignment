package PageObject;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyURL {
	WebDriver ldriver;
	
	public VerifyURL (WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Finding the WebElement
	@FindBy(id = "input")
	WebElement enterUrl;
	
	public void urlEnter(String url)
	{
		enterUrl.sendKeys(url);
	}
	
	

}
