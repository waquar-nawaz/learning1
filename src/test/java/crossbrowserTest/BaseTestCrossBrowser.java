package crossbrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTestCrossBrowser {
	
	WebDriver driver;
	
	
	
	@Parameters("ibm_br")
	@BeforeTest
	public void launchApp(String browser) {
		
		System.out.println("launching an app on browser, fetch value from TestNG XML file" + browser);
		
		
		//String browser = browserDetails;
		
		//driver = new ChromeDriver();
		
		
		if (browser.equalsIgnoreCase("CHROME")) {

			System.out.println("execute test case on chrome browser.");
			//launch a chrome browser
			driver = new ChromeDriver();
			
		}

		else if (browser.equalsIgnoreCase("edge")) {

			System.out.println("execute test case on edge browser.");
			
			driver = new EdgeDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {

			System.out.println("execute test case on firefox browser.");
			
			driver = new FirefoxDriver();
		}

		else if (browser.equalsIgnoreCase("safari")) {

			System.out.println("execute test case on safari browser.");
			
			driver = new SafariDriver();
		}

		else {

			System.out.println("execute test case on default browser: chrome browser");
			driver = new ChromeDriver();
		}
		
		
		
		
		
		
		
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		
	}
	
	@AfterTest
	public void closeApp() {
		System.out.println("closing an app");
		
		driver.close();
		
	}
	
	

}
