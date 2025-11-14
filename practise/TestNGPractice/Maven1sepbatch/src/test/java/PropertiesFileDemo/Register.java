package PropertiesFileDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Base;

public class Register extends Base {

	public static void main(String[] args) throws IOException, InterruptedException {
//		Properties prop=new Properties();
//		FileInputStream fis=new FileInputStream("./src\\test\\java\\config\\configProperties");
//		prop.load(fis);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//li[@class='dropdown']/a[@title='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys(prop.getProperty("validFirstName"));
		driver.findElement(By.id("input-lastname")).sendKeys(prop.getProperty("validLastName"));
		driver.findElement(By.id("input-email")).sendKeys(getTimeStamp());
		Thread.sleep(2000);
		driver.findElement(By.id("input-telephone")).sendKeys(prop.getProperty("validPhoneNum"));
		//driver.findElement(By.id("input-telephone")).sendKeys(prop.getProperty("validFirstName"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("validPass"));
		driver.findElement(By.id("input-confirm")).sendKeys(prop.getProperty("validPass"));
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//div[@class='pull-right']")).click();
		
	}
	 public static String getTimeStamp() {
		 long timestamp=System.currentTimeMillis();
		 return "gafurhassan1"+timestamp+"@gmail.com";
	 }

}
