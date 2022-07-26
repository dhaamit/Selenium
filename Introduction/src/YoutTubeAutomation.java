import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutTubeAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("Krishna Bhajans");//*[text()='Download']
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Krishna Bhajans");
		driver.findElement(By.xpath("//*[@type='submit']")).click();			
	}

}
