Feature: New user creating a account
In order to user fill out all the required information

Scenario: positive test
Given user visiting oscomerrece homepage 
When user click on create on account link
And click on the radio button
And user enter first_name,last_name,DOB,E-mail address
And user enter company name
And user enter street address,postcode,city,state/province
And user select country from dropdown
And user enter telephone number,fax number and select check box
And user enter password, password confirmation,click continue
Then user receving confirmation message and cloe the browser





