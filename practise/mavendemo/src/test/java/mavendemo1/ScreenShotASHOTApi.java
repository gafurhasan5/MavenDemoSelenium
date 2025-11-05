package mavendemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ScreenShotASHOTApi {
    public static void main(String[] args) throws IOException, AWTException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        driver.findElement(By.id("alert1")).click();
        //Screenshot screenshot = new AShot().shootingStrategy(shootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        //ImageIO.write(screenshot.getImage(), "PNG", new File(System.getProperty("user.dir") + "/Screenshot/fullimage.png"));

    }


    }

