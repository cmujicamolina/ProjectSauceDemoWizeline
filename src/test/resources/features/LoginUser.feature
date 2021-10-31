@SmokeTest
Feature:  User login

  @ValidLogin
  Scenario Outline: Valid customer login

    Given the customer is on the main page
    When enter user <user>
    And enter password <password>
    And the customer click the login button
    Then page shows product title

    Examples:
      | user          | password     |
      | standard_user | secret_sauce |

  @InValidLogin
  Scenario Outline: Invalid customer login

    Given the customer is on the main page
    When enter user <user>
    And enter password <password>
    And the customer click the login button
    Then page shows connection error

    Examples:
      | user          | password     |
      | locked_out_user | secret_sauce |