package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePageGeneral extends TestNGSecuenciaRunner{
        public BasePageGeneral(WebDriver driver){
            PageFactory.initElements(driver, this);
        }
}

