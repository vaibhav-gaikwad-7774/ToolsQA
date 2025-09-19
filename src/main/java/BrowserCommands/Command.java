package BrowserCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Command {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new SafariDriver();
		driver.get("https://www.toolsqa.com/selenium-webdriver/selenium-webdriver-browser-commands/");
		String title = driver.getTitle();
		
		String  pagesrc = driver.getPageSource();
		System.out.println(pagesrc);
		
		System.out.println("The title of the webpage: "+ title);

		driver.close();
		
		

}}
