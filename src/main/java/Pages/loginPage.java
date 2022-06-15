package Pages;

import BaseClass.baseClass;
import Helper.actionHandler;
import Helper.log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import java.io.IOException;

public class loginPage extends baseClass
{
    @FindBy(id = "field-email")
    private WebElement email;

    @FindBy(id = "field-password")
    private WebElement password;

    @FindBy(id = "submit-login")
    private WebElement loginBtn;


    @FindBy(xpath = "//a[contains(.,\"No account\")]")
    private WebElement noAccountbtn;

    public loginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void noAccountOptionPerform() throws InterruptedException
    {
        Thread.sleep(1000);
        noAccountbtn.click();
    }

    public void loginPerform() throws InterruptedException, IOException
    {
        Reporter.log("Login Test Start");
        log.startTestCase("Start Login Test");
        Thread.sleep(1000);


        email.sendKeys(super.pros.getProperty("email"));
        Assert.assertEquals("Login", driver.getTitle());
        password.sendKeys(super.pros.getProperty("password"));
        screenCapture();
        loginBtn.click();

        log.endTestCase("End Login Test");
        Reporter.log("Login Test End");
        Thread.sleep(2000);
    }
}
