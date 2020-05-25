Feature: Login Application

Scenario: Positive test case for logging into application
Given Initialize the Chrome Browser
And Navigate to "https://qa-horizon360.toro.com/login" page
When User enters "jewargisantoshi+test3@gmail.com" and "Santu@123" and logs in
And Verify if user is successfully logged in
Then Go to Estimates 
And Add New Estimate
And close browsers