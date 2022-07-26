package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}
	
	By UserName = By.xpath("//input[@id='login1']");
	By Password = By.id("password");
	By SignIn = By.className("signinbtn");
	
	public WebElement EmailId()
	{
		return driver.findElement(UserName);
	}
	public WebElement Password()
	{
		return driver.findElement(Password);
	}
	public WebElement LoginButton()
	{
		return driver.findElement(SignIn);
	}
}
