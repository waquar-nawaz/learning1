package nopComm_config;

//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utility.ReadConfig;

public class BaseTest {
	
	WebDriver driver;
	ReadConfig conf;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		System.out.println("launching an app on chrome browser");
		driver = new ChromeDriver();
		
		
		//fetch the value from config file
		
		conf = new ReadConfig();
		System.out.println("fetch application URL: "+ conf.getAppURL());
		
		
		driver.get(conf.getAppURL());
		
		
		
		
		driver.manage().window().maximize();
		
	}
	
	@AfterTest
	public void closeApp() {
		System.out.println("closing an app");
		
		driver.close();
		
	}
	
	

}
