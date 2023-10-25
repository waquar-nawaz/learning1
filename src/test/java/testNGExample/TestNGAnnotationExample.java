package testNGExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationExample {
	
	//execution workflow  --------
	WebDriver driver;
	
	
	@BeforeSuite
	public void Setup() {
		
		System.out.println("==============BeforeSuite=======================");
		
		
	}
	
	@AfterSuite
	public void teardown() {
		
		System.out.println("==============AfterSuite=======================");
		
		
	}
	
	@BeforeTest
	public void launchApp() {
		
		System.out.println("*******************BeforeTest*******************");
		
		
	}
	
	@AfterTest
	public void closeApp() {
		
		System.out.println("*******************AfterTest*******************");
		
		
	}
	
	

	@BeforeClass
	public void BeforeClass() {
		
		System.out.println("*******************BeforeClass*******************");
		
		
	}
	
	@AfterClass
	public void AfterClass() {
		
		System.out.println("*******************AfterClass*******************");
		
		
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		
		System.out.println("%%%%%%%%%%%%%%BeforeMethod%%%%%%%%%%%%%%");
		
//		driver = new ChromeDriver();
		
		
	}
	
	@AfterMethod
	public void AfterMethod() throws Exception {
		
		System.out.println("%%%%%%%%%%%%%%AfterMethod%%%%%%%%%%%%%%");
		Thread.sleep(4000);
//		driver.close();
//		driver.quit();
	}
	
	
	
	@Test(priority = -1)
	public void login() {
		System.out.println("login test case execution.......");
		
	}
	
	@Test
	public void logout() {
		System.out.println("logout test case execution.......");
		
	}
	

	@Test
	public void addItem() {
		System.out.println("addItem test case execution.......");
		
	}
	

}
