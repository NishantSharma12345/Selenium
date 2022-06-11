package Pages;

import BaseClass.baseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginPageTest extends baseClass
{
    loginPage obj;

    @BeforeClass
    void init()
    {
        obj = new loginPage(driver);
        System.out.println("Login Page Test");
    }

    @Test
    public void loginPerformTest() throws InterruptedException
    {
        obj.loginPerform();
    }

}
