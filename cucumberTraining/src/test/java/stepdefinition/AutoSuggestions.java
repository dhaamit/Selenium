package stepdefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestions {
	
	@Before
	public void beforeScenario() {
		System.out.println("******************************************");
	}
	
	@After
	public void afterScenario() {
		driver.close();
		System.out.println("##########################################");
	}
	
	@Before("@google")
	public void beforeGoogleScenario()
	{
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}
	
	@After("@google1")
	public void afterGoogleScenario(Scenario sc)
	{
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println(sc.getName());
		System.out.println(sc.getStatus());
		System.out.println(sc.getId());
	}
	
	@BeforeStep
	public void beforeGoogleScenarioStep()
	{
		System.out.println("------------before Step ------------");
	}

	@AfterStep
	public void afterGoogleScenarioStep()
	{
		System.out.println("-----------after step --------------");
	}
	
	WebDriver driver = null;
	@Given("user is on google page")
	public void user_is_on_google_page() {
		System.out.println("User is Launching Google Page ");
		//System.setProperty("webdriver.chrome.driver","C:\\Softwares\\Drivers\\chromedriver.exe");  
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
	}

	@When("user enters {} in search box")
	public void user_enters_in_search_box(String text) {
	    System.out.println("User is entering key : " + text);
	    driver.findElement(By.name("q")).sendKeys(text);
	}
	@Then("user should get suggestions based on search criteria")
	public void user_should_get_suggestions_based_on_recent_search_criteria() {
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println("Total Number of Suggestions " + autoSuggestions.size());
	}
	@Then("user will print the suggestions")
	public void user_will_print_the_suggestions() {
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println("Total Number of Suggestions " + autoSuggestions.size());
		for (WebElement suggestion : autoSuggestions)
		{
			System.out.println(suggestion.getText());
		}
		driver.close();
	}

	@When("click on search button")
	public void click_on_search_button() {
		driver.findElement(By.name("btnK")).click();
	}
	
	@When("user will navigate first page search results")
	public void user_will_navigate_first_page_search_results() {
		List<WebElement> searchResults = driver.findElements(By.xpath("//h3"));
		for (WebElement result : searchResults)
		{
			System.out.println(result.getText());
		}
	}

	@Then("user will print all the hyperlinks")
	public void user_will_print_all_the_hyperlinks() {
		List<WebElement> searchResults = driver.findElements(By.xpath("//h3"));
		for (WebElement result : searchResults)
		{
			System.out.println(result.getText());
		}
	}
	@Then("click on first link")
	public void click_on_first_link() {
		driver.findElement(By.xpath("(//a[h3][1])")).click();
	}
}
