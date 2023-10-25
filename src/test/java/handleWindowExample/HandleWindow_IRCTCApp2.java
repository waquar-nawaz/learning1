package handleWindowExample;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

//import org.junit.Test;

public class HandleWindow_IRCTCApp2 extends BaseTest{
	
	
	@Test
	public void verifyLoginfeature() throws Exception {
		
		
		
		
		String mainWindow = driver.getWindowHandle();			//unique window id ---- current focus of driver
		
		Set<String> allWindow = driver.getWindowHandles();								//set of strings --- multiple window id
		
		
		System.out.println("Main window ID: " + mainWindow);
		
		System.out.println("window count before click on Hotel: " + allWindow.size());
		
		
		
		
		
		WebElement btn_hotels = driver.findElement(By.partialLinkText("HOTELS"));
		btn_hotels.click();
		
		
		Thread.sleep(4000);
		
		
		
		Set<String> allWindow1 = driver.getWindowHandles();								//set of strings --- multiple window id
		
		
		
		System.out.println("window count after click on Hotel: " + allWindow1.size());
		
		
		
	}
}
