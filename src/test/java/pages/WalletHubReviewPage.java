package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.print.PageFormat;

/**
 * Created by Lenovo G50-70 on 16-07-2017.
 */
public class WalletHubReviewPage {
    WebDriver driver;
    Actions actions;

    public WalletHubReviewPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
//        actions = new Actions(driver);
    }

    @FindBy (xpath = ".//*[@id='wh-body-inner']/div[2]/div[3]")
    WebElement ratingStars;

    public void hoverStars(){
        actions.moveToElement(ratingStars);
        actions.click().build().perform();
    }
}
