package po;

import static resources.ExtentTestManager.getTest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

public class Po_SuperTournamentBracket {
	
	WebDriver driver;
		
	public Po_SuperTournamentBracket(WebDriver driver) {
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
	
	@FindBy(how=How.XPATH,using="//span[@class='p-2'][text()=' Super Tournament ']")
	WebElement ClickSuperTournament;
	
	@FindBy(how=How.XPATH,using="//div[@class='w-100 p-3 cursor text-center btn-orange'][1]")
	WebElement SuperTournamentPlay;
	
	@FindBy(how=How.XPATH,using="//span[@class='me-1'][text()='Create Bracket']")
	WebElement ClickCreateBracket;
	
	@FindBy(how=How.XPATH,using="//input[@id='bracket-name']")
	WebElement BracketName;
	
	@FindBy(how=How.XPATH,using="//div[text()='Create']")
	WebElement CreateBracket;
	
	@FindBy(how=How.XPATH,using="//div[@class='toast-body']")
	WebElement Toast;
	
	@FindBy(how=How.XPATH,using="//li[@id='tournament']")
	WebElement ClickTournament; 
	
//Bracket Predictions    ------------------------------------------------------------------------------------------>
	
	@FindBy(how=How.XPATH,using="//li[@data-bs-toggle='tooltip']")
	WebElement UserBracketName;
	
	@FindBy(how=How.XPATH,using="//div[@id='dropdownMenuLink']")
	WebElement BracketDropDown;
	
	@FindBy(how=How.XPATH,using="//ul/descendant::app-simple-dropdown-item[1]")
	WebElement BracketQuarters1;
	
	@FindBy(how=How.XPATH,using="//ul/descendant::app-simple-dropdown-item[2]")
	WebElement BracketQuarters2;
	
	@FindBy(how=How.XPATH,using="//ul/descendant::app-simple-dropdown-item[3]")
	WebElement BracketQuarters3;
	
	@FindBy(how=How.XPATH,using="//ul/descendant::app-simple-dropdown-item[4]")
	WebElement BracketQuarters4;
	
	@FindBy(how=How.XPATH,using="//ul/descendant::app-simple-dropdown-item[5]")
	WebElement BracketQuarters5;
	
	@FindBy(how=How.XPATH,using="//div[@class='d-flex w-100 p-3 cursor btn-grey-orange']")
	WebElement EditBracket;
	
	
	@FindBy(how=How.XPATH,using="//div[@class='credit-widget-amount ps-1 pe-2 d-none d-md-block']")
	WebElement CoinTotal;
	
	@FindBy(how=How.XPATH,using="(//div[@class='w-100 p-3 cursor text-center btn-orange'])[1]")
	WebElement ClickPredict;
	
	@FindBy(how=How.XPATH,using="(//span[@class='text-orange'])[contains(text(),'Credit')]")
	WebElement CreditCost;
		
	@FindBy(how=How.XPATH,using="(//div[@class='white-circle top40pc bg-white teams-select'])[1]")
	WebElement Prediction1;
	
	@FindBy(how=How.XPATH,using="(//img[@class='team-action-icon top35pc cursor'])[1]")
	WebElement OverridePrediction;
	
	@FindBy(how=How.XPATH,using="(//div[@class='w-100 p-3 cursor text-center btn-orange'])[2]")
	WebElement OverrideClick;
	
	
//Brackets position --------------------------------------------------------------------------------------------------------->

	
	@FindBy(how=How.XPATH,using="(//app-bracket-item)[1]")
	WebElement Bracket1;

	@FindBy(how=How.XPATH,using="(//app-bracket-item)[2]")
	WebElement Bracket2;

	@FindBy(how=How.XPATH,using="(//app-bracket-item)[3]")
	WebElement Bracket3;

	@FindBy(how=How.XPATH,using="(//app-bracket-item)[4]")
	WebElement Bracket4;

	@FindBy(how=How.XPATH,using="(//app-bracket-item)[5]")
	WebElement Bracket5;


	@FindBy(how=How.XPATH,using="(//app-bracket-item)[6]")
	WebElement Bracket6;


	@FindBy(how=How.XPATH,using="(//app-bracket-item)[7]")
	WebElement Bracket7;


	@FindBy(how=How.XPATH,using="(//app-bracket-item)[8]")
	WebElement Bracket8;


	@FindBy(how=How.XPATH,using="(//app-bracket-item)[9]")
	WebElement Bracket9;


	@FindBy(how=How.XPATH,using="(//app-bracket-item)[10]")
	WebElement Bracket10;


	@FindBy(how=How.XPATH,using="(//app-bracket-item)[11]")
	WebElement Bracket11;


	@FindBy(how=How.XPATH,using="(//app-bracket-item)[12]")
	WebElement Bracket12;


	@FindBy(how=How.XPATH,using="(//app-bracket-item)[13]")
	WebElement Bracket13;


	@FindBy(how=How.XPATH,using="(//app-bracket-item)[14]")
	WebElement Bracket14;


	@FindBy(how=How.XPATH,using="(//app-bracket-item)[15]")
	WebElement Bracket15;


	@FindBy(how=How.XPATH,using="(//app-bracket-item)[16]")
	WebElement Bracket16;


	@FindBy(how=How.XPATH,using="(//app-bracket-item)[17]")
	WebElement Bracket17;


	@FindBy(how=How.XPATH,using="(//app-bracket-item)[18]")
	WebElement Bracket18;


	@FindBy(how=How.XPATH,using="(//app-bracket-item)[19]")
	WebElement Bracket19;


	@FindBy(how=How.XPATH,using="(//app-bracket-item)[20]")
	WebElement Bracket20;


	@FindBy(how=How.XPATH,using="(//app-bracket-item)[21]")
	WebElement Bracket21;


	@FindBy(how=How.XPATH,using="(//app-bracket-item)[22]")
	WebElement Bracket22;


	@FindBy(how=How.XPATH,using="(//app-bracket-item)[23]")
	WebElement Bracket23;


	@FindBy(how=How.XPATH,using="(//app-bracket-item)[24]")
	WebElement Bracket24;


	@FindBy(how=How.XPATH,using="(//app-bracket-item)[25]")
	WebElement Bracket25;


	@FindBy(how=How.XPATH,using="(//app-bracket-item)[26]")
	WebElement Bracket26;


	@FindBy(how=How.XPATH,using="(//app-bracket-item)[27]")
	WebElement Bracket27;


	@FindBy(how=How.XPATH,using="(//app-bracket-item)[28]")
	WebElement Bracket28;


	@FindBy(how=How.XPATH,using="(//app-bracket-item)[29]")
	WebElement Bracket29;


	@FindBy(how=How.XPATH,using="(//app-bracket-item)[30]")
	WebElement Bracket30;


	@FindBy(how=How.XPATH,using="(//app-bracket-item)[32]")
	WebElement Bracket32;
	
	

// Super Tournament Menu -------------------------------------------------------------------------------------->

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
	
	public void ClickSuperTournament() {
		getTest().log(LogStatus.INFO, "Clicked SuperTournament");
		try {
			ClickSuperTournament.click();
		} catch (Exception e) {
		}
	}
	
	public void ClickSuperTournamentPlay() {
		getTest().log(LogStatus.INFO, "Clicked SuperTournament");
		try {
			SuperTournamentPlay.click();
		} catch (Exception e) {
		}
	}
	
	public void ClickCreateBracket() {
		getTest().log(LogStatus.INFO, "Clicked Create Bracket");
		try {
			ClickCreateBracket.click();
		} catch (Exception e) {
		}
	}
	
	public void EnterBracketName(String arg) {
		getTest().log(LogStatus.INFO, "Entered Bracket Name", arg);
		try {
			BracketName.sendKeys(arg);
		} catch (Exception e) {
		}
	}
	
	public void ClickCreateBracket2() {
		getTest().log(LogStatus.INFO, "Clicked Final CreateBracket");
		try {
			CreateBracket.click();
		} catch (Exception e) {
		}
	}
	
	public void ClickTournament() {
		getTest().log(LogStatus.INFO, "Clicked Tournament");
		try {
			ClickTournament.click();
		} catch (Exception e) {
		}
	}
	
	public String VerifyToast() {
		getTest().log(LogStatus.INFO, "Current Toast value is ", Toast.getText());
		return Toast.getText();	
	}
	
//MidWest Bracket Predictions  Methods------------------------------------------------------------------------------------------------------>
	
	public void ClickUserBracket() {
		getTest().log(LogStatus.INFO, "Clicked User Bracket");
		try {
			UserBracketName.click();
		} catch (Exception e) {
		}
	}
	
	public void DropDownQuarters(String arg) {
		getTest().log(LogStatus.INFO, "Selected DropDown Quarter");
		try {
			if(arg.equals(BracketQuarters1.getText().trim()))
			{	BracketQuarters1.click(); }
			else if(arg.equals(BracketQuarters2.getText().trim()))
			{ 	BracketQuarters2.click();  }
			else if(arg.equals(BracketQuarters3.getText().trim()))
			{   BracketQuarters3.click();  }
			else if(arg.equals(BracketQuarters4.getText().trim()))
			{ BracketQuarters4.click(); }
			else
			{ BracketQuarters5.click(); }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void EditBracket() {
		getTest().log(LogStatus.INFO, "Edit Bracket");
		try {
			EditBracket.click();
		} catch (Exception e) {
		}
	}
	
	public int CoinTotal() {
		try {
			
			return Integer.parseInt(CoinTotal.getText().trim());
		} catch (Exception e) {
		}
		return Integer.parseInt(CoinTotal.getText().trim());
	}
	
	public int CreditCost() {
		getTest().log(LogStatus.INFO, "Credit Cost is ", CreditCost.getText().trim().split("C")[0].trim());
		try {
			return Integer.parseInt(CreditCost.getText().trim().split("C")[0].trim());
		} catch (NumberFormatException e) {
		}
		return Integer.parseInt(CreditCost.getText().trim().split("C")[0].trim());
	}

	public void ScrollDown() {
		try {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,360)");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	int TotalCoins;
	int Creditcost;
	int i;
	
	public void Predictions() {
			
		try {
			i=i+1;
			TotalCoins = CoinTotal();
			Prediction1.click();
			Thread.sleep(1000);
			Creditcost = CreditCost();
			Thread.sleep(1000);
			ClickPredict.click();
			Thread.sleep(2500);
			Assert.assertEquals(Toast.getText(),toast4);
			Thread.sleep(2000);
			Assert.assertEquals(CoinTotal(),TotalCoins-Creditcost);
			Thread.sleep(2000);
			TotalCoins = CoinTotal();
			Thread.sleep(2000);
			getTest().log(LogStatus.INFO, "Prediction "+String.valueOf(i)+" used,Total Coins are", String.valueOf(TotalCoins));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	String BeforeOverride;
	String AfterOverride;
	String Team1;
	String Team2;
	int n;
	int m=17;
	
	public void OverRide() {
			
		try {
			n=n+1;
			WebElement[] brackets = {OverrideClick,Bracket1,Bracket2,Bracket3,Bracket4,Bracket5,Bracket6,Bracket7,Bracket8,Bracket9,Bracket10,
								 	 Bracket11,Bracket12,Bracket13,Bracket14,Bracket15,Bracket16,Bracket17,Bracket18,Bracket19,Bracket20,
								 	 Bracket21,Bracket22,Bracket23,Bracket24,Bracket25,Bracket26,Bracket27,Bracket28,Bracket29,Bracket30,
								 	 Bracket32};
			BeforeOverride = brackets[m].getText().trim();
			Thread.sleep(1000);
			Team1 = brackets[n].getText().trim();
			Team2 = brackets[n+1].getText().trim();
			OverridePrediction.click();
			Thread.sleep(2000);
			OverrideClick.click();
			Thread.sleep(2000);
			AfterOverride = brackets[m].getText().trim();
			Thread.sleep(2000);
			getTest().log(LogStatus.INFO, "Before Override value is ", BeforeOverride);
			Thread.sleep(1000);
			getTest().log(LogStatus.INFO, "After Override value is ", AfterOverride);
			n=n+1;
			m=m+1;
			Thread.sleep(1000);
			if(BeforeOverride.equals(Team1))
			{
				Assert.assertEquals(AfterOverride, Team2);
			}
			else
			{
				Assert.assertEquals(AfterOverride, Team1);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	String toast1 = "Login Success";
	String toast2 = "Bracket created successfully";
	String toast3 = "Only one bracket is allowed in Super Tournament";
	String toast4 = "Prediction used successfully";
	String toast5 = "Error:Prediction is already used for these teams";
	
	String toast6 = "sukrut1 Tournament created";
	
	//1.)New User Bracket Creation
	
//		public void UserBracketCreation(ArrayList<Object> myData) throws InterruptedException {
//			System.out.println("Valid Bracket Creation");
//			try {
//				getTest().log(LogStatus.INFO, "Testing Against Scenario", myData.get(3).toString());
//				EnterEmailID(myData.get(0).toString());
//				Thread.sleep(3000);
//				EnterPassword(myData.get(1).toString());
//				Thread.sleep(3000);
//				Clicklogin();
//				Thread.sleep(3000);
//				getTest().log(LogStatus.INFO, "Expected Toast is: ", toast1);
//				Assert.assertEquals(VerifyToast(), toast1);
//				System.out.println(VerifyToast());
//				ClickSuperTournament();
//				Thread.sleep(4000);
//				ClickSuperTournamentPlay();
//				Thread.sleep(2000);
//				ClickCreateBracket();
//				Thread.sleep(4000);
//				EnterBracketName(myData.get(2).toString());
//				Thread.sleep(3000);
//				ClickCreateBracket2();
//				Thread.sleep(3000);
//				getTest().log(LogStatus.INFO, "Expected Toast is: ", toast2);
//				Assert.assertEquals(VerifyToast(), toast2);
//				System.out.println(VerifyToast());
//				getTest().log(LogStatus.INFO, "Expected Toast is: ", toast3);
//				Assert.assertEquals(VerifyToast(), toast3);
//				Thread.sleep(3000);
//				ClickTournament();
//				Thread.sleep(1000);
//				ClickSuperTournament();
//				Thread.sleep(4000);
//				ClickSuperTournamentPlay();
//				Thread.sleep(3000);
//				ClickCreateBracket();
//				Thread.sleep(2000);	
//				getTest().log(LogStatus.INFO, "Expected Toast is: ", toast3);
//				Assert.assertEquals(VerifyToast(), toast3);
//			} catch(Exception e){
//				if(error_message.size()>0)
//				{
//					Assert.assertTrue(false, "Test Failed");
//				}else {
//					Assert.assertTrue(true, "Test Passed");
//				}
//			}
//		}
		
//2.) Bracket Predictions for All Quadrants: 
		
		public void UserBracketPredictions(ArrayList<Object> myData){
			System.out.println("Bracket Predictions for Quadrant "+myData.get(4).toString());
			try {
				getTest().log(LogStatus.INFO, "Testing Against Scenario", myData.get(3).toString());
				Thread.sleep(3000);
				EnterEmailID(myData.get(0).toString());
				Thread.sleep(3000);
				EnterPassword(myData.get(1).toString());
				Thread.sleep(3000);
				Clicklogin();
				Thread.sleep(4000);
				getTest().log(LogStatus.INFO, "Expected Toast is: ", toast1);
				Assert.assertEquals(VerifyToast(), toast1);
				System.out.println(VerifyToast());
				ClickSuperTournament();
				Thread.sleep(2000);
				ClickUserBracket();
				Thread.sleep(2000);
				BracketDropDown.click();
				Thread.sleep(2000);
				DropDownQuarters(myData.get(4).toString());
				Thread.sleep(1000);
				EditBracket();
				Thread.sleep(1000);
				ScrollDown();
				Thread.sleep(2000);
//1st Round----------------------------------------------------------->
				
				Bracket1.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket1.getText(), Bracket17.getText()); 
				Bracket2.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket2.getText(), Bracket17.getText());
				Bracket3.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket3.getText(), Bracket18.getText()); 
				Bracket4.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket4.getText(), Bracket18.getText());
				Bracket5.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket5.getText(), Bracket19.getText()); 
				Bracket6.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket6.getText(), Bracket19.getText()); 
				Bracket7.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket7.getText(), Bracket20.getText());
				Bracket8.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket8.getText(), Bracket20.getText()); 
				Bracket9.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket9.getText(), Bracket21.getText());
				Bracket10.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket10.getText(), Bracket21.getText()); 
				Bracket11.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket11.getText(), Bracket22.getText()); 
				Bracket12.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket12.getText(), Bracket22.getText());
				Bracket13.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket13.getText(), Bracket23.getText());
				Bracket14.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket14.getText(), Bracket23.getText()); 
				Bracket15.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket15.getText(), Bracket24.getText());
				Bracket16.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket16.getText(), Bracket24.getText());
//2nd Round ------------------------------------------------------->
				Bracket17.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket17.getText(), Bracket25.getText()); 
				Bracket1.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket1.getText(), Bracket17.getText());	
				Bracket17.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket17.getText(), Bracket25.getText()); 
				Bracket18.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket18.getText(), Bracket25.getText());
				Bracket3.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket3.getText(), Bracket18.getText());
				Bracket18.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket18.getText(), Bracket25.getText()); 
				Bracket19.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket19.getText(), Bracket26.getText()); 
				Bracket5.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket5.getText(), Bracket19.getText());
				Bracket19.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket19.getText(), Bracket26.getText()); 
				Bracket20.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket20.getText(), Bracket26.getText()); 
				Bracket7.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket7.getText(), Bracket20.getText());
				Bracket20.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket20.getText(), Bracket26.getText()); 
				Bracket21.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket21.getText(), Bracket27.getText()); 
				Bracket9.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket9.getText(), Bracket21.getText());
				Bracket21.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket21.getText(), Bracket27.getText()); 
				Bracket22.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket22.getText(), Bracket27.getText()); 
				Bracket11.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket11.getText(), Bracket22.getText()); 
				Bracket22.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket22.getText(), Bracket27.getText()); 
				Bracket23.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket23.getText(), Bracket28.getText()); 
				Bracket13.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket13.getText(), Bracket23.getText());
				Bracket23.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket23.getText(), Bracket28.getText()); 
				Bracket24.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket24.getText(), Bracket28.getText());
				Bracket15.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket15.getText(), Bracket24.getText());
				Bracket24.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket24.getText(), Bracket28.getText());
				Bracket16.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket16.getText(), Bracket24.getText());
				Bracket24.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket24.getText(), Bracket28.getText());
				
						
//3rd Round --------------------------------------------------------->
				Bracket25.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket25.getText(), Bracket29.getText());
				getTest().log(LogStatus.INFO, Bracket3.getText()+" Selected for Quarter Semifinalist");
				Bracket1.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket1.getText(), Bracket17.getText());	
				Bracket17.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket17.getText(), Bracket25.getText());
				Bracket25.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket25.getText(), Bracket29.getText()); 
				getTest().log(LogStatus.INFO, Bracket1.getText()+" Selected for Quarter Semifinalist");
				Bracket2.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket2.getText(), Bracket17.getText());
				Bracket17.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket17.getText(), Bracket25.getText());	
				Bracket25.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket25.getText(), Bracket29.getText()); 
				getTest().log(LogStatus.INFO, Bracket2.getText()+" Selected for Quarter Semifinalist");
				Bracket4.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket4.getText(), Bracket18.getText());
				Bracket18.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket18.getText(), Bracket25.getText()); 
				Bracket25.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket25.getText(), Bracket29.getText()); 
				getTest().log(LogStatus.INFO, Bracket4.getText()+" Selected for Quarter Semifinalist");	
				Bracket26.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket26.getText(), Bracket29.getText());
				getTest().log(LogStatus.INFO, Bracket7.getText()+" Selected for Quarter Semifinalist");
				Bracket5.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket5.getText(), Bracket19.getText());
				Bracket19.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket19.getText(), Bracket26.getText()); 
				Bracket26.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket26.getText(), Bracket29.getText());
				getTest().log(LogStatus.INFO, Bracket5.getText()+" Selected for Quarter Semifinalist");
				Bracket6.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket6.getText(), Bracket19.getText()); 
				Bracket19.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket19.getText(), Bracket26.getText()); 
				Bracket26.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket26.getText(), Bracket29.getText());
				getTest().log(LogStatus.INFO, Bracket6.getText()+" Selected for Quarter Semifinalist");
				Bracket8.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket8.getText(), Bracket20.getText());
				Bracket20.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket20.getText(), Bracket26.getText()); 		
				Bracket26.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket26.getText(), Bracket29.getText());
				getTest().log(LogStatus.INFO, Bracket8.getText()+" Selected for Quarter Semifinalist");
				Bracket27.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket27.getText(), Bracket30.getText());
				getTest().log(LogStatus.INFO, Bracket11.getText()+" Selected for Quarter Semifinalist");
				Bracket9.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket9.getText(), Bracket21.getText());
				Bracket21.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket21.getText(), Bracket27.getText());
				Bracket27.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket27.getText(), Bracket30.getText());
				getTest().log(LogStatus.INFO, Bracket9.getText()+" Selected for Quarter Semifinalist");
				Bracket10.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket10.getText(), Bracket21.getText()); 
				Bracket21.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket21.getText(), Bracket27.getText());
				Bracket27.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket27.getText(), Bracket30.getText());
				getTest().log(LogStatus.INFO, Bracket10.getText()+" Selected for Quarter Semifinalist");
				Bracket12.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket12.getText(), Bracket22.getText());
				Bracket22.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket22.getText(), Bracket27.getText()); 
				Bracket27.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket27.getText(), Bracket30.getText());
				getTest().log(LogStatus.INFO, Bracket12.getText()+" Selected for Quarter Semifinalist");
				Bracket28.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket28.getText(), Bracket30.getText());
				getTest().log(LogStatus.INFO, Bracket15.getText()+" Selected for Quarter Semifinalist");
				Bracket13.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket13.getText(), Bracket23.getText());
				Bracket23.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket23.getText(), Bracket28.getText()); 
				Bracket28.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket28.getText(), Bracket30.getText());
				getTest().log(LogStatus.INFO, Bracket13.getText()+" Selected for Quarter Semifinalist");
				Bracket14.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket14.getText(), Bracket23.getText()); 
				Bracket23.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket23.getText(), Bracket28.getText()); 
				Bracket28.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket28.getText(), Bracket30.getText());
				getTest().log(LogStatus.INFO, Bracket14.getText()+" Selected for Quarter Semifinalist");
				Bracket16.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket16.getText(), Bracket24.getText());
				Bracket24.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket24.getText(), Bracket28.getText());  
				Bracket28.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket28.getText(), Bracket30.getText());
				getTest().log(LogStatus.INFO, Bracket16.getText()+" Selected for Quarter Semifinalist");


//4.) Last Round Predictions---------------------------------------------------------->
				
				Bracket29.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket29.getText(), Bracket32.getText());
				getTest().log(LogStatus.INFO, Bracket8.getText()+" Selected for Semifinalist");
				Bracket30.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket30.getText(), Bracket32.getText());
				getTest().log(LogStatus.INFO, Bracket16.getText()+" Selected for Semifinalist");
				Bracket1.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket1.getText(), Bracket17.getText());	
				Bracket17.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket17.getText(), Bracket25.getText());
				Bracket25.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket25.getText(), Bracket29.getText()); 
				Bracket29.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket29.getText(), Bracket32.getText()); 
				getTest().log(LogStatus.INFO, Bracket1.getText()+" Selected for Semifinalist");
				Bracket2.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket2.getText(), Bracket17.getText());
				Bracket17.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket17.getText(), Bracket25.getText());	
				Bracket25.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket25.getText(), Bracket29.getText()); 
				Bracket29.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket29.getText(), Bracket32.getText()); 
				getTest().log(LogStatus.INFO, Bracket2.getText()+" Selected for Semifinalist");
				Bracket3.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket3.getText(), Bracket18.getText());
				Bracket18.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket18.getText(), Bracket25.getText()); 
				Bracket25.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket25.getText(), Bracket29.getText()); 
				Bracket29.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket29.getText(), Bracket32.getText()); 
				getTest().log(LogStatus.INFO, Bracket3.getText()+" Selected for Semifinalist");
				Bracket4.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket4.getText(), Bracket18.getText());
				Bracket18.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket18.getText(), Bracket25.getText()); 
				Bracket25.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket25.getText(), Bracket29.getText()); 
				Bracket29.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket29.getText(), Bracket32.getText()); 
				getTest().log(LogStatus.INFO, Bracket4.getText()+" Selected for Semifinalist");
				Bracket5.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket5.getText(), Bracket19.getText());
				Bracket19.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket19.getText(), Bracket26.getText()); 
				Bracket26.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket26.getText(), Bracket29.getText());
				Bracket29.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket29.getText(), Bracket32.getText()); 
				getTest().log(LogStatus.INFO, Bracket5.getText()+" Selected for Semifinalist");
				Bracket6.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket6.getText(), Bracket19.getText()); 
				Bracket19.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket19.getText(), Bracket26.getText()); 
				Bracket26.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket26.getText(), Bracket29.getText());
				Bracket29.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket29.getText(), Bracket32.getText()); 
				getTest().log(LogStatus.INFO, Bracket6.getText()+" Selected for Semifinalist");
				Bracket7.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket7.getText(), Bracket20.getText());
				Bracket20.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket20.getText(), Bracket26.getText()); 
				Bracket26.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket26.getText(), Bracket29.getText());
				Bracket29.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket29.getText(), Bracket32.getText()); 
				getTest().log(LogStatus.INFO, Bracket7.getText()+" Selected for Semifinalist");
				Bracket9.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket9.getText(), Bracket21.getText());
				Bracket21.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket21.getText(), Bracket27.getText());
				Bracket27.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket27.getText(), Bracket30.getText());
				Bracket30.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket30.getText(), Bracket32.getText());
				getTest().log(LogStatus.INFO, Bracket9.getText()+" Selected for Semifinalist");
				Bracket10.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket10.getText(), Bracket21.getText()); 
				Bracket21.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket21.getText(), Bracket27.getText());
				Bracket27.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket27.getText(), Bracket30.getText());
				Bracket30.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket30.getText(), Bracket32.getText()); 
				getTest().log(LogStatus.INFO, Bracket10.getText()+" Selected for Semifinalist");
				Bracket11.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket11.getText(), Bracket22.getText());
				Bracket22.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket22.getText(), Bracket27.getText()); 
				Bracket27.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket27.getText(), Bracket30.getText());
				Bracket30.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket30.getText(), Bracket32.getText());
				getTest().log(LogStatus.INFO, Bracket11.getText()+" Selected for Semifinalist");			
				Bracket12.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket12.getText(), Bracket22.getText());
				Bracket22.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket22.getText(), Bracket27.getText()); 
				Bracket27.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket27.getText(), Bracket30.getText());
				Bracket30.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket30.getText(), Bracket32.getText());
				getTest().log(LogStatus.INFO, Bracket12.getText()+" Selected for Semifinalist");
				Bracket13.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket13.getText(), Bracket23.getText());
				Bracket23.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket23.getText(), Bracket28.getText()); 
				Bracket28.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket28.getText(), Bracket30.getText());
				Bracket30.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket30.getText(), Bracket32.getText());
				getTest().log(LogStatus.INFO, Bracket13.getText()+" Selected for Semifinalist");
				Bracket14.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket14.getText(), Bracket23.getText()); 
				Bracket23.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket23.getText(), Bracket28.getText()); 
				Bracket28.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket28.getText(), Bracket30.getText());
				Bracket30.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket30.getText(), Bracket32.getText()); 
				getTest().log(LogStatus.INFO, Bracket14.getText()+" Selected for Semifinalist");
				Bracket15.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket15.getText(), Bracket24.getText());
				Bracket24.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket24.getText(), Bracket28.getText());
				Bracket28.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket28.getText(), Bracket30.getText());
				Bracket30.click();
				Thread.sleep(1300);
				Assert.assertEquals(Bracket30.getText(), Bracket32.getText());
				getTest().log(LogStatus.INFO, Bracket15.getText()+" Selected for Semifinalist");
				
				
				
// Coin Debit Predictions and Override------------------------------------------------------------------------->
				
				System.out.println("Coin Debit Swipe to Predictions for Quadrant "+myData.get(4).toString());
				getTest().log(LogStatus.INFO, "Total Credits are: ", CoinTotal.getText().trim());
				Predictions();
				Thread.sleep(2500);
				Predictions();
				Thread.sleep(2500);
				Predictions();
				Thread.sleep(2500);
				Predictions();
				Thread.sleep(2500);
				Predictions();
				Thread.sleep(2500);
				Predictions();
				Thread.sleep(2500);
				Predictions();
				Thread.sleep(2500);
				Predictions();
				Thread.sleep(2500);
				Predictions();
				Thread.sleep(2500);
				Predictions();
				Thread.sleep(2500);
				Predictions();
				Thread.sleep(2500);
				Predictions();
				Thread.sleep(2500);
				Predictions();
				Thread.sleep(2500);
				Predictions();
				Thread.sleep(2500);
				Predictions();
				Thread.sleep(2500);
				
				
//Override Predictions ----------------------------------------------------------------->
				
				System.out.println("Override Predictions for Quadrant "+myData.get(4).toString());
				OverRide();
				Thread.sleep(4000);
				Predictions();
				Thread.sleep(2500);
				Predictions();
				Thread.sleep(2500);
				Predictions();
				Thread.sleep(2500);
				
				OverRide();
				Thread.sleep(4000);
				Predictions();
				Thread.sleep(2500);
				Predictions();
				Thread.sleep(2500);
				Predictions();
				Thread.sleep(2500);
				
				OverRide();
				Thread.sleep(4000);
				Predictions();
				Thread.sleep(2500);
				Predictions();
				Thread.sleep(2500);
				Predictions();
				Thread.sleep(2500);
				
				OverRide();
				Thread.sleep(4000);
				Predictions();
				Thread.sleep(2500);
				Predictions();
				Thread.sleep(2500);
				Predictions();
				Thread.sleep(2500);
				
				OverRide();
				Thread.sleep(4000);
				Predictions();
				Thread.sleep(2500);
				Predictions();
				Thread.sleep(2500);
				Predictions();
				Thread.sleep(2500);
				
				OverRide();
				Thread.sleep(4000);
				Predictions();
				Thread.sleep(2500);
				Predictions();
				Thread.sleep(2500);
				Predictions();
				Thread.sleep(2500);
				
				OverRide();
				Thread.sleep(4000);
				Predictions();
				Thread.sleep(2500);
				Predictions();
				Thread.sleep(2500);
				Predictions();
				Thread.sleep(2500);
				
				OverRide();
				Thread.sleep(4000);
				Predictions();
				Thread.sleep(2500);
				Predictions();
				Thread.sleep(2500);
				Predictions();
				Thread.sleep(2500);
				
				OverRide();
				Thread.sleep(4000);
				Predictions();
				Thread.sleep(2500);
				Predictions();
				Thread.sleep(2500);
				
				OverRide();
				Thread.sleep(4000);
				Predictions();
				Thread.sleep(2500);
				Predictions();
				Thread.sleep(2500);
				
				OverRide();
				Thread.sleep(4000);
				Predictions();
				Thread.sleep(2500);
				Predictions();
				Thread.sleep(2500);
				
				OverRide();
				Thread.sleep(4000);
				Predictions();
				Thread.sleep(2500);
				Predictions();
				Thread.sleep(2500);
				
				OverRide();
				Thread.sleep(4000);
				Predictions();
				Thread.sleep(2500);
				
				OverRide();
				Thread.sleep(4000);
				Predictions();
				Thread.sleep(2500);
				
				OverRide();
				Thread.sleep(4000);
				
						

			} catch(Exception e){
				e.printStackTrace();
				if(error_message.size()>0)
				{
					Assert.assertTrue(false, "Test Failed");
				}else {
					Assert.assertTrue(true, "Test Passed");
				}
			}
		}

		
	
	
	
		
}
