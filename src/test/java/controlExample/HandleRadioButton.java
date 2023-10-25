package controlExample;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleRadioButton extends BaseTest{
	
	
	@Test
	public void RadioButtonExample() {
		
		WebElement radiobutton_female = driver.findElement(By.xpath("//*[@value=\"female\"]"));
		
		radiobutton_female.click();
		
		
		
		
	}

}
