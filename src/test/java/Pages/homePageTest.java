package Pages;

import BaseClass.baseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class homePageTest extends baseClass
{
    homePage obj;

    @BeforeClass
    void init()
    {
        obj = new homePage(driver);
        System.out.println("Homepage Test");
    }

    @Test
    public void homepagePerformTest() throws InterruptedException
    {
        obj.homePagePerform();
    }
}
