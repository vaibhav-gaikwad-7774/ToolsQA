package AutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest  {
	
	WebDriver driver;
	
	//Urls
	static String UrlMain = "https://www.saucedemo.com";
	static String urlwithlogin = "https://www.saucedemo.com/inventory.html";
	
	
	
	//credentials
	static String correctUser = "standard_user";
	String lockedUser = "locked_out_user";
	String problemUser = "problem_user";
	String glitchUser = "performance_glitch_user";
	String errorUser = "error_user";
	String visualUser = "visual_user";
	
	//passWord
	static String masterPass  = "secret_sauce";
	
	@BeforeMethod
	public void login() {
		driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get(UrlMain);
		
		
	}
	
	
	@Test
	public void login1() {
		
		
		driver.findElement(By.id("user-name")).sendKeys(correctUser);
		driver.findElement(By.id("password")).sendKeys(masterPass);
		driver.findElement(By.id("login-button")).click();
		String urlAfterLogin = driver.getCurrentUrl();
		if(urlAfterLogin.equals(urlwithlogin)) {
			System.out.println("Login successfully with the "+ correctUser);
		}else {
			System.out.println("Login unsuccessfully try another Username and pass");
		}
		
	}
	
	@AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
