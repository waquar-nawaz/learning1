package conditionalExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Conditional_textBox3 extends BaseTest{
	
	
	
	@Test
	public void verifyLoginFeature() throws Exception {
		
		
		
		//conditionalWait
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));    //max time, before throw an exception
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#text3")));
		
		
		
		WebElement txt3 = driver.findElement(By.cssSelector("#text3"));
		
		txt3.sendKeys("enter value into inputbox");
		
		
	}
	
	
	
	public void custom_wait_locator(int timedelay, By ele) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timedelay));    //max time, before throw an exception
		wait.until(ExpectedConditions.visibilityOfElementLocated(ele));
		
	}
	
	
	public void custom_wait_ele(int timedelay, WebElement ele) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timedelay));    //max time, before throw an exception
		wait.until(ExpectedConditions.visibilityOf(ele));
		
	}

}
