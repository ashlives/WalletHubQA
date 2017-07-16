package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Ashish on 14-07-2017.
 */
public class FacebookLoginPage {
    WebDriver driver;

    public FacebookLoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    WebElement emailField;

    @FindBy(id = "pass")
    WebElement passwordField;

    @FindBy(id = "loginbutton")
    WebElement loginButton;

    public void login(String username, String password){
        emailField.sendKeys(username);
        System.out.println("Entered Username: "+username);
        passwordField.sendKeys(password);
        System.out.println("Entered Password: "+password);
        loginButton.click();
        System.out.println("Clicked on Login button");
    }

}
