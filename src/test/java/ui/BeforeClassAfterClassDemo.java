package ui;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeClassAfterClassDemo {

	@BeforeClass
	public void dataSetup() {
		System.out.println("This method will be executed FIRST");
		System.out.println("setting up the data");
	}
	
	
	@AfterClass
	public void dataCleanup() {
		System.out.println("This method will be executed LAST");
		System.out.println("cleaning up the data");
	}
	@Test
	public void test1() {
		System.out.println("Executed test1");
	}

	@Test
	public void test2() {
		System.out.println("Executed test2");
	}
	
	@Test
	public void test3() {
		System.out.println("Executed test3");
	}
	
	@Test
	public void test4() {
		System.out.println("Executed test4");
	}
}
