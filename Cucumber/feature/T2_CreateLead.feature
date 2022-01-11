Feature: Create Lead of Leaftaps Application


Scenario Outline: Creating Lead Details
Given Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
When click on Login Button
Then Homepage Click
Given click Create Lead button
Given Enter the company name as <companyname>
And Enter first name as <firstname>
And Enter last name as <lastname>
When Click Submit Button



Examples: 
|companyname|firstname|lastname|
|'Nous TECHNOLOGIES'|'Sangeetha'|'RajKumar'|
|'TestLeaf'|'Princilla'|'H'|
