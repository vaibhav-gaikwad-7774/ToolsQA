package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {
	public static void main(String[] args) {
		WebDriver driver = new SafariDriver();
		

		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
	
		WebElement dropmenu = driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[2]/div"));
		try {
			dropmenu.click();
			System.out.println("The dropdown selected successfully");
		}finally{
			System.out.println("not the correct one");
		}
		
		
		
		
		
//		
//		Select dropdn = new Select(driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]")));
//		
//		dropdn.selectByIndex(2);
//		
//		dropdn.getOptions();
		
		
		driver.close();
	
	
	
	}
}

