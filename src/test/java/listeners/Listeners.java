package listeners;

import java.io.IOException;

import static resources.ExtentTestManager.getTest;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.relevantcodes.extentreports.LogStatus;

import resources.Base;

public class Listeners implements ITestListener {
	
	//Base p=new Base();
    private static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
        Log.info(getTestMethodName(result) + " test is Started.");
		//Log.info("Test Started"+result.toString());
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
        Log.info(getTestMethodName(result) + " test is succeed.");
        //ExtentReports log operation for passed tests.
        getTest().log(LogStatus.PASS, "Test passed");
		
	}

	public void onTestFailure(ITestResult result) {
		
		try {
			
			//p.getScreenshot(result.getName());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
