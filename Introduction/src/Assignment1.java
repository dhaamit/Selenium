import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement e = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		Assert.assertFalse(e.isSelected());
		Thread.sleep(2000);
		e.click();
		Assert.assertTrue(e.isSelected());
		Thread.sleep(2000);
		e.click();
		Assert.assertFalse(e.isSelected());
		int i;
		i = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(i);
			
	}

}
