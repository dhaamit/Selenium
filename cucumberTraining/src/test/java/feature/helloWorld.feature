Feature: Verify Login 

Scenario: Validate login success on Valid Credentials

Given User is on login page
When user enter valid username and password
And click on login button
Then user is navigated to dashboard page

Scenario: Validate login failure on In-valid Credentials
Given User is on login page
When user enter invalid username or password
And click on login button
Then user will stay on login page with error message displayed