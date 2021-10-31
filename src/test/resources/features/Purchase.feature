@SmokeTest
Feature:  Add Products

  @PurchaseSpecific
  Scenario Outline: Purchase Specific

    Given the customer is on the main page
    When enter user <user>
    And enter password <password>
    And the customer click the login button
    And the customer ADD TO CART of the product <product>
    And the customer clicks the buttom <buttom>
    And the customer clicks the buttom <buttom2>
    And the customer fill form <fisrtName>, <lastName>, <postalCode>
    And the customer clicks the buttom <buttom3>
    And the customer clicks the buttom <buttom4>
    Then it is validated that the customer completed the purchase <titlePurchase>

    Examples:
      | user          | password     | product  | buttom | buttom2  | buttom3  | fisrtName | lastName | postalCode | buttom4 | titlePurchase |
      | standard_user | secret_sauce | Backpack | cart   | CheckOut | Continue | Christian | Mujica   | 051        | Finish  | THANK YOU     |

  @PurchaseMultiply
  Scenario Outline: Purchase all products

    Given the customer is on the main page
    When enter user <user>
    And enter password <password>
    And the customer click the login button
    And the customer ADD TO CART of the product <product>
    And the customer clicks the buttom <buttom>
    And the customer clicks the buttom <buttom2>
    And the customer fill form <fisrtName>, <lastName>, <postalCode>
    And the customer clicks the buttom <buttom3>
    And the customer clicks the buttom <buttom4>
    Then it is validated that the customer completed the purchase <titlePurchase>

    Examples:
      | user          | password     | product | buttom | buttom2  | buttom3  | fisrtName | lastName | postalCode | buttom4 | titlePurchase |
      | standard_user | secret_sauce | ALL     | cart   | CheckOut | Continue | Christian | Mujica   | 051        | Finish  | THANK YOU     |
