package Pages;

import BaseClass.baseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class addressPageTest extends baseClass
{
    homePage hp;
    loginPage lp;
    addressPage obj;

    @BeforeClass
    void init()
    {
        hp = new homePage(driver);
        lp = new loginPage(driver);
        obj = new addressPage(driver);

        System.out.println("Address Page Test");
    }

    @Test
    public void addAddressPerformTest() throws InterruptedException, IOException {
        hp.homepageToSigninPerform();
        lp.loginPerform();
        obj.addAddressPerform();
    }
}
