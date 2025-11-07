package AutomationSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class practiceTest2 {
	public static void main(String[] args) {
		WebDriver driver = new SafariDriver();
		
		String appurl = driver.getCurrentUrl();
		
		
		System.out.println(appurl);
		
		
	}

}
