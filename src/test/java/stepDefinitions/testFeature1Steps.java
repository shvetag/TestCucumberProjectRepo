package stepDefinitions;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testFeature1Steps {

	@Given("User is on Net Banking Landing Page")
	public void user_is_on_net_banking_landing_page() {
	    
		System.out.println("User landed on net banking page");
	}
	
	@Given("User is on Practice Landing Page")
	public void user_is_on_practice_landing_page() {
		System.out.println("User landed on practice page");
		System.out.println("This change is made through cloned project i.e. CucumberAutomationDemo");
		System.out.println("Testing of Cucumber project with git");
		//Assert.assertTrue(false);
	}
	
	
//	@When("User login into application with username {string} and password {string}")
//	public void user_login_into_application_with_username_and_password(String username, String password) {
//	    
//		System.out.println(username + "    " + password);
//	}
	
	
	@When("^User login into application with username (.+) and password (.+)$")
	public void user_login_into_application_with_username_and_password(String username, String password) {
	    
		System.out.println(username + "    " + password);
	}

	
	
	@When("User sign into application")
	public void user_sign_into_application(List<String> data) {
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
		System.out.println("Home page has been displayed");
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
		System.out.println("Card details have been displayed");
	}
	
	
	@Given ("Setup entries in the DB")
	public void setup_entries() {
		System.out.println("***************");
		System.out.println("Setup of entries in the DB completed ");
	}
	
	@When ("Launch the browser from the config variable")
	public void launch_browser () {
		System.out.println("Browser launched successfully ");
	}
	
	
	@When ("hit the home page url of banking site")
	public void hit_url() {
		System.out.println("url hit");
	}


}
