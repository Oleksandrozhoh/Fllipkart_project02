Feature: Removing and saving for later item in the cart
  User Story: As a User I want to be able to add item into a cart and then remove/save for later  from the cart

  Scenario: Verify the item in the cart can be "removed"
    Given User on the Home page
    And User search for "item" ank click 'Search'
    And User click on first from the list "item"
    And User click 'Add to cart'
    And User click 'Card' and see "item"
    And User clicks 'Remove' "Item' and sees pop up 'Remove' window
    When user click 'Remove'
    Then User sees empty cart image and message "Missing Cart items?"

  Scenario: Verify the item in the cart can be  "saved for later"
    Given User on the Home page
    And User search for "item" ank click 'Search'
    And User click on first from the list "item"
    And User click 'Add to cart'
    And User click 'Card' and see "item"
    And User clicks 'Save for later'
    Then ser sees empty cart image and message "Missing Cart items?"