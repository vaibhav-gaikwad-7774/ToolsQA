package AutomationSelenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;

public class captureScreenshot {
    public static void main(String[] args) {
        WebDriver driver = new SafariDriver();

        try {
            // 1️⃣ Open Google
            driver.manage().window().maximize();
            driver.get("https://www.google.com");
            System.out.println("✅ Opened: " + driver.getTitle());

            // 2️⃣ Simple test: check if search box is displayed
            WebElement searchBox = driver.findElement(By.name("q"));
            if (searchBox.isDisplayed()) {
                System.out.println("✅ Test Passed: Search box is visible.");
            } else {
                System.out.println("❌ Test Failed: Search box not found!");
                takeScreenshot(driver, "SearchBoxNotFound");
            }

            // 3️⃣ Another test: verify incorrect title (will fail)
            String actualTitle = driver.getTitle();
            String expectedTitle = "Google Search"; // intentionally incorrect
            if (!actualTitle.equals(expectedTitle)) {
                System.out.println("❌ Test Failed: Title mismatch!");
                takeScreenshot(driver, "TitleMismatch");
            }

        } catch (Exception e) {
            System.out.println("⚠️ Exception occurred: " + e.getMessage());
            takeScreenshot(driver, "Exception_Failure");
        } finally {
            driver.quit();
        }
    }

    // 📸 Screenshot Utility Method
    public static void takeScreenshot(WebDriver driver, String fileName) {
        try {
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File dest = new File(System.getProperty("user.dir") + "/screenshots/" + fileName + "_" + timestamp + ".png");
            dest.getParentFile().mkdirs(); // Create folder if not exists
            FileHandler.copy(src, dest);
            System.out.println("📸 Screenshot saved: " + dest.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("❌ Failed to save screenshot: " + e.getMessage());
        }
    }
}
