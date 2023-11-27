package ui;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PassParameterFromTestngxml {
	
	@Parameters({"username"})
	@Test
	public void readingParameter(String username, String site) {
		System.out.println("Reading username and site from testng.xml");
		System.out.println("Username : " + username);
		System.out.println("Site : " + site);
	}

}
