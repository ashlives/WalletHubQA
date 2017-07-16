package testsuite;

import org.junit.Test;
import pages.WalletHubReviewPage;

/**
 * Created by Lenovo G50-70 on 16-07-2017.
 */
public class RateTest extends BaseSetup {
    WalletHubReviewPage objReview;

    @Test
    public void Test1(){
        objReview = new WalletHubReviewPage(driver);
        driver.get("https://wallethub.com/profile/test_insurance_company/");

    }
}
