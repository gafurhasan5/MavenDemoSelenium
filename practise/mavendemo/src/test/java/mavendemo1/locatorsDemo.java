package mavendemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
       // driver.get("https://in.linkedin.com/");
        driver.get("https://omayo.blogspot.com/");
        Thread.sleep(2000);

       WebElement textfield=driver.findElement(By.id("textbox1"));
       //driver.findElement(By.id("textbox1")).clear();
        textfield.clear();
      // driver.findElement(By.id("textbox1")).sendKeys("Gafur");
        textfield.sendKeys("Gafur");
        Thread.sleep(2000);
        textfield.clear();
        Thread.sleep(2000);
        textfield.sendKeys("Gafur Hassan shah");
        //driver.quit();





        //driver.findElement(By.linkText("Sign in")).click();
        //Thread.sleep(2000);
       // driver.findElement(By.id("username")).sendKeys("Gafur Hassan");
        //Thread.sleep(2000);
        //driver.findElement(By.id("password")).sendKeys("1234567");
        //Thread.sleep(2000);
        //driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']")).click();



        //driver.findElement(By.linkText("Sign in")).click();
     // driver.findElement(By.className("nav__button-secondary btn-md btn-secondary-emphasis ml-3")).click();
        //driver.findElement(By.className("nav__button-secondary btn-md btn-secondary-emphasis ml-3")).click();
        //driver.findElement(By.cssSelector(".signinButton gfg_loginModalBtn login-modal-btn")).click();

        //driver.findElement(By.className("inputWithIcon")).sendKeys("Gafur");
        //driver.findElement(By.className("inputWithIcon ")).sendKeys("12345");

        //driver.findElement(By.partialLinkText("Sign In")).click();
        //driver.findElement(By.id("username")).sendKeys("admin");

        //driver.findElement(By.id("password")).sendKeys("admin");
        //driver.quit();


    }
}
