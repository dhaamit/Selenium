Feature: Register multiple users
# is used as comment
Scenario: user registration in Formy application
Given user launch formy application
When user enter all details and validate success msg
	|	firstname	| 	lastname	|	jobtitle	|	education	|	sex	|	yoe	|
	|	amit		|	HB			|	Trainee		|	Grad School	|	Male|	10+	|
	|	amit1		|	HB2			|	Trainee2	|	Grad School	|	Male|	2-4	|
	|	amit2		|	HB1			|	Trainee1	|	Grad School	|	Male|	5-9	|
And close the browser