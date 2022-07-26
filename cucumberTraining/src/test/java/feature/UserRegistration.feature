Feature: User Registration

Scenario: Validate Formy Form with valid inputs
Given User is on Registration page
When user enter first Name
When user enter Last Name
When user enter job title
When user click on Submit
Then user validate success message