package Helper;

import BaseClass.baseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.File;

public class listener implements ITestListener
{
    @Override
    public void onFinish(ITestContext arg0)
    {
        Reporter.log("onFinish method finished");

      //  System.out.println("onFinish method finished "+arg0.getName());
        // TODO Auto-generated method stub

    }

    @Override
    public void onStart(ITestContext arg0)
    {
        Reporter.log("onStart method finished"+arg0.getName());

        // TODO Auto-generated method stub

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0)
    {
        Reporter.log("onTestFailedButWithinSuccessPercentage method finished"+arg0.getName());

        // TODO Auto-generated method stub

    }

    @Override
    public void onTestFailure(ITestResult arg0)
    {
        Reporter.log("onTestFailure method finished"+arg0.getName());

        String currentDate = dateClass.dateFormat();
        if(!arg0.isSuccess())
        {
            File scrFile = ((TakesScreenshot) baseClass.driver).getScreenshotAs(OutputType.FILE);
            try
            {
                File screenshotName = new File(System.getProperty("user.dir") + "/test-output/screenshots/" + currentDate + ".png");
                FileUtils.copyFile(scrFile, screenshotName);
                Reporter.log("<br><img src='" + screenshotName + "' height='400' width='400'/><br>");
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestSkipped(ITestResult arg0)
    {
        Reporter.log("onTestSkipped method finished"+arg0.getName());

        // TODO Auto-generated method stub

    }

    @Override
    public void onTestStart(ITestResult arg0)
    {
        System.out.println("onTestStart method finished"+arg0.getName());
        Reporter.log("onTestStart method finished"+arg0.getName());

        // TODO Auto-generated method stub

    }

    @Override
    public void onTestSuccess(ITestResult arg0)
    {
        Reporter.log("onTestSuccess method finished"+arg0.getName());

        // TODO Auto-generated method stub

    }
}

