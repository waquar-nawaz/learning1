package locatorExample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Constants;

public class HRMLogin {
	WebDriver driver ;
	
	@Before
	public void launchApp() {
		driver = new ChromeDriver();
		driver.get(Constants.nop_app);
		
		driver.manage().window().maximize();
		
		
	}
	
	@After
	public void closeApp() throws Exception {
		
		Thread.sleep(5000);
		driver.close();
		
	}
	
	
	
	@Test
	public void verifyLoginfeature() throws Exception {
		
		Thread.sleep(3000);
		
		//locator 
//		id
//		name
//		classname
//		tagname
//
//
//		linktext
//		partialLinktext
//
//		css selector
//		xpath
		
		
		//id
		
		
		//name
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		
		
		//tagname
		driver.findElement(By.tagName("button")).click();
		
		
		//validation Step
		System.out.println("=============after login=====================");
		System.out.println("URL: " +driver.getCurrentUrl());
		System.out.println("Title" +driver.getTitle());
		Thread.sleep(3000);
		
		//className
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		
		Thread.sleep(3000);
		
		
		//Linktext
		//driver.findElement(By.linkText("Logout")).click();   -------- linktext ----- exact text  ---- Logout
		
		
		
		//partialLinktext
		driver.findElement(By.partialLinkText("ogou")).click(); //-------- partialLinkText ----- partial text ----- Log
		
		
		//validation Step
		System.out.println("=============after logout=====================");
		System.out.println("URL: " +driver.getCurrentUrl());
		System.out.println("Title" +driver.getTitle());
		
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
	}

}
