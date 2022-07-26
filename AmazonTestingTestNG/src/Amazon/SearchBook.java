package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SearchBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String booksFeaturedNew, booksBestSeller;

		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		WebDriverWait explicitWait = new WebDriverWait(driver, 15);
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Best Sellers")));

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Book");
		driver.findElement(By.xpath("//input[@class='nav-input']")).click();

		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='acswidget-carousel__title']")));
	
		Assert.assertTrue(driver.findElement(By.xpath("//span[@class='acswidget-carousel__title']")).isDisplayed());

		booksFeaturedNew = driver.findElements(By.xpath("//span[@class='acswidget-carousel__title']")).get(0).getText();
		//System.out.println(booksFeaturedNew);

		booksBestSeller = driver.findElements(By.xpath("//span[@class='acswidget-carousel__title']")).get(1).getText();
		//System.out.println(booksBestSeller);

		if (booksFeaturedNew.contains("Featured New Release Books")
				&& booksBestSeller.contains("Best sellers in Books")) {
			System.out.println("Book Search Success.");
			Assert.assertTrue(true);
		} else {
			System.out.println("Book Search Failed.");
			Assert.assertTrue(false);
		}

	}

}
