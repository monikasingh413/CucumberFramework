@loginAll
Feature: login functionality

Background:
Given user should be on login page


@test
Scenario: valid login
When user enters valid userid and password
And click on login button
Then user should be navigated to home page
And close the browser


#Scenario: Invalid login
#When user enters userid as "admin" and password as "12345"
#And click on login button
#Then error message should be displayed
#And close the browser

 @sanity @smoke
Scenario Outline: Parametrized Invalid login
When user enters userid as "<userid>" and password as "<password>"
And click on login button
Then error message should be displayed
And close the browser
Examples:
|userid | password|
|ad1    | pwd1    |
|ad2    | pwd2    |
|ad3    | pwd3    |
|ad4    | pwd4    |


@only @sanity @smoke
Scenario: Step Parametrized Invalid login
When user enters userid as "<userid>" and password as "<password>" and click on login button
|userid | password|
|admin|admin|
Then user should be navigated to home page
And close the browser

