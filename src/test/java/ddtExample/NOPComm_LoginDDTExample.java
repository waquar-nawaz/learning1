package ddtExample;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NOPComm_LoginDDTExample extends BaseTest{
	
	
	@Test(dataProvider = "RegressionTestData")
	public void verifyLoginFeatureWithInValidUser(String email, String pwd) throws Exception {
		
		
		System.out.println("User credenatils are: " + email + " : " +pwd);
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input#Email")).clear();
		driver.findElement(By.cssSelector("input#Email")).sendKeys(email);
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input#Password")).clear();;
		driver.findElement(By.cssSelector("input#Password")).sendKeys(pwd);
		
		
		Thread.sleep(3000);
		driver.findElement(By.tagName("button")).click();
		
		
		
		
		//get the title
		//get the url
		//get the page source
		
		Assert.assertTrue(driver.getPageSource().contains("Login was unsuccessful"));
	
		
		
	}
	
	
	
	
	@DataProvider
	public Object[][] smokeTestData() {
		
		
		Object [][] data = { {"hima@google.com", "password"},{"komal@gmail.com", "password1"},{"Risab@yahoo.com", "testpass"}};
		
		return data;
		
		
	}
	
	

	@DataProvider
	public Object[][] RegressionTestData() {
		
		
		Object [][] data = { {"himaRegression@google.com", "password"},{"komalRegression@gmail.com", "password1"},{"RisabRegression@yahoo.com", "testpass"},{"ShwetaRegression@yahoo.com", "testpass"}};
		
		return data;
		
		
	}
	
	
	@DataProvider
	public Object[][] RegressionTestData_excel() {
		
		
		Object [][] data = { {"himaRegression@google.com", "password"},{"komalRegression@gmail.com", "password1"},{"RisabRegression@yahoo.com", "testpass"},{"ShwetaRegression@yahoo.com", "testpass"}};
		
		return data;
		
		
	}
	

}
