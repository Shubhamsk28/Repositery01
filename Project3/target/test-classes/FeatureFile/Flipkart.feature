Feature: Testing Functionality of Flipkart Application

@Test1
Scenario: Verification of Flipkart Login Application
Given user is able to enter the username
And user is able to enter the password 
Then user is click on login page

@Test2
Scenario: Verification of Flipkart Home page Application
Given user is able to enter the username and password
#Given user is able to enter"<username>" and "<password>"
When user click on login page
And user is on home page and verify the title 
And user click on To offers 
Then user is on offeers page



#Examples:
 #| username   | password  |
 #| 7090214343 | Shubh@m28 |