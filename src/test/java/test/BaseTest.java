package test;

//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.LoginPage;
import utility.Constants;

public class BaseTest {
	
	public WebDriver driver;
	public LoginPage lp;
	
//	testNG <------ Junit
	
	
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		System.out.println("launching an app on chrome browser");
		driver = new ChromeDriver();
		driver.get(Constants.hrm_app);
		//http://only-testing-blog.blogspot.com/2013/11/new-test.html
		
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		
		//Creating an object of Pages
		lp = new LoginPage(driver);
		
		
		
		
	}
	
	@AfterTest
	public void closeApp() throws InterruptedException {
		System.out.println("closing an app");
		Thread.sleep(7000);
		driver.close();
		
	}
	
	

}
