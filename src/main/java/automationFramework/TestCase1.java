package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new SafariDriver();
		
		driver.get("https://www.google.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		WebElement login = driver.findElement(By.className("lnXdpd"));
		login.getText();
		System.out.println(login);
		

		driver.close();
		
		
		

	}

}
