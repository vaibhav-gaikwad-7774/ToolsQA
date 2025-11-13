package AutomationSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;


public class LoginAndVarifyTitle {

	public static void main(String[] args) {
		WebDriver driver = new SafariDriver();
		
		driver.get("https://www.saucedemo.com");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.close();

	}

}
