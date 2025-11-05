package mavendemo1;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class NewWindowScreenshot {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        driver.findElement(By.xpath("//a[contains(text(),\"SeleniumTutorial\")]")).click();
        String mainWindow=driver.getWindowHandle();
        Set<String> allWindows=driver.getWindowHandles();
        Iterator<String> iterator=allWindows.iterator();
        while (iterator.hasNext()){
            String handle=iterator.next();
            if (!handle.equals(mainWindow)){
                driver.switchTo().window(handle);
                break;
            }
        }
        Thread.sleep(2000);
         //driver.findElement()
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest=new File("./Screenshot/NewWindow1.png");
        FileUtils.copyFile(scrFile, dest);
        driver.switchTo().window(mainWindow);
        driver.quit();
    }
}
