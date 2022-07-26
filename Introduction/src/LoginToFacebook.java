import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		/*driver.findElement(By.id("email")).sendKeys("amit");
		driver.findElement(By.name("pass")).sendKeys("pass");
		driver.findElement(By.linkText("Forgot account?")).click();
		driver.findElement(By.className("inputtext")).sendKeys("1234s");*/
		
		driver.findElement(By.cssSelector("#email")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("pwd");
		driver.findElement(By.cssSelector("#u_0_2")).click();
	}
}
