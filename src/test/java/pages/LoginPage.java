package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		
	}

	//Identification
//	By txt_user = By.name("username");
//	By txt_pass = By.name("password");
//	By btn_login = By.cssSelector("[type=submit]");
//	By lnk_forgotPass = By.xpath("//p[text()='Forgot your password? ']");
//	By img_logo = By.className("orangehrm-login-branding");
//	
//	By dropdown_user = By.className("oxd-userdropdown-name");
//	By lnk_Logout = By.partialLinkText("Logo");
	
	
	//Page Factory ---- desgining a page object model
	
	@FindBy(name = "username")
	WebElement txt_UserName;
	
	
	@FindBy(how = How.NAME, using = "username")
	WebElement txt_UserName1;
	
	
	
	//--------------using ruto--------------
	
	@FindBy(how = How.TAG_NAME, using="button")
	WebElement login;
	
	
	
	
	public void clickOnLogin(){
		login.click();
	}
	
	
	
	
	
	
	@FindBy(name = "password")
	WebElement txt_Password;
	
	
	@FindBy(css  = "[type=submit]")
	WebElement btnLogin;
	
	@FindBy(css  = ".oxd-userdropdown-name")
	WebElement usr_dropdown;
	
	
	@FindBy(partialLinkText  = "Logo")
	WebElement btnLogout;
	
	
//	
//	//methods
	public void enter_user(String user) {
		txt_UserName1.sendKeys(user);
//		txt_UserName.sendKeys(user);
		
	}
	
	public void enter_pass(String pwd) {
		txt_Password.sendKeys(pwd);
		
	}
	
	public void clickLoginButton() {
		btnLogin.click();
		
	}
	
	public void clickUserDropdown() throws Exception {
		usr_dropdown.click();;
		Thread.sleep(3000);
		
	}
	public void clickLogout() {
		btnLogout.click();;
		
	}
	
	
	public void verifyApplicationTitle(String actualTitle, String expectedTitle) throws Exception {
		
		Thread.sleep(3000);
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	
	
	
}
