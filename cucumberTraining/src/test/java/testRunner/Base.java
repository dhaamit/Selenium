package testRunner;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static void main(String[] args) {
		WebDriver driver = null;
		System.out.println("User is Launching Registration Page ");
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Drivers\\chromedriver.exe");
		// WebDriverManager.chromedriver().browserVersion("99.0").setup();
		driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
	}
}
