import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver ();
	driver.get("https://www.google.com"); //hit url on browser
	String title;
	title = driver.getTitle();
	System.out.println(title); //validate if page title is correct
	System.out.println(driver.getCurrentUrl());	//validate if you are landed on correct url
	//System.out.println(driver.getPageSource()); //print the Page source
	driver.get("https://www.yahoo.com");
	System.out.println(driver.getCurrentUrl());
	driver.navigate().back(); //navigates backwards
	System.out.println(driver.getCurrentUrl());
	driver.navigate().forward(); // navigates forward
	System.out.println(driver.getCurrentUrl());
	//driver.close(); // closes current browser
	//driver.quit(); // closes all browsers opened by selenium
	}
}
