package FacebookTestSuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookHomePage;

/**
 * Created by Ashish on 14-07-2017.
 */
public class FacebookPost extends BaseSetup{
    //FacebookHomePage objHome;

    @Test
    public void FacebookPost() throws InterruptedException {
        objHome.postStatus("Hello World");
        Thread.sleep(5000);
        System.out.println(objHome.getFirstFeed());
        Assert.assertTrue(objHome.getFirstFeed().contains("Hello World"));
    }
}
