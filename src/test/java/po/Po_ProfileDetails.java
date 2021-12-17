package po;

import static resources.ExtentTestManager.getTest;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;


public class Po_ProfileDetails {
	
	WebDriver driver;
	
	public Po_ProfileDetails(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how=How.XPATH, using="//input[@id='email']")
	WebElement email;
	
	@FindBy(how = How.CLASS_NAME, using ="invalid-feedback")
	private List<WebElement> error_message;
	
	@FindBy(how=How.XPATH, using="//input[@type='password']")
	WebElement password;
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	WebElement LoginClick;
	
	@FindBy(how=How.XPATH,using="//div[@class='toast-body']")
	WebElement Toast;
		
	
	public void EnterEmailID(String arg) {
		getTest().log(LogStatus.INFO, "Entered EmailID", arg);
		try {
			email.clear();
			email.sendKeys(arg);
		} catch (Exception e) {
		}
	}
	
	public void EnterPassword(String arg) {
		getTest().log(LogStatus.INFO, "Entered Password", arg);
		try {
			password.clear();
			password.sendKeys(arg);
		} catch (Exception e) {
		}
	}
	
	public void Clicklogin() {
		getTest().log(LogStatus.INFO, "Clicked Login");
		try {
			LoginClick.click();
		} catch (Exception e) {
		}
	}
	
	public String VerifyToast() {
		getTest().log(LogStatus.INFO, "Current Toast value is ", Toast.getText());
		return Toast.getText();	
	}
		
	
	public void waitForElement(String string) {
	    WebDriverWait wait = new WebDriverWait(driver,10);
	    WebElement element =  wait.until(ExpectedConditions.visibilityOfElementLocated(null));
	}
	
	String toast1 = "Login Success";
	
// 1.) Validating Friend requests  -------------------------------------------------------------------------->

		public void FriendRequests(ArrayList<Object> myData)throws InterruptedException {
			System.out.println("Validating Friend requests");
			try {
				getTest().log(LogStatus.INFO, "Testing Against Scenario", myData.get(2).toString());
				EnterEmailID(myData.get(0).toString());
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				EnterPassword(myData.get(1).toString());
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				Clicklogin();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				getTest().log(LogStatus.INFO, "Expected Toast is: ", toast1);
				Assert.assertEquals(VerifyToast(), toast1);
				System.out.println(VerifyToast());
				
				
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
