package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	@BeforeTest
	public void loginToApplication() {
		System.out.println("Logged in to application");
	}
	
	@AfterTest
	public void logoutFromApplication() {
		System.out.println("Logout from application");
	}
	
	@BeforeMethod
	public void beforeMethodTest() {
		System.out.println("Before Method: Executed");
	}
	
	@AfterMethod
	public void afterMethodTest() {
		System.out.println("After Method: Executed");
	}

	@Test(priority = 1, description = "Login functionality")
	public void test1() {
		System.out.println("Executed test1");
	}
	
	@Test(priority = 2)
	public void test2() {
		System.out.println("Executed test2");
	}
}
