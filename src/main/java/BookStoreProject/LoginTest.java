package BookStoreProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends baseClass {
	String url3 = "https://demoqa.com/register";
	String url4 = "https://demoqa.com/profile";
	String url5 = "https://demoqa.com/books";
	
	
//	@Test
//	public void Register() {
//		driver.get(url3);
//		driver.findElement(By.id("firstname")).sendKeys("Vaibhav");
//		driver.findElement(By.id("lastname")).sendKeys("Gaikwad");
//		
//		driver.findElement(By.id("userName")).sendKeys("vaibhav7774");
//		driver.findElement(By.id("password")).sendKeys("Vaibhav@1210");
//
//		driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();
//
//		driver.findElement(By.id("register")).click();
//
//
//	}
	
	
	@Test
	public void login() {
		driver.get(url2);
		
		driver.findElement(By.id("userName")).sendKeys("vaibhav7774");
		driver.findElement(By.id("password")).sendKeys("Vaibhav@1210");

		driver.findElement(By.id("login")).click();
		url4 = driver.getCurrentUrl();
		System.out.println("The url after successfully login is : "+ url4);
		

	}
	
	@Test
	public void BookStoreRedirect() {
		
//		driver.get(url4);
		
		WebElement gotostorebtn = driver.findElement(By.className("btn btn-primary"));
		
		driver.findElement(By.className("btn btn-primary")).click();
		System.out.println("The bookStore Url is opened successfully");
	
		
	}
	

}
