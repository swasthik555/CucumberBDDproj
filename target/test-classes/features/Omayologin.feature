Feature: Login to the omayo application

#This feature file is all about creating the scenarios for automating the login functionality of omayo application
@login
Scenario Outline: User should only be able to login with valid credentials
Given I navigate to application URL
When I enter Username as "<someusername>" and Password as "<somepassword>" into the field
And I click on Login button
Then User should be able to login based on "<expected>" login status

Examples:
|someusername   |somepassword	|expected	| 
|arun       		|1234         |failure	|
|SeleniumByArun	|Test143$     |success	|
|test						|4321         |failure	|


