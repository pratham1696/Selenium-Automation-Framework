Feature: Subscription in Cart Page
 
  Scenario: User subscribes from the cart page
    Given User is on the cart page
    When User scrolls to the subscription section
    And User enters the email "testdemo@gmail.com"
    And User clicks on the subscribe button
    Then Subscription confirmation message should be displayed