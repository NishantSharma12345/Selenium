package Pages;

import BaseClass.baseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class homePageTest extends baseClass
{
    homePage hp;
    @BeforeClass
    void init()
    {
        hp = new homePage(driver);
        System.out.println("Homepage Test");
    }

    @Test
    public void homepagePerformTest() throws InterruptedException
    {
        hp.subCategoryClickPerform();
        hp.changeLanguagePerform();
        hp.searchPerform();
    }
}
