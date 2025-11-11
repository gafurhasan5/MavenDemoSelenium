package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FbLogin {
	WebDriver driver=null;
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//li[@class='dropdown']/a[@title='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	}
	@Test
	public void username()
	{
		driver.findElement(By.id("input-email")).sendKeys("angelatucker13287@suffermail.com");
	}
	@Test
	public void password()
	{
		driver.findElement(By.id("input-password")).sendKeys("password");
	}
	@Test
	public void Login()
	{
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	}
	@Test
	public void result()
	{
		Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'My Account')]")).isDisplayed());
	}
	@AfterClass
	public void shutdown()
	{
		driver.quit();//Quit
	}

}
