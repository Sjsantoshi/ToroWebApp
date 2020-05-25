package toroBdd;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToroPFUsingBdd {

	WebDriver driver;
	
	public ToroPFUsingBdd(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "email")
	WebElement email;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath ="//div[@class='submit']")
	WebElement login;
	
	@FindBy(xpath = "//a[@href='/dashboard/estimates']")
	WebElement estimateDB;
	
	@FindBy(xpath="//div[@class='estimatebtn js-add-estimate-tut']")
	WebElement addEstimate;
	
	
	public WebElement Emailid()
	{
		return email;
	}
	
	public WebElement Passwordid()
	{
		return password;
	}
	
	public void loginButtonclick(){
		login.click();
	}
	
	public WebElement estimateDashboard(){
		return estimateDB;
	}
	
	public WebElement addEstimateButton(){
		return addEstimate;
	}
	
}
