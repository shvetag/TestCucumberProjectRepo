
Feature: Application Login
 
 
Background: 
When Launch the browser from the config variable
And hit the home page url of banking site

 
@RegressionTest @NetBanking
Scenario: F2 Admin login

Given User is on Net Banking Landing Page
When User login into application with username "admin" and password "pass123"
Then Home page is displayed
And Cards are displayed

@SmokeTest @RegressionTest @NetBanking
Scenario: F2 Net Banking User login

Given User is on Net Banking Landing Page
When User login into application with username "user1" and password 123
Then Home page is displayed
And Cards are displayed


@FunctionalTest @MortgageBanking
Scenario Outline: F2 Mortgage User login

Given User is on Net Banking Landing Page
When User login into application with username "<Username>" and password "<Password>"
Then Home page is displayed
And Cards are displayed

Examples:

| Username | Password |
| debituser | 1.5 |
| stockuser | passStock |
| credituser | passCredit |


@SmokeTest
Scenario: F2 Admin Signup

Given User is on Practice Landing Page
When User sign into application 
| shveta |
| gawas |
| gshveta7@gmail.com |
| 434641159 |
Then Home page is displayed
And Cards are displayed






