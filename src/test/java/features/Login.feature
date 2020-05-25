Feature: Application Login

Scenario: Home page default login
Given User is on netBanking login page
When User login to application with "Santu" and password "1234"
Then HomePage is shown
And cards are displayed are "true"

Scenario: Home page default login
Given User is on netBanking login page
When User login to application with "sa" and password "123 "
Then HomePage is shown
And cards are displayed are "false"