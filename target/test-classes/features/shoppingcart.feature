Feature: shoppingcart function
  as a user, I should be add items, delete items and checkout items at shopping cart

  Scenario: add item to the shoppingcart
    And click the first item at homep page
    And click add to the cart button at product page
    And verify that system says Product added
    And click the cart button
    Then verify that item is displayed at cart page


  Scenario: delete item from the shoppingcart
    When click the first item at homep page
    And  click add to the cart button at product page
    And verify that system says Product added
    And  click the cart button
    And click delete button for delete
    Then verify that cart is empty



