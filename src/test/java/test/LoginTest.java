package test;

import org.testng.annotations.Test;

import utility.Constants;

public class LoginTest extends BaseTest{
	
	@Test
	public void verifyLoginfeature() throws Exception {


		
		
		lp.enter_user(Constants.hrm_username);
		lp.enter_pass(Constants.hrm_password);
		lp.clickLoginButton();
		
		//Ruto utility line of code
//		lp.clickOnLogin();
		
		
		
		
		lp.verifyApplicationTitle(driver.getTitle(), "OrangeHRM");
		
		
		lp.clickUserDropdown();
		lp.clickLogout();
		
		lp.verifyApplicationTitle(driver.getTitle(), "OrangeHRM");
		
	}

}
