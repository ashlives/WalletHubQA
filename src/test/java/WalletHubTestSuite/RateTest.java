package WalletHubTestSuite;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WalletHubReviewPage;

import static org.testng.Assert.assertEquals;


public class RateTest extends BaseSetup {
    WalletHubReviewPage objReview;

    @Test
    public void Rating() throws InterruptedException {
        driver.get("https:\\wallethub.com/profile/test_insurance_company/");
        System.out.println("Navigate to ratings page.");
        objReview = new WalletHubReviewPage(driver);
        String classattribute = objReview.hoverStars(3);
        Assert.assertEquals(classattribute, "hover");
        objReview.selectPolicy();
        objReview.selectStars(5);
        objReview.setReviewText("Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test Test");
        objReview.clickSubmit();
        Thread.sleep(500);
        String status = objReview.verifySuccess();
        Assert.assertEquals(status, "true");
    }
}
