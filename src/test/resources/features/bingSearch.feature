@bing
Feature: Bing search functionality
  Agile story: As a user when I am on Bing search page
  I should be able to search anything and see relevant results

  Background:
    Given User is on the Bing search page

  Scenario: Search page default title verification
    Then user should see title is Bing


  Scenario Outline: Search result title verification
    When User search for "<search_word>"
    Then User should see "<search_word>" in the title

    Examples:
      | search_word |
      | cat         |
      | dog         |
      | apple       |

