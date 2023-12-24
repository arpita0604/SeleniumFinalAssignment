package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObject.DemoBlazeLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoBlazeStepDef {
	
	WebDriver driver;
	public DemoBlazeLoginPage demoBlazeLoginPg;
	static Alert alert;
	
	
	@Given("browser is open")
	public void browser_is_open() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    
	    demoBlazeLoginPg = new DemoBlazeLoginPage(driver);
	    
	}

	@When("user opens the url {string}")
	public void user_opens_the_url(String string) {
		driver.get("https://www.demoblaze.com/");
	    
	}


    @Then("click on Sign up link and alert prompt appears")
    public void click_on_sign_up_link_and_alert_prompt_appears() throws InterruptedException {
       demoBlazeLoginPg.clickOnSignUpLink();
       
       WebDriverWait wait =  new WebDriverWait(driver,Duration.ofSeconds(20));
      ((Wait<WebDriver>) wait).until(ExpectedConditions.visibilityOfElementLocated(By.className("modal-dialog")));
      // wait.until(ExpectedConditions.presenceOfElementLocated(By.className("modal-dialog")));
	}
      
	
	
	@Then("enter username as {string} and password as {string}")
	public void enter_username_as_and_password_as(String usernameadd, String password) throws Exception {
	    
	
		demoBlazeLoginPg.loginToApp(driver);
	}

	@Then("click on Sign Up button")
	public void click_on_sign_up_button() {
	    demoBlazeLoginPg.clickOnSignUpButton();
	}

	@Then("Sign up successful message appears in alert box")
	public void sign_up_successful_message_appears_in_alert_box() {
	    alert = driver.switchTo().alert();
	    String alertMessage = alert.getText();
	    System.out.println("Alert Message = "+alertMessage);
	    alert.accept();
	}

	@Then("close the browser")
	public void close_the_browser() {
	    driver.quit();
	}



}
