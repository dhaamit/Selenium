package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.LoginPage;

public class LoginToRediff {

	@Test
	public void login() {

		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		LoginPage lp = new LoginPage(driver);
		lp.EmailId().sendKeys("test");
		lp.Password().sendKeys("test");
		lp.LoginButton().click();
	}
}
