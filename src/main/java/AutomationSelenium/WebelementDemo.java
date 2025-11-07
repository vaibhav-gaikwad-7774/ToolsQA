package AutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;

public class WebelementDemo {
	
	
	public static void main(String[] args) {
		WebDriver driver = new SafariDriver();
		
		String url1 = "https://www.saucedemo.com";
		String url2 = "https://www.saucedemo.com/inventory.html";
		String url3 = "https://demoqa.com/automation-practice-form";
		
		
		
		
		
		
		
		
		driver.get(url1);
		WebElement username = driver.findElement(By.id("user-name"));
		username.clear();
		
		boolean statusUserName = username.isEnabled();
		if(statusUserName) {
			username.sendKeys("standard_user");
		}else {
			System.out.println("boolean status is "+ statusUserName + 
					"and is unable to write the sendkeys values");
		}
		
		
		
		
//		username.sendKeys("standard_user");
		
		
		
		
		
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.clear();
		pass.sendKeys("secret_sauce");
		
		
		
		
		boolean status = pass.isDisplayed();
		System.out.println(status);
		System.out.println("The password filed is displayed properly");
		
		
		driver.findElement(By.id("login-button")).click();
		
		String urlafterlogin = driver.getCurrentUrl();
		
		
		if(url2.equals(urlafterlogin)) {
			System.out.println("login was successfully done  with the " + username.toString() + " and "+ pass.toString() + 
					" and redirected to the url which is "+ url1 +" to "+ urlafterlogin);
		}else {
			System.out.println("login was unsuccessfull please go through code again");
		}
		
//		driver.close();
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		//practice form automation
		System.out.println("practicle form automation on the url which is "+ url3);
		
		driver.get(url3);
		String urldemoform = driver.getCurrentUrl();
		Assert.assertEquals(urldemoform, "https://demoqa.com/automation-practice-form");
		
		String title = driver.getTitle();
		System.out.println("The Title of the page which is "+ title);
		
		driver.findElement(By.id("firstName")).sendKeys("Vaibhav Gaikwad");
		
		driver.findElement(By.id("lastName")).sendKeys(" Gaikwad");
		
		driver.findElement(By.id("userEmail")).sendKeys("vaibhavgaikwad7774@gmail.com");
		
		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]"));
		checkbox.click();
		
		boolean status3 = checkbox.isEnabled();
		System.out.println(status3);
		
		driver.findElement(By.id("userNumber")).sendKeys("7774900968");
		
		WebElement dob = driver.findElement(By.id("dateOfBirthInput"));
		
		dob.clear();
		dob.sendKeys("10 Sep 2001");
		
		String textdob = dob.getText();
		System.out.println(textdob);
		
//		driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")).sendKeys("Nothing impoertant ");
//		
//		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")).click();
		
		driver.findElement(By.id("submit")).click();
		
		
		driver.close();
		
	}

}
