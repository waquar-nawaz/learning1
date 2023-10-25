package locatorExample;




import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exerciseExample {
    
    
    @Test
    public void verifySearchfeature() throws Exception {
        
        
        System.out.println("verifySearchfeature test case execution");
        
//      launch an nopComm app on chrome browser
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        driver.manage().window().maximize();
        
        //Enter email
        WebElement txt_email = driver.findElement(By.name("Email"));
        txt_email.clear();
        Thread.sleep(3000);
        txt_email.sendKeys("ibmtest@testmail.com");
        
        //Enter password
        WebElement pass = driver.findElement(By.name("Password"));
        pass.clear();
        pass.sendKeys("abcd123");
        Thread.sleep(3000);
        
        //Click on checkbox
        WebElement chk_rem = driver.findElement(By.id("RememberMe"));
        chk_rem.click();
        
        //click on login button
        WebElement submit = driver.findElement(By.tagName("button"));
        submit.click();
        
        //button-1 login-button
//        driver.findElement(By.className("button-1 login-button")).click();
        
       
    }

}