package WalletHubTestSuite;
import org.testng.annotations.Test;
import pages.WalletHubReviewPage;

/**
 * Created by Lenovo G50-70 on 16-07-2017.
 */
public class RateTest extends BaseSetup {
    WalletHubReviewPage objReview;

    @Test
    public void Test1(){
        driver.get("https:\\wallethub.com/profile/test_insurance_company/");
        objReview = new WalletHubReviewPage(driver);
        objReview.hoverStars(3);
        try {
            Thread.sleep(300000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
