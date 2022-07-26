import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJetAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty ("webdriver.chrome.driver","C:\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.spicejet.com");
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		//Thread.sleep(4000);
		Select s = new Select(driver.findElement(By.xpath("//div[@id='divpaxinfo']/following-sibling::div[1]/div[2]/p[1]/select")));
		s.selectByValue("2");
		s.selectByIndex(6);
		s.selectByVisibleText("4");
		System.out.println (s.toString());
	}

}
