package nopComm;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	WebDriver driver;
	
	@Before
	public void launchApp() {
		
		System.out.println("launching an app on chrome browser");
		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		
	}
	
	@After
	public void closeApp() {
		System.out.println("closing an app");
		
		driver.close();
		
	}
	
	

}
