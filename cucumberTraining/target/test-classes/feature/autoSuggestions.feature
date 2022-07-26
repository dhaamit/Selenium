@regression
Feature: Google Search Box
@uat @google
Scenario: Display Auto Suggestion for Synechron
Given user is on google page
When user enters "Synechron" in search box
Then user should get suggestions based on search criteria
And user will print the suggestions

@smoke @google1
Scenario: Display suggestions for Synechron Search
Given user is on google page
When user enters "Synechron" in search box
And click on search button
And user will navigate first page search results