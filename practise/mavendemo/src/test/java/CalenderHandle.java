import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CalenderHandle {
    static WebDriver driver=null;

    public static void main(String[] args)
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        driver.findElement(By.id("datepicker")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
        SelectDateInCalender("3","May","2027");
    }
    public static void SelectDateInCalender(String SelectDay1, String SelectMonth, String SelectYear)
    {
        if(Integer.parseInt((SelectDay1))>31)
        {
            System.out.println("Invalid Data Provided "+SelectDay1+"/"+SelectMonth+"/"+SelectYear);
            return;
        }
        String monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
        //System.out.println(monthYear);
        String month = monthYear.split(" ")[0];
        String year = monthYear.split(" ")[1];
        while(!(month.equals(SelectMonth) && year.equals(SelectYear))) {
            driver.findElement(By.xpath("//a[@title='Next']")).click();
            monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
            month = monthYear.split(" ")[0];
            year = monthYear.split(" ")[1];
        }
        String xpathText="//td[@data-handler='selectDay']/a[text()=\'"+SelectDay1+"\']";
        driver.findElement(By.xpath(xpathText)).click();


    }
}

