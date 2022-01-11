Feature: Merge Functionality of Teaftap application

Scenario Outline: Merge the LeadValues
Given User Enters the username as 'DemosalesManager'
And User enters the password as 'crmsfa'
When User Click on Login Button
Then User Click on 'CRM/SFA'
Then User Click on 'Leads'
Then User Click on 'Merge Leads'
When User Clicks on LookUp leads icon in Fromleads and windows open
Then Search by Firstname entered as<fname>
But If records not found No record found message to be dispalyed
And Windows to be closed
Then Search for another record with othername <oName>
When User Click on Find Leads
When User Clicks on LookUp leads icon in ToLeads and windows open
Then Search by Firstname entered as 'Ramkumar'
