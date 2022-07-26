import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		WebElement chkBox = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
		chkBox.click();
		String chkLabel = driver.findElement(By.xpath("//input[@id='checkBoxOption2']/parent::label")).getText().trim();
		System.out.println ("Label of CheckBox is ::" + chkLabel);
		Thread.sleep(5000);
		Select drpDown = new Select(driver.findElement(By.cssSelector("select#dropdown-class-example")));
		drpDown.selectByVisibleText(chkLabel);
		
		Assert.assertEquals(drpDown.getFirstSelectedOption().getText(), chkLabel);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(chkLabel);
		driver.findElement(By.cssSelector("input#alertbtn")).click();
		String alrtTxt = driver.switchTo().alert().getText();
		
		Assert.assertTrue(alrtTxt.contains(chkLabel));
		driver.switchTo().alert().accept();
	}
}