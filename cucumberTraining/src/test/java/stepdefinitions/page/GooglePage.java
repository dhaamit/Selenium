package stepdefinitions.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
// Every page object contains variable, methods and constructors
	
	@FindBy(name = "q")
	WebElement searchBox;
	
	@FindBy(name = "btnK")
	WebElement searchButton;
	
	@FindBy(xpath="//ul[@role='listbox']/li")
	List<WebElement> autosuggestions;
	
	public void enterSearchText (String text)
	{
		searchBox.sendKeys(text);
	}
	
	public void clickOnSearch()
	{
		searchButton.click();
	}
	
	public GooglePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void totalSuggestions() {
		System.out.println(autosuggestions.size());
	}
	
	public void printSuggestions() {
		for (WebElement webelement : autosuggestions)
		{
			System.out.println(webelement.getText());
		}
	}
	
}
