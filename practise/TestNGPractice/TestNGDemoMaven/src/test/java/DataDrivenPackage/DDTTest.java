package DataDrivenPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDTTest {
	
	WebDriver driver;
	//@Test(dataProvider="dataGet") here i give method name of data provider
	@Test(dataProvider="dataGet1",dataProviderClass=SampleDataProvider.class) //here i give same name data provider annotation name 
	public void login(String email,String Password)
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//li[@class='dropdown']/a[@title='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		//Assert.assertTrue(driver.findElement(By.xpath("a[text()='Edit your account information']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		//Thread.sleep(2000);
		
	}
	/*  this method in separate class
	  @DataProvider(name="dataGet1")
	 
	public String[][] dataGet()
	{
		String[][] data = {{"angelatucker13287@suffermail.com","password"},{"Rehankhan56390@gmail.com","Password"},{"Rehankhan56391@gmail.com","Password"}};
	       return data;
	}*/

}
