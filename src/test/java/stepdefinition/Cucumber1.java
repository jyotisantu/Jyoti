package stepdefinition;

import Browser.Browser;
import Pages.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cucumber1 {
	
	@Given("User is able to open the webpage {string}")
	public void user_is_able_to_open_the_webpage(String string) {
		
	    Browser.openBrowser();
	    Browser.openURL(string);
	}

	@And("user passes the username as {string}")
	public void user_passes_the_username_as(String string) {
		
	    Login.username(string);
	}

	@And("user enters the password as {string}")
	public void user_enters_the_password_as(String string) {
		
	    Login.password(string);
	}

	@When("Click on the Login button")
	public void click_on_the_login_button() {
	    Login.loginButton();
	}

	@Then("User is navigated to the product backlog page.")
	public void user_is_navigated_to_the_product_backlog_page() {
		
	    Login.NavigateTheProduct();
	    Browser.BrowserClose();
	}
	
}
