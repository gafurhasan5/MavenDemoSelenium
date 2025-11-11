package AsserttionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class AssertDemo {
	@Test
	public void TestTitle()
	{
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		//String expectedTitle=driver.getTitle();
		//String ActualTitle="Your Store";
		//Assert.assertEquals(ActualTitle, expectedTitle);
		//Assert.assertNotEquals(ActualTitle, expectedTitle);
		//Assert.assertTrue(expectedTitle.contains("Store"));
		driver.findElement(By.name("search")).sendKeys("HP",Keys.ENTER);
		WebElement element=driver.findElement(By.linkText("HP LP3065"));
		//Assert.assertTrue(element.isDisplayed());
		assertTrue(element.isDisplayed()); //static import->import static org.testng.Assert.*;
		//driver.quit();
		
	}

}
