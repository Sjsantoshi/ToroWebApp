package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinition {

    @Given("^User is on netBanking login page$")
    public void user_is_on_netbanking_login_page() throws Throwable {
     //code to navigate to login url
    	System.out.println("Navigted to login page");
    }

    @When("^User login to application with username and password$")
    public void user_login_to_application_with_username_and_password() throws Throwable {
     //code to login
    	System.out.println("Logged in successfully");
    }
    
    @When("^User login to application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_to_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println("logged in with username and passowrd");
        System.out.println(strArg1);
        System.out.println(strArg2);
    }

    @Then("^HomePage is shown$")
    public void homepage_is_shown() throws Throwable {
     //Home page validation
    	System.out.println("Validated home page");
    }

    @And("^cards are displayed are \"([^\"]*)\"$")
    public void cards_are_displayed_are(String arg1) throws Throwable {
        System.out.println(arg1);
    }

    }

