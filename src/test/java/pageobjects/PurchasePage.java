package pageobjects;

import Utils.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PurchasePage {
    private WebDriver driver;
    private WebDriverWait wait;

    //Constructor
    public PurchasePage(WebDriver browser){
        driver = browser;
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver,20);
    }

    //Locators
    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a/span")
    WebElement btnCart;

    @FindBy(id = "checkout")
    WebElement btnCheckOut;

    @FindBy(id = "first-name")
    WebElement fieldFirstName;

    @FindBy(id = "last-name")
    WebElement fieldLastName;

    @FindBy(id = "postal-code")
    WebElement fieldPostalCode;

    @FindBy(id = "continue")
    WebElement btnContinue;

    @FindBy(id = "finish")
    WebElement btnFinish;

    @FindBy(xpath = "//*[@id=\"checkout_complete_container\"]/h2")
    WebElement titlePurchase;

    //Actions
    public void clickBtnCart(){
        Wait.waitClickable(driver,btnCart,20);
        btnCart.click();
    }

    public void clickBtnCheckOut(){
        Wait.waitClickable(driver,btnCheckOut,20);
        btnCheckOut.click();
    }

    public void fillForm(String textFirstName, String textLastName, String textPostalCode){
        Wait.waitClickable(driver,fieldFirstName,20);
        fieldFirstName.sendKeys(textFirstName);

        Wait.waitClickable(driver,fieldLastName,20);
        fieldLastName.sendKeys(textLastName);

        Wait.waitClickable(driver,fieldPostalCode,20);
        fieldPostalCode.sendKeys(textPostalCode);
    }

    public void clickBtnContinue(){
        Wait.waitClickable(driver,btnContinue,20);
        btnContinue.click();
        Wait.waitSeconds(2);
    }

    public void clickBtnFinish(){
        Wait.waitClickable(driver,btnFinish,20);
        btnFinish.click();
        Wait.waitSeconds(2);
    }

    public boolean validateTitlePurchase(String textTitlePurchase){
        boolean result = false;
        if(titlePurchase.getText().contains(textTitlePurchase)){
            return true;
        }
        return result;
    }

}
