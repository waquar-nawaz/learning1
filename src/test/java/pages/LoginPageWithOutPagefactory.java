package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utility.Constants;

public class LoginPageWithOutPagefactory {

	WebDriver driver;
	
	public LoginPageWithOutPagefactory(WebDriver driver) {
		
		this.driver = driver;
		
		
	}

	//Identification
	By txt_user = By.name("username");
	By txt_pass = By.name("password");
	By btn_login = By.cssSelector("[type=submit]");
	By lnk_forgotPass = By.xpath("//p[text()='Forgot your password? ']");
	By img_logo = By.className("orangehrm-login-branding");
	
	By dropdown_user = By.className("oxd-userdropdown-name");
	By lnk_Logout = By.partialLinkText("Logo");
	
	
	//methods
	public void enter_user(String user) {
		driver.findElement(txt_user).sendKeys(user);
		
	}
	
	public void enter_pass(String pwd) {
		driver.findElement(txt_pass).sendKeys(pwd);
		
	}
	
	public void clickLoginButton() {
		driver.findElement(btn_login).click();
		
	}
	
	public void clickUserDropdown() throws Exception {
		driver.findElement(dropdown_user).click();;
		Thread.sleep(3000);
		
	}
	public void clickLogout() {
		driver.findElement(lnk_Logout).click();;
		
	}
	
	
	public void verifyApplicationTitle(String actualTitle, String expectedTitle) throws Exception {
		
		Thread.sleep(3000);
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	
	
	
}
