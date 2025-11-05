package mavendemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativXpathDemo {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://www.saucedemo.com");
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        System.out.println(driver.findElement(By.xpath("//table[@id='customers']//child::tr[4]/child::td[2]")).getText());
        System.out.println(driver.findElement(By.xpath("//table[@id='customers']//tr[position()='5']/td[position()='2']")).getText());
        driver.quit();
    }
}
