package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login1 {
	@Test(priority=1)
	public void LoginWithValidCredentials()
	{
		//WebDriverManager.
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//li[@class='dropdown']/a[@title='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("input-email")).sendKeys("angelatucker13287@suffermail.com");
		driver.findElement(By.id("input-password")).sendKeys("password");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed());
		//driver.quit();
	}
	@Test(priority=2)
	public void LoginWithInValidCredentials()
	{
		//WebDriverManager.
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//li[@class='dropdown']/a[@title='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("input-email")).sendKeys("angelatucker13287@suffermail.com");
		driver.findElement(By.id("input-password")).sendKeys("passwor");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		 Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText().contains("Warning: No match for E-Mail Address and/or Password"));
	//driver.close();
	}
	

}
