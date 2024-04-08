
Feature: Login into TutorialsNinja Application

Scenario: Login to the Application with valid credentials
Given I navigated to login page of the Application
When I enter emailAddress as "spacestudio555@gmail.com" and password as "8971059266" into the fields
And I click on the Login button
Then The user should be able to successfully login