@wip_Irina
Feature: Modification cart items
  User Story: As a User I want to be able to add item into a cart and then remove/save for later  from the cart

  Scenario Outline: Verify the item in the cart can be "removed"
    Given user is on the main page
    And user types "<item>" in the search box
    And User click on item from the list "<item>"
    And User click on first top option
    And User clicks Add to cart
    And User click Cart and see "<item>"
    And User clicks Remove item and sees pop up Remove window
    When user click Remove pop up window
    Then User sees pop up window that "<item>" Successfully removed
    Examples:
      | item      |
      | iphone 12 |


  Scenario Outline: Verify the item in the cart can be  "saved for later"
    Given user is on the main page
    And user types "<item>" in the search box
    And User click on item from the list "<item>"
    And User click on first top option
    And User clicks Add to cart
    And User click Cart and see "<item>"
    And User clicks Save for later
    Then User sees save for later list with the item "<item>"
    Examples:
      | item      |
      | iphone 12 |