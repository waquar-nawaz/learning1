package alertExample;

//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	WebDriver driver;
	
//	testNG <------ Junit
	
	
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		System.out.println("launching an app on chrome browser");
		driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		//http://only-testing-blog.blogspot.com/2013/11/new-test.html
		
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
	}
	
	@AfterTest
	public void closeApp() throws InterruptedException {
		System.out.println("closing an app");
		Thread.sleep(7000);
		driver.close();
		
	}
	
	

}
