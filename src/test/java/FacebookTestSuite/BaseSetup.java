package FacebookTestSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.FacebookHomePage;
import pages.FacebookLoginPage;


/**
 * Created by Ashish on 14-07-2017.
 */
public class BaseSetup {
    WebDriver driver;
    WebDriverWait wait;
    FacebookLoginPage objLogin;
    FacebookHomePage objHome;
    String userName = "";
    String password = "";

    @BeforeClass
    public void setup(){
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium Webdriver/chromedriver.exe");
        driver = new ChromeDriver(ops);
        wait = new WebDriverWait(driver,50);
        driver.get("https:\\www.facebook.com");
        objLogin = new FacebookLoginPage(driver);
        objHome = new FacebookHomePage(driver);
        objLogin.login(userName, password);
    }

    @AfterClass
    public void teardown(){
       driver.close();
    }
}
