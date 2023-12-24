package StepDefinition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.VerifyURL;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyUrlStepDef {
	
	WebDriver driver;
	public VerifyURL verifyUrlPg;
	
	@Given("Browser is open")
	public void browser_is_open() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    
	    verifyUrlPg = new VerifyURL(driver);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.manage().window().maximize();
	    
	}

	@Given("User is on google serach page")
	public void user_is_google_serach_page() {
		System.out.println("User landed on search page");
		
		
	    	}

	@When("User enters the Url in search box")
	public void user_enters_the_url_in_search_box() {
		
		driver.get("https://www.demoblaze.com/");
	}

	
	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
	    System.out.println("User is navigated to Demo Blaze Website");

	}
     
	@Then("Page title should be {string}")
	public void page_title_should_be(String expectedTitle) {
	    String actualTitle = driver.getTitle();
	    if (actualTitle.equals(expectedTitle))
	    {
	    	System.out.println("Test Case pass -- Expected Title matched with the Actual Title");
	    }
	    else
	    {
	    	System.out.println("Test case fail -- Expected title does not matched with the Actual Title");
	    }
	}

}
