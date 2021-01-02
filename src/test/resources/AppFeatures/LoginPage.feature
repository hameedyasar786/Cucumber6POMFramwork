Feature: Login Page Feature


Scenario: Login Page Title
Given user is on Login Page
When user gets the title of the page
Then page title should be "Login - My Store"

Scenario: Forgot Password Link
Given user is on Login Page
Then forgot your password link should be displayed

Scenario: Login with correct credentials
Given user is on Login Page
When user enters username "hc0712104@gmail.com"
And user enters password "Abc123!@#"
And user clicks on login button
Then user gets the title of the page
And page title should be "My account - My Store"