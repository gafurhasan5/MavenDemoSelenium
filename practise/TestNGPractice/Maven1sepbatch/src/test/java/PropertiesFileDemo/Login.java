package PropertiesFileDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Base;

public class Login extends Base {

	public static void main(String[] args) throws IOException 
	{
		/*Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("./src\\test\\java\\config\\configProperties");
		prop.load(fis);*/
		loadProperties();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("URL"));
		driver.findElement(By.xpath("//li[@class='dropdown']/a[@title='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("validEmail"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("validPassword"));
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		//Assert.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed());
		//driver.quit();
}

}
