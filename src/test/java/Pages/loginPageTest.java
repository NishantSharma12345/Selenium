package Pages;

import BaseClass.baseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class loginPageTest extends baseClass
{
    homePage hp;
    loginPage lp;

    @BeforeClass
    void init()
    {
        hp = new homePage(driver);
        lp = new loginPage(driver);
        System.out.println("Login Page Test");
    }

    @Test
    public void loginPerformTest() throws InterruptedException, IOException
    {
        hp.homepageToSigninPerform();
        lp.loginPerform();
    }

}
