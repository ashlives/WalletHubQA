package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

/**
 * Created by Lenovo G50-70 on 23-07-2017.
 */
public class WalletHubLoginPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id='join-login']/form/div[1]/input")
    WebElement emailField;

    @FindBy(xpath = "//*[@id='join-login']/form/div[2]/input")
    WebElement passwordField;

    @FindBy(xpath = "//button[contains(.,'Login')]")
    WebElement loginBtn;

    @FindBy(xpath = "//*[@id='viewport']/header/div/nav[3]/a[3]")
    WebElement profile;

    public WalletHubLoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
    }

    public String login(String username, String password){
        emailField.sendKeys(username);
        System.out.println("Username entered: "+username);
        passwordField.sendKeys(password);
        System.out.println("Password entered: "+password);
        loginBtn.click();
        System.out.println("Clicked on Login button");
        String name = profile.getText();
        return name;
    }
}
