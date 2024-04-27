package cucumber.steps1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogInSteps {

@Given("user navigates to the facebook website")
public void user_navigates_to_the_facebook_website() {
    System.out.println("Given");
}

@When("user validates the homepage title")
public void user_validates_the_homepage_title() {
	 System.out.println("When");
}

@Then("user enters {string} username")
public void user_enters_username(String username) {
	 System.out.println("Then" + username);
}

@And("user enters {string} password")
public void user_enters_password(String password) {
	 System.out.println("And"+password);
}

@And("user clicks on the sign button")
public void user_clicks_on_the_sign_button() {
	 System.out.println("And");
}
}
