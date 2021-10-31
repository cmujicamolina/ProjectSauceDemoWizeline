package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SortProductsPage {
    private WebDriver driver;
    private WebDriverWait wait;

    //Constructor
    public SortProductsPage(WebDriver browser){
        driver = browser;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver,20);
    }

    //Locators
    @FindBy(className="product_sort_container")
    private WebElement comboSort;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/div[2]/span/select")
    private WebElement comboText;

    //Actions
    public void selecSort(String textOrd){
        Select sort = new Select(comboSort);
        sort.selectByVisibleText(textOrd);
        sort.getFirstSelectedOption().getText();
    }

    public String GetComboText(){
        Select sort = new Select(comboSort);
        String message = sort.getFirstSelectedOption().getText().trim();

        return message;
    }


}
