Feature: Login functionality of LeafTap Application

@Smoke
Scenario Outline: Login with Credentials

Given Enter the UserName as <username>
And Enter the Password as <password>
When Click on Login Button
Then Homepage Should be Displayed

Examples:
|username|password|
|'DemoSalesManager'|'crmsfa'|




Scenario: Login with invalid Credentials

Given Enter the UserName as 'DemoSalesManager'
And Enter the Password as 'crm'
When Click on Login Button
But ErrorMessage Should be Displayed

