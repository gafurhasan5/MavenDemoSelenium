package mavendemo1;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class seleniumWaitDemo {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        //implicitly Wait Demo
       /* driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("//form[@id='checkbox-example']/button")).click();
       //driver.findElement(By.xpath("//button[normalize-space()='Remove']")).click();
        //driver.findElement(By.xpath("//button[text()='Remove']")).click();
        WebElement message=driver.findElement(By.id("message"));
        System.out.println(message.getText());*/
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//div[@id='start']/button")).click();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement message=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']/h4")));
        System.out.println("Message Found is "+message.getText());
        driver.quit();
    }
}
