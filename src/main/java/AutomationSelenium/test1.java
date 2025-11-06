package AutomationSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;


public class test1 {
	public static void main(String[] args) {
		WebDriver driver = new SafariDriver();
		driver.get("https://www.saucedemo.com");
		
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		
		String title = driver.getTitle();
		System.out.println("The Title of the page is : "+ title);
		
		int titlelegth = driver.getTitle().length();
		System.out.println("The title length of the title is"+titlelegth);
		
		String actualurl = driver.getCurrentUrl();
		
		if(actualurl.equals(url1)) {
			System.out.println("the correct usl opened");
			
		}else {
			System.out.println("The url is invalid");
		}
		
		String pageSource = driver.getPageSource();

		int pageSourceLength = pageSource.length();
		
		System.out.println("the page source length is "+ pageSourceLength);
		
		driver.close();
		
	}

}
