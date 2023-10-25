package locatorExample;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exerciseExample_Xpath_Css {

	@Test
	public void verifySearchfeature() throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();

		WebElement btn_login = driver.findElement(By.xpath("//button[@type='submit']"));
		btn_login.click();
		
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Logo")).click();				//Welcome Amit
		
		
		Thread.sleep(3000);
		WebElement btn_login1 = driver.findElement(By.cssSelector("button[type='submit']"));
		btn_login1.click();

	}

}