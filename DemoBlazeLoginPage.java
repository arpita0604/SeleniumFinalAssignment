package PageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Utilities.ExcelLib;
import io.cucumber.core.options.Constants;

public class DemoBlazeLoginPage {
	WebDriver ldriver;
	public DemoBlazeLoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Finding WebElements
	@FindBy(xpath = "//a[@data-target='#signInModal']")
	WebElement signUpLink;
	
	@FindBy(id = "sign-username")
	WebElement modalUsername;
	
	@FindBy(id = "sign-password")
	WebElement modalPassword;
	
	@FindBy(xpath = "//button[@onclick='register()']")
	WebElement modalSignUpButton;
	
	//Performing actions
	
	public void clickOnSignUpLink()
	{
		signUpLink.click();
	}
	public void loginToApp(WebDriver driver) throws Exception {
		
		//webLib.maximize();
		modalUsername.click();
		modalUsername.sendKeys(ExcelLib.getExcelData("Sheet1", 1, 1));
		modalPassword.click();
		modalPassword.sendKeys(ExcelLib.getExcelData("Sheet1", 1, 2));
		
	}
	/*public void enterUsername(String usernameAddress)
	{
		modalUsername.clear();
		modalUsername.sendKeys(usernameAddress);
		
	}
	
	public void enterPassword(String pwd)
	{
		modalPassword.clear();
		modalPassword.sendKeys(pwd);
	}
	*/
    public void clickOnSignUpButton()
    {
    	modalSignUpButton.click();
    }
    
}
