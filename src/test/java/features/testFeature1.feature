
Feature: Application Login
 
 
Background: 
Given Setup entries in the DB
When Launch the browser from the config variable
And hit the home page url of banking site

 
@RegressionTest
Scenario: F1 Admin page default login

Given User is on Net Banking Landing Page
When User login into application with username "admin" and password "pass123"
Then Home page is displayed
And Cards are displayed

@SmokeTest @RegressionTest
Scenario: F1 User page default login

Given User is on Net Banking Landing Page
When User login into application with username "user1" and password 123
Then Home page is displayed
And Cards are displayed


@FunctionalTest
Scenario Outline: F1 Mortgage User page default login

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
Scenario: F1 Admin page default Signup

Given User is on Practice Landing Page
When User sign into application 
| shveta |
| gawas |
| gshveta7@gmail.com |
| 434641159 |
Then Home page is displayed
And Cards are displayed






