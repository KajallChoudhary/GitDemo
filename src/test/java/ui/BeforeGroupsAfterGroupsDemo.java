package ui;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeGroupsAfterGroupsDemo {
	
	@BeforeGroups(value = "smoke")
	public void beforeGroupsMethod() {
		System.out.println("Always executed before SMOKE GROUP");
	}
	
	@AfterGroups(value = "smoke")
	public void afterGroupsMethod() {
		System.out.println("Always executed after SMOKE GROUP");
	}
	
	@Test(groups = "smoke")
	public void test1() {
		System.out.println("Executed test1");
	}

	@Test(groups = {"smoke", "regression"})
	public void test2() {
		System.out.println("Executed test2");
	}
	
	@Test(groups = "regression")
	public void test3() {
		System.out.println("Executed test3");
	}
	
	@Test(groups = "regression")
	public void test4() {
		System.out.println("Executed test4");
	}
}
