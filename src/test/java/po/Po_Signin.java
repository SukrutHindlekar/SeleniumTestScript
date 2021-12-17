package po;

import static resources.ExtentTestManager.getTest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

public class Po_Signin {
	
	WebDriver driver;

	public Po_Signin(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH ,using = "//input[@formcontrolname='email']")
	WebElement txtusername;
	
	@FindBy(how = How.CLASS_NAME, using ="invalid-feedback")
	private List<WebElement> error_message;
	
	@FindBy(how=How.XPATH, using ="//input[@type='password']")
	WebElement txtpassword;
	
	@FindBy(how=How.XPATH, using ="	//button[@class='signinbtns logbtn']")
	WebElement User_Login;
	
	@FindBy(how=How.XPATH, using ="//div[@class='toast-body']")
	WebElement verify_login;
	
	public void EnterUserName(String arg) {
		getTest().log(LogStatus.INFO, "Entered Username", arg);
		try {
			txtusername.clear();
			txtusername.sendKeys(arg);
			txtusername.sendKeys(Keys.TAB);
		} catch (Exception e) {
		}
	}
	
	public void EnterUserPass(String arg) {
		getTest().log(LogStatus.INFO, "Entered User Password", arg);
		try {
			txtpassword.clear();
			txtpassword.sendKeys(arg);
			txtpassword.sendKeys(Keys.TAB);
		} catch (Exception e) {
		}
	}
	
	public void ClickLogin() {
		getTest().log(LogStatus.INFO, "Clicked on Login Button");
		User_Login.click();
	}
	
	public String VerifyToast() {
		System.out.println("Toast Text: "+verify_login.getText().trim());
		return verify_login.getText().trim();
	}
	
	//1.)Sign in for valid username and valid password
	public void SignIn_Validdata(ArrayList<Object> myData) throws InterruptedException {
		System.out.println("in sign in validate data");
		try {
			getTest().log(LogStatus.INFO, "Testing Against Scenario", myData.get(2).toString());
			EnterUserName(myData.get(0).toString());
			EnterUserPass(myData.get(1).toString());
			ClickLogin();
			Thread.sleep(3000);			
			Assert.assertEquals(VerifyToast(), "Login Success");
		} catch(Exception e){
			if(error_message.size()>0)
			{
				Assert.assertTrue(false, "Test Failed");
			}else {
				Assert.assertTrue(true, "Test Passed");
			}
		}
	}
		//2.) Sign In for invalid username and invalid password
		
		public void SignIn_InvalidUsername_InvalidPassword(ArrayList<Object> myData) throws InterruptedException {
			
			try {
				getTest().log(LogStatus.INFO, "Testing Against Scenario", myData.get(2).toString());
				EnterUserName(myData.get(0).toString());		
				EnterUserPass(myData.get(1).toString());
				ClickLogin();
				Thread.sleep(3000);
				
				Assert.assertEquals(VerifyToast(), "User Doesnt Exist!");
			} catch (Exception e) {
				if(error_message.size()>0)
				{
					Assert.assertTrue(false, "Test Failed");
				}else {
					Assert.assertTrue(true, "Test Passed");
				}
			}	}
			
		//3.) Sign in for valid username invalid password
			
			public void SignIn_validUsername_InvalidPassword(ArrayList<Object> myData) throws InterruptedException {
				
				try {
					getTest().log(LogStatus.INFO, "Testing Against Scenario", myData.get(2).toString());
					EnterUserName(myData.get(0).toString());		
					EnterUserPass(myData.get(1).toString());
					ClickLogin();
					Thread.sleep(3000);
					
					Assert.assertEquals(VerifyToast(), "User Doesnt Exist!");
				} catch (Exception e) {
					if(error_message.size()>0)
					{
						Assert.assertTrue(false, "Test Failed");
					}else {
						Assert.assertTrue(true, "Test Passed");
					}
				}	}
			
			//4.) Sign in for Invalid username valid password
				
				public void SignIn_InvalidUsername_validPassword(ArrayList<Object> myData) throws InterruptedException {
					
					try {
						getTest().log(LogStatus.INFO, "Testing Against Scenario", myData.get(2).toString());
						EnterUserName(myData.get(0).toString());		
						EnterUserPass(myData.get(1).toString());
						ClickLogin();
						Thread.sleep(3000);
						
						Assert.assertEquals(VerifyToast(), "User Doesnt Exist!");
					} catch (Exception e) {
						if(error_message.size()>0)
						{
							Assert.assertTrue(false, "Test Failed");
						}else {
							Assert.assertTrue(true, "Test Passed");
						}
					}	
	}	
}
