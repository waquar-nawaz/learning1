package nopComm;

import org.junit.Assert;
import org.junit.Test;

public class NOPCommApp extends BaseTest{
	
	
	
	
	
	@Test
	public void verifyAppTitle() {
		
		System.out.println("verify application title");
		Assert.assertEquals("Your store. Login", driver.getTitle());
	
	
		String actualTitle = driver.getTitle();			//Your store. Login
		
		
		boolean isLoginPresentInTitle = actualTitle.contains("Login");
		System.out.println("Login present into Title or not: " + isLoginPresentInTitle);
		
		
		Assert.assertTrue(actualTitle.contains("Login"));
		
	
	
	}

}
