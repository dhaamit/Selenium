Feature: Google Search Box

Scenario: Display Auto Suggestion for IBM
Given user is on google page
When user enters "IBM" in search box
Then user should get suggestions based on recent search criteria
And user will print the suggestions

Scenario: Display suggestions for WIPRO
Given user is on google page
When user enters "WIPRO" in search box
And click on search button
And user will navigate first page search results

@uat
Scenario: Display suggestions for Infosys
Given user is on google page
When user enters "Infosys" in search box
And click on search button
And user will navigate first page search results