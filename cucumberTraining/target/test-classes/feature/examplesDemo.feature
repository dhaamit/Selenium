Feature: Multiple Search in Google

Scenario Outline: Google Multiple Search
Given user is on google page
When user enters <company> in search box
Then user should get suggestions based on search criteria
And user will print the suggestions

Examples:
|company	|
|IBM		|
|WIPRO 		|
|Synechron 	|
|Congizant	|