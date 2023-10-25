package rutoExample;

import org.openqa.selenium.By;
//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NOPCommAppTest {
	
	WebDriver driver;
	
//	testNG <------ Junit
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		System.out.println("launching an app on chrome browser");
		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		//http://only-testing-blog.blogspot.com/2013/11/new-test.html
		
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
	}
	
	@AfterTest
	public void closeApp() throws InterruptedException {
		System.out.println("closing an app");
		Thread.sleep(7000);
		driver.close();
		
	}
	
	
	@Test
	public void verifyLoginfeature() {
		
		
		
//		driver.findElement(By.cssSelector("input#Email")).clear();;
//		driver.findElement(By.cssSelector("input#Email")).sendKeys("admin");

		
		
		driver.findElement(By.id("Email")).clear();;
		driver.findElement(By.cssSelector("input#Email")).sendKeys("values to send");
		
		
		driver.findElement(By.xpath("//input[@name='RememberMe']")).click();
		
		driver.findElement(By.tagName("button")).click();
		
		
		
	}
	
	

}
