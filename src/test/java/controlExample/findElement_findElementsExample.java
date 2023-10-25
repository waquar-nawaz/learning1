package controlExample;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class findElement_findElementsExample extends BaseTest{
	
	
	@Test
	public void InputBoxExample() {
		
		
		//click operation on checkbox/radiobutton ---- click()
		
		
		//multiple match --- 3 -------- by default ---- will perform action on first element
//		driver.findElement(By.xpath("//*[@name='vehicle']")).click();

		
		
		WebElement chk = driver.findElement(By.xpath("//*[@name='vehicle']"));
		
		
		
		List<WebElement> chk_all = driver.findElements(By.xpath("//*[@name='vehicle']"));
		
		
		
		System.out.println("count of checkbox: " + chk_all.size());
		
		
//		chk_all.get(2).click();
		
		
		for (int i = 0; i < chk_all.size(); i++) {
			
			//chk_all.get(i).click();
			
			String chk_value = chk_all.get(i).getAttribute("value");
			
			if(chk_value.equalsIgnoreCase("bike")) {
				
				chk_all.get(i).click();
			}
			
			
			
		}
		
		
		
		
	}

}
