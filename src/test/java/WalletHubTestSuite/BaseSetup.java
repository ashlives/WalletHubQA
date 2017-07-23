package WalletHubTestSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.WalletHubLoginPage;

/**
 * Created by Lenovo G50-70 on 22-07-2017.
 */
public class BaseSetup {
    WebDriver driver;
    WebDriverWait wait;
    WalletHubLoginPage objLogin;

    @BeforeClass
    public void setup(){
        String username = "username";
        String password = "password";
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium Webdriver/chromedriver.exe");
        driver = new ChromeDriver(ops);
        objLogin = new WalletHubLoginPage(driver);
        wait = new WebDriverWait(driver,50);
        driver.get("https://wallethub.com/join/login");
        objLogin.login(username, password);
    }

    @AfterClass
    public void teardown(){
        driver.close();
    }
}