package PropertiesFileDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Base;

public class Search extends Base {

	public static void main(String[] args) throws IOException {
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("./src\\test\\java\\config\\configProperties");
		prop.load(fis);

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("URL"));
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys(prop.getProperty("validProductName"));
				
	    driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();

	}

}
