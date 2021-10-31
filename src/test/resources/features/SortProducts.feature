@SmokeTest
Feature:  Sort Products

  @SortProductLowPrice
  Scenario Outline: Sort Products by low price

    Given the customer is on the main page
    When enter user <user>
    And enter password <password>
    And the customer click the login button
    And order products by high to low price <order>
    Then validate that is ordered by <order>

    Examples:
      | user          | password     | order               |
      | standard_user | secret_sauce | Price (high to low) |

  @SortProductHighPrice
  Scenario Outline: Sort Products by high price

    Given the customer is on the main page
    When enter user <user>
    And enter password <password>
    And the customer click the login button
    And order products by low to high price <order>
    Then validate that is ordered by <order>

    Examples:
      | user          | password     | order               |
      | standard_user | secret_sauce | Price (low to high) |