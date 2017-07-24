package WalletHubTestSuite;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WalletHubActivityPage;
import pages.WalletHubReviewPage;

public class RateTest extends BaseSetup {
    WalletHubReviewPage objReview;
    WalletHubActivityPage objActivity;
    String reviewText = "Check the feed Check the feed Check the feed Check the feed Check the feed Check the feed Check the feed Check the feed Check the feed Check the feed Check the feed Check the feed Check the feed Check the feed Check the feed";

    @Test
    public void Rating() throws InterruptedException {
        driver.get("https:\\wallethub.com/profile/test_insurance_company/");
        System.out.println("Navigate to ratings page.");
        objReview = new WalletHubReviewPage(driver);
        objActivity = new WalletHubActivityPage(driver);
        String classattribute = objReview.hoverStars(5);
        Assert.assertTrue(classattribute.equals("hover")||classattribute.equals("hover pressed"));
        objReview.selectPolicy();
        Thread.sleep(5000);
        objReview.selectStars(5);
        Thread.sleep(5000);
        objReview.setReviewText(reviewText);
        Thread.sleep(5000);
        objReview.clickSubmit();
        String status = objReview.verifySuccess();
        Assert.assertEquals(status, "true");
        driver.get("https://wallethub.com/profile/vuprime1/activity/");
        String activityText = objActivity.getFirstActivity();
        Assert.assertTrue(activityText.contains(reviewText),"Failed");
    }
}
