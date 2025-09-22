package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SecondtestCase {
	public static void main(String[] args) {
		WebDriver driver = new SafariDriver();
		
		driver.get("www.google.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
	}
	

}



