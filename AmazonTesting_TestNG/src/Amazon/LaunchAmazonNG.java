package Amazon;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LaunchAmazonNG {
	
	@Test
	public void launchBrowser() {
		String homePageText;
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		WebDriverWait explicitWait = new WebDriverWait(driver, 10);
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Handmade home office décor']")));
	
		homePageText = driver.findElement(By.xpath("//*[text()='Handmade home office décor']")).getText();
	
		if (homePageText.contains("Handmade home office")) {
			System.out.println("'www.amazon.com' is successfully Launched");
			AssertJUnit.assertTrue(true);
		} else {
			System.out.println("'www.amazon.com' failed to Launch");
			AssertJUnit.assertTrue(false);
		}
	}
}
