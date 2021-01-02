Feature: Login Page Feature


Scenario: Login Page Title
Given user is on Login Page
When user gets the title of the page
Then page title should be "Login - My Store"

Scenario: Forgot Password Link
Given user is on login page
Then forgot your password link should be displayed

Scenario: Login with correct credentials
Given user is on login page
When user enters username "qatest0022@gmail.com"
And user enters password "Abc123!@#"
And user clicks on login button
Then user gets the title of the home page
And page title should be "My account - My Store"