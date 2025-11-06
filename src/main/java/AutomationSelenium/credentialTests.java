package AutomationSelenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class credentialTests extends BaseTest{
	@Test
	public void login2() {
		driver.findElement(By.id("user-name")).sendKeys(lockedUser);
		driver.findElement(By.id("password")).sendKeys(masterPass);
		driver.findElement(By.id("login-button")).click();
		String urlAfterLogin = driver.getCurrentUrl();
		
		if(urlAfterLogin.equals("https://www.saucedemo.com")) {
			System.out.println("The Login will be with "+lockedUser+ "please try with the valid one");
			
		}else {
			System.out.println("The login will be successfully done with the "+ lockedUser);
			
		}
		
	}
	
	@Test
	public void login3() {
		driver.findElement(By.id("user-name")).sendKeys(problemUser);
		driver.findElement(By.id("password")).sendKeys(masterPass);
		driver.findElement(By.id("login-button")).click();
		String urlAfterLogin = driver.getCurrentUrl();
		
		if(urlAfterLogin.equals("https://www.saucedemo.com")) {
			System.out.println("The Login will be with "+ problemUser+ " please try with the valid one");
			
		}else {
			System.out.println("The login will be successfully done with the "+ problemUser);
			
		}
		
	}
	
	
	@Test
	public void login4() {
		driver.findElement(By.id("user-name")).sendKeys(glitchUser);
		driver.findElement(By.id("password")).sendKeys(masterPass);
		driver.findElement(By.id("login-button")).click();
		String urlAfterLogin = driver.getCurrentUrl();
		
		if(urlAfterLogin.equals("https://www.saucedemo.com")) {
			System.out.println("The Login will be with "+ glitchUser+ " please try with the valid one");
			
		}else {
			System.out.println("The login will be successfully done with the "+ glitchUser);
			
		}
		
	}
	
	@Test
	public void login5() {
		driver.findElement(By.id("user-name")).sendKeys(errorUser);
		driver.findElement(By.id("password")).sendKeys(masterPass);
		driver.findElement(By.id("login-button")).click();
		String urlAfterLogin = driver.getCurrentUrl();
		
		if(urlAfterLogin.equals("https://www.saucedemo.com")) {
			System.out.println("The Login will be with "+ errorUser+ " please try with the valid one");
			
		}else {
			System.out.println("The login will be successfully done with the "+ errorUser);
			
		}
		
	}
	
	@Test
	public void login6() {
		driver.findElement(By.id("user-name")).sendKeys(visualUser);
		driver.findElement(By.id("password")).sendKeys(masterPass);
		driver.findElement(By.id("login-button")).click();
		String urlAfterLogin = driver.getCurrentUrl();
		
		if(urlAfterLogin.equals("https://www.saucedemo.com")) {
			System.out.println("The Login will be with "+ visualUser+ " please try with the valid one");
			
		}else {
			System.out.println("The login will be successfully done with the "+ visualUser);
			
		}
		
	}
	
	
}
