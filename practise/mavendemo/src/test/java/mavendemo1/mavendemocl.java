package mavendemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;


public class mavendemocl {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://google.com");
        driver.get("https://selenium.dev");
        driver.findElement(By.linkText("Documentation")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        //driver.navigate().to("https://selenium.dev");
        //driver.navigate().to("https://google.com");
       // URL url=new URL("\"https://google.com\"");
        //System.out.println(driver.getTitle());
        //System.out.println(driver.getCurrentUrl());
       // System.out.println(driver.getPageSource());
        //WebElement searchBox=driver.findElement(By.name("q"));
        //searchBox.sendKeys("selenium");
        Thread.sleep(2000);
        driver.quit();
       // driver.close();


    }
}
