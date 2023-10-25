package conditionalExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Conditional_textBox2 {
public WebDriver driver;
	
	
	
	
	@BeforeTest
	public void launchApp() throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("http://only-testing-blog.blogspot.com/2014/01/new-testing.html?");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	
	@AfterTest
	public void closeApp() throws Exception {
		
		Thread.sleep(7000);
		driver.close();
		
		driver.quit();
	}
	
	
	@Test
	public void verifyLoginFeature() throws Exception {
		
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));				//max time before throw an exception
		wait.until(ExpectedConditions.alertIsPresent());
		
		
		
		System.out.println("********************: "+driver.switchTo().alert().getText());
		
		
		driver.switchTo().alert().dismiss();
		
	}
	
	
	

}
