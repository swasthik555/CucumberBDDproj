Feature: Register for an Account in TutorialsNinja Application

@register
Scenario: Register for the application by providing valid details
Given I navigate to Register page
When I enter the below deatils
	|FirstName|Arun                      |
	|LastName |Motoori                   |
	|Email    |spacestudio555@gmail.com  |
	|Telephone|1234567788                |
	|Password |Second@123                |
And I select the privacy policy option
And I click on continue button
Then User should be able to successfully register