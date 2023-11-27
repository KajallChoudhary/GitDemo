package ui;

import org.testng.annotations.Test;

public class DataProviderDemo2 {
	
	@Test(dataProvider="dataSet", dataProviderClass = CommonDataProvider.class)
	public void printUserPwd(String username, String pwd) {
	System.out.println(username + " " + pwd);	 
	}
	
	@Test(dataProvider="dataSet",dataProviderClass = CommonDataProvider.class)
	public void test2(String u, String p, String t) {
		System.out.println(u +  " " + " " + t);
	}

	

}
