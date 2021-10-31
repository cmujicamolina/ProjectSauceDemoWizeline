package pageobjects;

import Utils.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginUserPage {
    private WebDriver driver;
    private WebDriverWait wait;

    //Constructor
    public LoginUserPage(WebDriver browser){
        driver = browser;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver,20);
    }

    //Locators
    @FindBy(id="user-name")
    private WebElement textUserName;

    @FindBy(id = "password")
    private WebElement textPassword;

    @FindBy(id="login-button")
    private WebElement btnLogin;

    @FindBy(xpath = "//span[contains(text(),'Products')]")
    private WebElement titleProducts;

    @FindBy(xpath = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3")
    private WebElement titleError;

    //Actions
    public void setUserName(String textUser){
        wait.until(ExpectedConditions.elementToBeClickable(textUserName));
        textUserName.sendKeys(textUser);
    }

    public void setPassword(String textPass){
        wait.until(ExpectedConditions.elementToBeClickable(textPassword));
        textPassword.sendKeys(textPass);
    }

    public void clickLogin(){
        wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
        btnLogin.click();
    }

    public String messageReturn(){
        Wait.waitVisibility(driver,titleProducts,20);
        String message = titleProducts.getText().trim();

        return message;
    }

    public boolean errorLoginReturn(String messageError){
        Wait.waitVisibility(driver,titleError,20);
        System.out.println(titleError.getText());

        boolean result = false;

        if(titleError.getText().contains(messageError)){
            result = true;
        }
        return result;

    }

}
