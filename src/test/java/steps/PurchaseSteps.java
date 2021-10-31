package steps;

import Utils.TestNGSecuenciaRunner;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageobjects.PurchasePage;

public class PurchaseSteps extends TestNGSecuenciaRunner {
    PurchasePage pur = new PurchasePage(driver);
    @And("^the customer fill form (.*),(.*),(.*)$")
    public void theCustomerFillFormFisrtNameLastNamePostalCode(String firstName, String lastName, String PostalCode) {
        pur.fillForm(firstName,lastName,PostalCode);
    }

    @Then("^it is validated that the customer completed the purchase (.*)$")
    public void itIsValidatedThatTheCustomerCompletedThePurchaseTitlePurchase(String textTitlePurchase) {
        Assert.assertTrue(pur.validateTitlePurchase(textTitlePurchase));
    }
}
