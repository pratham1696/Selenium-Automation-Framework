Feature: Search for a product, add to cart, login, and remove it


@tag2
  Scenario: Search for a product, add it to cart, login, and remove it
    Given I open the application
    When I navigate to the Products page ecommerce
    Then User should be navigated to 'ALL PRODUCTS' page successfully    
    Then I search for "Tshirt"
    When I add the first product with ID "28" to the cart
    Then I continue shopping ecommerce
    When I view the cart ecommerce
    Then I navigate to the login page
    When I enter email "TestPratham@gmail.com"
    Then I enter password "Hello@123"
    When I click the login button
    Then I view the cart again
    When I remove the All product from the cart
    Then 'Cart is empty!' should be visible
    

