Feature: Deleting the Values From LeafTap Application

Scenario Outline: Deleting the values 

Given Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
When Click on Login Button
Given Click on CRM/SFA 
Given Click on Leads Button
And Click on Find Leads 
And Click on phonenumber tab
And Enter the phoneNumber <phnumber>
And Click on Find Leads Button
And Get the first resulting LeadId and click the firstName
And Click on Delete button 
Then Click on FindLeads and Namea and ID
And Pass the captured LeadId
When click on Find Leads button




Examples:
|phnumber|
|'97'|

