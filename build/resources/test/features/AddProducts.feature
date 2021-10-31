@SmokeTest
Feature:  Add Products

  @AddProductEspecific
  Scenario Outline: Add Product Especific

    Given the customer is on the main page
    When enter user <user>
    And enter password <password>
    And the customer click the login button
    And the customer ADD TO CART of the product <product>
    Then it is validated that the product was added to the cart <product>

    Examples:
      | user          | password     | product  |
      | standard_user | secret_sauce | Backpack |

  @AddProductMultiply
  Scenario Outline: Add all products

    Given the customer is on the main page
    When enter user <user>
    And enter password <password>
    And the customer click the login button
    And the customer ADD TO CART of the product <product>
    Then it is validated that the product was added to the cart <product>

    Examples:
      | user          | password     | product |
      | standard_user | secret_sauce | All     |