package conditionalExample;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
	public WebDriver driver;
	
	
	
	
	@BeforeTest
	public void launchApp() throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	
	
	@AfterTest
	public void closeApp() throws Exception {
		
		Thread.sleep(7000);
		driver.close();
		
		driver.quit();
	}

}
