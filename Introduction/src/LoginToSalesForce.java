import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToSalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.salesforce.com");
		//below is example of bad xpath - long xpath starting with "/html.." is not reliable
		driver.findElement(By.xpath("/html/body/header/div[2]/div[2]/div/div/nav/div[1]/div/div[3]/div[1]/div[6]/div/a")).click(); 
		//beloe is example of good xpath
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("pwd");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		System.out.println (driver.findElement(By.cssSelector("div#error.loginError")).getText());
	}
}
