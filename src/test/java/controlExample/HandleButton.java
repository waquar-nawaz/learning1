package controlExample;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleButton extends BaseTest{
	
	
	@Test
	public void RadioButtonExample() {
		
		WebElement btn_submit = driver.findElement(By.xpath("//input[@type='submit']"));
		
		btn_submit.click();
		
		
		
		
	}

}
