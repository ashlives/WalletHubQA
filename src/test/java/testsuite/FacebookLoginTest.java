package testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.FacebookHomePage;
import pages.FacebookLoginPage;

/**
 * Created by Ashish on 14-07-2017.
 */
public class FacebookLoginTest extends BaseSetup{
    String userName = "ash.liveslove@gmail.com";
    String password = "Talkedcracker89";
    FacebookLoginPage objLogin;
    FacebookHomePage objHome;

    @Test
    public void Test1(){
        driver.get("https:\\www.facebook.com");
        objLogin = new FacebookLoginPage(driver);
        objHome = new FacebookHomePage(driver);
        objLogin.login(userName, password);
        objHome.postStatus("Hello World");
        //assert.equals("Hello World", )
    }
}
