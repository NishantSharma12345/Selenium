package Pages;

import BaseClass.baseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class createAccountPageTest extends baseClass
{
    homePage hp;
    loginPage lp;
    createAccountPage cap;


    @BeforeClass
    void init()
    {
        hp = new homePage(driver);
        lp = new loginPage(driver);
        cap = new createAccountPage(driver);

        System.out.println("Create Account Page Test");
    }

    @Test
    public void createAnAccountPerformTest() throws InterruptedException
    {
        hp.homepageToSigninPerform();
        lp.noAccountOptionPerform();
        cap.createAnAccountPerform();
    }

}
