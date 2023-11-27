package ui;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemoTest {
	
	Boolean dataSetup = false;
	
	@Test(enabled=false)
	public void unimplementedTest() {
		System.out.println("Unimplemented test case");
	}
	
	@Test
	public void forcefulSkip() {
		System.out.println("Skipping the method forcefully");
		throw new SkipException("Skipped Forcefully");
	}
	
	@Test
	public void conditionBased() {
		System.out.println("Skipping based on certain condition");
		if(dataSetup) {
			System.out.println("Execute the tests further");
		}else {
			System.out.println("Issue with dataSetup");
			throw new SkipException("DataSetup has some issues");
		}
	}
	
	

}
