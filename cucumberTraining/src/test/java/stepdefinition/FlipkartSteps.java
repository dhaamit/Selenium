package stepdefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartSteps extends BaseClass {

	//WebDriver driver = null;
	
	@Given("user is on flipkart page")
	public void user_is_on_flipkart_page() {
		System.out.println("User Registration page launching");
	//	WebDriverManager.chromedriver().setup();
		driver = getDriver();
		driver.get("https://www.flipkart.com/");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")))).click();
	}
	@When("user perfom mouse movement on menu and print the result")
	public void user_perfom_mouse_movement_on_menu_and_print_the_result(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	   driver.findElement(By.xpath("//div[text()='Beauty,Toys & more']")).click();
	   Thread.sleep(5000);
	   WebElement tvTab = driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
	   WebElement menTab = driver.findElement(By.xpath("//span[text()='Men']"));
	   WebElement womenTab = driver.findElement(By.xpath("//span[text()='Women']"));
	   WebElement bkTab = driver.findElement(By.xpath("//span[text()='Baby & Kids']"));
	   
	   moveToElementAndPrint(driver, tvTab);
	   moveToElementAndPrint(driver, menTab);
	   moveToElementAndPrint(driver, womenTab);
	   moveToElementAndPrint(driver, bkTab);
	   
	   
	   
	}
	
	public void moveToElementAndPrint(WebDriver driver, WebElement ele) throws InterruptedException
	{
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(5000);
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='_1QrT3s']//a"));
		for (WebElement link : links) {
			System.out.println(link.getText());
		}
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
	}

}
