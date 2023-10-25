package alertExampleJunit;

import org.junit.Assert;
//import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//import junit.framework.Assert;
//import org.testng.Assert;
//import org.testng.annotations.Test;

//import org.junit.Test;

public class HandleAlert extends BaseTest{
	
	
	@Test
	public void SimpleAlert() throws Exception {
		
		System.out.println("testng execution ");
		
		//click on btn_ShowmeAlert button
		
		WebElement btn_ShowmeAlert = driver.findElement(By.xpath("//*[contains(@value,'Me Ale')]"));
		btn_ShowmeAlert.click();
		
		
		Thread.sleep(4000);
		
		//handle an Alert
		//Alert/window/frame   ------- driver.switchTo()
		
		
		Alert simpleAlert = driver.switchTo().alert();
		
		
		//validation step
		//alert text
		
		
		System.out.println("Alert Text: " + simpleAlert.getText());
		
		
		Assert.assertEquals(simpleAlert.getText(), "Hi.. This is alert message!");
		
		Assert.assertTrue(simpleAlert.getText().contains("alert message"));
		Assert.assertFalse(simpleAlert.getText().contains("google"));
		
		//on alert
		
//		getText
//		accept    ------ click on OK button
//		dismiss
//		sendkeys
		
		
		//simpleAlert.accept();
		
		
		
		
		
		
		
	}

}
