package steps;

import Utils.TestNGSecuenciaRunner;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import pageobjects.AddProductsPage;
import pageobjects.SortProductsPage;

import java.util.Locale;

public class AddProductsSteps extends TestNGSecuenciaRunner {
    @Then("^it is validated that the product was added to the cart (.*)$")
    public void itIsValidatedThatTheproductWasAddedToTheCart(String bntName) {
        AddProductsPage addProd = new AddProductsPage(driver);
        String message = "REMOVE";

        switch (bntName.toUpperCase(Locale.ROOT)){
            case "ALL":
                Assert.assertTrue(addProd.validateAddCartBackPack(message));
                Assert.assertTrue(addProd.validateAddCartBike(message));
                Assert.assertTrue(addProd.validateAddCartBolt(message));
                Assert.assertTrue(addProd.validateAddCartJacket(message));
                Assert.assertTrue(addProd.validateAddCartOnesie(message));
                Assert.assertTrue(addProd.validateAddCartTshirt(message));
                break;

            case "BACKPACK":
                Assert.assertTrue(addProd.validateAddCartBackPack(message));
                break;

            case "BIKE":
                Assert.assertTrue(addProd.validateAddCartBike(message));
                break;

            case "BOLT":
                Assert.assertTrue(addProd.validateAddCartBolt(message));
                break;

            case "JACKET":
                Assert.assertTrue(addProd.validateAddCartJacket(message));
                break;

            case "ONESIE":
                Assert.assertTrue(addProd.validateAddCartOnesie(message));
                break;

            case "TSHIRT":
                Assert.assertTrue(addProd.validateAddCartTshirt(message));
                break;
        }
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed())
            takeScreenshot(scenario);
        driver.quit();
    }

    public void takeScreenshot(Scenario scenario){
        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot,"image/png");
    }
}
