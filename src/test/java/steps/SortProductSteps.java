package steps;

import Utils.TestNGSecuenciaRunner;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageobjects.SortProductsPage;

public class SortProductSteps extends TestNGSecuenciaRunner {
    @And("^order products by low to high price (.*)$")
    public void orderProductsByLowToHighPriceOrder(String textOrder) {
        SortProductsPage sort = new SortProductsPage(driver);
        sort.selecSort(textOrder);
    }

    @And("^order products by high to low price (.*)$")
    public void orderProductsByHighToLowPriceOrder(String textOrder) {
        SortProductsPage sort = new SortProductsPage(driver);
        sort.selecSort(textOrder);
    }

    @Then("^validate that is ordered by (.*)$")
    public void validateThatIsOrderedByOrder(String textOrder) {
        SortProductsPage sort = new SortProductsPage(driver);
        Assert.assertEquals(sort.GetComboText(),textOrder);
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
