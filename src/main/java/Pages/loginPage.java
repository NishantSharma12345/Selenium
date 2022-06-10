package Pages;

import BaseClass.baseClass;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends baseClass
{

    public loginPage()
    {
        PageFactory.initElements(driver,this);
    }
}
