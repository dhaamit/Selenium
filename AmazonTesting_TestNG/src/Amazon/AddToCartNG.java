package Amazon;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AddToCartNG {

	@Test
	public void addToCart() {
		// TODO Auto-generated method stub
		String addedToCart;

		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		WebDriverWait explicitWait = new WebDriverWait(driver, 15);
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Best Sellers")));

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Book");
		driver.findElement(By.xpath("//input[@class='nav-input']")).click();

		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='acswidget-carousel__title']")));
	
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//span[@class='acswidget-carousel__title']")).isDisplayed());

		WebElement booksFeaturedNewSpan = driver.findElements(By.xpath("//div[contains(@class,'acswidget')]")).get(3);

		//WebElement booksBestSellerSpan = driver.findElements(By.xpath("//div[contains(@class,'acswidget')]")).get(5);
		
		booksFeaturedNewSpan.findElement(By.xpath("//li[contains(@class,'a-carousel-card')]")).click();
		
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='a-button-text'] //span[contains(text(),'Hardcover')]")));
		
		driver.findElement(By.xpath("//a[@class='a-button-text'] //span[contains(text(),'Hardcover')]")).click();	

		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='add-to-cart-button']")));
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		addedToCart = driver.findElement(By.xpath("//h1[contains(@class,'a-size-medium')]")).getText();
		System.out.println (addedToCart);
		AssertJUnit.assertEquals(addedToCart, "Added to Cart");
	}
}
