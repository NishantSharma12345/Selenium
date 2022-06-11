package Pages;

import BaseClass.baseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class createAccountPageTest extends baseClass
{
    createAccountPage obj;

    @BeforeClass
    void init()
    {
        obj = new createAccountPage(driver);
        System.out.println("Create Account Page Test");
    }

    @Test
    public void createAnAccountPerformTest() throws InterruptedException
    {
        obj.createAnAccountPerform();
    }

}
