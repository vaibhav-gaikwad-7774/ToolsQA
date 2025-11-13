package AutomationSelenium;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;


public class CaptureScreeshot {
	public static void main(String[] args) {
		WebDriver driver = new SafariDriver();
		
		
		
		
		try {
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			
			String actualTile = driver.getTitle();
			System.out.println(actualTile);
		
			String expectedTitle = "Google more";
			
			if(actualTile.equals(expectedTitle)) {
				System.out.println("Test passed ");
			}else {
				System.out.println("test failed");
				File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				File dest = new File("failed_test.png");
			
				FileHandler.copy(src, dest);
				System.out.println("The Screenshot Saved as "+ dest.getAbsolutePath());
			}
			
		
			
		}catch(Exception e) {
			System.out.println("Error occured with the exception which is "+ e.getMessage());
			
		}finally {
			driver.close();
		}
	}

}
