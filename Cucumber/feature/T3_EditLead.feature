Feature: Edit the TeafTap Application

@Functional
Scenario Outline: Editing the values 
Given Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
When Click on Login Button
Given Click on 'CRM/SFA' Button
Given Click on 'Leads' Button
And  Click on 'Find Leads' Button
And Click on NameandID tab
Then Enter the name as <fName>
When Click on FindLeads button
Given Click on firstResulting name 
Then Get the Title of page
And Click on Edit button
Then Clear the companyname
And Enter the NewCompanyName to be added <cName>
When Click on Submit Button
And Verify the updated companyName <cName>

Examples:

|fName|cName|
|'Sangeetha'|'AspireSystems'|

 
