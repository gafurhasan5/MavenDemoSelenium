package TestNGParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTestDemo1 {


     @Test
    public  void VerifyTitle() throws InterruptedException {
         WebDriver driver = new ChromeDriver();
         {
             driver.manage().window().maximize();
             driver.get("https://www.saucedemo.com/");
             String actualTitle = driver.getTitle();
             Assert.assertEquals(actualTitle, "Swag Labs");
             Thread.sleep(2000);
             driver.quit();
         }
     }
           @Test
         public void VerifyLogo() throws InterruptedException {
             WebDriver driver = new ChromeDriver();
             {
                 driver.manage().window().maximize();

                 driver.get("https://www.saucedemo.com/");
                 WebElement Logo=driver.findElement(By.xpath("//div[@class='login_logo']"));
                 Assert.assertTrue(Logo.isDisplayed());
                 Thread.sleep(2000);
                 driver.quit();
             }
         }
}

