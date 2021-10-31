package steps;

import Utils.TestNGSecuenciaRunner;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageobjects.LoginUserPage;

public class LoginUserSteps extends TestNGSecuenciaRunner {

    @Given("^the customer is on the main page$")
    public void elClienteSeEncuentraEnLaPaginaDeBusqueda() {
        driver = new ChromeDriver();
        driver.get(Utils.Constants.baseURL);
    }



    @When("^enter user (.*)$")
    public void enterUserUser(String user) {
        LoginUserPage login = new LoginUserPage(driver);
        login.setUserName(user);
    }

    @And("^enter password (.*)$")
    public void enterPasswordPassword(String pass) {
        LoginUserPage login = new LoginUserPage(driver);
        login.setPassword(pass);
    }

    @And("^the customer click the login button$")
    public void theCustomerClickTheLoginButton() {
        LoginUserPage login = new LoginUserPage(driver);
        login.clickLogin();
    }

    @Then("^page shows product title$")
    public void pageShowsProductTitle() {
        LoginUserPage login = new LoginUserPage(driver);
        Assert.assertEquals(login.messageReturn(),"PRODUCTS");
    }

    @Then("^page shows connection error$")
    public void pageShowsConnectionError() {
        LoginUserPage login = new LoginUserPage(driver);
        String messageError = "Epic sadface";
        Assert.assertTrue(login.errorLoginReturn(messageError));
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
