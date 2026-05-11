Feature: Add products to cart and place an order
@tag3
  Scenario: Add products, checkout, and place an order
    Given I open the applications ecommerce
    When I navigate to the Products page
    Then I add the product with ID "1" to the cart
    Then I continue shopping
    Then I add the product with ID "2" to the cart
    When I view the cart
   	Then I verify both products are added to the cart
    Then I verify their prices, quantity, and total price
   
    
    
    
