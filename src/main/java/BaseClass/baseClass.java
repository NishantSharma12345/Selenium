package BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.util.Properties;

public class baseClass {

    public static WebDriver driver;
    public static Properties pros;
    public baseClass()
    {
        try
        {
            pros=new Properties();
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
        if(pros.getProperty("browser").equals("chrome"))
        {
            driver= WebDriverManager.chromedriver().create();
            driver.get(pros.getProperty("url"));
            driver.manage().window().maximize();
        }
    }

    @AfterSuite
    public void exit()
    {
        driver.close();
    }
}
