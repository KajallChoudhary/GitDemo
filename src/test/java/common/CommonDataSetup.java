package common;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class CommonDataSetup {

	@BeforeSuite
	public void dataSetup() {
		System.out.println("Setting up the data");
	}
	
	@AfterSuite
	public void cleanup() {
		System.out.println("Cleaning up the data");
	}
	
	
}
