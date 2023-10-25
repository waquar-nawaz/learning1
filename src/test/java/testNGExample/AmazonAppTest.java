package testNGExample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonAppTest {
	
	//pre-condition
	//Test
	//post-condition
	//workflow
	
//	priority
	
	
	//priority ----- highest negative number having highest priority
	//By default --- priority is 0
	//if priority is same ---- execution as per naming conv (ASCII value)
	
	
	@Test(priority = 1)
	public void cancelOrder() {
		
		System.out.println("cancelOrder test case");
	}
	
	
	@BeforeTest
	public void launchApp() {
		
		System.out.println("launching an application");
		
	}
	
	
	@AfterTest
	public void closeApp() {
		
		System.out.println("================closeApp =============");
		
	}
	
	@Test(priority = -100)
	public void login() {
		
		System.out.println("login test case");
	}
	
	
	@Test(priority = 3)
	public void logout() {
		
		System.out.println("logout test case");
	}
	

	@Test(priority = 1, description = "adding an item to Amazon cart !!")
	public void addItem() {
		
		System.out.println("addItem test case");
	}
	
	

	@Test
	public void testcase1() {
		
		System.out.println("testcase1 test case");
	}
	

	@Test
	public void testcase2() {
		
		System.out.println("testcase2 test case");
	}
	
	
	
	@Test(priority = 2)
	public void payment() {
		
		System.out.println("payment test case");
	}

}
