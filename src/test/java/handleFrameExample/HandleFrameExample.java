package handleFrameExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import org.junit.Test;

public class HandleFrameExample {

	WebDriver driver;

//	testNG <------ Junit

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("launching an app on chrome browser");
		driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
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
	public void Frame_ControlExample() throws Exception {

		
		
		//index ----- start from 0
//		driver.switchTo().frame(0);
//		//name or id
//		driver.switchTo().frame("name or id");
	
		
		WebElement myframe = driver.findElement(By.cssSelector("[data-src*=\"photo-manager\"]"));
		
		driver.switchTo().frame(myframe);
		
		
		WebElement img3 = driver.findElement(By.cssSelector("img[src*='tatras3']"));
		System.out.println("**************: " +img3.getAttribute("alt"));
		
		
		

	}
}
