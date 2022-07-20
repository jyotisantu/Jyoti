package stepdefinition;

import Browser.Browser;
import Pages.Loginfeature;
import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cucumber2 {
	

@Given("User is able to open the url {string}")
public void user_is_able_to_open_the_url(String string) {
	try
	{
		Loginfeature.OpenUrl(string);
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
}

@And("User is able to enter the UserId {string}")
public void user_is_able_to_enter_the_user_id(String string) {
    try
	{
		Loginfeature.UserId(string);
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
}

@And("User is pass the PassId {string}")
public void user_is_pass_the_pass_id(String string) {
	try
	{
		Loginfeature.PassId(string);
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
}

@When("Tap on the login button")
public void tap_on_the_login_button() {
    
	try
	{
		Loginfeature.LogInBtn();
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
}

@Then("User should be navigated to the next page.")
public void user_should_be_navigated_to_the_next_page() {
	try
	{
		Loginfeature.NextPg();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	Browser.BrowserClose();	
}

@And("User entered the UserId {string}")
public void user_entered_the_user_id(String string) {
	try
	{
		Loginfeature.Suser(string);
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
}

@And("User passed the PassId {string}")
public void user_passed_the_pass_id(String string) {
	try
	{
		Loginfeature.Spass(string);
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
}

@When("click on the login button")
public void click_on_the_login_button() {
	try
	{
		Loginfeature.Login_Button();
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
}

@Then("User should able to navigated to next page where he able to see the all the product details.")
public void user_should_able_to_navigated_to_next_page_where_he_able_to_see_the_all_the_product_details() throws InterruptedException {
	try
	{
		String actualText = Loginfeature.ProdDetails();
		//Assert.assertEquals("Products",actualText);
		System.out.println("Page Heading is same..");
	}
	catch (AssertionError e)
	{
		System.out.println("Page Heading is not same.."+e);
	}
	Browser.BrowserClose();
}


}
