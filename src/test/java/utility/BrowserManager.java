package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManager {
	
	public static WebDriver getDriver(String type) {
		WebDriver driver = null;
		if(type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver = new ChromeDriver();
		}else if(type.equalsIgnoreCase("firefox")) {
			 driver = new ChromeDriver();
		}else if(type.equalsIgnoreCase("firefox")) {
			driver = new ChromeDriver();
		}		
		return driver;
	}
}
