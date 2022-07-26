import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Test Case
1. open rediff site in chrome broswer "https://www.rediff.com"
2. print todays rate for sensex and nifty
3. search shoes in shopping
4. print the rate for first 3 shoes in list
5. CLick on books link
6. print the title of book page.*/

public class AutomateRediffPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com");
		//System.out.println(driver.findElement(By.cssSelector("span[id*='bse']")).getText());
		//System.out.println(driver.findElement(By.xpath("//div[@class='div_container']/div[1]/a/span[2]")).getText());
		driver.findElement(By.cssSelector("input[id='srchword']")).sendKeys("shoes");
		driver.findElement(By.cssSelector("input[type*='sub']")).click();
		System.out.println(driver.getTitle());
		//System.out.println(driver.findElement(By.xpath("//[contains(itemprop,'price')]")).getText());
		driver.findElement(By.xpath("//span[contains(@class,'hmbooks')]")).click();
	}

}
