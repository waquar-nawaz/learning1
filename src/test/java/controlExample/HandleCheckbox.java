package controlExample;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleCheckbox extends BaseTest{
	
	
	@Test
	public void InputBoxExample() {
		
		WebElement chk_boat = driver.findElement(By.xpath("//*[@value=\"Boat\"]"));
		
		
		System.out.println("*****before selection*********" + chk_boat.isSelected());
		
		
		chk_boat.click();
		
		
		System.out.println("*****after selection*********" + chk_boat.isSelected());
		
		
		
	}

}
