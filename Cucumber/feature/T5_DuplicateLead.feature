Feature: Duplicate Values in LeafTap Application

Scenario Outline: Deleting the Duplicate Values
Given Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
When Click on Login Button
And Click on 'CRM/SFA' Button
And Click on 'Leads' Button
And Click on 'Find Leads' Button
And Click on phonenumber tab
And Enter the phone Number <phnumber>
And Click on Find Lead Button
And  Get the first resulting Result
When Click on 'Duplicate Lead' Button
And  Click on submit button

Examples:
|phnumber|
|'97'|
