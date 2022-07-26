package stepdefinitions.test;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stepdefinition.BaseClass;
import stepdefinitions.page.GooglePage;

public class GoogleSearchTest extends BaseClass{
	
	GooglePage gp = null;
	
	@Before
	public void setup() {
		driver = getDriver();
		gp = new GooglePage(driver);
	}
	
	@Given("pom user is on google page")
	public void pom_user_is_on_google_page() {
	   driver.get("http://www.google.com");
	}
	@When("pom user enter company name")
	public void pom_user_enter_company_name() {
	   gp.enterSearchText("Synechron");
	}
	@Then("google app display autosuggestions")
	public void google_app_display_autosuggestions() {
	    gp.totalSuggestions();
	
	}
	@Then("pom user pirnt all the suggestion")
	public void pom_user_pirnt_all_the_suggestion() {
	    gp.printSuggestions();
	}
	@Then("pom use close the browser")
	public void pom_use_close_the_browser() {
	    driver.close();
	}



}
