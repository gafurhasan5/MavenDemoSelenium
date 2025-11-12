package AsserttionPackage;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
	@Test
	public void TestTitle() throws InterruptedException
	{
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		String expectedTitle=driver.getTitle();
		String ActualTitle="Your Stor1";
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals(ActualTitle, expectedTitle);
		//Assert.assertNotEquals(ActualTitle, expectedTitle);
		//Assert.assertTrue(expectedTitle.contains("Store"));
		Thread.sleep(2000);
		driver.findElement(By.name("search")).sendKeys("HP",Keys.ENTER);
		WebElement element=driver.findElement(By.linkText("HP LP3065"));
		//Assert.assertTrue(element.isDisplayed());
		assertTrue(element.isDisplayed()); //static import->import static org.testng.Assert.*;
		driver.quit();
		softAssert.assertAll();
		
	}

}
