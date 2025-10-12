package Polymorphism;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestPolymorphism {
	public static void main(String[] args) {
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
		driver = new SafariDriver(); // Same reference, different object
        driver.get("https://www.google.com");
        String title1 = driver.getTitle();
		System.out.println(title1);
		driver.close();
		
	}

}
