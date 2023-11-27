package ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	@Test(dataProvider="dataSet")
	public void printUserPwd(String username, String pwd) {
	System.out.println(username + " " + pwd);	 
	}
	
	@Test(dataProvider="dataSet1")
	public void test2(String u, String p, String t) {
		System.out.println(u +  " " + " " + t);
	}

	@DataProvider
	public Object[][] dataSet() {
		Object[][] data = new Object[4][2];

		// row1
		data[0][0] = "user1";
		data[0][1] = "pass1";

		// row2
		data[1][0] = "user2";
		data[1][1] = "pass2";

		// row3
		data[2][0] = "user3";
		data[2][1] = "pass3";

		// row4
		data[3][0] = "user4";
		data[3][1] = "pass4";
		
		return data;
	}
	
	@DataProvider
	public Object[][] dataSet1() {
		return new Object[][] {
			{"user1", "pass1", "test1"},
			{"user2", "pass2", "test2"}
		};
			
	}

}
