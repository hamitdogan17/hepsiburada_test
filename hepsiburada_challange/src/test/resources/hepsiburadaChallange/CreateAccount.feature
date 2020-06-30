Feature: Create Account
  @create_account_give_an_order_then_check_the_order
  Scenario: Create Account and Order
    Given Navigate to to HomePage
    And Click Sign In Button
    And Enter Email address to create an Account
    And Create New Account
    Then Is Login successfull
    When Click Dresses Button
    And Click Summer Dresses button
    And Select any item on Summer Dresses Page
    Then Check page with item name "Printed Summer Dress"
    When Click Add to cart button on Summer Dress Page
    And Enter summer to search textbox
    And Click search button
    And Click second item on Search Page
    And Click Add to cart button on Search Page
    And Click Cart button
    And Click Proceed to Checkout button on Summary page
    And Click Proceed to Checkout button on Address page
    And Click Checkbox on Shipping page
    And Click Proceed to Checkout button on Shipping page
    And Select payment method
    And Click Confirm button
    Then Check the order message is "Your order on My Store is complete."
    And Check the order from Order History And Details Page