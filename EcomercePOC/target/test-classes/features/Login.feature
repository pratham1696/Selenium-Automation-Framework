
#Sample Feature Definition Template
@validLogintag
     
  Feature: Valid Login to Automation Exercise Website
  
  @tag1
  Scenario: User logs in with valid credentials
    Given User navigates to login page
    When User enters valid username "TestPratham@gmail.com"
    When User enters valid password "Hello@123"
    When User clicks on login button
    Then User should be logged in successfully


