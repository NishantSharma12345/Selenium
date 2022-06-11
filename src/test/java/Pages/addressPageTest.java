package Pages;

import BaseClass.baseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class addressPageTest extends baseClass
{
    addressPage obj;

    @BeforeClass
    void init()
    {
        obj = new addressPage(driver);
        System.out.println("Address Page Test");
    }

    @Test
    public void addAddressPerformTest() throws InterruptedException
    {
        obj.addAddressPerform();
    }
}
