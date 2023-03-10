Feature: as user should be able to see all furnishing menu
@soukaina

  Scenario: Verify user accessing all the furnishing menu
    Given user should hover "Home" menu
    And user click Home Furnishings
    Then user able to see furnishing:
      | Bedsheets             |
      | Curtains              |
      | Cushions & Pillows    |
      | Blankets              |
      | Bath Towels           |
      | Kitchen & Table Linen |
      | Floor Coverings       |
