package Pages;

import BaseClass.baseClass;
import Helper.actionHandler;
import Helper.log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class homePage extends baseClass
{
    @FindBy(xpath = "//span[.=\"Sign in\"]")
    private WebElement signinbtn;

    @FindBy(xpath = "//li[@id=\"category-3\"]//a[@data-depth=\"0\"]")
    private WebElement rootCategoryBtn;
    @FindBy(xpath = "//a[contains(.,\"Men\")]")
    private WebElement subCategoryBtn;


    @FindBy(xpath = "//span[.=\"English\"]")
    private WebElement selectedLanguageBtn;
    @FindBy(xpath = "//a[.=\"हिन्दी\"]")
    private WebElement newSelectedLanguageBtn;


    @FindBy(xpath = "//input[@name=\"s\"]")
    private WebElement search;
    @FindBy(xpath = "//span[.=\"Hummingbird printed t-shirt\"]")
    private WebElement product;


    public homePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void homepageToSigninPerform() throws InterruptedException
    {
        if(signinbtn != null)
        {
            Thread.sleep(1000);
            actionHandler.click(signinbtn);
        }
        else
        {
            log.error("Failed Test");
        }
    }
    public void subCategoryClickPerform() throws InterruptedException
    {
        Assert.assertEquals("NishantSharma-Store", driver.getTitle());
        actionHandler.moveToElement(rootCategoryBtn);
        Thread.sleep(2000);
        actionHandler.click(subCategoryBtn);
        Thread.sleep(2000);
    }

    public void changeLanguagePerform() throws InterruptedException
    {
        Thread.sleep(2000);
        actionHandler.click(selectedLanguageBtn);
        Thread.sleep(2000);
        actionHandler.click(newSelectedLanguageBtn);
        Thread.sleep(2000);
    }
    public void searchPerform() throws InterruptedException
    {
        Thread.sleep(2000);
        search.sendKeys(pros.getProperty("search"));
        Thread.sleep(4000);
        product.click();
        Thread.sleep(4000);
    }
}
