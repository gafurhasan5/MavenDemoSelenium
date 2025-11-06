import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CalenderHandle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        driver.findElement(By.id("datepicker")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));

        String monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
        System.out.println(monthYear);
        String month = monthYear.split(" ")[0];
        String year = monthYear.split(" ")[1];
        while (!((month.equals("May")) && (year.equals("2027")))) {
            driver.findElement(By.xpath("//a[@data-handler=\"next\"]")).click();
            monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
            month = monthYear.split(" ")[0];
            year = monthYear.split(" ")[1];
        }

       // driver.findElement(By.xpath("//td[@data-handler=\"selectDay\"]/a[text()=\"2\"]")).click();
           driver.findElement(By.xpath("//a[text()=\"3\"]")).click();
        //driver.quit();
    }
    }

