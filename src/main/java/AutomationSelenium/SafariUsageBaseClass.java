package AutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SafariUsageBaseClass { 
	
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
			
			
	public static void main(String[] args) {

			WebDriver driver = new SafariDriver();
			driver.manage().window().maximize();

			driver.get(UrlMain);
			String title = driver.getTitle();
			System.out.println(title);
			
			Assert.assertEquals(title, "Swag Labs");
			
			driver.findElement(By.id("user-name")).sendKeys(correctUser);
			driver.findElement(By.id("password")).sendKeys(masterPass);
			driver.findElement(By.id("login-button")).click();
			
			String urlafterlogin = driver.getCurrentUrl();
			System.out.println(urlafterlogin);
			if(urlafterlogin.equals(urlwithlogin)) {
				System.out.println("The login with the credention which is "+ correctUser + " and "+ masterPass+ "logged with successfully");
				
			}
			else {
				System.out.println("invalid");
			}
			
			Assert.assertEquals(urlafterlogin, urlwithlogin);
		
			driver.close();
		
		
	}
	

}
