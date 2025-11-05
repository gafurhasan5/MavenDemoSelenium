package SeleniumWait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) {
      WebDriver driver = new ChromeDriver();

      driver.get("https://demoqa.com/");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

      //driver.quit();
    }
}
