import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UseKeyboardKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		
		WebElement element = driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest')]"));
		//Thread.sleep(2000);
		element.clear();
		//Thread.sleep(2000);
		element.sendKeys("Mum");
		Thread.sleep(2000);
		element.sendKeys(Keys.ARROW_DOWN);	
		element.sendKeys(Keys.ENTER);
		
		System.out.println (driver.findElement(By.xpath("//input[@id='fromCity']")).getText());
		
		Assert.assertEquals(driver.findElement(By.xpath("//input[@id='fromCity']")).getText(), "Mumbai");
		
	}

}
