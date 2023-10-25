package controlExample;

import org.junit.Test;
import org.openqa.selenium.By;

public class HandleInputbox extends BaseTest{
	
	
	@Test
	public void InputBoxExample() {
		
		
		driver.findElement(By.xpath("//input[@name=\"fname\"]")).sendKeys("enter first Name");
//		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("enter first Name");
		
		
	}

}
