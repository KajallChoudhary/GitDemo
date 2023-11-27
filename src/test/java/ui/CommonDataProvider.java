package ui;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class CommonDataProvider {

	@DataProvider
	public Object[][] dataSet(Method m){
		Object[][] testdata = null;
		
		if(m.getName().equals("printUserPwd")) {
			testdata = new Object[][] {
				{"standard_user", "secret_sauce"},
				{"locked_out_user","secret_sauce"},
				{"problem_user","secret_sauce"},
				{"performance_glitch_user", "secret_sauce"}
			};
		}else if(m.getName().equals("test2")) {
			testdata = new Object[][] {
				{"standard_user", "secret_sauce", "test1"},
				{"locked_out_user","secret_sauce", "test2"},
				{"problem_user","secret_sauce", "test3"},
				{"performance_glitch_user", "secret_sauce", "test4"}
			};
		}
		return testdata;
		
	}
}
