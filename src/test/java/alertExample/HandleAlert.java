package alertExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

//import org.junit.Test;

public class HandleAlert extends BaseTest{
	
	
	//@Test
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
		
		
		simpleAlert.accept();
		
		
		
		
		
		
		
	}
	
	
	//@Test
	public void ConfirmAlert() throws Exception {
		
		System.out.println("testng execution ");
		
		//click on btn_ShowmeAlert button
		
		WebElement btn_confirmAlert = driver.findElement(By.xpath("//button[contains(text(),'Confirm')]"));
		btn_confirmAlert.click();
		
		
		Thread.sleep(4000);
		
		//handle an Alert
		//Alert/window/frame   ------- driver.switchTo()
		
		
		Alert confirmAlert = driver.switchTo().alert();
		
		
		//validation step
		//alert text
		
		
		System.out.println("Alert Text: " + confirmAlert.getText());
		
		
		Assert.assertEquals(confirmAlert.getText(), "Press 'OK' or 'Cancel' button!");
		
		Assert.assertTrue(confirmAlert.getText().contains("'OK' or 'Cancel'"));
		
		
		//on alert
		
//		getText
//		accept    ------ click on OK button
//		dismiss
//		sendkeys
		
		
		//confirmAlert.accept();
		
		confirmAlert.dismiss();
		
		WebElement ok_Cancel_verification = driver.findElement(By.xpath("//div[contains(@id,'demo')]"));
		
		System.out.println("*****************: " + ok_Cancel_verification.getText());
		
		
		Assert.assertTrue(ok_Cancel_verification.getText().contains("OK"), "error message: validation get failed !!");
		
		
		
	}

	
	
	@Test
	public void PromptAlert() throws Exception {
		
		System.out.println("testng execution ");
		
		//click on btn_ShowmeAlert button
		
		WebElement btn_prompt = driver.findElement(By.xpath("//button[contains(text(),'Prompt')]"));
		btn_prompt.click();
		
		
		Thread.sleep(4000);
		
		//handle an Alert
		//Alert/window/frame   ------- driver.switchTo()
		
		
		Alert promptAlert = driver.switchTo().alert();
		
		
		//validation step
		//alert text
		
		
		System.out.println("Alert Text: " + promptAlert.getText());
		
		
		Assert.assertEquals(promptAlert.getText(), "Your Name Please");
		
		Assert.assertTrue(promptAlert.getText().contains("Your Name Please"));
		
		
		//on alert
		
//		getText
//		accept    ------ click on OK button
//		dismiss
//		sendkeys
		
		String name = "Abhishek";
		
		promptAlert.sendKeys(name);
		
		
		
		
		
		promptAlert.accept();
		
//		promptAlert.dismiss();
		
		
		
		
		
	}
}
