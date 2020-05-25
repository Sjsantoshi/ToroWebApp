package toroBdd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginBdd {
	WebDriver driver;
	String url;
	
  @BeforeClass
  public void init()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users/Springworks/Desktop/chromedriver_win32/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  url = "https://qa-horizon360.toro.com/login";
	  driver.get(url);
	  
  }
  @Test
  public void dashboard() throws InterruptedException {
	  ToroPFUsingBdd est = new ToroPFUsingBdd(driver);
	  est.Emailid().sendKeys("jewargisantoshi+test18@gmail.com");
	  est.Passwordid().sendKeys("Santu@123");
	  est.loginButtonclick();
	  Thread.sleep(3000);
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,1500)");
	  Thread.sleep(3000);
	  est.estimateDashboard().click();
	  Thread.sleep(3000);
	  est.addEstimateButton().click();
	  Thread.sleep(3000);
	  
  }
  
  @AfterClass
  public void quit()
  {
	  driver.quit();
  }
}
