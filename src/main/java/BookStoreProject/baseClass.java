package BookStoreProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class baseClass {
	
	WebDriver driver;
	
	String url1 = "https://demoqa.com/register";
	String url2 = "https://demoqa.com/login";
	
	
	@BeforeTest
    public void startup() {
        driver = new SafariDriver();
        driver.manage().window().maximize();
        
        
    }
	
	@Test
	public void CheckUrl() throws InterruptedException {
		
		driver.get(url2);
//		Thread.sleep();//
		driver.findElement(By.id("newUser")).click();
		String title = driver.getTitle();
		System.out.println(title);
//		Assert.assertEquals(title, null);
	}

	
	@AfterTest
	public void tearDown() {
       driver.quit();
        
		
	}

	
}
