package po;

import static resources.ExtentTestManager.getTest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

public class Po_RegisterUser {
	
	WebDriver driver;

	public Po_RegisterUser(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH ,using = "//input[@id='first-name']")
	WebElement firstname;
	
	@FindBy(how = How.CLASS_NAME, using ="invalid-feedback")
	private List<WebElement> error_message;
	
	@FindBy(how=How.XPATH, using ="//input[@id='last-name']")
	WebElement lastname;
	
	@FindBy(how=How.XPATH, using ="//input[@id='email']")
	WebElement Emailid;
	
	@FindBy(how=How.XPATH, using ="//option[@value='+1']")
	WebElement Phonezipcode1;
	
	@FindBy(how=How.XPATH, using ="//option[@value='+91']")
	WebElement Phonezipcode2;
	
	@FindBy(how=How.XPATH, using ="//input[@id='phone']")
	WebElement PhoneNumber;

	@FindBy(how=How.XPATH, using ="//input[@type='password']")
	WebElement Password;
	
	@FindBy(how=How.XPATH, using ="//button[@class='signinbtns logbtn']")
	WebElement ClickNext;
	
	@FindBy(how=How.XPATH, using ="//input[@type='date']")
	WebElement DateofBirth;
	
	@FindBy(how=How.XPATH, using ="//select/option[@value='Male']")
	WebElement GenderMale;
	
	@FindBy(how=How.XPATH, using ="//select/option[@value='Female']")
	WebElement GenderFemale;
	
	@FindBy(how=How.XPATH, using ="//select/option[@value='Others']")
	WebElement GenderOthers;
	
	@FindBy(how=How.XPATH, using ="//button[@class='signinbtns logbtn']")
	WebElement ClickNext2;
	
	@FindBy(how=How.XPATH, using ="//input[@type='checkbox']")
	WebElement CheckboxTermsandConditions;
	
	@FindBy(how=How.XPATH, using ="//span[@class='fw-bold']")
	WebElement Accept;
	
	@FindBy(how=How.XPATH, using="//div[@class='toast-body']")
	WebElement Toast;
	
	public void EnterUserFirstname(String arg) {
		getTest().log(LogStatus.INFO, "Entered Firstname", arg);
		try {
			firstname.clear();
			firstname.sendKeys(arg);
		} catch (Exception e) {
		}
	}
	
	public void EnterUserLastname(String arg) {
		getTest().log(LogStatus.INFO, "Entered Lastname", arg);
		try {
			lastname.clear();
			lastname.sendKeys(arg);
		} catch (Exception e) {
		}
	}
	
	public void EnterEmailId(String arg) {
		getTest().log(LogStatus.INFO, "Entered Email", arg);
		try {
			Emailid.clear();
			Emailid.sendKeys(arg);
		} catch (Exception e) {
		}
	}
	
	public void EnterPhoneZipcode(String arg) {
		getTest().log(LogStatus.INFO, "Selected Phone zipCode", arg);
		try {
			if(arg.equals(Phonezipcode2.getText().trim()))
			{
				Phonezipcode2.click();				
			}
			else
			{
				Phonezipcode1.click();
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void EnterPhoneNumber(String arg) {
		getTest().log(LogStatus.INFO, "Entered PhoneNumber", arg);
		try {
			PhoneNumber.clear();
			PhoneNumber.sendKeys(arg);
		} catch (Exception e) {
		}
	}
	
	public void EnterPassword(String arg) {
		getTest().log(LogStatus.INFO, "Entered Password", arg);
		try {
			Password.clear();
			Password.sendKeys(arg);
		} catch (Exception e) {
		}
	}
	
	public void Clickbutton() {
		getTest().log(LogStatus.INFO, "Pressed CLick button");
		try {
			ClickNext.click();
		} catch (Exception e) {
		}
	}
	
	public void EnterDOB(String arg) {
		getTest().log(LogStatus.INFO, "Entered Date of birth", arg);
		try {
			DateofBirth.clear();
			DateofBirth.sendKeys(arg);
		} catch (Exception e) {
		}
	}
	public void EnteredGender(String arg) {
		getTest().log(LogStatus.INFO, "Selected Gender", arg);
		try {
			if(arg.matches(GenderMale.getText().trim()))
			{
				GenderMale.click();
			}
			else if(arg.matches(GenderFemale.getText().trim()))
			{
				GenderFemale.click();
			}
			else
			{	
				GenderOthers.click();
			}
					
		} catch (Exception e) {
		}
	}
	public void ClickedNext2() {
		getTest().log(LogStatus.INFO, "Clicked Next button");
		try {
			ClickNext2.click();
		} catch (Exception e) {
		}
	}
	
	public void CheckedTerms() {
		
		try {
//			JavascriptExecutor executor = (JavascriptExecutor)driver;
//			executor.executeScript("arguments[0].click();", CheckboxTermsandConditions);
			CheckboxTermsandConditions.click();
			getTest().log(LogStatus.INFO, "Checked Terms and conditions");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void ClickedAccept() {
		
		try {
			Accept.click();
			getTest().log(LogStatus.INFO, "Clicked Accept");
		} catch (Exception e) {
		}
	}
	
	public String verifyToast() {
		getTest().log(LogStatus.INFO, "Current Toast value is ", Toast.getText());
		return Toast.getText();
	}
	
	String toast1 = "OTP Sent on Email!!";
	String toast2 = "Email Already Exists";
	String toast3 = "Phone # Already Exists";
	String toast4 = "Please use a valid mobile number";
	String toast5 = "Birthday should be DD-MM-YYYY";
	
	//1.)User Registration for valid user data
	public void User_RegisterWithValidData(ArrayList<Object> myData) throws InterruptedException {
		System.out.println("User Register with valid data");
		try {
			getTest().log(LogStatus.INFO, "Testing Against Scenario", myData.get(8).toString());
			EnterUserFirstname(myData.get(0).toString());
			Thread.sleep(1000);
			EnterUserLastname(myData.get(1).toString());
			Thread.sleep(1000);
			EnterEmailId(myData.get(2).toString());
			Thread.sleep(1000);
			EnterPhoneZipcode(myData.get(3).toString());
			Thread.sleep(1000);
			EnterPhoneNumber(myData.get(4).toString());
			Thread.sleep(1000);
			EnterPassword(myData.get(5).toString());
			Thread.sleep(1000);
			Clickbutton();
			Thread.sleep(2000);
			EnterDOB(myData.get(6).toString());
			Thread.sleep(1000);
			EnteredGender(myData.get(7).toString());
			Thread.sleep(3000);
			ClickedNext2();
			Thread.sleep(3000);
			CheckedTerms();
			Thread.sleep(3000);
			ClickedAccept();	
			Thread.sleep(3000);		
			verifyToast();
			getTest().log(LogStatus.INFO, "Expected Toast is: ", toast1);
			Assert.assertEquals(verifyToast(), toast1);
		} catch(Exception e){
			if(error_message.size()>0)
			{
				Assert.assertTrue(false, "Test Failed");
			}else {
				Assert.assertTrue(true, "Test Passed");
			}
		}
	}
		
	//2.) User Registration for existing emailID
	
		public void User_RegisterWithExistingEmailid(ArrayList<Object> myData) throws InterruptedException {
			System.out.println("User Register with existing EmailID");
			try {
				getTest().log(LogStatus.INFO, "Testing Against Scenario", myData.get(8).toString());
				EnterUserFirstname(myData.get(0).toString());
				Thread.sleep(1000);
				EnterUserLastname(myData.get(1).toString());
				Thread.sleep(1000);
				EnterEmailId(myData.get(2).toString());
				Thread.sleep(1000);
				EnterPhoneZipcode(myData.get(3).toString());
				Thread.sleep(1000);
				EnterPhoneNumber(myData.get(4).toString());
				Thread.sleep(1000);
				EnterPassword(myData.get(5).toString());
				Thread.sleep(1000);
				Clickbutton();
				Thread.sleep(2000);
				EnterDOB(myData.get(6).toString());
				Thread.sleep(1000);
				EnteredGender(myData.get(7).toString());
				Thread.sleep(3000);
				ClickedNext2();
				Thread.sleep(3000);
				CheckedTerms();
				Thread.sleep(3000);
				ClickedAccept();	
				Thread.sleep(3000);		
				verifyToast();
				getTest().log(LogStatus.INFO, "Expected Toast is: ", toast2);
				Assert.assertEquals(verifyToast(), toast2);
			} catch(Exception e){
				if(error_message.size()>0)
				{
					Assert.assertTrue(false, "Test Failed");
				}else {
					Assert.assertTrue(true, "Test Passed");
				}
			}
		}
			//3.) User Registration for existingPhoneNumber
			
			public void User_RegisterWithExistingPhoneNumber(ArrayList<Object> myData) throws InterruptedException {
				System.out.println("User Register with existing phonenumber");
				try {
					getTest().log(LogStatus.INFO, "Testing Against Scenario", myData.get(8).toString());
					EnterUserFirstname(myData.get(0).toString());
					Thread.sleep(1000);
					EnterUserLastname(myData.get(1).toString());
					Thread.sleep(1000);
					EnterEmailId(myData.get(2).toString());
					Thread.sleep(1000);
					EnterPhoneZipcode(myData.get(3).toString());
					Thread.sleep(1000);
					EnterPhoneNumber(myData.get(4).toString());
					Thread.sleep(1000);
					EnterPassword(myData.get(5).toString());
					Thread.sleep(1000);
					Clickbutton();
					Thread.sleep(2000);
					EnterDOB(myData.get(6).toString());
					Thread.sleep(1000);
					EnteredGender(myData.get(7).toString());
					Thread.sleep(3000);
					ClickedNext2();
					Thread.sleep(3000);
					CheckedTerms();
					Thread.sleep(3000);
					ClickedAccept();	
					Thread.sleep(3000);		
					verifyToast();
					getTest().log(LogStatus.INFO, "Expected Toast is: ", toast3);
					Assert.assertEquals(verifyToast(), toast3);
				} catch(Exception e){
					if(error_message.size()>0)
					{
						Assert.assertTrue(false, "Test Failed");
					}else {
						Assert.assertTrue(true, "Test Passed");
					}
				}
	}
			
			//4.) User Registration for invalid PHone number
			
			public void User_RegisterWithInvalidPhonenumber(ArrayList<Object> myData) throws InterruptedException {
				System.out.println("User Register with invalid phone number");
				try {
					getTest().log(LogStatus.INFO, "Testing Against Scenario", myData.get(8).toString());
					EnterUserFirstname(myData.get(0).toString());
					Thread.sleep(1000);
					EnterUserLastname(myData.get(1).toString());
					Thread.sleep(1000);
					EnterEmailId(myData.get(2).toString());
					Thread.sleep(1000);
					EnterPhoneZipcode(myData.get(3).toString());
					Thread.sleep(1000);
					EnterPhoneNumber(myData.get(4).toString());
					Thread.sleep(1000);
					EnterPassword(myData.get(5).toString());
					Thread.sleep(1000);
					Clickbutton();
					Thread.sleep(2000);
					EnterDOB(myData.get(6).toString());
					Thread.sleep(1000);
					EnteredGender(myData.get(7).toString());
					Thread.sleep(3000);
					ClickedNext2();
					Thread.sleep(3000);
					CheckedTerms();
					Thread.sleep(3000);
					ClickedAccept();	
					Thread.sleep(3000);		
					verifyToast();
					getTest().log(LogStatus.INFO, "Expected Toast is: ", toast4);
					Assert.assertEquals(verifyToast(), toast4);
				} catch(Exception e){
					if(error_message.size()>0)
					{
						Assert.assertTrue(false, "Test Failed");
					}else {
						Assert.assertTrue(true, "Test Passed");
					}
				}
			}
				
				//5.) User Registration for existing Invalid Birthdate
				
				public void User_RegisterWithInvalidBirthdate(ArrayList<Object> myData) throws InterruptedException {
					System.out.println("User Register with invalid birthdate");
					try {
						getTest().log(LogStatus.INFO, "Testing Against Scenario", myData.get(8).toString());
						Thread.sleep(2000);
						EnterUserFirstname(myData.get(0).toString());
						Thread.sleep(1000);
						EnterUserLastname(myData.get(1).toString());
						Thread.sleep(1000);
						EnterEmailId(myData.get(2).toString());
						Thread.sleep(1000);
						EnterPhoneZipcode(myData.get(3).toString());
						Thread.sleep(1000);
						EnterPhoneNumber(myData.get(4).toString());
						Thread.sleep(1000);
						EnterPassword(myData.get(5).toString());
						Thread.sleep(1000);
						Clickbutton();
						Thread.sleep(2000);
						EnterDOB(myData.get(6).toString());
						Thread.sleep(1000);
						EnteredGender(myData.get(7).toString());
						Thread.sleep(3000);
						ClickedNext2();
						Thread.sleep(3000);
						CheckedTerms();
						Thread.sleep(3000);
						ClickedAccept();	
						Thread.sleep(3000);		
						verifyToast();
						getTest().log(LogStatus.INFO, "Expected Toast is: ", toast5);
						Assert.assertEquals(verifyToast(),toast5);
					} catch(Exception e){
						if(error_message.size()>0)
						{
							Assert.assertTrue(false, "Test Failed");
						}else {
							Assert.assertTrue(true, "Test Passed");
						}
					}
				}
}
			

