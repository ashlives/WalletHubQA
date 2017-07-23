package pages;

import org.openqa.selenium.By;
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
        actions = new Actions(driver);
    }

    @FindBy (className = "wh-rating-notes")
    WebElement ratingStars;


    public void hoverStars(int star){
        actions.moveToElement(ratingStars).perform();
        WebElement stars = driver.findElement(By.xpath(".//*[@id='wh-body-inner']/div[2]/div[3]/div[1]/div/a["+star+"]"));
        actions.moveToElement(stars).build().perform();
    }
}
