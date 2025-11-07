package BookStoreProject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends baseClass {
	String url3 = "https://demoqa.com/register";
	
	
	@Test
	public void login() {
		String urllogin =  driver.getCurrentUrl();
		System.out.println(urllogin);
		driver.findElement(By.id("firstname")).sendKeys("Vaibhav");
		driver.findElement(By.id("lastname")).sendKeys("Gaikwad");
		
		driver.findElement(By.id("userName")).sendKeys("vaibhav7774");
		driver.findElement(By.id("password")).sendKeys("vaibhav77");

		driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();

		driver.findElement(By.id("register")).click();

		
		

	}
	

}
