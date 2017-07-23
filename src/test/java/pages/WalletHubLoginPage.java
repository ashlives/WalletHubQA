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

    @FindBy(xpath = ".//*[@id='join-login']/form/div[1]/input")
    WebElement emailField;

    @FindBy(xpath = ".//*[@id='join-login']/form/div[2]/input")
    WebElement passwordField;

    @FindBy(xpath = "//button[contains(.,'Login')]")
    WebElement loginBtn;

    public WalletHubLoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
    }

    public void login(String username, String password){
        emailField.sendKeys(username);
        passwordField.sendKeys(password);
        loginBtn.click();
    }
}
