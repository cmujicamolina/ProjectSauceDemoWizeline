package Utils;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestNGSecuenciaRunner {

    static int position;
    public static WebDriver driver;

    @BeforeSuite
    public void beforeSuite(){
    }

    @BeforeMethod(alwaysRun = true)
    public void startAppium(){
        driver.manage().deleteAllCookies();
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethodSetup(ITestResult result) {
        try {
            driver.close();
            driver.quit();
            position = position + 1;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


}
