package testcase;

import static resources.ExtentTestManager.startTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import po.Po_ProfileDetails;
import resources.ExtentTestManager;
import utility.BrowserManager;
import utility.User_ProfileDetailsUtil;
import utility.User_SuperTournamentUtil;

public class Testcase_ProfileDetails {
	
	WebDriver driver;
	ArrayList<Object> data;
	ExtentTest test;
	static String scenarioName = "FriendRequests";
	static String file = "FriendRequests.xlsx";
	static String sheetname = "Sheet1";
	
	@BeforeMethod
	@Parameters({"browser","url"})
	public void setup(String browser, String url) {
		driver = BrowserManager.getDriver("chrome");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	}
	
	@DataProvider(name = "getTestData")
	public Iterator<Object> getTestData() throws IOException {
		data=User_ProfileDetailsUtil.getDatafromExcel(file, sheetname);
		ExtentTestManager.scenarioName="FriendRequests";
		System.out.println("***Our Data***"+data);
		System.out.println("****"+ data.iterator());
		return data.iterator();
	}
	
	@Test(dataProvider = "getTestData",description = "Validating Friend Requests",priority = 1)
	public void BracketCreationSuperTournament(ArrayList<Object> myData) throws InterruptedException {
		startTest("Validating Friend Requests","Validating Friend Requests");
		Po_ProfileDetails obj = PageFactory.initElements(driver, Po_ProfileDetails.class);
		obj.FriendRequests(myData);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
}
