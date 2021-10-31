$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Purchase.feature");
formatter.feature({
  "line": 2,
  "name": "Add Products",
  "description": "",
  "id": "add-products",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 24,
  "name": "Purchase all products",
  "description": "",
  "id": "add-products;purchase-all-products",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 23,
      "name": "@PurchaseMultiply"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "the customer is on the main page",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "enter user \u003cuser\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "enter password \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "the customer click the login button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "the customer ADD TO CART of the product \u003cproduct\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "the customer clicks the buttom \u003cbuttom\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "the customer clicks the buttom \u003cbuttom2\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "the customer fill form \u003cfisrtName\u003e, \u003clastName\u003e, \u003cpostalCode\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "the customer clicks the buttom \u003cbuttom3\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "the customer clicks the buttom \u003cbuttom4\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "it is validated that the customer completed the purchase \u003ctitlePurchase\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 38,
  "name": "",
  "description": "",
  "id": "add-products;purchase-all-products;",
  "rows": [
    {
      "cells": [
        "user",
        "password",
        "product",
        "buttom",
        "buttom2",
        "buttom3",
        "fisrtName",
        "lastName",
        "postalCode",
        "buttom4",
        "titlePurchase"
      ],
      "line": 39,
      "id": "add-products;purchase-all-products;;1"
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce",
        "ALL",
        "cart",
        "CheckOut",
        "Continue",
        "Christian",
        "Mujica",
        "051",
        "Finish",
        "THANK YOU"
      ],
      "line": 40,
      "id": "add-products;purchase-all-products;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 40,
  "name": "Purchase all products",
  "description": "",
  "id": "add-products;purchase-all-products;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 23,
      "name": "@PurchaseMultiply"
    },
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "the customer is on the main page",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "enter user standard_user",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "enter password secret_sauce",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "the customer click the login button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "the customer ADD TO CART of the product ALL",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "the customer clicks the buttom cart",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "the customer clicks the buttom CheckOut",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "the customer fill form Christian, Mujica, 051",
  "matchedColumns": [
    6,
    7,
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "the customer clicks the buttom Continue",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "the customer clicks the buttom Finish",
  "matchedColumns": [
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "it is validated that the customer completed the purchase THANK YOU",
  "matchedColumns": [
    10
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginUserSteps.elClienteSeEncuentraEnLaPaginaDeBusqueda()"
});
formatter.result({
  "duration": 6992422667,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 11
    }
  ],
  "location": "LoginUserSteps.enterUserUser(String)"
});
formatter.result({
  "duration": 573664584,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 15
    }
  ],
  "location": "LoginUserSteps.enterPasswordPassword(String)"
});
formatter.result({
  "duration": 336454959,
  "status": "passed"
});
formatter.match({
  "location": "LoginUserSteps.theCustomerClickTheLoginButton()"
});
formatter.result({
  "duration": 1274968667,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ALL",
      "offset": 40
    }
  ],
  "location": "BotonSteps.theCustomerADDTOCARTOfTheProductProduct(String)"
});
formatter.result({
  "duration": 25094630834,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cart",
      "offset": 31
    }
  ],
  "location": "BotonSteps.theCustomerClicksTheButtomButtom(String)"
});
formatter.result({
  "duration": 228911541,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CheckOut",
      "offset": 31
    }
  ],
  "location": "BotonSteps.theCustomerClicksTheButtomButtom(String)"
});
formatter.result({
  "duration": 101837916,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Christian",
      "offset": 23
    },
    {
      "val": " Mujica",
      "offset": 33
    },
    {
      "val": " 051",
      "offset": 41
    }
  ],
  "location": "PurchaseSteps.theCustomerFillFormFisrtNameLastNamePostalCode(String,String,String)"
});
formatter.result({
  "duration": 692489209,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Continue",
      "offset": 31
    }
  ],
  "location": "BotonSteps.theCustomerClicksTheButtomButtom(String)"
});
formatter.result({
  "duration": 2146291625,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Finish",
      "offset": 31
    }
  ],
  "location": "BotonSteps.theCustomerClicksTheButtomButtom(String)"
});
formatter.result({
  "duration": 2163760084,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "THANK YOU",
      "offset": 57
    }
  ],
  "location": "PurchaseSteps.itIsValidatedThatTheCustomerCompletedThePurchaseTitlePurchase(String)"
});
formatter.result({
  "duration": 48707209,
  "status": "passed"
});
formatter.after({
  "duration": 88831917,
  "status": "passed"
});
formatter.after({
  "duration": 30375,
  "status": "passed"
});
formatter.after({
  "duration": 85041,
  "status": "passed"
});
formatter.after({
  "duration": 35708,
  "status": "passed"
});
});