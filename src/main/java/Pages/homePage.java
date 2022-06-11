package Pages;

import BaseClass.baseClass;
import Helper.actionHandler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class homePage extends baseClass
{
    @FindBy(xpath = "//a[contains(.,\"Men\")]")
    private WebElement menCategoryBtn;

    @FindBy(xpath = "//input[@name=\"s\"]")
    private WebElement search;
    @FindBy(xpath = "//span[.=\"Hummingbird printed t-shirt\"]")
    private WebElement product;

    @FindBy(xpath = "//span[contains(.,\"English\")]")
    private WebElement languageSelectDropdown;

    public homePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void homePagePerform() throws InterruptedException
    {
        Assert.assertEquals("NishantSharma-Store", driver.getTitle());
        //actionHandler.click(menCategoryBtn);
        Thread.sleep(2000);
        Select languageDropdown = new Select(languageSelectDropdown);
        languageDropdown.selectByVisibleText(pros.getProperty("language"));
        Thread.sleep(2000);
        search.sendKeys(pros.getProperty("search"));
        Thread.sleep(4000);
        product.click();
        Thread.sleep(4000);
    }
}
