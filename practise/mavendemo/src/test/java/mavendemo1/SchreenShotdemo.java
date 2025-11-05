package mavendemo1;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;


public class SchreenShotdemo {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File("./Screenshot/omayo.png");
       // FileHandler.copy( scrFile,destFile);
        FileUtils.copyFile(scrFile, destFile);
        driver.findElement(By.xpath("//a[normalize-space()='onlytestingblog']")).click();
        File scrFile2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
         destFile = new File("./Screenshot/linktext4.png");
         FileUtils.copyFile(scrFile2, destFile);
        driver.findElement(By.xpath("//button[normalize-space()='Check this']")).click();
        File scrFile3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        destFile = new File("./Screenshot/linktext1.png");
        FileUtils.copyFile(scrFile3, destFile);
        driver.quit();
    }

}
