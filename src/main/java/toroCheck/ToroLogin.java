package toroCheck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToroLogin {
	static WebDriver driver;
	static String baseUrl;
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users/Springworks/Desktop/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "https://dev-horizon360.toro.com/";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		WebElement email = driver.findElement(By.name("email"));
		email.click();
		email.sendKeys("admin@toro.com");
		
		WebElement password = driver.findElement(By.name("password"));
		password.click();
		password.sendKeys("password@123");
		
		WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
		login.click();
		
		WebElement search = driver.findElement(By.xpath("//input[@type='txt']"));
		search.click();
		search.sendKeys("Springrole");
		
		WebElement loginAsAdmin = driver.findElement(By.xpath("//*[contains(text(), 'Login as Admin')]"));
		loginAsAdmin.click();
		
	}

}
