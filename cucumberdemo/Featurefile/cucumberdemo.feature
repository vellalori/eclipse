
Feature: Test Google Search



  Scenario: Google search scenario
    Given User is entering google url
    When User is going to search the term"Selenium"
    And User enters enter key
    Then User should be able to see the result
  

