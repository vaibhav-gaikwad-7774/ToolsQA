package AutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class navigationDemo {
	public static void main(String[] args) {
		WebDriver driver = new SafariDriver();
		driver.get("https://www.saucedemo.com");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		String urlafterlogin = driver.getCurrentUrl();
		
		System.out.println(urlafterlogin);
		
		driver.navigate().back();
		
		String mainurl = driver.getCurrentUrl();
		System.out.println(mainurl);
		
		driver.navigate().forward();
		
		String forwardurl = driver.getCurrentUrl();
		System.out.println(forwardurl);
		
		driver.navigate().refresh();
		
		String refreshurl = driver.getCurrentUrl();
		System.out.println(refreshurl);
		
		
		
		
		driver.close();
		
	}
	
	
	

}
