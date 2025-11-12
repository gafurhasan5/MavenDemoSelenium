package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FbLogin {
	
	
	
	WebDriver driver=null;
	@BeforeSuite
	public void beforeSuit()
	{
		System.out.println(" 1.Before Suit");
	}
	@AfterSuite
	public void AfterSuit()
	{
		System.out.println("After Suit");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println(" 2.Before Test");
	}
	@AfterTest
	public void AfterTest()
	{
		System.out.println("AfetrTest");
	}
	
	@BeforeClass
	public void beforeMethod()
	{
		System.out.println(" 3.Before class");
	}
	@AfterClass
	public void AfterMethod()
	{
		System.out.println("after class");
	}
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		System.out.println(" 4.Before method");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//li[@class='dropdown']/a[@title='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);
	}
	@Test(priority=1)
	public void username() throws InterruptedException
	{
		System.out.println("User Name Test");
		driver.findElement(By.id("input-email")).sendKeys("angelatucker13287@suffermail.com");
		Thread.sleep(2000);
	}
	@Test(priority=2)
	public void password() throws InterruptedException
	
	{
		System.out.println("User password Test");
		driver.findElement(By.id("input-password")).sendKeys("password");
		Thread.sleep(2000);
	}
	@Test(priority=3)
	public void Login() throws InterruptedException
	{
		System.out.println("login button Test");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		Thread.sleep(2000);
	}
//	@Test
//	public void result()
//	{
//		Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'My Account')]")).isDisplayed());
//	}
	
	@AfterMethod
	public void shutdown() throws InterruptedException //tearDown()
	{
		System.out.println("After method Quit");
		driver.quit();//Quit
		Thread.sleep(2000);
	}

}
