package Pages;

import BaseClass.baseClass;
import Helper.actionHandler;
import Helper.log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import static BaseClass.baseClass.pros;

public class addressPage extends baseClass
{
    @FindBy(xpath = "//span[.=\"Sign in\"]")
    private WebElement signinbtn;

    @FindBy(id = "field-email")
    private WebElement email;

    @FindBy(id = "field-password")
    private WebElement password;

    @FindBy(id = "submit-login")
    private WebElement loginBtn;



    @FindBy(xpath = "//a[@id=\"addresses-link\"]//span[@class = \"link-item\"]")
    private WebElement addAddressbtn;
    @FindBy(xpath = "//span[.=\"Create new address\"]")
    private WebElement createNewAddressBtn;
    @FindBy(xpath = "//input[@name=\"alias\"]")
    private WebElement alias;
    @FindBy(xpath = "//input[@name=\"company\"]")
    private WebElement company;
    @FindBy(xpath = "//input[@name=\"vat_number\"]")
    private WebElement VATnumber;
    @FindBy(xpath = "//input[@name=\"address1\"]")
    private WebElement address;
    @FindBy(xpath = "//input[@name=\"city\"]")
    private WebElement city;
    @FindBy(xpath = "//input[@name=\"postcode\"]")
    private WebElement postcode;
    @FindBy(xpath = "//input[@name=\"phone\"]")
    private WebElement phone;
    @FindBy(xpath = "//select[@name=\"id_state\"]")
    private WebElement statedropdownbtn;
    @FindBy(xpath = "//button[contains(.,\"Save\")]")
    private WebElement saveAddressbtn;

    WebDriver driver;

    public  addressPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void addAddressPerform() throws InterruptedException
    {
        actionHandler.click(signinbtn);
        email.sendKeys(super.pros.getProperty("email"));
        password.sendKeys(super.pros.getProperty("password"));
        loginBtn.click();
        Thread.sleep(2000);


        Reporter.log("Add Address Test Start");
        log.startTestCase("Start Add Address Test");
        actionHandler.click(addAddressbtn);
        Thread.sleep(1000);
        actionHandler.click(createNewAddressBtn);
        Thread.sleep(1000);
        alias.sendKeys(pros.getProperty("alias"));
        company.sendKeys(pros.getProperty("company"));
        VATnumber.sendKeys(pros.getProperty("number"));
        address.sendKeys(pros.getProperty("address"));
        city.sendKeys(pros.getProperty("city"));
        postcode.sendKeys(pros.getProperty("zip"));
        Select dropdownState = new Select(statedropdownbtn);
        dropdownState.selectByVisibleText(pros.getProperty("state"));
        phone.sendKeys(pros.getProperty("phone"));
        saveAddressbtn.click();
        log.endTestCase("End Add Address Test");
        Reporter.log("Add Address Test End");
    }
}
