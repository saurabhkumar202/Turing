package sanity;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class RobustTest {

    @BeforeSuite
    public void setUp(){
        System.out.println("Robust test - This is set up");
    }

    @Test(priority = 1)
    public void openBrowser(){
        System.out.println("Robust test - This is test 1");
    }

   @Test(priority = 2)
    public void launchSite(){
        System.out.println("Robust test - This is test 2");
    }

    @AfterSuite
    public void testDown(){
        System.out.println("Robust test - This is tear down");
    }


}
