package DependOnMethodPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WishList {
	WebDriver driver;
	@Test()
	public void login()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//li[@class='dropdown']/a[@title='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.id("input-email")).sendKeys("angelatucker13287@suffermail.com");
		driver.findElement(By.id("input-password")).sendKeys("password");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		//Assert.assertTrue(driver.findElement(By.xpath("a[text()='Edit your account information']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		//Thread.sleep(2000);
		
	}
	//@Test(dependsOnMethods= {"login"},alwaysRun=true)  // depend but forefully run this test
	@Test(dependsOnMethods= {"login"})
	public void AddProductToWishListAndViewWishList()
	
	{
		//WebDriver driver=new ChromeDriver();
		driver.findElement(By.name("search")).sendKeys("HP",Keys.ENTER);
		driver.findElement(By.xpath("//button[@data-original-title='Add to Wish List']")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("wish list")));
	    element.click();
	    Assert.assertTrue(driver.getTitle().equals("My Wish List"));
		
		
	}
	
	@Test(dependsOnMethods= {"login","AddProductToWishListAndViewWishList"})
	public void removeProductToWishList()
	{
		//driver.findElement(By.xpath("//a[@data-original-title='Remove']")).click();
		driver.findElement(By.xpath("//a[@data-original-title='Remove']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='content']/p[text()=\"Your wish list is empty.\"]")).isDisplayed());
		driver.quit();
	}
	

}
