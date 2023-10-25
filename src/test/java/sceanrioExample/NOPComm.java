package sceanrioExample;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class NOPComm {
	
	
	@Test
	public void verifySearchfeature() throws Exception {
		
		
		System.out.println("verifySearchfeature test case execution");
		
//		launch an nopComm app on chrome browser
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		
		
		
		
		WebElement txt_email = driver.findElement(By.name("Email"));
		txt_email.clear();
		
		Thread.sleep(3000);
		
		txt_email.sendKeys("ibmtest@testmail.com");
		
		
		WebElement chk_rem = driver.findElement(By.id("RememberMe"));
		
		//click on checkbox
		chk_rem.click();
		
		
	}

}
