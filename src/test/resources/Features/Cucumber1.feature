Feature: To verify the login functionality.
Scenario: Checking the functionality for valid data.
Given User is able to open the webpage "https://www.saucedemo.com/"
And user passes the username as '<username>'
And user enters the password as '<password>'
When Click on the Login button
Then User is navigated to the product backlog page.
Examples:
|username|password|
|standard_user|secret_sauce|
|problem_user|secret_sauce|