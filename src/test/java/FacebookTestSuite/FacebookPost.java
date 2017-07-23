package FacebookTestSuite;

import org.testng.annotations.Test;
import pages.FacebookHomePage;

/**
 * Created by Ashish on 14-07-2017.
 */
public class FacebookPost extends BaseSetup{
    //FacebookHomePage objHome;

    @Test
    public void FacebookPost(){
        objHome.postStatus("Hello World");
    }
}
