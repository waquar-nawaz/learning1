package controlExample;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	WebDriver driver;
	
	@Before
	public void launchApp() throws Exception {
		
		System.out.println("launching an app on chrome browser");
		driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		//http://only-testing-blog.blogspot.com/2013/11/new-test.html
		
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
	}
	
	@After
	public void closeApp() throws InterruptedException {
		System.out.println("closing an app");
		Thread.sleep(7000);
		driver.close();
		
	}
	
	

}
