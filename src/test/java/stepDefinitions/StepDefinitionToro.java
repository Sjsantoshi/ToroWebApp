package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import toroBdd.LoginBdd;
import toroBdd.ToroPFUsingBdd;

public class StepDefinitionToro {
	WebDriver driver;
	String url;


	@Given("^Initialize the Chrome Browser$")
	public void initialize_the_Chrome_Browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Chrome Initialisation");
		System.setProperty("webdriver.chrome.driver", "C:\\Users/Springworks/Desktop/chromedriver_win32/chromedriver.exe");
		  driver = new ChromeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" page$")
	public void navigate_to_page(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Navigate to login page of Toro");
		  driver.get(arg1);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
		
	/*@When("^User enters (.+) and (.+) and logs in$")
    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
	System. out.println("Username and passowrd is entered");
	  est.Emailid().sendKeys(username);
	  est.Passwordid().sendKeys(password);
	  est.loginButtonclick();
}
*/
	 @When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
	    public void user_enters_something_and_something_and_logs_in(String strArg1, String strArg2) throws Throwable {
		 System. out.println("Username and passowrd is entered");
		 ToroPFUsingBdd est = new ToroPFUsingBdd(driver);
		  est.Emailid().sendKeys(strArg1);
		  est.Passwordid().sendKeys(strArg2);
		  est.loginButtonclick();
	 }
	 
	@And("^Verify if user is successfully logged in$")
	public void verify_if_user_is_successfully_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Successfully logged in");
	}
	

@Then("^Go to Estimates$")
public void go_to_Estimates() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
		System.out.println("Clicks on Estimates on dashboard");
		 ToroPFUsingBdd est = new ToroPFUsingBdd(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,5000)");
		  Thread.sleep(3000);
		  est.estimateDashboard().click();
		  Thread.sleep(3000);		
    }

    @And("^Add New Estimate$")
    public void add_new_estimate() throws Throwable {
    	System.out.println("Clicks to add a new estimate");
		 ToroPFUsingBdd est = new ToroPFUsingBdd(driver);
    	est.addEstimateButton().click();
		  Thread.sleep(3000);
    }
	

    @And("^close browsers$")
    public void close_browsers() throws Throwable {
    	driver.quit();
    }


}
