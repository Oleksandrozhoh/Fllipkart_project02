Feature: Add to cart functionality
  Agile story 12: As a user I should be able to see a product in teh cart when I add it to the cart

  Scenario: When user adds a product to the cart it appears in the cart
    Given user is on the main page
    When user adds a product to the cart
    Then user sees the product in the cart

