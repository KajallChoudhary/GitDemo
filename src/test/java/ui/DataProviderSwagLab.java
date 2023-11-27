package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderSwagLab {

	@Test(dataProvider = "dataSet")
	public void loginTest(String username, String password) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(username);
		System.out.println("entered username " + username);
		driver.findElement(By.id("password")).sendKeys(password);
		System.out.println("entered password " + password);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.close();
	}
	
	@DataProvider
	public Object[][] dataSet(){
		return new Object[][] {
			{"standard_user", "secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user", "secret_sauce"}
		};
		
	}
	
}
