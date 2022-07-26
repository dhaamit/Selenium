@pom
Feature: Google Search

Scenario: Search feature of google using POM
Given pom user is on google page
When pom user enter company name
Then google app display autosuggestions
Then pom user pirnt all the suggestion
Then pom use close the browser