package controlExample;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class findElement_findElementsExample2 extends BaseTest{
	
	
	@Test
	public void InputBoxExample() {
		
		
		//click operation on checkbox/radiobutton ---- click()
		
		
		//multiple match --- 3 -------- by default ---- will perform action on first element
//		driver.findElement(By.xpath("//*[@name='vehicle']")).click();

		
		List<WebElement> chk_all = driver.findElements(By.xpath("//*[@name='asdflALKSFlkajslkdjlKAS']"));
		System.out.println("count: " + chk_all.size());
		
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		driver.findElement(By.xpath("//*[@name='asdflALKSFlkajslkdjlKAS']")).click();
		
		
	}

}
