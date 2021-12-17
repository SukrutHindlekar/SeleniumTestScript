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

import po.Po_Signin;
import resources.ExtentTestManager;
import utility.BrowserManager;
import utility.User_SignInUtil;

public class Testcase_Signin {
	WebDriver driver;
	ArrayList<Object> data;
	ExtentTest test;
	static String scenarioName = "SigningIn";
	static String file = "SignIn.xlsx";
	static String sheetname = "Sheet1";
	
	@BeforeMethod
	@Parameters({"browser","url"})
	public void setup(String browser, String url) {
		driver = BrowserManager.getDriver("chrome");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	@DataProvider()
	public Iterator<Object> getTestData() throws IOException {
		data = User_SignInUtil.getDatafromExcel(file, sheetname);
		ExtentTestManager.scenarioName="SigningIn";
		System.out.println("***Our Data***"+data);
		System.out.println("****"+ data.iterator());
		return data.iterator();
	}
	
	@Test(dataProvider = "getTestData",description = "Sign with Valid Data",priority = 1)
	public void signIn_uservaliddata(ArrayList<Object> myData) throws InterruptedException {
		startTest("User sign in with valid username and valid password","SignIn with Valid Username and valid password");
		
		Po_Signin obj = PageFactory.initElements(driver, Po_Signin.class);
		obj.SignIn_Validdata(myData);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	@Test(dataProvider = "getTestData",description = "Sign with Invalid username and Invalid Password",priority = 2)
	public void signIn_userInvalidUsernameInvalidPassword(ArrayList<Object> myData) throws InterruptedException {
		startTest("User sign in with invalid username and invalid password","SignIn with invalid username and invalid password");
		Po_Signin obj = PageFactory.initElements(driver, Po_Signin.class);
		obj.SignIn_InvalidUsername_InvalidPassword(myData);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	@Test(dataProvider = "getTestData",description = "Sign with Valid username invalid password",priority = 3)
	public void signIn_userValidUsernameInvalidPassword(ArrayList<Object> myData) throws InterruptedException {
		startTest("User sign in with valid username and invalid password","SignIn with valid username and invalid password");
		
		Po_Signin obj = PageFactory.initElements(driver, Po_Signin.class);
		obj.SignIn_validUsername_InvalidPassword(myData);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	@Test(dataProvider = "getTestData",description = "Sign with Invalid username Valid Password",priority = 4)
	public void signIn_userInvalidusernameValidPassword(ArrayList<Object> myData) throws InterruptedException {
		startTest("User sign in with invalid username and valid password","SignIn with Invalid username and valid password");
		
		Po_Signin obj = PageFactory.initElements(driver, Po_Signin.class);
		obj.SignIn_InvalidUsername_validPassword(myData);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
