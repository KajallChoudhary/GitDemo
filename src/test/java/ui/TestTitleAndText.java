package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTitleAndText {
	
	@Test
	public void testTitle() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		SoftAssert sa = new SoftAssert();
		
		driver.get("https://www.ebay.com");
		String expectedTitle = "Electronics,Cars, Fashion, Collectibles & More | eBay";
		String expectedText = "Search";
		String actualText = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		String actualTitle = driver.getTitle();
		System.out.println("Matching title..");
		sa.assertEquals(actualTitle, expectedTitle);
		System.out.println("Title matched");
		
		/* Hard Assertion
		System.out.println("Matching text");
		Assert.assertEquals(actualText, expectedText);
		System.out.println("Text matched");
		*/
		
		//Soft Assert
		System.out.println("Matching text");
		sa.assertEquals(actualText, expectedText);
		System.out.println("Text matched");
		driver.close();
		sa.assertAll();
	}

}
