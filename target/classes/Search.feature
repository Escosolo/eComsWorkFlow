@Search
Feature: Search for items
  Background:
    Given I go to the Home Page
    Scenario: As a user I want to search for an item
      When I search for "shirt" in the search input box
      Then I see "1 result has been found." product listing page
      When I click on the first item on page
      Then I verify search description "Faded Short Sleeve T-shirts" on the product page
      And I also see option to select sizes
      #And I see search description "Faded Short Sleeve "T-shirts" price "$16.51" and item "In stock"