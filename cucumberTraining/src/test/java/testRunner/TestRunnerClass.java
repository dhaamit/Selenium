package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/feature/parallelExecution.feature", 
				glue = {"stepdefinition" }, 
				dryRun = false, 
				monochrome = true, 
//				tags = "@pom",
//				tags = "@google1",
//				tags = "@uat", 
//				tags = "@uat and @regression", 
//				tags = "@uat or @regression", 
//				tags = "@uat and not @regression", 						
				plugin = { "pretty",
				"junit:target/JUnitReports/reports.xml", 
				"json:target/JsonReports/reports.json",
				"html:target/HTMLReports/reports.html" })

public class TestRunnerClass {

}
