Feature: Search functionality
  User story:
  Search for "wooden spoon" and click on the "wooden spoon stand"
  option from the drop down,
  then verify the header:
  "Showing ... results for "wooden spoon"

  Scenario: Verify search functionality
    Given user is on the main page
    When user types "wooden spoon" in the search box
    Then user should see "wooden spoon stand" in the suggested options
    When user selects "wooden spoon stand" from the suggested options
    Then user should be launched to the page that contains "wooden spoon stand" in title



