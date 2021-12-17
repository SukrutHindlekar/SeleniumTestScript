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

import po.Po_RegisterUser;
import po.Po_SuperTournamentBracket;
import resources.ExtentTestManager;
import utility.BrowserManager;
import utility.User_ProfileDetailsUtil;
import utility.User_RegisterUtil;
import utility.User_SuperTournamentUtil;

public class Testcase_SuperTournament {
	
	WebDriver driver;
	ArrayList<Object> data;
	ExtentTest test;
	static String scenarioName = "SuperTournaments";
	static String file = "SuperTournamentsBrackets.xlsx";
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
		ExtentTestManager.scenarioName="SuperTournaments";
		System.out.println("***Our Data***"+data);
		System.out.println("****"+ data.iterator());
		return data.iterator();
	}
	
//	@Test(dataProvider = "getTestData",description = "Creating bracket in Super Tournament",priority = 1)
//	public void BracketCreationSuperTournament(ArrayList<Object> myData) throws InterruptedException {
//		startTest("Creating bracket in Super Tournament","Creating bracket in Super Tournament");
//		Po_SuperTournamentBracket obj = PageFactory.initElements(driver, Po_SuperTournamentBracket.class);
//		obj.UserBracketCreation(myData);
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//	}
	
	@Test(dataProvider = "getTestData",description = "Bracket Quadrant Predictions",priority = 1)
	public void BracketPredictions(ArrayList<Object> myData) throws InterruptedException {
		startTest("Bracket Predictions "+myData.get(4).toString(),"Bracket Predictions "+myData.get(4).toString());
		Po_SuperTournamentBracket obj = PageFactory.initElements(driver, Po_SuperTournamentBracket.class);
		obj.UserBracketPredictions(myData);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
}
