import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingLinksOnPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		int iAllPageLinks = driver.findElements(By.tagName("a")).size();
		System.out.println ("Print all page links size : "+iAllPageLinks);
		
		WebElement footerDriver = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		int iFooterLinks = footerDriver.findElements(By.tagName("a")).size();
		System.out.println ("Print all footer links size : "+iFooterLinks);
		
		WebElement footerColumnDriver =footerDriver.findElement(By.tagName("ul"));
		//WebElement<List> footerColumnDriverLinks = <List>footerColumnDriver.findElements(By.tagName("a"));
		int iFooterColumnLinks = footerColumnDriver.findElements(By.tagName("a")).size();
		System.out.println ("Print all footer Column links size : "+iFooterColumnLinks);
		String keySeq = Keys.chord(Keys.CONTROL,Keys.ENTER); 
		
		for (int i=0;i<iFooterColumnLinks;i++)
		{
			footerColumnDriver.findElements(By.tagName("a")).get(i).sendKeys(keySeq);
			Thread.sleep(2000);
		}
		Set<String> abc=driver.getWindowHandles();//4
		Iterator<String> it=abc.iterator();
		
		while(it.hasNext())
		{
			
		   driver.switchTo().window(it.next());
		   System.out.println(driver.getTitle());
		
		}	
		}

}
