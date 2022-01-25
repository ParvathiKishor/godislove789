Feature: Application Login

@Regression
Scenario: Home page default login.
Given User is on netbanking landing page.
When User login into app with "maya" and password "Apple@123"
Then Home page is popullated
And Cards displayed are "true"

@Smoke
Scenario: Home page default login.
Given User is on netbanking landing page.
When User login into app with "devi" and password "Apple@246"
Then Home page is popullated
And Cards displayed are "true"

@Smoke
Scenario: Home page default login.
Given User is on netbanking landing page.
When User login into app with "monu" and password "Apple@2566"
Then Home page is popullated
And Cards displayed are "false"

@Regression
Scenario: Home page default login.
Given User is on netbanking landing page.
When User login into app with "devu" and password "Apple@123"
Then Home page is popullated
And Cards displayed are "false"