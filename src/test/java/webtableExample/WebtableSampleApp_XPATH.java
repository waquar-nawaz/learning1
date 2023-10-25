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

public class WebtableSampleApp_XPATH {

    @Test

    public void WebTableSampleApp(){

    	WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

        
       
        List<WebElement> nowOfRows =  driver.findElements(By.xpath("//table[@id='contactList']//tr"));
        
        System.out.println("No or Rows: " + nowOfRows.size());					//7
        
        
        
        List<WebElement> header =  driver.findElements(By.xpath("//table[@id='contactList']//tr[1]/th"));
        
        
        for (int i = 0; i < header.size(); i++) {
        	
        	String headerText = header.get(i).getText();
        	
        	System.out.println("Header text: " + headerText);
        	if(headerText.equalsIgnoreCase("Contact")) {
        		
        		System.out.println("=============somthing================" + i+ 1);
        		
        	}
			
		}
        
        
        
        
        for (int row = 2; row <= nowOfRows.size(); row++) {
        	
        	
        	
        	String contactName = driver.findElement(By.xpath("//table[@id='contactList']//tr[      " +   row  +    " ]/td[2]")).getText();
        	
        	
        	if(contactName.equalsIgnoreCase("Roland Mendel") ) {
        		
        		System.out.println("found the match......" + contactName);
        	}
        	
        	
        	String country = driver.findElement(By.xpath("//table[@id='contactList']//tr[      " +   row  +    " ]/td[3]")).getText();
        	System.out.println("Contact Name details: " + contactName + " : " + country);
        	
			
		}
        
        
        
        
        
        
        
        
        
        
        
        

    }

    }