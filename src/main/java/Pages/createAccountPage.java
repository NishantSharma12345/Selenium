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

import static BaseClass.baseClass.pros;

public class createAccountPage extends baseClass
{
    WebDriver driver;

    @FindBy(xpath = "//input[@type=\"radio\" and @value =\"1\"]")
    private WebElement socialTitleRadiobtn;
    @FindBy(xpath = "//input[@name=\"firstname\"]")
    private WebElement firstname;
    @FindBy(xpath = "//input[@name=\"lastname\"]")
    private WebElement lastname;
    @FindBy(id = "field-email")
    private WebElement email;
    @FindBy(xpath = "//input[@name=\"password\"]")
    private WebElement password;
    @FindBy(xpath = "//input[@name=\"birthday\"]")
    private WebElement birthday;
    @FindBy(xpath = "//input[@name=\"customer_privacy\"]")
    private WebElement customPrivacyCheckboxbtn;
    @FindBy(xpath = "//input[@name=\"psgdpr\"]")
    private WebElement termsConditionCheckboxbtn;
    @FindBy(xpath = "//button[contains(.,\"Save\")]")
    private WebElement saveAccountbtn;


    public  createAccountPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void createAnAccountPerform() throws InterruptedException
    {
        Reporter.log("Create Account Test Start");
        log.startTestCase("Create Account Login Test");
        Assert.assertEquals("Login", driver.getTitle());
        Thread.sleep(1000);

        socialTitleRadiobtn.click();
        firstname.sendKeys(pros.getProperty("firstname"));
        lastname.sendKeys(pros.getProperty("lastname"));
        email.sendKeys(pros.getProperty("email1"));
        password.sendKeys((pros.getProperty("password1")));
        birthday.sendKeys(pros.getProperty("birthdate"));
        Thread.sleep(1000);
        customPrivacyCheckboxbtn.click();
        Thread.sleep(1000);
        termsConditionCheckboxbtn.click();
        saveAccountbtn.click();

        Thread.sleep(2000);
        log.endTestCase("End Create Account Test");
        Reporter.log("Create Account Test End");
    }
}
