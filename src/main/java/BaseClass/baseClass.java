package BaseClass;
import Helper.listener;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@Listeners(listener.class)
public class baseClass
{
    public static WebDriver driver;
    public static Properties pros;
    public baseClass()
    {
        try
        {
            pros = new Properties();
            FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/Config/config.properties");
            pros.load(fs);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    @BeforeSuite
    public void setup()
    {
        DOMConfigurator.configure("log4j.xml");
        if(pros.getProperty("browser").equals("chrome"))
        {
            driver = WebDriverManager.chromedriver().create();
            driver.get(pros.getProperty("url"));
            driver.manage().window().maximize();
            //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
    }

    public static void screenCapture() throws IOException
    {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        String currentDate = dateClass.dateFormat();
        File screenshotName = new File("C://Users//ASUS//IdeaProjects//Selenium//test-output//screenshots//" + currentDate + ".png");
        FileUtils.copyFile(scrFile,screenshotName);
        Reporter.log("<br><img src='"+ screenshotName +"' height='400' width='400'/><br>");

        //File screenshotName= new File(System.getProperty("user.dir")+"//test-output//screenshots//" + currentDate + ".png");
        //File screenshotName = new File("//home//users//nishant.sharma//IdeaProjects//Selenium-IntelliJ-IDEA-main//test-output//screenshots//" + driver.getTitle()+Math.random() + ".png");
        //File screenshotName = new File("//home//users//nishant.sharma//IdeaProjects//Selenium-IntelliJ-IDEA-main//test-output//screenshots//" + currentDate + ".png");
    }

    @AfterSuite
    public void exit()
    {
        driver.close();
    }
}
