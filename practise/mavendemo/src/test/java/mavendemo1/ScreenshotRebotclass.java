package mavendemo1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScreenshotRebotclass {
    public static void main(String[] args) throws IOException, AWTException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        driver.findElement(By.id("alert1")).click();

        Robot robot=new Robot();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rectangle = new Rectangle(dimension);
        BufferedImage image = robot.createScreenCapture(rectangle);
        String path = System.getProperty("user.dir") + "//Screenshot//Alertpage1.png";
        ImageIO.write(image,"png", new File(path));
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.quit();

    }
}
