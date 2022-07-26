import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://the-internet.herokuapp.com");
				
		driver.findElement(By.xpath("//a[@href='/nested_frames']")).click();

		
		System.out.println(driver.findElements(By.tagName("frame")).size());//2
		driver.switchTo().frame(0);
		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.xpath("//body")).getText());
	}
}