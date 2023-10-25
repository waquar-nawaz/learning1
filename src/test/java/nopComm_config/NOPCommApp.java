package nopComm_config;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

//import org.junit.Assert;
//import org.junit.Test;

public class NOPCommApp extends BaseTest{
	
	
	
	
	
	@Test
	public void verifyAppTitle() throws Exception {
		
		
		
		driver.findElement(By.cssSelector("input#Email")).clear();;
		driver.findElement(By.cssSelector("input#Email")).sendKeys(conf.get_useremail());
		
		
		
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input#Password")).clear();;
		driver.findElement(By.cssSelector("input#Password")).sendKeys(conf.get_pass());
		
		
		driver.findElement(By.cssSelector("input#RememberMe")).click();
		
		driver.findElement(By.tagName("button")).click();
		
		
		
	
	
	}

}
