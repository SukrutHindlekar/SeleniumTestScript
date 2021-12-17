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
import resources.ExtentTestManager; 
import utility.BrowserManager;
import utility.User_RegisterUtil;

public class Testcase_RegisterUser {
	
	WebDriver driver;
	ArrayList<Object> data;
	ExtentTest test;
	static String scenarioName = "RegisterUser";
	static String file = "RegisterUser.xlsx";
	static String sheetname = "Sheet1";
	
	@BeforeMethod
	@Parameters({"browser","url"})
	public void setup(String browser, String url) {
		driver = BrowserManager.getDriver("chrome");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	}
	
	@DataProvider(name = "getTestData")
	public Iterator<Object> getTestData() throws IOException {
		data=User_RegisterUtil.getDatafromExcel(file, sheetname);
		ExtentTestManager.scenarioName="RegisterUser";
		System.out.println("***Our Data***"+data);
		System.out.println("****"+ data.iterator());
		return data.iterator();
	}
	
	@Test(dataProvider = "getTestData",description = "User Register with Valid Data",priority = 1)
	public void UserRegisterwithValidData(ArrayList<Object> myData) throws InterruptedException {
		startTest("User Register with valid Details","User Register with Valid Details");
		
		Po_RegisterUser obj = PageFactory.initElements(driver, Po_RegisterUser.class);
		obj.User_RegisterWithValidData(myData);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	@Test(dataProvider = "getTestData",description = "User Register with existing EmailID",priority = 2)
	public void UserRegisterwithexisitingEmailID(ArrayList<Object> myData) throws InterruptedException {
		startTest("User Register with existing EmailID","User Register with existing EmailID");
		
		Po_RegisterUser obj = PageFactory.initElements(driver, Po_RegisterUser.class);
		obj.User_RegisterWithExistingEmailid(myData);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	@Test(dataProvider = "getTestData",description = "User Register with existing phonenumber",priority = 3)
	public void UserRegisterwithExistingPhoneNo(ArrayList<Object> myData) throws InterruptedException {
		startTest("User Register with existing phonenumber","User Register with existing phonenumber");
		
		Po_RegisterUser obj = PageFactory.initElements(driver, Po_RegisterUser.class);
		obj.User_RegisterWithExistingPhoneNumber(myData);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	@Test(dataProvider = "getTestData",description = "User Register with invalid phone number",priority = 4)
	public void UserRegisterwithInvalidPhoneNumber(ArrayList<Object> myData) throws InterruptedException {
		startTest("User Register with invalid phone number","User Register with invalid phone number");
		
		Po_RegisterUser obj = PageFactory.initElements(driver, Po_RegisterUser.class);
		obj.User_RegisterWithInvalidPhonenumber(myData);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	@Test(dataProvider = "getTestData",description = "User Register with invalid birthdate",priority = 5)
	public void UserRegisterwithInvalidBirthDate(ArrayList<Object> myData) throws InterruptedException {
		startTest("User Register with invalid birthdate","User Register with invalid birthdate");
		
		Po_RegisterUser obj = PageFactory.initElements(driver, Po_RegisterUser.class);
		obj.User_RegisterWithInvalidBirthdate(myData);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
		
}
