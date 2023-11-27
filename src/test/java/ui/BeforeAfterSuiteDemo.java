package ui;

import org.testng.annotations.Test;

import common.CommonDataSetup;

public class BeforeAfterSuiteDemo extends CommonDataSetup {
	
	@Test
	public void test1() {
		System.out.println("Test1");
	}
	
	@Test
	public void test2() {
		System.out.println("Test2");
	}
	
	@Test
	public void test3() {
		System.out.println("Test3");
	}

}
