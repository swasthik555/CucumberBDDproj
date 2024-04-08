Feature: Life of a software tester and his boss

@Smoke @All
Scenario Outline: I am a good software tester and my boss loves me
Given I am a "good" software tester
When I go to work
And I "involves" with it
Then My boss "loves" me

Scenario: I am a average software tester and my boss forgives me
Given I am a "average" software tester
When I go to work
And I "work" with it
Then My boss "forgives" me

@All @login
Scenario: I am a bad software tester and my boss hates me
Given I am a "bad" software tester
When I go to work
And I "mess" with it
Then My boss "hates" me

