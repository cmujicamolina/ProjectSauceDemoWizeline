package pageobjects;

import Utils.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddProductsPage {
    private WebDriver driver;
    private WebDriverWait wait;

    //Constructor
    public AddProductsPage(WebDriver browser){
        driver = browser;
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver,20);
    }

    //Locators
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement btnBackpack;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement btnBike;

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement btnBolt;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    WebElement btnJacket;

    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    WebElement btnOnesie;

    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    WebElement btnTshirt;

    //
    @FindBy(id = "remove-sauce-labs-backpack")
    WebElement btnBackpackRemove;

    @FindBy(id = "remove-sauce-labs-bike-light")
    WebElement btnBikeRemove;

    @FindBy(id = "remove-sauce-labs-bolt-t-shirt")
    WebElement btnBoltRemove;

    @FindBy(id = "remove-sauce-labs-fleece-jacket")
    WebElement btnJacketRemove;

    @FindBy(id = "remove-sauce-labs-onesie")
    WebElement btnOnesieRemove;

    @FindBy(id = "remove-test.allthethings()-t-shirt-(red)")
    WebElement btnTshirtRemove;

    //Actions
    public void clickBtnBackpack(){
        Wait.waitClickable(driver,btnBackpack,4);
        btnBackpack.click();
        Wait.waitSeconds(4);
    }

    public void clickBtnBike(){
        Wait.waitClickable(driver,btnBike,4);
        btnBike.click();
        Wait.waitSeconds(4);
    }

    public void clickBtnBolt(){
        Wait.waitClickable(driver,btnBolt,4);
        btnBolt.click();
        Wait.waitSeconds(4);
    }

    public void clickBtnJacket(){
        Wait.waitClickable(driver,btnJacket,4);
        btnJacket.click();
        Wait.waitSeconds(4);
    }

    public void clickBtnOnesie(){
        Wait.waitClickable(driver,btnOnesie,4);
        btnOnesie.click();
        Wait.waitSeconds(4);
    }

    public void clickBtnTshirt(){
        Wait.waitClickable(driver,btnTshirt,4);
        btnTshirt.click();
        Wait.waitSeconds(4);
    }

    public boolean validateAddCartBackPack(String message){
        boolean result = false;
        Wait.waitVisibility(driver,btnBackpackRemove,4);

        if(btnBackpackRemove.getText().contains(message)){
            result = true;
        }
        return result;
    }

    public boolean validateAddCartBike(String message){
        boolean result = false;
        Wait.waitVisibility(driver,btnBikeRemove,4);

        if(btnBikeRemove.getText().contains(message)){
            result = true;
        }
        return result;
    }

    public boolean validateAddCartBolt(String message){
        boolean result = false;
        Wait.waitVisibility(driver,btnBoltRemove,4);

        if(btnBoltRemove.getText().contains(message)){
            result = true;
        }
        return result;
    }

    public boolean validateAddCartJacket(String message){
        boolean result = false;
        Wait.waitVisibility(driver,btnJacketRemove,4);

        if(btnJacketRemove.getText().contains(message)){
            result = true;
        }
        return result;
    }

    public boolean validateAddCartOnesie(String message){
        boolean result = false;
        Wait.waitVisibility(driver,btnOnesieRemove,4);

        if(btnOnesieRemove.getText().contains(message)){
            result = true;
        }
        return result;
    }

    public boolean validateAddCartTshirt(String message){
        boolean result = false;
        Wait.waitVisibility(driver,btnTshirtRemove,4);

        if(btnTshirtRemove.getText().contains(message)){
            result = true;
        }
        return result;
    }
}
