package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	WebDriver driver;
	
	@Given("^User is entering google url$")
	public void user_is_entering_google_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver","F:\\eclipse05\\build files\\chromedriver.exe");
		driver=new ChromeDriver();
	   driver.get("https://www.google.co.in/");
	}

	@When("^User is going to search the term\"([^\"]*)\"$")
	public void user_is_going_to_search_the_term(String arg1) throws Throwable {
		driver.findElement(By.name("q")).sendKeys(arg1);
	   
	}

	@When("^User enters enter key$")
	public void user_enters_enter_key() throws Throwable {
		driver.findElement(By.name("q")).submit();
	   
	}

	@Then("^User should be able to see the result$")
	public void user_should_be_able_to_see_the_result() throws Throwable {
	  
	}


}
