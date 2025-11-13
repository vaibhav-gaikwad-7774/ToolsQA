package AutomationSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class Checkbox {
	public static void main(String[] args) {
		WebDriver driver = new SafariDriver();
		

		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/automation-practice-form");
	
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")).click();
		
		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]"));
		if(checkbox.isSelected()) {
			System.out.println("The checkbox will be checked successfully");
		}else {
			System.out.println("The checkbox will be not checked successfully");
		}
		
	
		
		driver.close();
	}
	
	

}
