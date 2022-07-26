Feature: Google Search Box

Background: 
Given user is on google page

Scenario: Display Auto Suggestion for IBM
When user enters "IBM" in search box
Then user should get suggestions based on search criteria
And user will print the suggestions

Scenario: Display suggestions for WIPRO
When user enters "WIPRO" in search box
And click on search button
And user will navigate first page search results

@uat
Scenario: Display suggestions for Infosys
When user enters "Infosys" in search box
And click on search button
And user will navigate first page search results

Scenario: Display suggestions for Congizant
When user enters "Cognizant" in search box
And click on search button
And user will navigate first page search results

Scenario: Display suggestions for TCS
When user enters "TCS" in search box
And click on search button
And user will navigate first page search results

Scenario: Display suggestions for Accenture
When user enters "Accenture" in search box
And click on search button
And user will navigate first page search results