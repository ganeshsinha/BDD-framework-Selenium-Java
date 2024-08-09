Feature: Google Search

  Scenario Outline: Search for multiple keywords on Google
    Given User is on Google search page
    When User enters "<keyword>" in the search box
    Then User should see search results for "<keyword>"

  Examples:
    | keyword   |
    | Selenium  |
    | Cucumber  |
    | TestNG    |
