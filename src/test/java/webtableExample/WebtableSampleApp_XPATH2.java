package webtableExample;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtableSampleApp_XPATH2 {

    @Test

    public void WebTableSampleApp(){

    	WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

        
       
        
        
        
//        List<WebElement> AllCheckbox = driver.findElements(By.xpath("//table//td/input"));
//        
//        
//        
//        for (int i = 0; i < AllCheckbox.size(); i++) {
//			
//        	
//        	
//        	
//        	AllCheckbox.get(i).click();
//        	
//        	
//        	
//		}
//        
        
        
        driver.findElement(By.xpath("//table//td[text()='Helen Bennett']/preceding-sibling::td/input")).click();
        
        
        
        
        
        

    }

    }