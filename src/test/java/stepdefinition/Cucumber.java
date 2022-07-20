package stepdefinition;

import org.testng.Assert;

import Browser.Browser;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cucumber {
	
	@Given("open the browser")
	public void open_the_browser() {
	    Browser.openBrowser();
	}

	@When("Enter the {string}.")
	public void enter_the(String string) {
	   Browser.openURL(string);
	}

	@Then("page is displayed.")
	public void page_is_displayed() {
		
		Browser.BrowserClose();
	}

}
