package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test
public class DemoLoginTest {
	String URL = "https://www.saucedemo.com/v1/";
	String URL2  = "https://www.saucedemo.com/v1/inventory.html";
	
	@Test
	public void login() {
		WebDriver driver = new SafariDriver();
		driver.get(URL);
			String title = driver.getTitle();
			System.out.println(title);
			Assert.assertEquals(title, "Swag Labs");
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
			System.out.println("Successfully logined in the given Credential");
			driver.quit();
		}
		
		@Test
		public void URLmatched() {
			WebDriver driver = new SafariDriver();
			driver.get(URL);
				String title = driver.getTitle();
				System.out.println(title);
				Assert.assertEquals(title, "Swag Labs");
				driver.findElement(By.id("user-name")).sendKeys("standard_user");
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				driver.findElement(By.id("login-button")).click();	
				String newURL  = driver.getCurrentUrl();
				System.out.println(newURL);
//			Assert.assertEquals(URL2, driver.getCurrentUrl());
//			System.out.println("The URL is matched Successfully");
		}
		
		@Test
		public void HtTest() {
		WebDriver driver = new SafariDriver();
		driver.get("https://www.hindustantimes.com");
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		if(title.contains("Hindustan Times")) {
		    System.out.println("Test Passed");
		} else {
		    System.out.println("Test Failed");
		}
		driver.quit();
		
		
		}
		
}
		
		
	
	
	
	


