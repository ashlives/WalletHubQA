package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

/**
 * Created by Lenovo G50-70 on 23-07-2017.
 */
public class WalletHubActivityPage {
    WebDriver driver;

    public WalletHubActivityPage(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
    }

    @FindBy(xpath = "(//*[@class='feeddesc'])[1]")
    WebElement firstActivityFeed;

    public String getFirstActivity(){
        System.out.println(firstActivityFeed.getText());
        return firstActivityFeed.getText();
    }
}
