package crossbrowserTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NOPCommApp extends BaseTestCrossBrowser{
	
	
	
	
	
	@Test
	public void verifyloginfeature() throws Exception {
		
		
		System.out.println("login test case exeution");
		driver.findElement(By.cssSelector("input#Email")).clear();;
		driver.findElement(By.cssSelector("input#Email")).sendKeys("admin@yourstore.com");
		
		
		driver.findElement(By.id("Password")).clear();;
		driver.findElement(By.id("Password")).sendKeys("admin");
		
		
		driver.findElement(By.xpath("//input[@name='RememberMe']")).click();
		
		driver.findElement(By.tagName("button")).click();
		
		
		//validation step
		Thread.sleep(3000);
		Assert.assertTrue(driver.getTitle().contains("Dashboard"), "validation of application title get failed after login!!");
		
		
		driver.findElement(By.partialLinkText("Logo")).click();
	
		
		//validation step
		Thread.sleep(3000);
		Assert.assertTrue(driver.getTitle().contains("Login"), "validation of application title get failed after logout!!");
				
	
	}

}
