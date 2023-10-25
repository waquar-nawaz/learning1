package alertExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertExampleTest3 {

	WebDriver driver;

//	testNG <------ Junit

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("launching an app on chrome browser");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/91995/Downloads/Test%20(2).html");
		// http://only-testing-blog.blogspot.com/2013/11/new-test.html

		driver.manage().window().maximize();
		Thread.sleep(4000);

	}

	@AfterTest
	public void closeApp() throws InterruptedException {
		System.out.println("closing an app");
		Thread.sleep(7000);
		//driver.close();

	}

	@Test
	public void promptAlert() throws Exception {

		System.out.println("testng execution ");

		// click on btn_ShowmeAlert button

		WebElement btn_prompt = driver.findElement(By.xpath("//button[contains(text(),'Prompt')]"));
		btn_prompt.click();

		Thread.sleep(4000);

		// handle an Alert
		// Alert/window/frame ------- driver.switchTo()

		//Alert promptAlert = driver.switchTo().alert();

		// validation step
		// alert text

		System.out.println("Alert Text: " + driver.switchTo().alert().getText());

		Assert.assertEquals(driver.switchTo().alert().getText(), "Please enter your name:");

		//Assert.assertTrue(promptAlert.getText().contains("Your Name Please"));

		// on alert

//		getText
//		accept    ------ click on OK button
//		dismiss
//		sendkeys

		String name = "Pooja Mallick";

		
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys(name);
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();

//		promptAlert.dismiss();
		
		
		WebElement validation_message = driver.findElement(By.xpath("//p[contains(@id,'demoPrompt')]"));
		
		System.out.println("****************:" + validation_message.getText());
		
		Assert.assertTrue(validation_message.getText().contains(name));

	}

}
