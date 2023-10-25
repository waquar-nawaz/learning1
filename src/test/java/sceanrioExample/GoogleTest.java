package sceanrioExample;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
	
	
	@Test
	public void verifySearchfeature() {
		
		
		System.out.println("verifySearchfeature test case execution");
		
//		launch an google app on chrome browser
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		
		driver.findElement(By.name("q")).sendKeys("iphone 15 pro");
		
		
		
	}

}
