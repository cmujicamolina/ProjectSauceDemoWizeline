package steps;

import Utils.TestNGSecuenciaRunner;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pageobjects.AddProductsPage;
import pageobjects.PurchasePage;

import java.util.Locale;

public class BotonSteps extends TestNGSecuenciaRunner {

    @And("^the customer ADD TO CART of the product (.*)$")
    public void theCustomerADDTOCARTOfTheProductProduct(String bntName) {
        AddProductsPage addProd = new AddProductsPage(driver);
        switch (bntName.toUpperCase(Locale.ROOT)){
            case "ALL":
                addProd.clickBtnBackpack();
                addProd.clickBtnBike();
                addProd.clickBtnBolt();
                addProd.clickBtnJacket();
                addProd.clickBtnOnesie();
                addProd.clickBtnTshirt();
                break;
            case "BACKPACK":
                addProd.clickBtnBackpack();
                break;
            case "BIKE":
                addProd.clickBtnBike();
                break;
            case "BOLT":
                addProd.clickBtnBolt();
                break;
            case "JACKET":
                addProd.clickBtnJacket();
                break;
            case "ONESIE":
                addProd.clickBtnOnesie();
                break;
            case "TSHIRT":
                addProd.clickBtnTshirt();
                break;
        }
    }
    @And("^the customer clicks the buttom (.*)$")
    public void theCustomerClicksTheButtomButtom(String btnName) {
        PurchasePage pur = new PurchasePage(driver);
        switch (btnName.toUpperCase(Locale.ROOT)) {
            case "CART":
                pur.clickBtnCart();
                break;

            case "CHECKOUT":
                pur.clickBtnCheckOut();
                break;

            case "CONTINUE":
                pur.clickBtnContinue();
                break;

            case "FINISH":
                pur.clickBtnFinish();
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
